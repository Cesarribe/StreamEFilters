import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        do {

            int menu;

            System.out.println("***** Menu Colletions + filtrod *****");
            System.out.println("Digite 1 para cadastrar\n Digite 2 para conferir a lista\n Digite 3 para sair");
            menu = scanner.nextInt();

            if (menu ==1){
                System.out.println("Digite o nome");
                String nome = scanner.next();
                nomes.add(nome);

                System.out.println("Digite o sexo");
                String sexo = scanner.next();

                if (sexo.equalsIgnoreCase("Masculino")){
                    masculinos.add(nome);
                    continuar = true;
                } else if (sexo.equalsIgnoreCase("Feminino")){
                    femininos.add(nome);
                    continuar = true;
                } else {
                    System.out.println("Opcao invalida");
                    continuar = true;
                }


            } else if (menu ==2) {
                System.out.println("Digite 1 para ver a lista feminina \n Digite 2 para ver a lista " +
                        "masculina \n Digite 3 para ver a lista completa");
                int menu3 = scanner.nextInt();

                if (menu3 == 1){
                    System.out.println("Lista feminina");
                    for (String nome : femininos) {
                        System.out.println(nome);
                        System.out.println(" ");
                    }
                } else if (menu3 ==2) {
                    System.out.println(" Lista masculina");
                    for (String nome : masculinos){
                        System.out.println(nome);
                        System.out.println(" ");
                    }
                } else if (menu3 ==3) {
                    System.out.println("Listagem completa");
                    System.out.println("Lista feminina");
                    for (String nome : femininos) {
                        System.out.println(nome);
                        System.out.println(" ");
                    }
                    System.out.println(" Lista masculina");
                    for (String nome : masculinos){
                        System.out.println(nome);
                        System.out.println(" ");

                    }
                } else {
                    System.out.println("Opcao invalida");
                }


            } else if (menu==3) {
                continuar = false;

            }else {
                System.out.println("opcao incorreta");

            }


        } while (continuar != false);

    }
}