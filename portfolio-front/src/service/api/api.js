import axios from 'axios'

const api = axios.create({
  baseURL: 'http://host.docker.internal:81/api'
})

export default api
