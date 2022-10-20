import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = userInput.nextInt();
        int contador = 0;
        int primo = 0;

        for(int inteiro = 1; inteiro <= numero; inteiro++) {
            primo = numero % inteiro;

            if(primo == 0) {
                contador = contador + 1;
            }
        }

        if(contador == 2) {
            System.out.println("O numero " + numero + " e primo");
        } else {
            System.out.println("O numero " + numero + " nao e primo");

        }
    }
}