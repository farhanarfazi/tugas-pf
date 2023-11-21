import static java.lang.System.out;
import java.util.Scanner;

public class soal3dowhile {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("masukkan batas aritmatika: ");
		int n = sc.nextInt();
		System.out.print("masukkan bilangan awal: ");
		int a = sc.nextInt();
		System.out.print("masukkan bilangan beda: ");
		int b = sc.nextInt();
		int i = 0;
			
		do {int hasil = a + (i * b);
				i++;
				System.out.print("masukkan data ke-" + (i) + ": "+hasil);
		} while (i < n);
	}
}	