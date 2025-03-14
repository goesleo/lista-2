import java.util.Scanner;

public class exercicio_tres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("o numero " + numero + " é par.");
        }else{
            System.out.println("o numero " + numero + " é impar.");
        }


    }
}
