import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class exercicio6 {
    public static void main(String[] args) {

//        Dado a lista de números:
//
//        List<Integer> lista = Arrays.asList(1,2,3,4);
//
        List<Integer> lista = Arrays.asList(1,2,3,4);
//        Percorra a lista e gere uma nova com o triplo do valor de cada elemento

        List<Integer> listaVezesTres = new ArrayList<>();

//        for (int valor : lista){
//            listaVezesTres.add(valor*3);
//        }
//        System.out.println(listaVezesTres);

//        lista.forEach(el -> listaVezesTres.add(el*3));
//        System.out.println(listaVezesTres);

//        List<Integer> triplos = lista.stream().map(valor -> valor * 3).collect(toList());
//        System.out.println(triplos);

        List<Integer> triplos = new ArrayList<>();
        for(int i=0; i<lista.size(); i++){
            triplos.add(lista.get(i)*3);
        }
        System.out.println(triplos);


    }
}
