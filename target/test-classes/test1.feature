#language: pt
Funcionalidade: Listagem de produtos disponíveis para compra

  Cenário: Mostra nome do produto
    Dado que estou na página inicial
    Quando não estou logado
    Então visualizo o produto "Hummingbird Printed T-Shirt" na posicao "1"