package nl.craftsmen.presentation.aliexpress;

import nl.craftsmen.presentation.aliexpress.Bak;

public class Main {


    public static void main(String[] args) {
        Bak bak1 = new Bak(100, 100);
        Bak bak2 = new Bak(50, 50);

        boolean destinatinReached = bak1.destinationReached();

        System.out.println("done");
    }
}
