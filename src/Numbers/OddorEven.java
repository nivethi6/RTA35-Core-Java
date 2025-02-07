package Numbers;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c;
        do{
        System.out.println("Enter a Number: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("The sum of number is: " + n + " Natural number is: " + sum);

        System.out.println("Even Number of 1 to " +n+" number is:");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Odd Number of 1 to " +n+" number is:");

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "");
            }
        }  System.out.println("Do you want to continue (Y/N): ");
            c = scanner.next().charAt(0);
        }while(c=='y' ||c=='Y');
        System.out.println("Exit");

    }
}
