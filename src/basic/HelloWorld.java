package basic;

public class HelloWorld {

    public static void main(String[] args) {
        int counter = 10;
        counter ++;
        method(counter);
    }
    public static void method(int counter)
    {
        System.out.println("HelloWorld");
        System.out.println("Counter value in method : "+counter);

        counter++;
        System.out.println("Counter value in method 1: "+counter);
        method2(counter);
    }
    public static void method2(int counter)
    {
        System.out.println("Method 2");
        counter++;
        System.out.println("Counter value in method 2: "+counter);

    }


}


