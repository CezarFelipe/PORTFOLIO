<template>
  <div class="body" id="body">
    <div class="body-top">
      <div class="text">
        <div class="text1">
          <h1>Hi! I am <span>Cézar Silva</span></h1>
          <h4>Software developer, game developer and passionate about technology and the digital world.</h4>
        </div>
        <div class="text2">
          <div class="text2-image">
             <img src="../assets/Rectangle 2.png" alt="">
          </div>
          <div class="text2-text">
            <div class="text2-text-titulo">
              <h2>My awesome <span>Services</span></h2>
            </div>
            <div class="text2-text-topico">
            <div class="text2-text-topico1">
                <ul>
                  <li>BackEnd Developer</li>
                  <li>Game Designer</li>
                </ul>
            </div>
            <div class="text2-text-topico2">
                <ul>
                  <li>FrontEnd Developer</li>
                </ul>
            </div>
            </div>
          </div>
        </div>
      </div>
      <div class="image">
        <img img :src=profile.photoHome alt="">
      </div>
    </div>
    <div class="body-bottom">
      <div class="body-bottom-titulo">PORTFOLIO
      </div>
      <v-layout row wrap class="body-bottom-link">
        <v-flex xs12 md4 class="body-bottom-link-work" v-for="work in works" :key="work.categoryId" id="listportfolio">
          <router-link :to="{ name: 'WorksDetails', params: { id: work.id} }"><img img :src=work.imageMain alt="1" border="0"><br>{{work.title}}</router-link>
        </v-flex>
      </v-layout>
    </div>
  </div>
</template>
<script>
import api from '../service/api/api'
export default {
  name: 'Home',
  components: {
  },
  data: () => {
    return {
      works: [],
      profile: {}
    }
  },
  created () {
    this.loading = false
    this.getWork()
    this.getProfile(1)
  },
  methods: {
    getWork () {
      api
        .get('/works/')
        .then(response => {
          this.works = response.data
          this.encodedImage = this.works.encodedImage
          console.log(response.data)
          this.loading = true
        })
        .catch(error => {
          console.log(error)
          this.errored = true
          this.loading = true
        })
        .finally(() => this.loading === false)
    },
    getProfile (id) {
      api
        .get('/profile/' + id)
        .then(response => {
          this.profile = response.data
          console.log(response.data)
          this.loading = true
        })
        .catch(error => {
          console.log(error)
          this.errored = true
          this.loading = true
        })
        .finally(() => this.loading === false)
    }
  }
}
</script>
<style>
#body{
  background-color: #0D0D0D;
  margin-bottom: 30px;
}
.text1{
  margin-right: 10px;
  width: 80%;
}
.body{
  height: auto;
}
.body-top{
  height: 90%;
}
.text{
  float: left;
  height:100%;
  width: 60%;
  margin-top: 10px;
}
.image{
  height: 100%;
  width: 100%;
}
.image img {
  width: 33%;
  height: 100%;
}
.body-bottom-titulo{
  height: 20%;
  width: 100%;
  float:left;
  text-align: center;
  color:#F7F7F7;
  font-size:24px;
  font-family: Uchen;
  background-color: #0D0D0D;
}
.body-bottom-link{
  text-align: center;
  height: 100%;
  background-color: #0D0D0D;
  width: 100%;
}
.body-bottom{
  height: 43%;
  width: 100%;
  background-color: #0D0D0D;
  margin-top: 20px;
}
.text2{
  height: 100%;
  margin-top: 20px;
}
.text2-image{
  float: left;
  height: 53%;
  width: 25%;
}
.text2-image img {
  padding: 5px;
  width: 70%;
  margin-top: 10%;
  margin-left: 15%;
}
.text2-text{
  height: 100%;
  margin-right: 60px;
}
.text2-text-titulo{
  text-align: center;
  height: 20%;
}
.text2-text-topico{
  height: 33%;
  margin-top: 20px;
}
.text2-text-topico1{
  float: left;
  height: 100%;
  width: 30%;
  text-align: left;
  margin-left: 50px;
}
.text2-text-topico2{
  float: left;
  height: 100%;
  width: 30%;
  text-align: left;
}
.text2-text-topico1 li{
  list-style-type: disc;
  font-family: Uchen;
  font-size: 20PX;
  padding: 2px;
  color:#F7F7F7;
}
.text2-text-topico2 li{
  list-style-type: disc;
  font-family: Uchen;
  font-size: 20PX;
  padding: 2px;
  color:#F7F7F7;
}
.body-bottom-link ul {
    list-style-type: none;
}
.body-bottom-link li {
    float:left;
}
.body-bottom-link li a {
    text-decoration: none;
    display: block;
    text-align: center;
    padding: 14px 5px;
    font-family: Uchen;
    font-size: 14PX;
}
.body-bottom-link-work img{
  width: 80%;
  height: 80%;
  margin: 5px;
}
.body-bottom-link-work{
  float: left;
  background-color: #0D0D0D;
}
#listportfolio a { color:#F7F7F7} /* Globally */
#listportfolio a:visited { text-decoration: none; color:#F7F7F7; }
#listportfolio a:hover { text-decoration: none; color:#5E3927;}
#listportfolio a:focus { text-decoration: none; color:#5E3927;}
#listportfolio a:hover, a:active { text-decoration: none; color:#5E3927; font-weight: bolder;}
@media only screen and (max-width: 414px) {
.body{
  height: 80%;
}
.image{
  display: none;
}
.text{
  height: 50%;
  width: 100%;
}
.text1{
  height: 100%;
  width: 100%;
}
.body-bottom{
  height: 30%;
}
.body-top{
  height: 90%;
}
.text2-text-titulo{
  margin-top: 10px;
  height: 50%;
}
.text2-text-titulo h2{
  font-size: 30px;
}
.text2-text-titulo span{
  font-size: 32px;
}
.text2-text-topico2 ul li{
  font-size: 14px;
}
.text2-text-topico1 ul li{
  font-size: 14px;
}
}
@media only screen and (max-width: 540px) {
.body{
  height: 80%;
}
.image{
  display: none;
}
.text{
  height: 50%;
  width: 100%;
}
.text1{
  height: 100%;
  width: 100%;
}
.body-bottom{
  height: 30%;
}
.body-top{
  height: 90%;
}
.text2-text-titulo{
  margin-top: 10px;
  height: 50%;
}
.text2-text-titulo h2{
  font-size: 30px;
}
.text2-text-titulo span{
  font-size: 32px;
}
.text2-text-topico2 ul li{
  font-size: 14px;
}
.text2-text-topico1 ul li{
  font-size: 14px;
}
}
@media only screen and (max-width: 800px) {
.body{
  height: 80%;
}
.image{
  display: none;
}
.text{
  height: 50%;
  width: 100%;
}
.text1{
  height: 100%;
  width: 100%;
}
.body-bottom{
  height: 30%;
}
.body-top{
  height: 90%;
}
.text2-text-titulo{
  margin-top: 10px;
  height: 50%;
}
.text2-text-titulo h2{
  font-size: 30px;
}
.text2-text-titulo span{
  font-size: 32px;
}
.text2-text-topico2 ul li{
  font-size: 14px;
}
.text2-text-topico1 ul li{
  font-size: 14px;
}
}
@media only screen and (max-width: 900px) {
.body{
  height: 80%;
}
.image{
  display: none;
}
.text{
  height: 50%;
  width: 100%;
}
.text1{
  height: 100%;
  width: 100%;
}
.body-bottom{
  height: 30%;
}
.body-top{
  height: 90%;
}
.text2-text-titulo{
  margin-top: 10px;
  height: 50%;
}
.text2-text-titulo h2{
  font-size: 30px;
}
.text2-text-titulo span{
  font-size: 32px;
}
.text2-text-topico2 ul li{
  font-size: 14px;
}
.text2-text-topico1 ul li{
  font-size: 14px;
}
}
</style>
