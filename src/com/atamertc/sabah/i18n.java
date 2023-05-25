package com.atamertc.sabah;

import java.util.Locale;
import java.util.ResourceBundle;

public class i18n {
    /*
    i18n : Internationalization -> Uluslararasilastirma
    l10n : Localization -> Yerellistirme
    g11n : Globalization -> Kuresellestirme

    Dil destegi
    Alfabe destegi
    Tarih
    Olcu birimleri
     */
    public static void main(String[] args) {

        //Farkli kullanicilar geldiginde farkli locallerde ilgili dosyalardaki verileri
        //gostermek istiyorum -> ResourceBundle : Kaynak Paketi
        Locale tr = Locale.of("tr", "TR");
        Locale en = Locale.of("en", "EN");
        ResourceBundle bundleTR = ResourceBundle.getBundle("text",tr);
        ResourceBundle bundleEN = ResourceBundle.getBundle("text",en);
        System.out.println(bundleTR.getObject("menu1item1"));
        System.out.println(bundleEN.getObject("menu1item1"));
        






    }
}
