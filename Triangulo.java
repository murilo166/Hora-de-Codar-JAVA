import java.util.Scanner;
public class Triangulo {
    public static void main(String[]args){

        System.out.println("digite o valor da base ");

        Scanner ben= new Scanner(System.in);
        int base= ben.nextInt();

        System.out.println("digite o valor da altura ");
        int altura= ben.nextInt();

        System.out.println("o valor da area:"+(base*altura)*2);

    }
}
