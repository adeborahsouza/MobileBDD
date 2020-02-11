#language: pt
Funcionalidade: Registrar um novo usuario

  Contexto: 
    Dado que o usuario esteja na homepage

  Cenario: Registro com sucesso
    Quando ir para a pagina de cadastro
    E preencher os dados corretamente
    Entao o registro e feito

  Cenario: Registro com falha
    Quando ir para a pagina de cadastro
    E preencher os dados incorretamente
    Entao o registro e feito
