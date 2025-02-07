package Numbers;


import java.util.Scanner;

public class SumOfNNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char c;
        do {
            System.out.println("Enter a Number: ");
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("The Sum of N number is " + n + " \nNatural number is " + sum);
            System.out.println("Do you want to continue Y/N: ");
            c = scanner.next().charAt(0);
        }while(c=='y' || c=='Y');
        System.out.println("Thank You");

    }

}
