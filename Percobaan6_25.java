import java.util.Scanner;
public class Percobaan6_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;
        
        System.out.println("Masukkan panjang");
        p=input.nextInt();
        System.out.println("Masukkan lebar");
        l=input.nextInt();
        System.out.println("Masukkan tinggi");
        t=input.nextInt();

        L=p*l;
        System.err.println("Luas Persegi Panjang adalah "+L);

        vol=p*t;
        System.out.println("Volume balok adalah "+vol);
    }
    static int hitungLuas (int pjg, int lb){
        int Luas=pjg*lb;
        return Luas;
    }  
    static int hitungVolume (int tinggi, int a, int b){
        int volume=hitungLuas(a,b)*tinggi;
        return volume;
    }
}
