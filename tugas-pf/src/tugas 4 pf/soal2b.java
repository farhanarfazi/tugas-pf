import static java.lang.System.out;
import java.util.Scanner;

public class soal2a {
	public static void main (String abc[]) {
		Scanner sc = new Scanner(System.in);
		
		out.print("Masukkan nilai: ");
		double nilai = sc.nextDouble();
		
		String huruf;
		
		switch ((int) nilai / 10) {
			case 10:
			huruf = "A";
			break;
			case 9:
			huruf = "A";
			break;
			case 8:
			huruf = "A";
			break;
			case 7:
			huruf = "B";
			break;
			case 6:
			huruf = "C";
			break;
			case 5:
			huruf = "D";
			break;
			default:
			huruf = "E";
			break;
			}
		System.out.println("NIlai huruf: " + huruf);
	}
}	