Sistema web com os seguintes itens:

Listar Usuários;

Cadastrar Usuário;

Back-end desenvolvido em java com Spring Boot framework
Porta:8080 padrão
URL de GET teste: http://localhost:8080/usuario/selectall
URL de POST teste: http://localhost:8080/usuario/save
Corpo JSON:
{
    "nome":String,
    "idade":Long,
    "dataNascimento":Date Format dd/MM/yyyy,
    "cpf":String,
    "email":String
}
Corpo Resposta: "String"

Banco de dados H22
Link para consultas:  http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
USER NAME: sa

Front-End desenvolvido em React
Porta: 5173
comando para start da aplicação: npm run dev

URL de visualização: http://localhost:5173/







