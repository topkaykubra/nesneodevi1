package nesneodevbir;

import java.util.Scanner;

public class nesneodevbir {
    
    private static Scanner input;

   
    public static void main(String[] args) {
        input = new Scanner(System.in);
        double birinciKenarUzunlugu, ikinciKenarUzunlugu, tabanUzunlugu , yukseklik,yaricap,kenarsayisi,kenarUzunluk,
                        cokkenCevresi,cokkenAlan, ucgenCevresi, ucgenAlani;
        
        System.out.println("Üçgenin Birinci Kenar Uzunluğunu giriniz:");
        birinciKenarUzunlugu = input.nextDouble();
        
        System.out.println("Üçgenin İkinci Kenar Uzunluğunu giriniz:");
        ikinciKenarUzunlugu= input.nextDouble();
        
        System.out.println("Üçgenin Taban Uzunluğunu Giriniz:");
        tabanUzunlugu= input.nextDouble();
        
        System.out.println("Üçgenin Yüksekliğini Giriniz:");
        yukseklik= input.nextDouble();
                
                System.out.println("Çokkenin yarıçapını giriniz:");
        yaricap= input.nextDouble();
                
                System.out.println("Düzgün çokkenin kenar sayısını giriniz:");
        kenarsayisi= input.nextDouble();
                
                System.out.println("Düzgün çokkenin bir kenar uzunluğunu giriniz:");
        kenarUzunluk= input.nextDouble();
        
               
        ucgenCevresi= ucgenCevresiHesapla(birinciKenarUzunlugu, ikinciKenarUzunlugu, tabanUzunlugu);
        ucgenAlani=ucgenAlaniHesapla(tabanUzunlugu, yukseklik);
                cokkenAlan=cokkenAlanHesapla(yaricap, kenarsayisi);
                cokkenCevresi=cokkeCevreHesapla(kenarUzunluk,kenarsayisi);
    
        cevreYazdir(ucgenCevresi);
        alanYazdir(ucgenAlani);
                alanaYazdir(cokkenAlan);
                cevreeYazdirc(cokkenCevresi);
        
        
       
    }

    private static double ucgenCevresiHesapla(double x, double y, double z) {
        double cevre= x + y + z;
        return cevre;
    }

    private static double ucgenAlaniHesapla(double z, double h) {
        double alan= (z*h)/2;
        return alan;
    }

    private static void cevreYazdir(double i) {
        System.out.println("Üçgenin Çevresi:"+i);
    }

    private static void alanYazdir(double j) {
        System.out.println("Üçgenin Alani:"+j);
    }

    private static double cokkenAlanHesapla(double a, double b) {
        double alana = 1/2*a*b;
                return alana;
    }

    private static void alanaYazdir(double k) {
        System.out.println("Çokken Alani:"+k);
        
    }

    private static double cokkeCevreHesapla(double c, double d) {
        double cevree = c*d;
              return cevree;
    }

    private static void cevreeYazdirc(double e) {
        System.out.println("Çokken çevresi:"+e);
    }
    
}