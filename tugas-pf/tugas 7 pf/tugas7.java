import static java.lang.System.out;
import java.util.Scanner;
public class tugas7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Jumlah Data: ");
		int JumlahData = scanner.nextInt();
		
		int[] data = new int[JumlahData];
		
		for (int i = 0; i < JumlahData; i++) {
			System.out.print("Data ke-" + i + ": ");
			data[i] = scanner.nextInt();
		}
		
		System.out.println("Menampilkan Data");
		double totalpenjumlahan = 0;
		for (int i = 0; i < JumlahData; i++) {
			System.out.print(data[i] + "--> ");
			if (data[i] % 2 == 0) {
				System.out.println("Genap");
			} else {
				System.out.println("Ganjil");
			}
			totalpenjumlahan += data[i];
		}

System.out.println("Total Penjumlahan: " + totalpenjumlahan);
double RataRata = totalpenjumlahan / JumlahData;
System.out.println("Rata-Rata: " + RataRata);
	}
}