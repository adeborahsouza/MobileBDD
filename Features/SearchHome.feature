#language: pt
Funcionalidade: Pesquisar um produto pela lupa

  Contexto: 
    Dado que o usuario esteja na homepage

  Cenario: Pesquisa home sucesso
    Quando clicar em uma categoria valida
    Entao a pesquisa e feita

  Cenario: Pesquisa home falha
    Quando clicar em uma categoria invalida
    Entao a pesquisa n e feita
