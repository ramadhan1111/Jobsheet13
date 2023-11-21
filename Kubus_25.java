import java.util.Scanner;
public class Kubus_25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sisi kubus: ");
        int sisi = input.nextInt();

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Volume kubus adalah " + volume);
        System.out.println("Luas permukaan kubus adalah " + luasPermukaan);
    }

    private static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    private static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }
}
