#language: pt
Funcionalidade: Pesquisar um produto pela home

  Contexto: 
    Dado que o usuario esteja na homepage

  Cenario: Pesquisa home sucesso
    Quando clicar em uma categoria
    Entao a pesquisa e realizada

  Cenario: Pesquisa home falha
    Quando clicar em uma categoria
    E escolher filtros invalidos
    Entao a pesquisa n e feita
