
import java.util.Scanner;

public class Aplikacja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prawidloweHaslo ="qwerty";
		System.out.println("Podaj sciezke do pliku");
		
		Scanner s = new Scanner(System.in);
		String plikString = s.next();
		String[] parts = plikString.split(".");
		File plik = new File();
		String plik2 = "zaszyfrowany.txt";
		
		System.out.println("Podaj has³o");
		Scanner s2 = new Scanner(System.in);
		String haslo = s2.next();
		if(prawidloweHaslo.equals(haslo)){
			Crypt.szyfrowanie(plik, plik2);
		}
		else{
			System.out.println("Nieprawidlowe haslo!");
		}
		//System.out.println(sciezka);
	}
	
}
