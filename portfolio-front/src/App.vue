<template>
  <v-app id="body">
    <Header/>
    <v-main>
      <router-view/>
    </v-main>
    <Footer/>
  </v-app>
</template>
<script>
import Footer from './components/Footer.vue'
import Header from './components/Header.vue'
export default {
  name: 'App',
  components: {
    Header,
    Footer
  },
  data: () => ({
    //
  })
}
</script>
<style>
#body body{
  background-color: #0D0D0D;
}
#body{
  background-color: #0D0D0D;
}
h1
{
  font-size: 60px;
  font-family: Uchen;
  color:#F7F7F7;
  margin: 4px;
}
h2
{
  font-size: 50px;
  font-family: Uchen;
  color:#F7F7F7;
  margin: 4px;
}
h4
{
  font-size: 20px;
  font-family: Uchen;
  color:#F7F7F7;
  margin: 4px;
}
h1 span
{
  color:#5E3927;
}
h2 span
{
  color:#5E3927;
}
h6
{
  font-size: 12px;
  font-family: Uchen;
  color:#F7F7F7;
}
</style>
