import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Works from '../views/Works.vue'
import Error404 from '../views/Error404.vue'
import WorksDetails from '../views/WorksDetails.vue'
import About from '../views/About.vue'
import Contact from '../views/Contact.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '*',
    name: 'Error404',
    component: Error404
  },
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/works',
    name: 'Work',
    component: Works
  },
  {
    path: '/workdetails/:id',
    name: 'WorksDetails',
    component: WorksDetails
  },
  {
    path: '/about',
    name: 'About',
    component: About
  },
  {
    path: '/contact',
    name: 'Contact',
    component: Contact
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
