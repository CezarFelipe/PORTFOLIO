<template>
<div class="works-details-body">
  <div class="works-details-body-top">
  <v-layout row wrap id="works-details-body-top-row">
    <v-flex xs12 md9>
    <div class="works-details-body-top-left"><br/>
        <div><h4>Sistema Web</h4></div>
        <div><h2>SUPPLY LOGISTIC SYSTEM</h2></div>
        <p>A system aimed at managing the entire supply chain</p>
    </div>
    </v-flex>
    <v-flex xs12 md3>
      <div class="works-details-body-top-right">
        <div class="works-details-body-top-button">
            <router-link to="/"><v-btn x-large id="works-details-body-top-button">ACESSO AO SISTEMA</v-btn></router-link>
        </div>
        <div class="works-details-body-top-github">
            <router-link to="/"><img class="work-body-image" src="../assets/Github.png" alt=""> GitHub</router-link>
        </div>
        <div class="works-details-body-top-documentation">
            <router-link to="/"><img class="work-body-image" src="../assets/Documentation.png" alt="">  Documentation</router-link>
        </div>
      </div>
    </v-flex>
  </v-layout>
  </div>
  <div class="works-details-body-bottom">
    <v-layout row wrap class="works-details-body-bottom-1">
      <v-flex xs12 md4 class="works-details-body-bottom-1-text"><p>With several control tools, the system will provide process performance, speed without losing control of transactions, making decisions structured and predictable</p>
      </v-flex>
      <v-flex xs12 md8 class="works-details-body-bottom-1-image"><img class="work-body-image" src="../assets/Rectangle 5.png" alt="">
      </v-flex>
    </v-layout>
    <v-layout row wrap class="works-details-body-bottom-2">
      <v-flex xs12 md4 offset-xs4 align-end class="works-details-body-bottom-2-text"><p>With several control tools, the system will provide process performance, speed without losing control of transactions, making decisions structured and predictable</p>
      </v-flex>
      <v-flex xs12 md4 class="works-details-body-bottom-2-image justify"><img class="work-body-image" src="../assets/Rectangle 5.png" alt="">
      </v-flex>
    </v-layout>
  </div>
</div>
</template>
<script>
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
}
.works-details-body-bottom-1{
  width: 100%;
  height: 50%;
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
  text-align: right;
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
