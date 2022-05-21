import java.util.Arrays;
import java.util.List;

public class Outros {

  public static void main(String[] args) {
    
    Aluno a1 = new Aluno("Ana", 7.1, null);
    Aluno a2 = new Aluno("Luna", 7.1, null);
    Aluno a3 = new Aluno("Gui", 8.1, null);
    Aluno a4 = new Aluno("Gabi", 10, null);
    Aluno a5 = new Aluno("Ana", 7.1, null);
    Aluno a6 = new Aluno("Pedro", 9.1, null);
    Aluno a7 = new Aluno("Gui", 8.1, null);
    Aluno a8 = new Aluno("Maria", 10, null);
    
    
    List<Aluno>alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
    System.out.println("distict...");
    alunos.stream().distinct().forEach(System.out::println);
    
    System.out.println("\nSkip/Limite");
    alunos.stream()
    .distinct()
    .skip(2)
    .limit(2)
    .forEach(System.out::println);


    System.out.println("\ntakeWhile");
    alunos.stream()
    .distinct()
    .skip(2)
  //  .takeWhile(a -> a.nota >=7)   Habilitavel a verssão 10
    .forEach(System.out::println);

  }
}
