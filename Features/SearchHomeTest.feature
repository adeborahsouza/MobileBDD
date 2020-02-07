#language: pt

Funcionalidade: Pesquisar um produto pela lupa

  Cenario: Pesquisa lupa com sucesso
	Dado que o usuario esteja na homepage
	Quando procurar por um produto valido
	Entao a pesquisa e feita

  Cenario: Pesquisa lupa com falha
	Dado que o usuario esteja na homepage
	Quando procurar por um produto invalido
	Entao a pesquisa nao e feita