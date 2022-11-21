import java.util.Scanner;
public class Circulo {
    public static void main(String[]args) {

        System.out.println("digite o valor do raio ");

        Scanner cir = new Scanner(System.in);
        int raio = cir.nextInt();

        System.out.println("o valor da area do circulo e: "+ 3.14*(raio*raio));



    }


}
