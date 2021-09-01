package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
//        Os números primos possuem várias aplicações dentro da Computação, por exemplo
//        na Criptografia. Um número primo é aquele que é divisível apenas por um e
//        por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.

        System.out.println("Por favor digite um número positivo: ");
        int numeroPrimo = leitor.nextInt();
        int contador = 1;
        int numeroDivisor = 0;

        while (contador <= numeroPrimo) {

            if (numeroPrimo % contador == 0) {
                numeroDivisor++;
            }
            contador++;
        }
        if (numeroDivisor == 2){
            System.out.println("O número digitado é primo.");
        }
        else {
            System.out.println("O número digitado não é primo.");
        }

    }
}
