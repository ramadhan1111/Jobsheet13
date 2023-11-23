import java.util.Scanner;

public class FungsiKel6_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data mahasiswa
        String namaMahasiswa = inputDataMahasiswa("Nama Mahasiswa: ");
        String nim = inputDataMahasiswa("NIM Mahasiswa: ");
        String prodi = inputDataMahasiswa("Prodi Mahasiswa: ");

        // Menampilkan data mahasiswa dalam bentuk tabel
        System.out.println("=====================================");
        System.out.println("|          Data Mahasiswa           |");
        System.out.println("=====================================");
        System.out.println("| Nama          | " + padRight(namaMahasiswa, 15) + " |");
        System.out.println("| NIM           | " + padRight(nim, 15) + " |");
        System.out.println("| Prodi         | " + padRight(prodi, 15) + " |");
        System.out.println("=====================================");

        scanner.close();
    }

    // Fungsi untuk input data mahasiswa
    private static String inputDataMahasiswa(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Fungsi untuk menambahkan spasi di sebelah kanan
    private static String padRight(String input, int length) {
        return String.format("%-" + length + "s", input);
    }
}