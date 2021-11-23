package me.berniga;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2021, 9, 22);
        int anno = data.getYear();
        int mese = data.getMonthValue();
        int giorno = data.getDayOfMonth();
        Month nomeMese = data.getMonth();
        DayOfWeek nomeGiorno=data.getDayOfWeek();
        System.out.println(data);
        System.out.println(anno);
        System.out.println(mese+" "+nomeMese);
        System.out.println(giorno+" "+nomeGiorno);
        System.out.println("Numero giorni di "+nomeMese+": "+data.lengthOfMonth());
        System.out.println();
        //-------------
        LocalDate data2 = LocalDate.now();
        LocalDate data3 = data2.minusMonths(2);
        LocalDate data4 = data2.plusMonths(1);
        LocalDate data5 = data2.withYear(2020);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Data2 = "+data2+"\t");
        System.out.println("Data2 = "+data2.format(formatter));
        System.out.print("Data3 = "+data3+"\t");
        System.out.println("Data3 = "+data3.format(formatter));
        System.out.print("Data4 = "+data4+"\t");
        System.out.println("Data4 = "+data4.format(formatter));
        System.out.print("Data5 = "+data5+"\t");
        System.out.println("Data5 = "+data5.format(formatter));
        System.out.println();
        //-------------
        LocalTime orario = LocalTime.of(12,30,10);
        System.out.println("Orario = "+orario);
        System.out.println("Ore = "+orario.getHour());
        System.out.println("Minuti = "+orario.getMinute());
        System.out.println("Secondi = "+orario.getSecond());
        System.out.println();
        //-------------
        LocalDateTime dataOrario = LocalDateTime.of(data, orario);
        System.out.println("Data e orario = "+dataOrario);
        System.out.println(dataOrario.getDayOfMonth());
        System.out.println(dataOrario.getMonthValue());
        System.out.println(dataOrario.getYear());
        System.out.println(dataOrario.getHour());
        System.out.println(dataOrario.getMinute());
        System.out.println(dataOrario.getSecond());
        System.out.println();
        //-------------
    }
}
