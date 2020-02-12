#language: pt
Funcionalidade: Pesquisar um produto pela lupa

  Contexto: 
    Dado que o usuario esteja na homepage

  Cenario: Pesquisa lupa com sucesso
    Quando procurar por um produto valido
    Entao a pesquisa e feita

  Cenario: Pesquisa lupa com falha
    Quando procurar por um produto invalido
    Entao a pesquisa nao e feita
