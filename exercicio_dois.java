import java.util.Scanner;

public class exercicio_dois {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("\nDigite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("\ndigite o terceiro numero: ");
        int num3 = sc.nextInt();

        int maior;
        int menor;

        if (num1 > num2 && num1 > num3) {
            maior = num1;
        }else if (num2 > num1 && num2 > num3) {
            maior = num2;
        } else {
            maior = num3;
        }

        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        System.out.println("\nO maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);

        sc.close();


    }



}
