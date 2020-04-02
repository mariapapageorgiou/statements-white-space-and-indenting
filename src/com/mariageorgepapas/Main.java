package com.mariageorgepapas;

public class Main {

    public static void main(String[] args) {

        int                       myVariable         =
                       50;                                 // Java is removing the white space so this is correct but not recommended way to write code

        if (myVariable == 50) {
            System.out.println("Printed");
        }
        myVariable     ++           ;                      // this is a complete statement as well but not recommended
        myVariable--;
        System.out.println("This is a test");

System.out.println("This is" +
"another" +                                           // the code here is readable by Java but not easy to read
"still more.");                                       // Ctrl+Alt+L to reformat code for proper indentation

        int anotherVariable = 50; myVariable--; System.out.println("This is another one");      // these are three complete statements
                                                                                                // it is not recommended to write code this way



    }
}
