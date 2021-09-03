package br.com.zup;

import java.util.Scanner;

public class Ex_13_Lista6 {
    public static void main(String[] args) {
        Scanner peso = new Scanner(System.in);
        System.out.println("Digite o peso do peixe");
        double pesoDoPeixeExcedente = peso.nextDouble();


        //criando variaveis
        double pesoMaximoPeixe = 50;
        double multa = 4;

        //calculo do excedente
        double excedente = pesoDoPeixeExcedente - pesoMaximoPeixe;
        double resultado = excedente * multa;

        System.out.println("Peso máximo do peixe é: " + pesoMaximoPeixe + "kg");
        System.out.println("Peso Excedente é: " + excedente + "Kg");
        System.out.println("Valor da multa a pagar é:  R$" + resultado);

    }
}

