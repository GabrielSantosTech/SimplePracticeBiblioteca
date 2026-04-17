package Livros;

import java.util.ArrayList;
import java.util.List;

public class LivrosLista {

    List<String> book = new ArrayList<>();



    public LivrosLista() {

        book.add("Arte da Guerra");
        book.add("48 leis do poder");




    }

    public List<String> getBook() {
        return book;
    }
}
