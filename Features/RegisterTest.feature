#language: pt
Funcionalidade: Registrar um novo usuario

  Cenario: Registro com sucesso
    Dado que o usuario esteja na homepage
    Quando ir para a pagina de cadastro
    E preencher os dados corretamente
    Entao o registro e feito

  Cenario: Registro com falha
    Dado que o usuario esteja na homepage
    Quando ir para a pagina de cadastro
    E preencher os dados incorretamente
    Entao o registro nao e feito
