package Main;

import java.util.Scanner;

public class CalculadoraPartidasRankeadas {

    public static String calculaNivel(int vitorias, int derrotas) {

        int saldoVitoria = vitorias - derrotas;
        String nivel;


        if (vitorias <= 10) {
            nivel = "Ferro";
        } else if (vitorias >= 11 && vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias >= 21 && vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }
        return "O Herói tem de saldo  " + saldoVitoria + " pontos e está no nível de " + nivel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas partidas deseja jogar? ");
        int quantidadePartidas = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer do scanner

        for (int i = 1; i <= quantidadePartidas; i++) {

            System.out.println("Quantas vitórias teve o jogador?");
            int quantidadeVitorias = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do scanner

            System.out.println("Quantas derrotas teve o jogador?");
            int quantidadeDerrotas = scanner.nextInt();

            String resultado = calculaNivel(quantidadeVitorias, quantidadeDerrotas);
            System.out.println(resultado);
        }
    }
}




