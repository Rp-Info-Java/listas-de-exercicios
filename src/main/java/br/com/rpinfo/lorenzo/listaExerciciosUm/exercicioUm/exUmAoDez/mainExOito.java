package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exUmAoDez;

import br.com.rpinfo.lorenzo.FunctionsAux;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class mainExOito {
    public static void main(String[] args) {
        int mes = 0, dia = 0;
        int ano;
        Calendar c = Calendar.getInstance();
        System.out.println("=== Quantia de Dias no Mês do Ano Informado ===");
        System.out.println("Informe um ano: ");
        ano = FunctionsAux.lerOpcaoInt();
        c.set(Calendar.YEAR, ano);

        do{
            System.out.println("Informe qual mês deseja ver a quantia de dias (1-12): ");
            mes = FunctionsAux.lerOpcaoInt();

            if(mes < 1 || mes > 12){
                System.out.println("Mês incorreto. Forneça um número de mês válido (1-12)!\n");
            }
        }while(mes < 1 || mes > 12);

        setarMes(mes, c);
        diaAno(mes, c);

        do{
            System.out.println("Informe um dia para o mês escolhido (1-31): ");
            dia = FunctionsAux.lerOpcaoInt();

            if(dia < 1 || dia > 31){
                System.out.println("Informe um número de dia válido para o mês escolhido (1-31)!\n");
            } else if (dia > 29 && mes == 2){
                System.out.println("O mês escolhido não possui essa quantia de dias!\n");
            }
        }while(dia < 1 || dia > 31 || (dia > 29 && mes == 2));

        c.set(Calendar.DAY_OF_MONTH, dia);
        Calendar calendGrego = new GregorianCalendar(ano, mes - 1, c.get(Calendar.DAY_OF_MONTH));
        int diasDaSemana = calendGrego.get(Calendar.DAY_OF_WEEK);

        diaSemana(diasDaSemana, dia, mes, ano);
    }

    public static void diaSemana(int diasDaSemana, int dia, int mes, int ano){
        String diaMesSemana = switch(diasDaSemana){
            case 1 -> "Domingo";
            case 2 -> "Segunda-Feira";
            case 3 -> "Terça-Feira";
            case 4 -> "Quarta-Feira";
            case 5 -> "Quinta-Feira";
            case 6 -> "Sexta-Feira";
            case 7 -> "Sábado";
            default -> "Não representa um dia da semana!\n";
        };
        System.out.println("No dia: " + dia + "/" + mes + "/" + ano + ". O dia da semana era: " + diaMesSemana);
    }

    public static void diaAno(int mes, Calendar c) {
        if (mes <= 7 && mes % 2 != 0 || (mes > 7 && mes%2 == 0)) {
            System.out.println("O mês de " + mesString(mes) + " possui 31 dias!\n");
        } else if (mes == 2) {
            if (Year.isLeap(c.get(Calendar.YEAR))) {
                System.out.println("O mês de " + mesString(mes) + " possui 29 dias!\n");
            } else {
                System.out.println("O mês de " + mesString(mes) + " possui 28 dias!\n");
            }
        } else {
            System.out.println("O mês de " + mesString(mes) + " possui 30 dias!\n");
        }
    }
    public static String mesString(int mes){
        String mesNome = switch(mes){
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Não representa um mês!\n";
        };
        return mesNome;
    }
    public static void setarMes(int mes, Calendar c){
        switch(mes){
            case 1: c.set(Calendar.MONTH, 1);
                break;
            case 2: c.set(Calendar.MONTH, 2);
                break;
            case 3: c.set(Calendar.MONTH, 3);
                break;
            case 4: c.set(Calendar.MONTH, 4);
                break;
            case 5: c.set(Calendar.MONTH, 5);
                break;
            case 6: c.set(Calendar.MONTH, 6);
                break;
            case 7: c.set(Calendar.MONTH, 7);
                break;
            case 8: c.set(Calendar.MONTH, 8);
                break;
            case 9: c.set(Calendar.MONTH, 9);
                break;
            case 10: c.set(Calendar.MONTH, 10);
                break;
            case 11: c.set(Calendar.MONTH, 11);
                break;
            case 12: c.set(Calendar.MONTH, 12);
                break;
            default:
                System.out.println("Não é um mês válido!\n");
                break;
        }
        System.out.println("Mês: " + mesString(mes));
    }

}
