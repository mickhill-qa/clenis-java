#language: pt
Funcionalidade: Login no Site do Seu Barriga

  Cenario: Login com Sucesso
    Dado que eu estou na pagina inicial
    Quando preencher login e senha
    E clicar em Entrar
    Entao serei direcionado a area interna do site

  Cenario: Login com senha errada
    Dado que eu estou na pagina inicial
    Quando preencher login e senha errada
    E clicar em Entrar
    Entao o site exibe o erro: "Problemas com o login do usuário"

  Cenario: Login com email em branco
    Dado que eu estou na pagina inicial
    Quando preencher login em branco e senha
    E clicar em Entrar
    Entao o site exibe o erro: "Email é um campo obrigatório"
