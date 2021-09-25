<template>
<div class="contact-body">
  <div class="contact-body-top">
    <v-layout row wrap id="contact-body-top-row">
      <v-flex xs12 md9>
        <div class="contact-body-top-left"><br/>
            <div><h2>Contact</h2></div>
        </div>
      </v-flex>
    </v-layout>
    <v-flex xs12 md6 class="contact-body-bottom">
      <div class="link">
        <div class="link-linkedin">
          <div class="link-linkedin-img">
            <img src="../assets/Ellipse 1.png" alt="">
          </div>
          <div class="link-linkedin-txt text-link">
            <a :href=profile.linkLinkedin target="blank">{{profile.linkLinkedin}}</a>
          </div>
        </div>
        <div class="link-github">
          <div class="link-github-img">
            <img src="../assets/logo-github.png" alt="">
          </div>
          <div class="link-github-txt text-link">
              <a :href=profile.linkGithub target="blank">{{profile.linkGithub}}</a>
          </div>
        </div>
        <div class="link-email">
          <div class="link-email-img">
            <img src="../assets/logo-email.png" alt="">
          </div>
          <div class="link-email-txt text-link">
            <a :href=profile.linkEmail target="blank">{{profile.linkEmail}}</a>
          </div>
        </div>
      </div>
    </v-flex>
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
.contact-body{
  width: 100%;
  height: 100%;
  background-color:#0D0D0D;
}
.contact-body-top{
  width: 100%;
  height: 30%;
}
.contact-body-bottom{
  width: 100%;
  height: 200%;
  margin-top: 20px;
}
#contact-body-top-row{
  width: 100%;
  height: 95%;
  border-width: 2px;
  border-style: solid;
  border-color: #5B3525;
  margin: auto;
}
.contact-body-top-left{
  width: 100%;
  height: 100%;
  padding: 5px;
}
.contact-body-top-left h2{
  color: #5B3525;
  font-weight: unset;
}
.link{
  color: white;
  height: 80%;
  width: 100%;
}
.link-github{
  height: 30%;
}
.link-email{
  height: 30%;
}
.link-linkedin{
  height: 30%;
}
.link-linkedin-img{
  float: left;
  width: 20%;
  height: 100%;
  text-align: center;
  line-height: 500%;
}
.link-linkedin-img img{
  width: 60%;
}
.link-linkedin-txt{
  color:#F7F7F7;
  font-family: Uchen;
  font-size: 18PX;
  text-align: left;
  line-height: 500%;
}
.link-email-img{
  float: left;
  width: 20%;
  height: 100%;
  text-align: center;
  line-height: 500%;
}
.link-email-img img{
  width: 60%;
}
.link-email-txt{
  color:#F7F7F7;
  font-family: Uchen;
  font-size: 18PX;
  text-align: left;
  line-height: 500%;
}
.link-github-img{
  float: left;
  width: 20%;
  height: 100%;
  text-align: center;
  line-height: 500%;
}
.link-github-img img{
  width: 60%;
}
.link-github-txt{
  color:#F7F7F7;
  font-family: Uchen;
  font-size: 18PX;
  text-align: left;
  line-height: 500%;
}
.text-link a { color:#F7F7F7} /* Globally */
.text-link a:visited { text-decoration: none; color:#F7F7F7; }
.text-link a:hover { text-decoration: none; color:#5E3927;}
.text-link a:focus { text-decoration: none; color:#5E3927;}
.text-link a:hover, a:active { text-decoration: none; color:#5E3927; font-weight: bolder;}
</style>
