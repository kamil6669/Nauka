package statki;

import java.util.ArrayList;

public class Portal {

private ArrayList<String> polaPolozenia;
private String nazwa;

public void setPolaPolozenia(ArrayList<String> ppol){
	polaPolozenia = ppol;
}
public void setNazwa(String nzwPortalu){
	nazwa = nzwPortalu;
}
public String sprawdz(String ruch){
	String wynik = "pud�o";
	 
	int indeks = polaPolozenia.indexOf(ruch);
	 
	if (indeks >= 0) {
	 polaPolozenia.remove(indeks);
	 
	 if (polaPolozenia.isEmpty()) {
	wynik = "zatopiony";
	System.out.println("Au! Zatopi	e portal " + nazwa + " : ( ");
	 } else {
	wynik = "trafiony";
	 } // koniec if
	 } // koniec if
	 return wynik;
	 } // koniec metody
	} // koniec klasy
