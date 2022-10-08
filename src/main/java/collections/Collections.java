package collections;


import model.Produto;
import org.apache.commons.collections4.SetUtils;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        //HashSet is unsorted and unordered

        //LinkedHashSet is ordered and sorted

        //TreeSet is sorted
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha 1kg", 40.0, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
        Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 2250.5, 0);
        // não aceitam duplicatas
        Produto produto5 = new Produto("012", "Xiaomi Mi 9", 2500.5, 0);

        Set<Produto> produtoSet = new HashSet<>();
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);

        System.out.println("# # # HashSet # # #");
        for(Produto p : produtoSet){
            System.out.println(p);
        }

        Set<Produto> newProdutoSet;
        newProdutoSet = SetUtils.orderedSet(produtoSet);


        System.out.println("\n# # # HashSet Apache # # #");
        for(Produto p : newProdutoSet){
            System.out.println(p);
        }


    }
}
