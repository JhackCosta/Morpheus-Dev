Sistema web com os seguintes itens:

Listar Usuários;

Cadastrar Usuário;
#
Back-end desenvolvido em java com Spring Boot framework.
<br />
Porta:8080 padrão.
<br />
URL de GET teste: http://localhost:8080/usuario/selectall.
<br />
URL de POST teste: http://localhost:8080/usuario/save.
<br />
Corpo JSON:
{
    "nome":String,
    "idade":Long,
    "dataNascimento":Date Format dd/MM/yyyy,
    "cpf":String,
    "email":String
}
<br />
Corpo Resposta: "String".
<br />
Banco de dados H22.
<br />
Link para consultas:  http://localhost:8080/h2-console.
<br />
JDBC URL: jdbc:h2:mem:testdb.
<br />
USER NAME: sa.
#
Front-End desenvolvido em React.
<br />
Porta: 5173.
<br />
comando para start da aplicação: npm run dev.
<br />
URL de visualização: http://localhost:5173/







