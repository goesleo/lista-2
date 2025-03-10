import java.util.Scanner;
public class exercicio_cinco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade por favor: ");
        int idade = sc.nextInt();

        if (idade >= 18 && idade <= 67){
            System.out.println("Você pode doar sangue.");
        } else{
            System.out.println("Você não pode doar sangue.");
        }

    }


}
