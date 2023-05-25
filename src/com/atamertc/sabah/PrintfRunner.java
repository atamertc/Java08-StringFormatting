package com.atamertc.sabah;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PrintfRunner {
    /*
    String formatlama:

     */
    public static void main(String[] args) {
        String metin = "Bilge Adam";
        String metin2 = "Bilge Kadin";
        //printf
        System.out.printf("Son calistigim sirket %s'dir.%n", metin);
        System.out.printf("Son calistigim sirket %s'dir.%s%n", metin, metin2);

        //% isareti yanina rakam konmasi kac karakter yer kaplayacagini belirtir (kendi dahil)
        String metin3 = "Ata Mert";
        System.out.printf("%10s\n", metin3);
        System.out.printf("Turkiye|%15s|\n", metin3);
        System.out.printf("Turkiye|%-15s|\n", metin3);
        System.out.println("----------------------------------------------");

        //%d : int byte short long gibi tam sayi degerleri ile calismak icin
        byte byteDegisken = 127;
        short shortDegisken = 32767;
        int intDegisken = Integer.MAX_VALUE;
        long longDekisken = Long.MAX_VALUE;
        System.out.printf("Byte: %d\nShort: %d\nInt: %d\nLong: %d\n",
                byteDegisken, shortDegisken, intDegisken, longDekisken);
        System.out.println("----------------------------------------------");
        //%f : float ve double tipleri stringe donusturur
        float floatDegisken = 987.65432110f;
        double doubleDegisken = 987.65432110;
        System.out.printf("Float: %20.8f\n", floatDegisken);
        System.out.printf("Double: %-20.4f\n", doubleDegisken);
        System.out.println("----------------------------------------------");
        //%o : Octal sayi 8 lik sistem
        int i = 16;
        System.out.printf("Octal: %o\n",i);
        //%x : hexadecimal 16 lik sistem
        int j = 16;
        System.out.printf("Hexa: %x\n",j);
        System.out.println("----------------------------------------------");

        String s = "Ankara";
        int sayi1 = 100;
        double dabil1 = 25.25d;
        System.out.printf("%s--%d--%.2f--%1$s\n", s, sayi1, dabil1);
        System.out.println("----------------------------------------------");
        //Dolar simgesi ile once virgulden sonra kacinci siradakini istedigini
        //dolarin soluna sayi ile belirt sonra dolar koy sonra degisken tipi
        System.out.printf("%1$s %1$s\n",s);
        System.out.println("----------------------------------------------");
        //Soru 1: input -> 2500 = output -> $2,500
        int a = 2500;
        float ab = 2500f;
        System.out.printf("$%,d\n",a);
        System.out.printf("%,.2f TL\n", ab);
        System.out.println("----------------------------------------------");
        //Tarih formatlama
        LocalDate ld = LocalDate.now();
        System.out.printf("Yil: %d Ay: %02d Gun: %d\n",
                ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth());
        System.out.println("----------------------------------------------");
        //%b boolean deger yazdirmak icin
        boolean dogruMu = true;
        System.out.printf("%b\n", dogruMu);
        System.out.println("----------------------------------------------");
        // + isareti gostermek icin
        int say1 = 10;
        int say2 = -10;
        System.out.printf("%+d\n", say1);
        System.out.printf("%+d\n", say2);
        System.out.println("----------------------------------------------");
        //String.format ile formatlama
        String str = String.format("%+d", say1); // Tek ozelligi geriye String dondurmesi
        System.out.println(str);
        System.out.println("----------------------------------------------");
        //Kaan 19/01/2000'de dogmustur -> ciktisi al
        String ad1 = "Kaan";
        LocalDate dt1 = LocalDate.of(2000, 1, 19);
        //1.yol
        System.out.printf("%s %d/%02d/%d'de dogmustur\n", ad1, dt1.getDayOfMonth(), dt1.getMonthValue(), dt1.getYear());
        //2.yol duzgun format veremedik
        System.out.printf(Locale.of("tr","TR"),"%s %tD'de dogmustur\n", ad1,dt1);
        System.out.printf(Locale.CANADA, "%s %tD'de dogmustur\n", ad1, dt1);
        //3. yol
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("%s %s'de dogmustur\n", ad1, dt1.format(dtf));












    }
}
