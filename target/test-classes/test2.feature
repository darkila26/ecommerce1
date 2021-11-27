#language: pt
Funcionalidade: Adicionar produtos no carrinho

  Cenário: + nome do produto no carrinho
    Dado que estou no carrinho
    Quando não estou logado
    Então visualizo o produto no carrinho "Hummingbird printed t-shirt" na posicao "1"