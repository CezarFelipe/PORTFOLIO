<template>
  <v-system-bar id=header
    height="60">
      <ul>
        <li><router-link to="/">HOME</router-link></li>
        <li><router-link to="/about">ABOUT</router-link></li>
        <li><router-link to="/works">WORKS</router-link></li>
        <li><a :href=profile.linkCurriculum target="blank">CURRICULUM</a></li>
        <li><router-link to="/contact">CONTACT</router-link></li>
      </ul>
  </v-system-bar>
</template>
<script>
import api from '../service/api/api'
export default {
  name: 'Header',
  data: () => {
    return {
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
#header{
  background-color: #0D0D0D;
}
#header ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
}

#header li {
    float: left;
}

#header li a {
    text-decoration: none;
    display: block;
    text-align: center;
    padding: 14px 16px;
    font-family: Uchen;
    font-size: 14PX;
}

#header li a { color:#F7F7F7} /* Globally */
#header li a:visited { text-decoration: none; color:#F7F7F7; }
#header li a:hover { text-decoration: none; color:#5E3927;}
#header li a:focus { text-decoration: none; color:#5E3927;}
#header li a:hover, a:active { text-decoration: none; color:#5E3927; font-weight: bolder;}
@media only screen and (max-width: 480px) {
  #header{
    padding-top: 5px;
    padding-bottom: 5px;
    line-height: 2px;
  }
  }
</style>
