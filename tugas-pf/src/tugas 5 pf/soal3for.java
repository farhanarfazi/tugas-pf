import static java.lang.System.out;
import java.util.Scanner;

public class soal3for {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("masukkan batas aritmatika: ");
		int n = sc.nextInt();
		System.out.print("masukkan bilangan awal: ");
		int a = sc.nextInt();
		System.out.print("masukkan bilangan beda: ");
		int b = sc.nextInt();
		
			for (int i = 0; i < n; i++) {
				int hasil = a + (i * b);
				System.out.print("masukkan data ke-" + (1 + i) + ": "+hasil);
			}
	}	
}	