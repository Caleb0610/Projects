import java.util.Scanner;

public class activity {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Student Number: ");
        String studentNumber = input.nextLine();

        System.out.print("Student Name: ");
        String studentName = input.nextLine();
        System.out.print("Course: ");
        String course = input.nextLine();
        
        System.out.print("Math Grade: ");
        double math = input.nextDouble();
        System.out.print("Science Grade: ");
        double science = input.nextDouble();
        System.out.print("PE Grade: ");
        double pe = input.nextDouble();
        System.out.print("English Grade: ");
        double english = input.nextDouble();
        System.out.print("Filipino Grade: ");
        double filipino = input.nextDouble();

        double average = (math + science + pe + english + filipino) / 5;

        System.out.println("----------------------------------");
        System.out.println("Student Number : " + studentNumber);
        System.out.println("Student Name   : " + studentName);
        System.out.println("Course         : " + course);
        System.out.println();
        System.out.println("Subjects       Grade");
        System.out.println("Math           : " + math);
        System.out.println("Science        : " + science);
        System.out.println("PE             : " + pe);
        System.out.println("English        : " + english);
        System.out.println("Filipino       : " + filipino);
        System.out.println();
        System.out.println("Average        : "+ average);
        System.out.println("-----------------------------------");
    }
}


// class Test {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }