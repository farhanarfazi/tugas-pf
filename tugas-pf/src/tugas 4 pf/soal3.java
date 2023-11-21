import static java.lang.System.out;
import java.util.Scanner;

public class soal3 {
	public static void main (String abc[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan nilai: ");
		double nilai = sc.nextDouble();
		
		double indeks;
		
		switch ((int) nilai / 10) {
			case 10:
			indeks = 4.0;
			break;
			case 9:
			indeks = 4.0;
			break;
			case 8:
			indeks = 4.0;
			break;
			case 7:
			indeks = 3.0;
			break;
			case 6:
			indeks = 2.0;
			break;
			case 5:
			indeks = 1.0;
			break;
			default:
			indeks = 0;
			break;
			}
		System.out.println("NIlai: " + indeks);
	}
}	