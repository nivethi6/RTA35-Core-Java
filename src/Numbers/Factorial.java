package Numbers;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char c;

        do{
            System.out.print("Enter a Number: ");
            int n=scanner.nextInt();
            long f = 1;
            for(int i=1;i<=n;i++){
                f*=i;
            }

            System.out.print("Factorial Number is: "+f);
            System.out.print("\nDo you want to continue Y/N: ");
            c = scanner.next().charAt(0);
        }while(c=='y' || c=='Y');
        System.out.println("Thank You");

    }

}
