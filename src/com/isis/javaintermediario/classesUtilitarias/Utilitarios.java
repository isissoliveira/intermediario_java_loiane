package com.isis.javaintermediario.classesUtilitarias;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Utilitarios {

    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();
        int ano = hoje.get(Calendar.YEAR);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);

        hoje.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Calendar data = new GregorianCalendar( 2010, 6, 4, 14, 25, 32);
        System.out.println( sd.format(data.getTime()));

        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);



    }


}
