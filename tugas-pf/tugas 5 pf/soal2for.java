import static java.lang.System.out;
import java.util.Scanner;

public class soal2for {
	public static void main (String[] args) {
		int j = 0;
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("masukkan jumlah data: ");
		int n = sc.nextInt();
	
		for (int i = 0; i < n; i++) {
			System.out.print("masukkan data ke-" + (i + 1) + ": ");
			int data = sc.nextInt();
			j = j + data;
		}
	
		double r = (double) j / n;
		
		System.out.print("total jumlah adalah: " + j);
		System.out.print("rata-rata adalah: " + r);
	}
}