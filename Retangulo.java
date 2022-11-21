import java.util.Scanner;
public class Retangulo {

    public static void main(String[]args){

        System.out.println("digite o valor da base?");


        Scanner pit= new Scanner(System.in);


        int base= pit.nextInt();

        System.out.println("digite o valor da altura?");


        int alutura= pit.nextInt();

        System.out.println("o valor da area do retangulo e:"+(base*alutura));


    }
}
