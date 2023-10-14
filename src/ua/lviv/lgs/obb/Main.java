package ua.lviv.lgs.obb;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<Obbj> mySet = new HashSet<>();
        mySet.add(new Obbj("Object1", 5));
        mySet.add(new Obbj("Object2", 2));
        mySet.add(new Obbj("Object3", 9));
        mySet.add(new Obbj("Object4", 1));

        System.out.println("Невідсортований список:");
        mySet.forEach(System.out::println);

        Set<Obbj> mySet1 = mySet.stream()
                .sorted(Obbj::compareTo)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("Відсортований список:");
        mySet1.forEach(System.out::println);
    }
}
