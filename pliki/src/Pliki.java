import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Pliki
{
  public static void main(String[] args)throws IOException
  {
	  String nazwawej;
	  Scanner nazwa = new Scanner(System.in);//zjebane to wczytywanie
	  nazwawej = nazwa.nextLine();
	  nazwawej += ".txt";
	  
	  Vector<String> wektor  = new Vector<String>();
	  odczyt(nazwawej, wektor);
	  zapis("wyj.txt",wektor);
	  
	  

	  
      
  }
public static void odczyt(String filename, Vector<String> a)throws IOException//dzia�a na dowolna liczbe lini
{
	FileReader reader = null;
	String linia;
	try 
	{
		reader = new FileReader(filename);	
	}
	catch (FileNotFoundException e) {
	       System.out.println("B��D PRZY OTWIERANIU PLIKU!");
	       System.exit(1);
	   }
	BufferedReader breader = new BufferedReader(reader);
	 try {
	     while((linia = breader.readLine()) != null){
	       a.add(linia);
	    }
	    } catch (IOException e) {
	        System.out.println("B��D ODCZYTU Z PLIKU!");
	        System.exit(2);
	   }
}
  
  
  public static void zapis (String filename, Vector<String> a) throws FileNotFoundException
  {
      PrintWriter zapis = new PrintWriter(filename);

	  int index = a.size() -1;
	  for(int i = 0; i < a.size(); i++)
	  {
		  zapis.println(a.elementAt(index));  		
		  index = index -1;
	  }
     zapis.close();
  }
}