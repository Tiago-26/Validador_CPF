from suds.client import Client
url = "http://localhost:10000/validacpf?wsdl"  
client = Client(url)
CPF = input("Digite o CPF: ")
response= client.service.isCPF(CPF)
print(response)
