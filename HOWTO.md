## GUIA PARA UTILIZAÇÃO DO PROJETO

### REQUISITOS PARA UTILIZAÇÃO DO PROJETO
 - BANCO DE DADOS MYSQL
 - JDK NA VERSÃO 1.8
 - TOMCAT NA VERSAO 9

### CONFIGURAÇÃO DO BANCO DE DADOS
Para configurar o banco de dados de acordo com o projeto, devemos utilizar a versão 8.17 do Banco de Dados MYSQL que está especificada no arquivo POM.MXL. 

#### CONFIGURAÇÃO DO USUÁRIO DO BANCO DE DADOS
Durante a instalação do Banco de Dados, devemos criar uma senha para o usuário root. Neste exemplo a senha será 'root'. Caso queira, utlizar outra senha, lembre-se de alterar as propriedades do arquivo 'persistence.xml'.

#### CRIAÇÃO DO BANCO DE DADOS

Como estamos utlizando JPA e o Hibernate, precisamos apenas de criar o banco de dados. Neste exemplo, o nome do banco será 'funcionarios_prova'.

### DICA DE IDE (ECLIPSE)
 Caso você esteja utilizando a IDE ECLIPE, importe o Projeto como MAVEN e em seguida, atualize as dependências.
 
### TESTE DO BACK-END
Para o utlizar os serviços do Back-end, utlizamos a ferramenta POSTMAN. Abaixo está a lista das requisiões. Lembre-se de instalar o POSTMAN. Se as requisições retornarem com o status 200, sinal que está funcionando.

#### CADASTRAR SETOR

URL: http://localhost:8080/funcionarios/rs/setores/
{
	"nome": "CONTABILIDADE"
}

#### LISTAR SETOR

URL: http://localhost:8080/funcionarios/rs/setores/


#### EDITAR SETOR

http://localhost:8080/funcionarios/rs/setores/{informe o id}

{
	"id": 3,
	"nome": "CONTABILIDADE ALTERADO"
}

#### EXCLUIR SETOR

URl: http://localhost:8080/funcionarios/rs/setores/{informe o id}

#### CADASTRAR FUNCIONÁRIO


URL: http://localhost:8080/funcionarios/rs/funcionarios

{
	"nome": "fulano",
	"setor": {
		"id": 1,
		"nome": "TECNOLOGIA"
	},
	"salario": 1500,
	"email": "fulano@teste.com",
	"idade": 10
}

#### EDITAR FUNCIONÁRIO

URL: http://localhost:8080/funcionarios/rs/funcionarios/{informe o id}

{
	"id": 1,
	"nome": "GLEICY ALTERADO",
	"setor": {
		"id": 1,
		"nome": "TECNOLOGIA"
	},
	"salario": 4500,
	"email": "gleicyteste@teste.com",
	"idade": 24
}

#### EXCLUIR FUNCIONÁRIO

URL: http://localhost:8080/funcionarios/rs/funcionarios/{informe o id}

