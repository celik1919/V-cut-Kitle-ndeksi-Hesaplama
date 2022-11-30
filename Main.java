import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,kilo,vki;
        Scanner mec = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = mec.nextDouble();
        System.out.print("Lütfen kilonuzu (kilogram cinsinden) giriniz: ");
        kilo= mec.nextDouble();
        vki=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " +vki);
    }
}