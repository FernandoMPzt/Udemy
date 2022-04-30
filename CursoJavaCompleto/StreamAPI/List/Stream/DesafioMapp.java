package StreamAPI.List.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMapp {

  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
    Consumer<String>print = System.out::print;

    nums.stream().map(n -> n.toString().forEach(print));

    UnaryOperator<String> binario  = n -> n.(nums);
    UnaryOperator<String> inverter  = n -> n.(nums);
    UnaryOperator<String> c  = n -> n.(nums);

    System.out.println("\nNumero abaixo, converte numero");

nums.map(binario).
nums.map(binario).
nums.map(c);

  }
}
