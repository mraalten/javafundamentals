package nl.craftsmen.presentation.chapter01.operators;

public class Person {

    private final String gender;
    private final int age;

    public Person(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public boolean isYoungMale() {
        boolean isMale = isMale();
        boolean isYoung = isYoung();
        boolean youngMale = isMale &= isYoung;
        System.out.println("Gender " + gender + " and age " + age + ": isYoung isMale: " + youngMale);
        return youngMale;
    }

    public boolean isMale() {
        System.out.println("isMale() called");
        return gender.equals("M");
    }

    public boolean isYoung() {
        System.out.println("isAge() called");
        return age < 21;
    }
}
