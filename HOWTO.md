## GUIA PARA UTILIZA��O DO PROJETO

### REQUISITOS PARA UTILIZA��O DO PROJETO
 - BANCO DE DADOS MYSQL
 - JDK NA VERS�O 1.8
 - TOMCAT NA VERSAO 9

### CONFIGURA��O DO BANCO DE DADOS
Para configurar o banco de dados de acordo com o projeto, devemos utilizar a vers�o 8.17 do Banco de Dados MYSQL que est� especificada no arquivo POM.MXL. 

#### CONFIGURA��O DO USU�RIO DO BANCO DE DADOS
Durante a instala��o do Banco de Dados, devemos criar uma senha para o usu�rio root. Neste exemplo a senha ser� 'root'. Caso queira, utlizar outra senha, lembre-se de alterar as propriedades do arquivo 'persistence.xml'.

#### CRIA��O DO BANCO DE DADOS

Como estamos utlizando JPA e o Hibernate, precisamos apenas de criar o banco de dados. Neste exemplo, o nome do banco ser� 'funcionarios_prova'.

### DICA DE IDE (ECLIPSE)
 Caso voc� esteja utilizando a IDE ECLIPE, importe o Projeto como MAVEN e em seguida, atualize as depend�ncias.
 
### TESTE DO BACK-END
Para o utlizar os servi�os do Back-end, utlizamos a ferramenta POSTMAN. Abaixo est� a lista das requisi�es. Lembre-se de instalar o POSTMAN. Se as requisi��es retornarem com o status 200, sinal que est� funcionando.

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

#### CADASTRAR FUNCION�RIO


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

#### EDITAR FUNCION�RIO

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

#### EXCLUIR FUNCION�RIO

URL: http://localhost:8080/funcionarios/rs/funcionarios/{informe o id}

