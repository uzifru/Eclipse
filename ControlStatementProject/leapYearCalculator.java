package controlStatementProject;
import java.util.Scanner;
public class leapYearCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = 0;
		int tahun = 0;
		System.out.println("Bulan ke: ");
		month = in.nextInt();
		System.out.println("Tahun ke: ");
		tahun = in.nextInt();
		String monthOf = (month%2==0)?"Genap":"Ganjil";
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Bulan ini ada 31 hari");
			System.out.println("Bulan ini "+monthOf);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Bulan ini ada 30 hari");
			System.out.println("Bulan ini "+monthOf);
			break;
		case 2:
			if (tahun%4==0&&tahun%100!=0||tahun%400==0) {
				System.out.println("Tahun ini kabisat \nBulan ini ada 29 hari");
			}
			else {
				System.out.println("Tahun ini bukan kabisat \nBulan ini ada 28 hari");
			}
			System.out.println("Bulan ini "+monthOf);
			break;
		default:
			System.out.println("Bulan yang anda masukkan salah");
			break;
		}
	}
}