import java.util.Scanner;;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int num2 = scanner.nextInt();

        try {
            if(num1 > num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i=num1; i<=num2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
