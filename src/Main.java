import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int zufallszahl =(int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        System.out.println(zufallszahl);
        int zahl;
        System.out.println("Zufallszahl zwischen 1 und 100 eingeben:");
       do {
           zahl = sc.nextInt();
           if (zufallszahl == zahl) {
               System.out.println("Gewonnen!!!");
           } else if (zufallszahl < zahl) {
               System.out.println("Die Zufallszahl ist kleiner");
               System.out.println("Versuch es nochmal:");

           } else {
               System.out.println("Die Zahl ist größer");
               System.out.println("Versuch es nochmal:");

           }
       }
       while (zahl!=zufallszahl);
    }
}
