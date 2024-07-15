package th.ac.cmu.eng.isne.oop;

import java.time.LocalDate;

public class Admin extends User {



    // Constructor
    Admin(String name, int year, int month, int day) {
        super(name, year, month, day); // Call superclass constructor
    }

    Admin(){
        super();
    }

    //print "Hello admin " followed by the admin's name
    public void doSomething() {

        if (getDob().equals(LocalDate.now())){
            System.out.println("Happy birthday" + getName() + "!");
        } else {
            System.out.println("Hello admin " + getName() + "!");
        }


    }


    protected void doSomething(int n) {
        for (int i = 0; i < n; i++) {
            super.doSomething(); // Calls User's doSomething() method
        }
    }
}


