package DaireAlan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        int r,a;
        double pi = 3.14, alan;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen dairenin yarı çapını giriniz =");
        r = inp.nextInt();
        System.out.print("Lütfen daire diliminin merkez açı değerini girin =");
        a = inp.nextInt();
        alan = (pi*(r*r)*a)/360;
        System.out.print("daire dilimini alanı = " + alan);
        /*İnstagram : Kursattrgt*/ 
    }
}