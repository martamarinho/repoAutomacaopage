#language : pt
@tag
Funcionalidade: testar funcionalidade de login

  @tag1
  Cenario: logar com sucesso no site advantage
    Dado que eu esteja no site "https://www.advantageonlineshopping.com/#/"
    Quando eu clicar no icon de logar
    E preencher usuario e senha validos
    E clicar no botao logar
    Entao devo logar com sucesso
  