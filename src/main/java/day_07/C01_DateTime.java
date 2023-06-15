package day_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C01_DateTime {
       /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Ali'nin dogum tarihini 23/6/15 formatına benzer bir formatta yazdırın
        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */

    public static void main(String[] args) {
        LocalDate dogAli =LocalDate.of(1923,10,29).plusYears(45).
                plusMonths(8).plusDays(15);

        LocalDate dogVeli =LocalDate.of(1993,9,15).minusYears(24).
               minusMonths(2).minusDays(11);

        System.out.println(dogAli);//1924-07-14
        System.out.println(dogVeli);//1924-07-14


        //23/6/15
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/M/dd");
        System.out.println(dtf.format(dogAli));


        if (dogAli.equals(dogVeli)){
            System.out.println("Ayni tarihte dogmuslar");
        }else{
            System.out.println("Ayni tarihte dogmamislar");
        }







    }


}
