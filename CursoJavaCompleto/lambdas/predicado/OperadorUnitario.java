package lambdas.predicado;

import java.util.function.UnaryOperator;

public class OperadorUnitario {

public static void main(String[] args) {
    
    UnaryOperator<Integer> maisDois = n -> n+2;
    UnaryOperator<Integer> vezesDois = n -> n*2;
    UnaryOperator<Integer> aoquadrado = n-> n*n;


    int resultado1 = maisDois.andThen(vezesDois).andThen(aoquadrado).apply(0);
    System.out.println(resultado1);

    int resultado2 = aoquadrado.andThen(vezesDois).andThen(maisDois).apply(0);
    System.out.println(resultado2);

    //int resultado3 = maisDois.andThen(vezesDois).andThen(aoquadrado).apply(0);
    //System.out.println(resultado3);


  }
}
