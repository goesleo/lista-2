import java.util.Scanner;

public class exercicio_um {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero:");
        double num1 = sc.nextDouble();
        System.out.println("digite o segundo numero:");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("O mairo numero é: " + num1);
            System.out.println("O menor numero é: " + num2);
        } else if (num2 > num1) {
            System.out.println("O maior numero é: " + num2);
            System.out.println("O maior numero é: " + num1);
        } else {
            System.out.println("Os dois números são iguais!");
        }


    }

}
