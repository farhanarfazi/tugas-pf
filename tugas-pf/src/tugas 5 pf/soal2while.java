import static java.lang.System.out;
import java.util.Scanner;

public class soal2while {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("masukkan jumlah data: ");
		int n = sc.nextInt();
		int j = 0;
		int i = 0;
		
		while (i < n) {
			System.out.print("masukkan data ke-" + (i + 1) + ": ");
			int data = sc.nextInt();
			i++;
			j = j + data;
		}
		
		double r = (double) j / n;
		
		System.out.print("total jumlah adalah: " + j);
		System.out.print("rata-rata adalah: " + r);
	}
}