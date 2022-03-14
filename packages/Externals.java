package SEE;

import CIE.Student;
import java.util.*;

public class Externals extends Student {

    public int[] seeMarks = new int[5];

    public void getData() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks obtained in SEE: ");
        for (int i = 0; i < 5; i++) {

            System.out.println("Marks obtained in Subject " + (i + 1) + " is");
            seeMarks[i] = sc.nextInt();

        }

    }

    public void printData() {
        System.out.println("\n\n================================\n\n");
        for (int i = 0; i < 5; i++) {

            System.out.println("SEE Marks obtained in Subject " + (i + 1) + " is " + seeMarks[i]);

        }
    }

}
