package nl.craftsmen.presentation.chapter01.operators;

public class BooleanLogical {

    public static void main(String[] args) {
        Person youngMale = new Person("M", 20);
        Person oldMale = new Person("M", 65);
        Person youngFemale = new Person("F", 18);
        Person oldFemale = new Person("F", 79);

        youngMale.isYoungMale();
        oldMale.isYoungMale();
        youngFemale.isYoungMale();
        oldFemale.isYoungMale();
    }

}

