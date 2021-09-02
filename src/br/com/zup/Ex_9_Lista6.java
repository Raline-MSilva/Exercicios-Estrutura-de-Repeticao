package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_9_Lista6 {
    public static void main(String[] args) {


        //Faça um Programa que leia uma lista de 10 números e mostre-os na ordem inversa.

        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        int contador = 1;
        int exibicao = 9;
        int fimExibicao = 0;

        while (contador <= 10) {
            System.out.println("Digite o número" + contador + ":");
            int qntNumeros = leitor.nextInt();

            numeros.add(qntNumeros);
            contador++;
        }
        System.out.println(numeros);

        while (exibicao >= fimExibicao) {
            System.out.println(numeros.get(exibicao));
            exibicao--;
        }

    }
}