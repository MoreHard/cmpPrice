import Vue from 'vue'
import VueRouter from 'vue-router'

import HelloWorld from '../components/HelloWorld.vue'
import Intro from '../components/Intro.vue'

Vue.use(VueRouter);

const router = new VueRouter({
    mode: "history",
    routes: [
        {path: '*', component:HelloWorld},
        {path: "/intro", component: Intro},
    ],
})



export default router;