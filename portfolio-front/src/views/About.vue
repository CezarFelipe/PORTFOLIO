<template>
  <div class="about">
    <div class="about-body-top">
      <div class="about-body-top-text">
        <h1>About</h1>
        <p>Paulistano, born in the greater São Paulo region of the ABC region, married for over 9 years, father of two, a beautiful couple of children.</p>
        <p>Graduated in Business Administration from Uniesp College, post-graduated in Digital Games from Cruzeiro do Sul College and post-graduated in Software Engineering from Estácio College.</p>
        <p>Apaixonado por programação, desenvolvedor fullstack, conheço tecnologias de front end como os framework Angular e VueJs, e Html, css e Java Script e no back end as linguagens Java e os framework quartz e spring, e C# e a engine Unity.</p>
      </div>
      <div class="about-body-top-image">
      <img img :src=profile.photoAbout alt="">
      </div>
    </div>
    <div class="about-body-bottom">
      <div class="about-body-bottom-image">
        <img src="../assets/Rectangle 2.png" alt="">
      </div>
      <div class="about-body-bottom-tex">
      <p>I have a profile aligned with the full cycle concept, the complete cycle, from idea conception, architecture and deployment.</p>
      <p>I am also a gamer designer, Art Designer and Sound Designer, and my main hobby is playing video games.</p>
      </div>
    </div>
  </div>
</template>
<script>
import api from '../service/api/api'
export default {
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
    this.getProfile(1)
  },
  methods: {
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
h1
{
  font-size: 60px;
  font-family: Uchen;
  color:#5B3525;
}
p{
  font-size: 18px;
  font-family: Uchen;
  color:#F7F7F7;
  margin: 10px;
}
.about{
width: 100%;
height: 100%;
background-color: #0D0D0D;
}
.about-body-top-text{
width: 65%;
height: 100%;
float: left;
}
.about-body-top-image{
width: 32%;
height: 100%;
float: left;
}
.about-body-top{
width: 100%;
height:65%;
}
.about-body-bottom{
width: 100%;
height: 35%;
}
.about-body-top-image img {
  width: 100%;
  height: 100%;
}
.about-body-bottom-image{
  width: 15%;
  height: 100%;
  float: left;
}
.about-body-bottom-tex{
  height: 100%;
  width: 100%;
}
@media only screen and (max-width: 414px) {

.about-body-top-text{
  width: 100%;
}
.about-body-bottom{
  margin-top: 150px;
}
.about-body-top-image{
  display: none;
}
.about-body-bottom-tex{
  width: 100%;
}
.about-body-bottom-image{
  display: none;
}
.about-body-bottom-image img{
  display: none;
}
.about{
width: 100%;
height: 80%;
background-color: #0D0D0D;
}
}
</style>
