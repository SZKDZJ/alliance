import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import ElementPlus from 'element-plus'
import zhCn from 'element-plus/dist/locale/zh-cn.mjs'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
import "@/assets/Icon/add_sub/iconfont.css"
import "@/assets/Icon/add/iconfont.css"
import "@/assets/Icon/sub/iconfont.css"
import "@/assets/Icon/course/iconfont.css"
import "@/assets/Icon/scan/iconfont.css"
import '@/assets/css/global.css'

const app = createApp(App)

app.use(router)
app.use(ElementPlus, {
    locale: zhCn,
})
app.mount('#app')

for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}