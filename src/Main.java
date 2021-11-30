import java.util.Scanner;


public class Main {
    public  static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int kimya,fizik,matematik,turkce,tarih,muzik,ort,gecme=60;
        System.out.println("Sırasıyla kimya, fizik, matematik, türkçe, tarih, müzik notlarını girin");
        kimya=scanner.nextInt();
        fizik=scanner.nextInt();
        matematik=scanner.nextInt();
        turkce=scanner.nextInt();
        tarih=scanner.nextInt();
        muzik=scanner.nextInt();

        ort=((kimya+fizik+matematik+turkce+tarih+muzik)/6);
        boolean gecme_kontrol=ort>=gecme;
        System.out.println("Ortalama:"+ort);
        String output=(gecme_kontrol)? "Sınıfı Geçti": "Sınıfta kaldı";
        System.out.println(output);

    }
}
