#language: pt
Funcionalidade: Registrar um novo usuario

  Contexto: 
    Dado que o usuario esteja na pagina de cadastro

  Cenario: Registro com sucesso
    Quando preencher os dados corretamente
    Entao o registro e feito

  #Cenario: Registro com falha
    #Quando preencher os dados incorretamente
    #Entao o registro nao e feito
