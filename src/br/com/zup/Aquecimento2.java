package br.com.zup;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aquecimento2 {
    /*Crie um programa para gerenciar uma lista de candidatos de um vestibular, cada candidato tem número de matrícula
    e uma nota. No final do programa, o usuário deve decidir se irá adicionar mais de um candidato, exibir todos os
    candidatos cadastrados ou excluir um candidato pelo número de matrícula.
     */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> candidatos = new HashMap<String, String>();

        System.out.println("Olá, bem vindo ao sistema de candidatos do vestibular!");

        boolean chaveEscolhida = true;
        int opcaoEscolhida = 0;

        while (chaveEscolhida){
            System.out.println("Digite 1: Para cadastrar um novo candidato");
            System.out.println("Digite 2: Para exibir a lista dos candidatos já cadastrados");
            System.out.println("Digite 3: Para excluir um candidato pelo número da sua matrícula");
            System.out.println("Digite 4: Para sair do sistema");
            opcaoEscolhida = leitor.nextInt();
            leitor.nextLine();

            if (opcaoEscolhida == 1){
                System.out.println("Digite o nome completo do candidato:");
                String nomeCandidato = leitor.nextLine();
                System.out.println("Agora digite a matrícula:");
                String matricula = leitor.nextLine();
                System.out.println("Por fim, digite a nota:");
                String nota = leitor.nextLine();
                candidatos.put(matricula, "\t" + "Nome: "+nomeCandidato+ "Nota: " + nota);
            }
            else if (opcaoEscolhida == 2){
                for (String listaCandidatos:candidatos.keySet()) {
                    System.out.println(listaCandidatos + candidatos.get(listaCandidatos));
                }
            }
            else if (opcaoEscolhida == 3){
                System.out.println("Digite a matricula do candidato que deseja deletar");
                String deletarCandidato = leitor.nextLine();
                System.out.println("Candidato deletado com sucesso!");
                candidatos.remove(deletarCandidato);
            }
            else if (opcaoEscolhida == 4){
                System.out.println("Você saiu do Sistema!");
                // pra parar o loop uso um número diferente de 0
                chaveEscolhida = false;
            }
            else {
                System.out.println("Por favor digite uma das opções do menu!");
            }
        }


    }
}
