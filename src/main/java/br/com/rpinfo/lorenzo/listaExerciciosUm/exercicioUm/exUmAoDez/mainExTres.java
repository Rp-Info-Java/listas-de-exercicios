package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exUmAoDez;

import br.com.rpinfo.lorenzo.FunctionsAux;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class mainExTres {
    public static void main(String[] args) {
        int fuso;
        System.out.println("Insira o fuso horário de deslocamento para GMT: ");
        fuso = FunctionsAux.lerOpcaoInt();
        horarioGMT(fuso);
    }

    public static void horarioGMT(int fuso){
        Instant instant = Instant.now();
        String formattedInstant;
        if(fuso > 0){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
                    .withZone(TimeZone.getTimeZone("GMT+" + fuso).toZoneId());

            formattedInstant = formatter.format(instant);
        }else{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
                    .withZone(TimeZone.getTimeZone("GMT" + fuso).toZoneId());
            formattedInstant = formatter.format(instant);
        }
        System.out.println("Hora atual em GMT: " + formattedInstant);
    }
}
