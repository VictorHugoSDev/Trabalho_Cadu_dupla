import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário o primeiro número
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        // Solicitar ao usuário o segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Solicitar ao usuário o segundo número
        System.out.print("Digite o segundo número: ");
        int numero3 = scanner.nextInt();

        // Calcular a soma dos dois números
        int soma = numero1 + numero2 + numero3;

        // Exibir o resultado da soma
        System.out.println("A soma dos números é: " + soma);

        // Fechar o scanner
        scanner.close();
    }
}
