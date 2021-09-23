import axios from 'axios'

const api = axios.create({
  baseURL: 'http://host.docker.internal::81/api'
})

/* const api = axios.create({
  baseURL: 'http://localhost:3000'
}) */

export default api
