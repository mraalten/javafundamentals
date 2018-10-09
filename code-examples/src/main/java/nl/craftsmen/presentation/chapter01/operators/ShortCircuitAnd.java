package nl.craftsmen.presentation.chapter01.operators;

public class ShortCircuitAnd {

    public static void main(String[] args) {
        System.out.println("Person 1");
        System.out.println("---------------------");
        Person person = new Person("M", 20);
        boolean isYoungMale = person.isMale() && person.isYoung();

        System.out.println(isYoungMale);

        System.out.println();

        System.out.println("Person 2");
        System.out.println("---------------------");
        Person person2 = new Person("V", 25);
        isYoungMale = person2.isMale() && person2.isYoung();

        System.out.println(isYoungMale);
    }


}
