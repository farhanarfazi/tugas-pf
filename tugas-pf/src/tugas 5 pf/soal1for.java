import static java.lang.System.out;
import java.util.Scanner;

public class soal1for {
	public static void main (String[] args) {
		float liter, pilihan;
		double harga1, harga2, harga3;
		
		Scanner sc = new Scanner(System.in);
		
		out.println("pilih jenis BBM");
		out.println("1.bensin");
		out.println("2.solar");
		out.println("3.pertamax");
		out.print("masukkan pilihan: ");
		pilihan = sc.nextFloat();
		
		if (pilihan == 1) {
			out.println("1.bensin");
			out.print("berapa liter: ");
			liter = sc.nextFloat();
			harga1 = liter * 8000;
			for (int i = 0; i <= harga1;i = i+1) {
			out.println(i);
		}
		out.println("harga: Rp"+harga1);
		}
		if (pilihan == 2) {
			out.println("2.solar");
			out.print("berapa liter: ");
			liter = sc.nextFloat();
			harga2 = liter * 9000;
			for (int i = 0; i <= harga2;i = i+1) {
			out.println(i);
		}
		out.println("harga: Rp"+harga2);
		}
		if (pilihan == 3) {
			out.println("3.pertamax");
			out.print("berapa liter: ");
			liter = sc.nextFloat();
			harga3 = liter * 11000;
			for (int i = 0; i <= harga3;i = i+1) {
			out.println(i);
		}
		out.println("harga: Rp"+harga3);
		}
	}
}