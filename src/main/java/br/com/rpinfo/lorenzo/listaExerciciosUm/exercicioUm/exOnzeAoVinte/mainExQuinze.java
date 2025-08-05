package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exOnzeAoVinte;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExQuinze {
    public static void main(String[] args) {
        System.out.println("=== DIAMANTE DE ASTERISCOS ===\n");
        piramide();
    }

    public static void piramide() {
        int numLinhas = 7;
        int contSpace = numLinhas - 1;
        int contTeste = 0;

        firstHalf(contSpace, numLinhas, contTeste);
        contSpace = 1;
        secondHalf(contSpace, numLinhas, contTeste);
    }

    public static void firstHalf(int contSpace, int numLinhas, int contTeste){
        for (int i = 1; i <= numLinhas; i++) {
            for (int k = contSpace; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                contTeste++;
            }
            contTeste--;
            for (int m = 1; m <= i; m++) {
                if (i != 1 && contTeste > 0) {
                    System.out.print("*");
                    contTeste--;
                }
            }
            System.out.println();
            contSpace--;
        }
    }
    public static void secondHalf(int contSpace, int numLinhas, int contTeste){
        for(int n=numLinhas-1; n>=1; n--){
            for (int o = contSpace; o >= 0; o--) {
                System.out.print(" ");
            }
            for (int p = 1; p<=n; p++){
                System.out.print("*");
                contTeste++;
            }
            for (int q=1; q<=n-1; q++){
                if(contTeste > 0){
                    System.out.print("*");
                    contTeste--;
                }
            }
            System.out.println();
            contSpace++;
        }
    }
}
