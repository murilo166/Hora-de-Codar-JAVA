import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        menu();

    }

    static void menu() {
        System.out.println("digite   1.para exercicio um    2.  execercicio dois   3.exercicio tres    4.exercicio  quatro   5.exercicio cinco    6.exercicio  seis    7.exercicio  sete   8.exercicio 8   9. exercicio nove   10.exercicio dez    11. exercicio onze   12.exercicio doze   13.exercicio treze   14.exercicio quatorze  15. exercicio quinze ");


        Scanner men = new Scanner(System.in);

        int ditar = men.nextInt();

        int escolha = ditar;

        switch (escolha) {

            case 1:
                plutao();

            case 2:
                execercio2();

            case 3:
                exercicio3();

            case 4:
                exercicio4();

            case 5:
                exercicio5();

            case 6:
                exercicio6();

            case 7:
                exercicio7();

            case 8:
                exercicio8();

            case 9:
                exercicio9();

            case 10:
                exerciciodez();

            case 11:
                exercicioonze();

            case 12:
                exercicio12();

            case 13:
                exercicio13();

            case 14:
                exercicio14();

            case 15:
                exercicio15();


        }

    }


    static void plutao() {
        String planeta = "plutao";

        System.out.println(planeta);
    }

    static void execercio2() {

        System.out.print("escreva o seu nome?");

        Scanner ng = new Scanner(System.in);

        String nome = ng.nextLine();

        System.out.println("ola" + " " + nome);
    }

    static void exercicio3() {
        System.out.println("qual e o seu nome?");

        Scanner ty = new Scanner(System.in);

        String nome = ty.nextLine();

        System.out.println("qual e a sua idade?");

        int idaded = ty.nextInt();

        System.out.println("ola" + " " + nome + " " + "sua idade e" + " " + idaded);
    }


    static void exercicio4() {


        System.out.println("digite um valor ");

        Scanner nuber = new Scanner(System.in);

        int numero = nuber.nextInt();


        if (numero == 0) {

            System.out.println(numero + " " + "e um numero neutro");
        }

        if (numero > 0) {

            System.out.println(numero + " " + "e um numero positivo");

        }
        if (numero < 0) {
            System.out.println(numero + " " + "e um numero negativo");
        }


    }

    static void exercicio5() {

        System.out.println("digite o primeiro valor ");

        Scanner mun = new Scanner(System.in);

        int valorum = mun.nextInt();

        System.out.println("digite o segundo valor ");

        int valordois = mun.nextInt();


        System.out.println("digite o terceiro valor ");

        int valortres = mun.nextInt();


        int resultado = Math.max(valorum, valordois);

        if (resultado == valorum) {

            int resul = Math.max(valorum, valortres);

            System.out.println(resul + "e o maior numero");

        }
        if (resultado == valordois) {

            int rest = Math.max(valordois, valortres);

            System.out.println(rest + "e o maior valor");

        }


    }


    static void exercicio6() {

        System.out.println("digite o primeiro valor");

        Scanner futuro = new Scanner(System.in);

        int valorum = futuro.nextInt();

        System.out.println("digite o segundo valor");

        int valordois = futuro.nextInt();

        System.out.println("digite o terceiro  valor");

        int valortres = futuro.nextInt();

        System.out.println("digite o quarto valor");

        int valorquatro = futuro.nextInt();

        int con = Math.max(valorum, valordois);

        int cons = Math.max(valortres, valorquatro);

        int resultado = Math.max(con, cons);

        System.out.println(resultado + "e o maior deles");

    }


    static void exercicio7() {

        System.out.println("digite o primeiro valor");

        Scanner pou = new Scanner(System.in);

        int primeironumero = pou.nextInt();

        System.out.println("digite o segundo valor");

        int segundonumero = pou.nextInt();

        System.out.println("digite o terceiro valor");

        int terceironumero = pou.nextInt();


        int calculo = Math.max(primeironumero, segundonumero);


        int caluclodois = Math.max(calculo, terceironumero);

        System.out.println(calculo + " " + caluclodois + " " + "sao os dois maiores numeros");

    }

    static void exercicio8() {

        System.out.println("digite o primeiro valor");

        Scanner robben = new Scanner(System.in);

        int valorum = robben.nextInt();

        System.out.println("digite o segundo valor");

        int valordois = robben.nextInt();

        System.out.println("digite o terceiro valor");

        int valortres = robben.nextInt();

        System.out.println("digite o quarto valor");

        int valorquarto = robben.nextInt();

        System.out.println("digite o quinto valor");

        int valorquinto = robben.nextInt();


        int calculoum = Math.max(valorum, valordois);

        int calculodois = Math.max(valortres, valorquarto);

        int calculofinalum = Math.max(calculoum, calculodois);

        int calculofinaldois = Math.max(calculofinalum, valorquinto);

        System.out.println(calculofinalum + " " + calculofinaldois + " " + "sao os maiores valores");


    }

    static void exercicio9() {

        System.out.println("digite o primeiro valor");

        Scanner gol = new Scanner(System.in);

        int numeroum = gol.nextInt();

        System.out.println("digite o segundo valor");

        int numerodois = gol.nextInt();

        if (numerodois == 0 && numerodois <= 0) {
            System.out.println("digite um novo valor para o segundo valor");

            int valornovo = gol.nextInt();

            System.out.println(numeroum / valornovo + " " + "e o resultado da divisao");


        } else {

            System.out.println(numeroum / numerodois + " " + "esse e o resultado da divisao");


        }

    }

    static void exerciciodez() {
        int i = 0;

        while (i < 11) {
            System.out.println("digite o primeiro valor");

            Scanner in = new Scanner(System.in);

            int valorum = in.nextInt();

            System.out.println("digite o segundo valor");

            int valordois = in.nextInt();

            System.out.println("digite o valor tres");

            int valortres = in.nextInt();

            System.out.println("digite o valor quatro");

            int valorquatro = in.nextInt();

            System.out.println("digite o valor cinco");

            int valorcinco = in.nextInt();

            System.out.println("digite o sexto valor");

            int valorsexto = in.nextInt();

            System.out.println("digite o setimo valor");

            int valorsetimo = in.nextInt();

            System.out.println("digite o oitavo valor");

            int valorpoitavo = in.nextInt();

            System.out.println("digite o nono valor");

            int valornono = in.nextInt();

            System.out.println("digite o decimo valor");

            int valordez = in.nextInt();

            int soma = (valorum + valordois + valortres + valorquatro + valorcinco + valorsexto + valorsetimo + valorpoitavo + valornono + valordez) / 10;

            System.out.println(soma + " " + "e a media aritmetica");

        }

    }

    static void exercicioonze() {

        System.out.println("digite o nota um");

        Scanner em = new Scanner(System.in);

        int notaum = em.nextInt();

        System.out.println("digite a nota dois");

        int notadois = em.nextInt();

        System.out.println("digite a nota tres");

        int notatres = em.nextInt();

        System.out.println("digite a nota quatro");

        int notaquatro = em.nextInt();

        int media = (notaum + notadois + notatres + notaquatro) / 4;

        if (media >= 6.5) {
            System.out.println(" PARABENS voce esta aprovado");
        } else {
            System.out.println(" INFELIZMENTE voce esta reprovado");
        }


    }

    static void exercicio12() {

        int conatagem = 30;

        while (conatagem >= 1) {

            System.out.println(conatagem+" "+" segundo  para explodir");

            conatagem--;

        }

        if (conatagem==0){
            System.out.println("EXPLOSAO !!!!");
        }



    }

    static void exercicio13(){

       int contagem=10;

       while (contagem>=1){

           System.out.println(contagem);

           contagem--;


       }

    }

    static void exercicio14(){

        System.out.println("escreva o primeiro numero maior do que o segundo");

        Scanner fer= new Scanner(System.in);

        int primeiro= fer.nextInt();

        System.out.println("escreva o segundo numero");

        int segundo= fer.nextInt();

        int media=(primeiro+segundo)/2;



        int contagem=primeiro;

        while (contagem>segundo){
            System.out.println(contagem);

            contagem--;
        }

        System.out.println(media+" "+" e a media aritmetica");




    }

    static void exercicio15(){

        System.out.println("digite o nome do aluno");
        Scanner tr= new Scanner(System.in);


        String [] nome = new String[5];



        System.out.println("digite o nota um");

        Scanner em = new Scanner(System.in);

        int notaum = em.nextInt();

        System.out.println("digite a nota dois");

        int notadois = em.nextInt();

        int media=(notaum+notadois)/2;

        if (media >= 6.5) {
            System.out.println(nome+" "+" PARABENS voce esta aprovado");





            System.out.println("gostaria de adicionar mais um aluno aperte 1(sim) ou 2(não) ");
            Scanner um= new Scanner(System.in);
            int escolha= um.nextInt();


            while (escolha==1) {
                exercicio15();


                if(escolha==2){


                        System.out.println(nome[1]);


/*ainda nâo consegui resolver vou buscar ajuda para resolver com o meu professor*/

            }






            }


            }




        }







    }















