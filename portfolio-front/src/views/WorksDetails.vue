<template>
<div v-if="loading" class="works-details-body">
<v-skeleton-loader>
  <div class="works-details-body-top">
  <v-layout row wrap id="works-details-body-top-row">
    <v-flex xs12 md9>
    <div class="works-details-body-top-left"><br/>
        <div><h4>{{work.type}}</h4></div>
        <div><h2>{{work.title}}</h2></div>
        <p>{{work.shortDescription}}</p>
    </div>
    </v-flex>
    <v-flex xs12 md3>
      <div class="works-details-body-top-right">
        <div class="works-details-body-top-button">
            <a :href=work.linkSystem target="_blank"><v-btn x-large id="works-details-body-top-button">ACESSO AO SISTEMA</v-btn></a>
        </div>
        <div class="works-details-body-top-github">
            <a :href=work.linkGit target="_blank"><img class="work-body-image" src="../assets/Github.png" alt=""> GitHub</a>
        </div>
        <div class="works-details-body-top-documentation">
            <a :href=work.linkDocument target="_blank"><img class="work-body-image" src="../assets/Documentation.png" alt="">  Documentation</a>
        </div>
      </div>
    </v-flex>
  </v-layout>
  </div>
  <div class="works-details-body-bottom">
    <v-layout row wrap class="works-details-body-bottom-1">
      <v-flex xs12 md4 class="works-details-body-bottom-1-text"><p>{{work.text1}}</p>
      </v-flex>
      <v-flex xs12 md8 class="works-details-body-bottom-1-image"><img class="work-body-image" img :src=work.image1 alt="">
      </v-flex>
    </v-layout>
    <v-layout row wrap class="works-details-body-bottom-2">
      <v-flex xs12 md4 offset-xs4 align-end class="works-details-body-bottom-2-text"><p>{{work.text2}}</p>
      </v-flex>
      <v-flex xs12 md4 class="works-details-body-bottom-2-image justify"><img class="work-body-image" img :src=work.image2 alt="">
      </v-flex>
    </v-layout>
  </div>
</v-skeleton-loader>
</div>
<div v-else class="works-details-body"></div>
</template>
<script>
import VueRouter from 'vue-router'
import api from '../service/api/api'
export default {
  data () {
    return {
      work: {},
      loading: Boolean,
      attrs: {
        class: 'mb-6',
        boilerplate: true,
        elevation: 2
      }
    }
  },
  created () {
    this.loading = false
    this.getWork()
  },
  methods: {
    getWork () {
      this.route = new VueRouter(this.$route)
      const id = this.route.options.params.id
      api
        .get('/works/' + id)
        .then(response => {
          this.work = response.data
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
.works-details-body{
  width: 100%;
  height: 100%;
  background-color:#0D0D0D;
}
.works-details-body-top{
  width: 100%;
  height: 40%;
}
.works-details-body-bottom{
  width: 100%;
  height: 50%;
}
#works-details-body-top-row{
  width: 100%;
  height: 95%;
  border-width: 2px;
  border-style: solid;
  border-color: #5B3525;
  margin: auto;
}
.works-details-body-top-left{
  width: 100%;
  height: 100%;
  padding: 5px;
}
.works-details-body-top-right{
  width: 100%;
  height: 100%;
}
.works-details-body-top-left h2{
  color: #5B3525;
  font-weight: unset;
}
.works-details-body-top-left h4{
  color: #FFFFFF;
  font-weight: unset;
}
.works-details-body-top-left p{
  color: #FFFFFF;
  font-weight: unset;
}
.works-details-body-top-button{
  width: 100%;
  height: 40%;
  padding: 10px;
}
.works-details-body-top-github{
  width: 100%;
  height: 30%;
  padding: 10px;
  font-size: 16x;
  font-family: Uchen;
  color:#F7F7F7;
}
.works-details-body-top-documentation{
  width: 100%;
  height: 30%;
  padding: 10px;
  font-size: 16px;
  font-family: Uchen;
  color:#F7F7F7;
}
#works-details-body-top-button{
  font-size: 12px;
  font-family: Uchen;
  color:#F7F7F7;
  background-color: #5E3927;
  height: 80%;
  width: 70%;
  padding: 10px;
}
.works-details-body-bottom-2{
  width: 100%;
  height: 50%;
  margin: 3px;
}
.works-details-body-bottom-1{
  width: 100%;
  height: 50%;
  margin: 3px;
}

.works-details-body-bottom-1-text{
  height: 100%;
  width: 30%;
}
.works-details-body-bottom-1-image{
  height: 100%;
  width: 70%;
}
.works-details-body-bottom-2-text{
  height: 100%;
  width: 70%;
  text-align: left;
}
.works-details-body-bottom-2-image{
  height: 100%;
  width: 30%;
  align-items:flex-end;
}
.works-details-body-top-documentation a { color:#F7F7F7} /* Globally */
.works-details-body-top-documentation a:visited { text-decoration: none; color:#F7F7F7; }
.works-details-body-top-documentation a:hover { text-decoration: none; color:#5E3927;}
.works-details-body-top-documentation a:focus { text-decoration: none; color:#5E3927;}
.works-details-body-top-documentation a:hover, a:active { text-decoration: none; color:#5E3927; font-weight: bolder;}

.works-details-body-top-github a { color:#F7F7F7} /* Globally */
.works-details-body-top-github a:visited { text-decoration: none; color:#F7F7F7; }
.works-details-body-top-github a:hover { text-decoration: none; color:#5E3927;}
.works-details-body-top-github a:focus { text-decoration: none; color:#5E3927;}
.works-details-body-top-github a:hover, a:active { text-decoration: none; color:#5E3927; font-weight: bolder;}

</style>
