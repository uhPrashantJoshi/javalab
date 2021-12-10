package CIE;

import java.util.*;

public class Internals extends Student {
    public int[] cie_marks = new int[5];

    public void getData() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the Student");
        name = sc.nextLine();
        System.out.println("Enter the USN of the Student");
        USN = sc.next();
        System.out.println("Enter the Semester of the Student");
        semester = sc.nextInt();

        System.out.println("Enter the marks obtained in CIE: ");
        for (int i = 0; i < 5; i++) {

            System.out.println("CIE Marks obtained in Subject " + (i + 1));
            cie_marks[i] = sc.nextInt();

        }

    }

    public void printData() {
        System.out.println("\n\n\n\n\n\n\n\n================================================\n\n");
        System.out.println("Name : " + name);
        System.out.println("\nUSN : " + USN);
        System.out.println("\nSemester : " + semester + "\n");

        for (int i = 0; i < 5; i++) {

            System.out.println("CIE Marks obtained in Subject " + i + 1 + " is " + cie_marks[i]);

        }

    }

}
