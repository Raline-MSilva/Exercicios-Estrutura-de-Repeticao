package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_8_Lista6 {
    public static void main(String[] args) {
        //Faça um Programa que leia uma lista de 5 números inteiros e mostre-os.

        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        int contador = 1;


        while (contador <= 5) {
            System.out.println("Por favor digite um número" + contador + ": ");
            int valorDadoPeloUsuario = leitor.nextInt();

            numeros.add(valorDadoPeloUsuario); // inicio a minha lista com os numeros escolhido pelo usuario
                contador++;

        }
        System.out.println(numeros); // printa os números que foi digitado pelo usuário.

    }
}
