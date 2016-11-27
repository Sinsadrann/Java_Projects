import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) throws FileNotFoundException 
	{
	//Tworzê tablice na zwierzeta	
		ArrayList<Gad> listaG = new ArrayList<Gad>();
		ArrayList<Ptak> listaP = new ArrayList<Ptak>();
		ArrayList<Ryba> listaR = new ArrayList<Ryba>();
		ArrayList<Ssak> listaS = new ArrayList<Ssak>();
	
	//Zmienna pliku i skanera
	File plik = new File("zwierzeta.txt");
	Scanner input = new Scanner(plik);
	//String na odczyt slowa
	String slowo;
	do
	{
//Pobieram typ
	slowo = input.next();
	
	if(slowo == "gad")
	{
		Gad nowy = new Gad();
		nowy.typ = "gad";
		listaG.add(nowy);
		listaG.lastIndexOf(nowy);
	}
	if(slowo == "ptak")
	{
		Ptak nowy = new Ptak();
		nowy.typ = "ptak";
		listaP.add(nowy);
	}
	if(slowo == "ryba")
	{
		Ryba nowy = new Ryba();
		nowy.typ = "ryba";
		listaR.add(nowy);
	}
	if(slowo == "ssak")
	{
		Ssak nowy = new Ssak();
		nowy.typ = "ssak";
		listaS.add(nowy);
	}
//Pobieram gatunek	
	slowo = input.next();
	
	
	
	}
	while(slowo != null);
	
	
	
	
	

	}

	ArrayList<Zwierze> lista = new ArrayList<Zwierze>();

}
