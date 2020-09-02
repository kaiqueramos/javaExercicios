package profNelioAlves.exercicios.aula94.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list.add("Maria");
        list.add("Jhonas");
        list.add("Jacinto");
        list.add("Pedruzio");
        list.add(2, "Raphel");

        for (String x : list){
            System.out.println(x);
        }
        System.out.println("-------------------------------");
        list.removeIf(x -> x.charAt(0) == 'J');

        for (String x : list){
            System.out.println(x);
        }
        System.out.println("-------------------------------");

        System.out.println("Pedruzio: " + list.indexOf("Pedruzio"));
        System.out.println("Bob: " + list.indexOf("Bob"));

        System.out.println("-------------------------------");

        List<String > result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("-------------------------------");
        list.add("Marcola");

        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);
    }
}
