package if1.pkg10119032.latihan28.gantikata;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk mengganti kata
 * didalam sebuah kalimat
 */
public class IF110119032Latihan28GantiKata {

    public static void main(String[] args) {
        //pengguna memasukkan kalimat awal
        Scanner scan = new Scanner(System.in);
        System.out.println("===== Program Mengganti Kata =====\n");
        System.out.print("Masukkan Kalimat : ");
        String kalimatAwal = scan.nextLine();
        
        //ganti kata didalam kalimat
        System.out.print("Ganti kata : ");
        String gantiKata = scan.next();
        System.out.print("Menjadi Kata : ");
        String menjadiKata = scan.next();
        
        //hasil keluaran
        System.out.println("\n===== Hasil Formatting =====");
        String kalimatBaru=kalimatAwal.replace(gantiKata,menjadiKata);
        System.out.println("Kalimat Awal : " + kalimatAwal);
        System.out.println("Kalimat Baru : " + kalimatBaru);
    }
    
}
