package my.pkg;

import my.pkg.GenericResponse.Fruit;

public class Main {

    public static void main(String[] args) {
        System.out.println(new GenericResponse().withFresh(Fruit.APPLE).withSpoil(Fruit.BANANA));
    }
}
