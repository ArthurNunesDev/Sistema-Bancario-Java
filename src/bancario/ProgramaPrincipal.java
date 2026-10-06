package bancario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {

    public static Scanner scanner = new Scanner(System.in);
    public static List<ContaBancaria> contas = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n------ MENU O BANCO ------");
            System.out.println("1 - Cadastrar conta");
            System.out.println("2 - Mostrar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    mostrarSaldo();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    sacar();
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }

    public static void cadastrar() {
        System.out.print("Digite o número da conta: ");
        int num = scanner.nextInt();

        if (buscarConta(num) != null) {
            System.out.println("Conta já cadastrada.");
            return;
        }

        scanner.nextLine();
        System.out.print("Digite o nome do titular: ");
        String nome = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(0.0, num, nome);
        contas.add(conta);

        System.out.println("Conta cadastrada com sucesso.");
    }

    public static void mostrarSaldo() {
        ContaBancaria c = encontrarEValidar();

        if (c != null) {
            System.out.println(c);
        }
    }

    public static void depositar() {
        ContaBancaria c = encontrarEValidar();

        if (c != null) {
            System.out.print("Digite o valor do depósito: ");
            double valor = scanner.nextDouble();
            c.depositar(valor);
            System.out.println("Depósito realizado com sucesso.");
        }
    }

    public static void sacar() {
        ContaBancaria c = encontrarEValidar();

        if (c != null) {
            System.out.print("Digite o valor do saque: ");
            double valor = scanner.nextDouble();

            if (c.sacar(valor)) {
                System.out.println("Saque realizado com sucesso.");
            }
        }
    }

    public static ContaBancaria encontrarEValidar() {
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        ContaBancaria conta = buscarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
        }

        return conta;
    }

    public static ContaBancaria buscarConta(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNum_conta() == numero) {
                return conta;
            }
        }

        return null;
    }
}
