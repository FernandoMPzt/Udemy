import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class desafioprodutoM{
  
  public static void main(String[] args){

    desafioProduto v1 = new desafioProduto("A", 30,true); 
    desafioProduto v2 = new desafioProduto("B", 30,true); 
    desafioProduto v3 = new desafioProduto("C", 25,true); 
    desafioProduto v4 = new desafioProduto("D", 30,false); 


    List<desafioProduto>venda = Arrays.asList(v1,v2,v3,v4);

    Predicate<desafioProduto> vendaDesconto = v -> v.promocao ;

    Predicate<desafioProduto> freteV = v -> v.frete;
    
    Function<desafioProduto,String> VendaD =  v -> "Produto "+v.nome+" está superpromoção";
 
    venda.stream().
      filter(vendaDesconto).
      filter(freteV).
      map(VendaD).
      forEach(System.out::println);
    

  }
  
}