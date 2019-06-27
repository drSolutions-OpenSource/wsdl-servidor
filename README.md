[![Build Status](https://travis-ci.org/diegomrodrigues/wsdl-servidor.svg?branch=master)](https://travis-ci.org/diegomrodrigues/wsdl-servidor)

# Servidor SOAP
Utilização do Spring Boot para gerar um WebService SOAP.  
  
  
## Tecnologias utilizadas
* Java 8  
* Spring Boot  
* Spring Web Services
* WSDL4j  
  
  
## Armazenamento
* GitHub  
* Travis CI: Serviço de integração contínua, usado para criar e testar projetos de software hospedados no GitHub  
  
  
## Pacotes
* wsdlservidor: Ponto de entrada do servidor
* wsdlservidor.assets: Classes geradas para o funcionamento do serviço SOAP
* wsdlservidor.config: Configuração do serviço SOAP
* wsdlservidor.endpoits: Criação dos endpoints, ou seja, as requisições que serão aceitas pelo serviço
* wsdlservidor.repositories: Repositório de Pais, com os paises em exemplo no código

## Exemplo de uso
  
http://localhost:8080/ws/paises.wsdl

```xml
<wsdl:definitions targetNamespace="http://drsolutions.com.br/wsdlservidor/assets">
<wsdl:types>
<xs:schema elementFormDefault="qualified" targetNamespace="http://drsolutions.com.br/wsdlservidor/assets">
<xs:element name="getPaisRequest">
<xs:complexType>
<xs:sequence>
<xs:element name="nome" type="xs:string"/>
</xs:sequence>
</xs:complexType>
</xs:element>
...

```
  
  
curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
	<SOAP-ENV:Header/>
	<SOAP-ENV:Body>
		<ns2:getPaisResponse xmlns:ns2="http://drsolutions.com.br/wsdlservidor/assets">
			<ns2:pais>
				<ns2:nome>Brasil</ns2:nome>
				<ns2:populacao>209300000</ns2:populacao>
				<ns2:capital>Brasília</ns2:capital>
				<ns2:moeda>BRL</ns2:moeda>
			</ns2:pais>
		</ns2:getPaisResponse>
	</SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```
  
## Autor
Diego Mendes Rodrigues  
  
[drSolutions - Agência digital](https://www.drsolutions.com.br)