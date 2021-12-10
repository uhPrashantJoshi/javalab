package ProgramStudent;

import CIE.*;
import SEE.*;
import java.util.*;

public class marksStudent {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students you'd like to take details of : ");
        int numberOfStudents = sc.nextInt();

        Internals[] s = new Internals[numberOfStudents];
        Externals[] e = new Externals[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {

            s[i] = new Internals();
            s[i].getData();

            e[i] = new Externals();
            e[i].getData();
        }

        System.out.println("\n\n================================================\n\n");

        System.out.println("Would you like to access the information of the students??\n1.Yes\n2.No");
        int userChoice = sc.nextInt();

        switch (userChoice) {

            case 1:
                for (int j = 0; j < numberOfStudents; j++) {
                    s[j].printData();
                    e[j].printData();
                }
                break;

            case 2:
                sc.close();
                return;

        }
        sc.close();

    }

}
