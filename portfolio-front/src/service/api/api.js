import axios from 'axios'

const api = axios.create({
  baseURL: 'http://34.95.134.192:81/api'
})

export default api
