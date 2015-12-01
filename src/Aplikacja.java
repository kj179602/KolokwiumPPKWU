
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import bin.thirdLibrary.FileOpen;

import java.io.File;

import bin.thirdLibrary.FileExtension;
import bin.secondLibrary.Crypt;



public class Aplikacja {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String prawidloweHaslo ="qwerty";
		System.out.println("Podaj sciezke do pliku");
		
		Scanner s = new Scanner(System.in);
		String plik = s.next();
		String plik2 = "aes_zaszyfrowany.png";
		
		System.out.println("Podaj has³o");
		Scanner s2 = new Scanner(System.in);
		String haslo = s2.next();
		if(prawidloweHaslo.equals(haslo)){
			
				Crypt.szyfrowanie(plik, plik2);
				System.out.println("Plik zaszyfrowano");
			
		}
		else{
			System.out.println("Nieprawidlowe haslo!");
		}
		System.out.println(FileExtension.getFileExtension(plik2));
		FileOpen.openFile(plik2);
		s.close();
	}
	
}
