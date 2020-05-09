const soap = require("soap")
const url = "http://localhost:10000/validacpf.jws?wsdl"

const CPF = "13116113717"
soap.createClient(url, (err, client) => {
  if (err) {
    console.log(err)
    console.log('Cocnect o services, ANTA. Que eu nâo faço milagre!!! :-)')
  }
  else {
    console.log('Service ok')
    client.isCPF({
      cpf: CPF
  }, (err, result) => {
    console.log('CPF: ' + CPF)
    console.log(result)
  })
}
})