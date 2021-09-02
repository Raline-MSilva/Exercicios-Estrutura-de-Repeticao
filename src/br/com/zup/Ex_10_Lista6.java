package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_10_Lista6 {
    public static void main(String[] args) {
        //Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
        Scanner leitor = new Scanner(System.in);
        List<Integer> notasAlunos = new ArrayList<>();

        int contador = 1;
        int soma = 0;

        while (contador <= 4) {
            System.out.println("Digite a nota " + contador + ":");
            int notas = leitor.nextInt();

            notasAlunos.add(notas);
            contador++;
            if (notas <= 10){
                soma = soma + notas;
            }
        }
        System.out.println(notasAlunos);
        System.out.println("A soma das notas é de: " + soma);
        System.out.println("A média das notas é de: " + soma /4);
    }
}
