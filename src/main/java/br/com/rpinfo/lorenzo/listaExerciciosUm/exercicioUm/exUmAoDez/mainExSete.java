package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exUmAoDez;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExSete {
    public static void main(String[] args) {
        int num;

//        System.out.println("""
//                === Dias da Semana ===
//                1- Domingo
//                2- Segunda-Feira
//                3- Terça-Feira
//                4- Quarta-Feira
//                5- Quinta-Feira
//                6- Sexta-Feira
//                7- Sábado
//                """);
        System.out.println("=== Dias da Semana ===");
        System.out.println("Digite um número para imprimir o dia da semana (lembre-se, o primeiro dia da semana é o Domingo!): ");
        num = FunctionsAux.lerOpcaoInt();

        String diaSemana = switch(num){
            case 1 -> "Domingo";
            case 2 -> "Segunda-Feira";
            case 3 -> "Terça-Feira";
            case 4 -> "Quarta-Feira";
            case 5 -> "Quinta-Feira";
            case 6 -> "Sexta-Feira";
            case 7 -> "Sábado";
            default -> "Não é um dia da semana!";
        };

        System.out.println("O dia da semana escolhido foi: " + diaSemana);
    }
}
