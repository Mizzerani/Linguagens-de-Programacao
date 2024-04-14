package main.java;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {1
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao;
        int apostaNumero;
        char apostaLetra;
        char letraViciada = 'M';
        int apostaParImpar;
        try{
            do {
                System.out.println("--------- Sorteio Lotofácil ---------");
                System.out.println("1. Sorteio de números de 0 até 100");
                System.out.println("2. Sorteio de letras A até Z");
                System.out.println("3. Sorteio de números pares/ímpares");
                System.out.println("0. Sair");
                System.out.println("-------------------------------------");
                System.out.print("\nEscolha uma opção: \n");
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1 -> {
                        System.out.println("Aposta de números de 0 até 100 selecionada.");
                        System.out.print("\nDigite um número, de 0 a 100. \n");
                        int numeroAposta = random.nextInt(101);
                        apostaNumero = scanner.nextInt();
                        if (apostaNumero > 100) {
                            System.out.println("Opção inválida! Digite um número menor que 100.");
                        }
                        else if (apostaNumero < 0) {
                            System.out.println("Opção inválida! Digite um número maior que 0.");
                        }
                        else if (apostaNumero == numeroAposta) {
                            System.out.println("Parabéns!!! Você ganhou R$ 1.000,00 reais!");
                        }
                        else {
                            System.out.println("Que pena! O número sorteado foi:  " + numeroAposta);
                        }
                    }
                    case 2 -> {
                        System.out.println("Aposta de A até Z selecionada.");
                        System.out.println("\nDigite uma letra, de A até Z. \n");
                        apostaLetra = scanner.next().toUpperCase().charAt(0);
                        if (!Character.isLetter(apostaLetra)) {
                            System.out.println("Opção inválida! Digite apenas uma letra!");
                        }
                        else if (apostaLetra == letraViciada) {
                                System.out.println("Parabéns!!! Você ganhou R$ 500,00 reais!");
                        }
                        else {
                                System.out.println("Que pena! A letra sorteada foi: " + letraViciada);
                        }
                    }
                    case 3 -> {
                        System.out.println("Aposta entre par ou ímpar selecionada.");
                        System.out.println("\nDigite um número inteiro. \n");
                        apostaParImpar = scanner.nextInt();
                        if (apostaParImpar % 2 == 0) {
                            System.out.println("Parabéns!!! Você ganhou R$ 100,00 reais!");
                        }
                        else {
                            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                        }
                    }
                    case 0 -> System.out.println("Encerrando...");
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }
            } while (opcao != 0);
        }
        catch (InputMismatchException e) {
            System.out.println("Erro! O valor digitado não é válido. Tente novamente!");
        }
        scanner.close();
    }
}