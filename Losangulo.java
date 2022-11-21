import java.util.Scanner;
public class Losangulo {

    public static void main(String[]args){

        System.out.println("digite o valor da diagonal maior");

        Scanner dent= new Scanner(System.in);


        int diagonalmaior= dent.nextInt();

        System.out.println("digite o valor da diagonal menor");
        int digonalmenor= dent.nextInt();

        System.out.println("o valor da area do losangulo e:"+(diagonalmaior*digonalmenor)/2);



    }
}
