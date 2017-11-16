import java.util.Scanner;

public class Main {

    public static void  Boom(){
        int number = 5;
        System.out.println("Your number is: "+number);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alibaba = sc.nextInt();
        System.out.println("");
        System.out.printf("");
        Boom();
        System.out.println("After add");
        System.out.println("Second sout");
        if (alibaba >= 0) {
            System.out.println("Number > " + alibaba);
        }
        else {
            System.out.println("You fucked up. SOrry");
        }
    }


}
