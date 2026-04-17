import Livros.LivrosLista;
import Livros.SituacaoLivro;
import Livros.menu.MenuBt;
import Livros.menu.config;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SituacaoLivro statuson = SituacaoLivro.DISPONIVEL;
        SituacaoLivro statusoff = SituacaoLivro.EMPRESTADO;
        LivrosLista books = new LivrosLista();
        MenuBt home = new MenuBt();
        config configmenu = new config();

        home.menu();



        System.out.print("Qual deseja: ");
        int EscolhaMenu = input.nextInt();

        if (EscolhaMenu == 1) {
            System.out.println(books.getBook());
            System.out.print("Qual livro deseja: ");
            int bookopc = input.nextInt();
            switch (bookopc) {
                case 1:
                    System.out.println("O livro desejado é: " + books.getBook().get(0));
                    System.out.println("Ele está: " + statuson);
                    break;

                case 2:
                    System.out.println("O livro é: " + books.getBook().get(1));
                    System.out.println("Ele está: " + statusoff);
                    break;

                case 3:
                    System.out.println("Livro acima desse está indisponivel.");
                    System.out.println("Voltando ao menu...\n");

                default:
                    System.out.println("Em breve...");
                    home.menu();
            }

        } else if (EscolhaMenu == 2) {
            System.out.println("Saindo....");


        } else if (EscolhaMenu == 3) {
            configmenu.ajustes();

        }


    }


}



