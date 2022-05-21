

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Match{

  public static void main(String[] args) {
    
    Aluno a1 = new Aluno("Ana", 7.1, null);
    Aluno a2 = new Aluno("Luna", 7.1, null);
    Aluno a3 = new Aluno("Gui", 8.1, null);
    Aluno a4 = new Aluno("Gabi", 10, null);


    List<Aluno>alunos = Arrays.asList(a1,a2,a3,a4);

    Predicate<Aluno>aprovado = a -> a.nota >=7;
    Predicate<Aluno>reprovado = aprovado.negate();

    System.out.println(alunos.stream().allMatch(aprovado));
    System.out.println(alunos.stream().anyMatch(aprovado));
    System.err.println(alunos.stream().noneMatch(reprovado));
  }
  
}
