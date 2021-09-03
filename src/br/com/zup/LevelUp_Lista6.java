package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LevelUp_Lista6 {
    public static void main(String[] args) {
        //Crie um programa para gerenciar uma lista de alunos, cada aluno tem nome, telefone e email.
        Scanner leitor = new Scanner(System.in);
        Map<String, String> alunos = new HashMap<String, String>();

        System.out.println("Bem vindo ao cadastramento de alunos!");
        System.out.println("Por favor digite o nome completo do aluno: ");
        String nome = leitor.nextLine();
        System.out.println("Agora digite o telefone: ");
        String telefone = leitor.nextLine();
        System.out.println("Por fim digite o email: ");
        String email = leitor.nextLine();

        //No final do programa deve ser exibido a lista de alunos cadastrados.



    }
}
