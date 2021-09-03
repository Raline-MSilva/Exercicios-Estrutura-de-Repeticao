package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_11_Lista6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> numPares = new ArrayList<>();
        List<Integer> numImpares = new ArrayList<>();

        //Faça um Programa que leia 20 números e armazene-os numa lista.
        //Armazene os números pares na lista PAR e os números ÍMPARES na lista ímpar.
        //Imprima as três listas.
        int contador = 1;

        while (contador <= 20){
            System.out.println("Digite o número" +contador+ ":");
            int qntNumeros = leitor.nextInt();

            numeros.add(qntNumeros);
            contador++;
            if (qntNumeros % 2 == 0){
                 numPares.add(qntNumeros);
            }
            else {
                numImpares.add(qntNumeros);
            }

        }
        System.out.println("Números escolhidos" +numeros);
        System.out.println("Números Pares dos números escolhidos" +numPares);
        System.out.println("Números Impares dos números escolhidos" +numImpares);
    }
}


