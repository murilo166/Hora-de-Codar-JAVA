import java.util.Scanner;
public class Paralelograma {

    public static void main(String[]args){

        System.out.println("digite o valor da base ");

        Scanner jor= new Scanner(System.in);
        int base= jor.nextInt();

        System.out.println("digite o valor da altura ");
        int altura= jor.nextInt();

        System.out.println("o valor da area:"+(base*altura));




    }
}
