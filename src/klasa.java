
public class klasa {

klasa2 Gracz;

int zmienna =0;

{
System.out.println("pierwszy hehehehe");
	
}

public klasa (int test){
	System.out.println("JAAAAA");
    zmienna = test;
}

void wypisz(){
	Gracz = new klasa2();
	Gracz.losuj();
	zmienna=Gracz.liczba;
	System.out.println("liczba wylosowan" + zmienna);

	if (zmienna ==1){
		System.out.println("jeden");
	}
	else{
		System.out.println("nie jeden");

	}
}
}
