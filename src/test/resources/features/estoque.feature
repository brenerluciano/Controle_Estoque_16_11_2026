# language: pt
Funcionalidade: Controle de estoque
  Como funcionário da loja
  Quero registrar entradas e saídas de produtos
  Para manter o saldo do estoque correto

  Cenário: Entrada de produtos
    Dado um produto "Caneta" com 10 unidades em estoque
    Quando eu adiciono 5 unidades
    Então o saldo deve ser 15 unidades

  Cenário: Saída com saldo suficiente
    Dado um produto "Caneta" com 10 unidades em estoque
    Quando eu retiro 4 unidades
    Então a retirada deve ser aceita
    E o saldo deve ser 6 unidades

  Cenário: Saída com saldo insuficiente
    Dado um produto "Caneta" com 10 unidades em estoque
    Quando eu retiro 15 unidades
    Então a retirada deve ser recusada
    E o saldo deve ser 10 unidades