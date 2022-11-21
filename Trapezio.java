import java.util.Scanner;
public class Trapezio {

    public static void main(String[]args){

        System.out.println("digite o valor da base maior");

        Scanner jet= new Scanner(System.in);

        int basemaior= jet.nextInt();

        System.out.println("digite o valor da base menor");
        int basemenor= jet.nextInt();

        System.out.println("digite o valor da altura");
        int altura= jet.nextInt();

        System.out.println("digite o valor da area e do trapezio e:"+(basemaior*basemenor)*(altura)/2);






    }
}
