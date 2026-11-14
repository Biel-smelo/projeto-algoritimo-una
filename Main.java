# projeto-algoritimo-una
  import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=== SISTEMA DE TRIAGEM E AVALIAÇÃO DE PACIENTES ===");

        while (opcao != 2) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Realizar novo cadastro e avaliação");
            System.out.println("2 - Encerrar sistema");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            if (opcao == 1) {
                System.out.print("\nNome do paciente: ");
                String nome = sc.nextLine();

                System.out.print("Telefone para contato: ");
                String telefone = sc.nextLine();

                System.out.print("Peso (kg): ");
                double peso = sc.nextDouble();

                System.out.print("Altura (m): ");
                double altura = sc.nextDouble();

                double imc = calcularIMC(peso, altura);
                exibirFichaPaciente(nome, telefone, imc);

            } else if (opcao == 2) {
                System.out.println("\nEncerrando o sistema. Até logo!");
            } else {
                System.out.println("\nOpção inválida! Digite 1 ou 2.");
            }
        }

        sc.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void exibirFichaPaciente(String nome, String telefone, double imc) {
        System.out.println("\n--- FICHA DO PACIENTE ---");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.printf("IMC Calculado: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30.0) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
        System.out.println("-------------------------");
    }
}
