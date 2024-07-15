package th.ac.cmu.eng.isne.oop;
// Main.java

import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        User john = new User("John", 1954, 2, 18);
        john.doSomething();

        Admin nicolas = new Admin();
        nicolas.setName("Nicolas");
        nicolas.setDob(LocalDate.of(1964, 1, 7));
        nicolas.doSomething();
        nicolas.doSomething(3);

        Admin peter = new Admin();
        peter.setName("Peter");
        peter.doSomething();

    }
}
