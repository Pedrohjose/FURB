package Exercicios;

import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        String[] perguntas = {
            "Gosta de música sertaneja?",
            "Gosta de futebol?",
            "Gosta de seriados?",
            "Gosta de redes sociais?",
            "Gosta da Oktoberfest?"
        };

        String[] rapaz = lerRespostas("rapaz", perguntas);
        String[] moca = lerRespostas("moça", perguntas);
        int afinidade = calcularAfinidade(rapaz, moca);
        exibirResultado(afinidade);
    }

    private static String[] lerRespostas(String pessoa, String[] perguntas) {
        Scanner sc = new Scanner(System.in);
        String[] respostas = new String[perguntas.length];
        System.out.println("Respostas de " + pessoa + ":");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i] + " (SIM/NÃO/IND): ");
            respostas[i] = sc.next().toUpperCase();
        }
        return respostas;
    }

    private static int calcularAfinidade(String[] r1, String[] r2) {
        int afinidade = 0;
        for (int i = 0; i < r1.length; i++) {
            if (r1[i].equals(r2[i])) {
                afinidade += 3;
            } else if (r1[i].equals("IND") || r2[i].equals("IND")) {
                afinidade += 1;
            } else {
                afinidade -= 2;
            }
        }
        return afinidade;
    }

    private static void exibirResultado(int pontos) {
        System.out.println("Afinidade: " + pontos);
        if (pontos == 15) System.out.println("Casem!");
        else if (pontos >= 10) System.out.println("Vocês têm muita coisa em comum!");
        else if (pontos >= 5) System.out.println("Talvez não dê certo :(");
        else if (pontos >= 0) System.out.println("Vale um encontro.");
        else if (pontos >= -9) System.out.println("Melhor não perder tempo");
        else System.out.println("Vocês se odeiam!");
    }
}
