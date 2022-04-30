
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
  public static void main(String[] args) {

    Aluno a1 = new Aluno("Ana",7.8,"M");
    Aluno a2 = new Aluno("Bia",5.8,"F");
    Aluno a3 = new Aluno("Daniel",9.8,"M");
    Aluno a4 = new Aluno("Gui",6.8,"M");
    Aluno a5 = new Aluno("Rebeca",7.1,"F");
    Aluno a6 = new Aluno("Pedro",8.8,"O");

      List<Aluno>alunos= Arrays.asList(a1,a2,a3,a4,a5,a6);

      Predicate<Aluno> aprovado =a -> a.nota >=7;

      Predicate<Aluno> genero =a -> a.genero != "F" || a.genero == "O";

      //Function<Aluno, String> saudacaoAprovado = a->"Parabéns"+a.nome +"! \n Você foi aprovado(a)";

      Function<Aluno, String> generoM = a ->"Aluno genero masculino" +a.genero;

      //Function<Aluno, String> generoO = a ->"Aluno não deseja informar genero" +a.genero +". Atura ou pira";

      alunos.stream()
      .filter(genero)
      .filter(aprovado).
      //map(saudacaoAprovado).
      map(generoM).
      forEach(System.out::println);

  }
}
