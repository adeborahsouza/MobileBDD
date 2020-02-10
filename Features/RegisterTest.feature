#language: pt
Funcionalidade: Registrar um novo usuario

  Cenario: Registro com sucesso
    Dado home
    Quando ir para a pagina de cadastro
    E preencher os dados corretamente
    Entao o registro e feito
