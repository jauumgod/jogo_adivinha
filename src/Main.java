import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero =0, choice=0, tentativas=0;
        String name = "";

        Scanner scan = new Scanner(System.in);
        Random randint = new Random();
        numero = randint.nextInt(1,50);

        System.out.println("BEM VINDO AO GAME [Você tem 10 tentativas!]");

        System.out.print("Digite seu nome: ");
        name = scan.next();

        while(choice!=numero){
            tentativas++;
            if(tentativas>10){
                System.out.print("Você Perdeu, excedeu as 10 tentativas! ");
            }
            System.out.print("Digite um numero entre [1-50]: ");
            choice = scan.nextInt();
            if(choice==numero){
                System.out.printf("PARABENS!!%s o numero Sorteado foi %d \n", name, numero);
                break;
            }
            if (choice>numero){
                System.out.print("Calma ai bb, digite um número Menor! ");
            }
            if (choice<numero){
                System.out.print("Opa, digite um número Maior! ");
            }
        }
    }
}