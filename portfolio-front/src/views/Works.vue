<template>
<div class="works-body">
<div class="works-body-box">
<v-container class="work-body">
  <v-layout row wrap class="work-body-bottom">
    <v-flex class="work-body-bottom-works" xs12 md4 v-for="work in works" :key="work.categoryId">
    <router-link :to="{ name: 'WorksDetails', params: { id: work.id} }"><img class="work-body-image" img :src=work.imageMain alt=""></router-link>
    <div class="work-body-image-text">
        <h6>Title: {{work.title}}</h6>
        <h6>Type: {{work.type}}</h6>
      </div>
    </v-flex>
  </v-layout>
</v-container>
</div>
</div>
</template>
<script>
import api from '../service/api/api'
export default {
  data: () => {
    return {
      works: []
    }
  },
  created () {
    this.loading = false
    this.getWork()
  },
  methods: {
    getWork () {
      api
        .get('/works/')
        .then(response => {
          this.works = response.data
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
.works-body{
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
}
.works-body-box {
width: 80%;
height: 100%;
padding-top: 5%;
}
.work-body-image-text{
  margin: 15px;
}
.works-body{
  background-color: #0D0D0D;
}
.work-body-image-text h6{
  color: #FFFFFF;
  font-weight: unset;
}
.work-body-bottom-works img{
  width:  70%;
  height: 70%;
  margin: 2px;
}
</style>
