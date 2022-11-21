import java.util.Scanner;
public class Quadrado {
    public static void main(String[]args){

        System.out.println("digite o valor do lado um");

        Scanner bvd= new Scanner(System.in);

        int ladoum= bvd.nextInt();

        System.out.println("digite o valor do lado dois");

        int ladodois= bvd.nextInt();

        System.out.println("a area do quadrado e: "+(ladoum*ladodois));




    }
}
