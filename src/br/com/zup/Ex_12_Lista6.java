package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_12_Lista6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        //Faça um Programa que leia uma lista de 5 números inteiros, mostre a soma, a multiplicação e os números.

        int contador = 1;
        int soma = 0;
        int multiplicacao = 1;


        while (contador <= 5){
            System.out.println("Digite o número" +contador+ ":");
            int qntNumeros = leitor.nextInt();

            numeros.add(qntNumeros);

            if (qntNumeros >= 0){
                soma = soma + qntNumeros;
                multiplicacao = soma * contador;
            }
            contador++;


        }
        System.out.println("Lista de numeros" + numeros);
        System.out.println("A soma dos números é de: " + soma);
        System.out.println("A multiplicação dos números é de: " + multiplicacao);

    }
}
