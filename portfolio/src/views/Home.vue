<template>
  <div class="body">
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
        image
      </div>
    </div>
    <div class="body-bottom">
      <div class="titulo">
        TITULOS
      </div>
      <div class="link">LINK TRABALHOS
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: 'Home',
  components: {
  }
}
</script>
<style>

.text1{
  margin-right: 10px;
  width: 80%;
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
.body{
  height: 530px;
}
.body-top{
  background-color: aqua;
  height: 65%;
}
.text{
  float: left;
  background-color:#0D0D0D;
  height:100%;
  width: 60%;
}
.image{
  background-color:azure;
  height: 100%;
}
.body-bottom{
  background-color: blue;
  height: 35%;
}
.titulo{
  background-color: green;
  text-align: center;
  height: 20%;
}
.link{
  background-color:yellow;
  text-align: center;
  height: 80%;
}
.body-bottom{
  background-color: blue;
}
.text2{
  height: 100%;
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
}
.text2-text-titulo{
  text-align: center;
  height: 20%;
}
.text2-text-topico{
  text-align: center;
  height: 33%;
}
.text2-text-topico1{
  float: left;
  height: 100%;
  width: 30%;
  text-align: left;
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
</style>
