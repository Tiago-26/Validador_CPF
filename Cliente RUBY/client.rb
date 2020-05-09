require 'savon'

client = Savon.client do 
	wsdl "http://localhost:10000/validacpf?wsdl"

	open_timeout 5
	read_timeout 5
end

puts "Digite o CPF: " 
c = gets
c = c.chomp

response = client.call(:is_cpf, message:{"cpf" => c})
responsetxt = response.body[:is_cpf_response][:return]
puts "--> " + responsetxt