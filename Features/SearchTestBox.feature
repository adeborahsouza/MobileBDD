#language: pt

Funcionalidade: Pesquisar produto pela home

  Cenario: Pesquisa home com sucesso
	Dado que o usuario esteja na homepage
	Quando clicar em uma categoria da home
	E escolher um produto valido
	Entao a pesquisa e feita


  Cenario: Pesquisa home com falha
	Dado que o usuario esteja na homepage
	Quando clicar em uma categoria da home
	E escolher um produto invalido
	Entao a pesquisa nao e feita
