package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exUmAoDez;

import br.com.rpinfo.lorenzo.FunctionsAux;

//todas vao ter sua propria main
public class mainExUm {
    public static void main(String[] args) {
        //nao abreviar variaveis
        Double polegadas;

        System.out.println("\n=== Conversor de Polegadas para Metros ===\n");
        System.out.println("Digite o número de POLEGADAS que deseja converter para METROS: ");
        polegadas = FunctionsAux.lerOpcaoDouble();

        System.out.println("\nPolegadas: " + polegadas);
        System.out.println("Metros: " + conversao(polegadas) + " (m)");
    }

    public static Double conversao(Double polegadas){
        Double metros = 0D;
        metros = (polegadas * 0.0254);
        return metros;
    }
}
