# curso-java-web

Projeto desenvlovido no curso de Java para Web realizado na instituição de ensino Triadworks com o instrutor Handerson Frota.

Especificações técnicas: <br />
IDE: Eclipse Mars <br />
Versão do Java: 1.7 ou 1.8 <br />
Versão do Tomcat: 7.0 ou 8.0. <br />

Para rodar é preciso importar o projeto no eclipse e adicionar o projeto no Tomcat. <br />
Também é necessário criar um banco mysql com o nome 3WJavaWeb24. <br />
A tabela usuario possui os campos: id(int, pk), nome(varchar), login(varchar), senha(varchar) <br />
A tabela caloteiro possui os campos: id(int, pk), nome(varchar), email(varchar), devendo(int), dataDivida(data) <br />

Usuario do banco: root, senha: root. <br />

A classe TesteUsuarioDAO testa uma autenticação. Basta cadastrar um usuario no banco e rodar a classe. <br />
Por padrão, nessa classe, os critérios de teste são nome: handerson, senha: 123
