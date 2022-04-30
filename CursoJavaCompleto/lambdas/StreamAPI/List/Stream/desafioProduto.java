
// so compra se tiver + 30% desconto e fret gratis um filtro. quantidade

public class desafioProduto{
// preco nomeproduto  preco
    final String nome;
    final boolean promocao;
    final double desconto;
    final boolean frete;

  public desafioProduto(String nome, double desconto,boolean frete) {
    this.nome = nome;
    this.desconto = desconto;
    this.frete = frete;
    this.promocao =  desconto >= 30;
    
  }

}