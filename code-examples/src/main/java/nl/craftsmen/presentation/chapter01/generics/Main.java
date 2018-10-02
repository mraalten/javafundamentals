package nl.craftsmen.presentation.chapter01.generics;

import nl.craftsmen.presentation.chapter01.generics.new_way.NewAccountConverter;
import nl.craftsmen.presentation.chapter01.generics.new_way.NewProductConverter;
import nl.craftsmen.presentation.chapter01.generics.old_way.OldAccountConverter;
import nl.craftsmen.presentation.chapter01.generics.old_way.OldProductConverter;

public class Main {

    public static void main(String[] args) {
        OldProductConverter oldProductConverter = new OldProductConverter();
        OldAccountConverter oldAccountConverter = new OldAccountConverter();

        oldProductConverter.process("old car");
        oldAccountConverter.process(12345);


        NewProductConverter newProductConverter = new NewProductConverter();
        NewAccountConverter newAccountConverter = new NewAccountConverter();

        newProductConverter.process("new car");
        newAccountConverter.process(67890);

    }

}
