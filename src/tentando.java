import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class tentando {
    public static void main(String[] args) {

      List<Pessoa> pessoas = new ArrayList<>();
      Scanner scanner = new Scanner(System.in);
        int menuInicial;
      do {
          System.out.println("***********");
          System.out.println("Menu final de list");
          System.out.println(" ");
          System.out.println(" Digite 1 para cadastrar\n digite 2 para ver cadastros\n digite 3 para sair do programa");
          menuInicial = scanner.nextInt();

          if (menuInicial == 1){
              System.out.println("*********");
              System.out.println("Digite o nome do usuário");
              String nome = scanner.next();
              System.out.println("Digite o sexo 'M' para masculino ou 'F' para feminino");
              String sexo = scanner.next();

              Pessoa pessoa = new Pessoa(nome, sexo);
              pessoas.add(pessoa);
          }

              if (menuInicial==2){
                  System.out.println("Para a lista masculinda, digite 1\n para a lista feminina, digite 2\n para " +
                          "listagem completa, digite 3");
                  int menuLista = scanner.nextInt();

                  List<Pessoa> homens = pessoas.stream()
                          .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("M"))
                          .collect(Collectors.toList());

                  List<Pessoa> mulheres = pessoas.stream()
                          .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("F"))
                          .collect(Collectors.toList());

                  if (menuLista ==1){
                      for (Pessoa homem : homens) {
                          System.out.println(homem.getNome());
                      }
                  }
                  else if (menuLista ==2){
                      for (Pessoa mulher: mulheres){
                          System.out.println(mulher.getNome());
                      }

                  } else if (menuLista ==3) {
                      for (Pessoa e: pessoas) {
                          System.out.println(e);

                      }

                  }
              }



        } while (menuInicial != 3);
        System.out.println("Obrigado por usar o programa");
    }
}
