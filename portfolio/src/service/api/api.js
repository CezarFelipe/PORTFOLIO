import axios from 'axios'

const api = axios.create({
  baseURL: 'http://34.95.134.192:3000'
})

export default api
