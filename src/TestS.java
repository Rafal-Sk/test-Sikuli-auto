import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenRemote;
import org.sikuli.script.Key;


import com.android.dx.gen.Type;
import com.sun.glass.events.KeyEvent;


public class TestS {


	
	public static void main(String[] args) throws FindFailed, InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("TestNG Automa");
		
		String dir_scr = "C:\\DANE_RAFAL\\obrazy\\";
	
		Screen s = new Screen();
		
	
	    //trzeci przyklad
		
		//org.sikuli.script.Pattern oknoGlowne = new  org.sikuli.script.Pattern("C:\\DANE_RAFAL\\obrazy\\oknoglowneSR.png");
		//s.wait(oknoGlowne,10);
		
		//s.doubleClick("C:\\DANE_RAFAL\\obrazy\\maksymalizuj.PNG");
		
		System.out.println("1. Wybór programu SR");
		s.click("C:\\DANE_RAFAL\\obrazy\\SR_start.png");
		
		
		 System.out.println("2. Lista osób");
		//wybor przycisku Osoby (Lista Osób)
	    s.click("C:\\DANE_RAFAL\\obrazy\\kliknnr2Osoby.png");
	    
        String imie =  "Bogus³aw";
        String nazwisko = "Albin";
        
	    
	    //wyszukuje osobê o nazwisku Albin
	    //s.click("C:\\DANE_RAFAL\\obrazy\\Nazwisko_filtr.png");
	    s.paste(imie);   // uzycie paste 'wkleja' imiê zamiast 'type' poniewa¿ ma problemy ze znakami '³' '¹' 'ê' wiec nalezy uzyc 'paste'.
	    
	   
	    s.type(Key.TAB);    // automatyczny przycisk TAB
	    s.type(nazwisko);    // wprowadza nazwisko
	    s.type(Key.ENTER); // automatyczny przycisk ENTER
	    
	    // Menu Operacje
	    
	    s.click("C:\\DANE_RAFAL\\obrazy\\menuOperacje.png");
	    
	    //Rejestracja zgody powiadomienia
	    s.click("C:\\DANE_RAFAL\\obrazy\\rejestracjaPowiadom.png");
	    
	    
	    
	    //s.click("C:\\DANE_RAFAL\\obrazy\\akceptuj.png");
		
		
		
		//Screenre
		
	/*
	 // I sposób
		org.sikuli.script.Pattern image1 = new org.sikuli.script.Pattern("C:\\DANE_RAFAL\\obrazy\\notepad_icon.PNG");
		s.click(image1);
		s.doubleClick(image1);
		//s.wait(image1,10);
		
		s.find("C:\\DANE_RAFAL\\obrazy\\notepad.PNG");		
		s.type("Test aplikacji automat");
		
		*/
	//------------------------------------------------------------------------	
		
		
		
		// drugi sposób
	/*	org.sikuli.script.Pattern image2 = new org.sikuli.script.Pattern("C:\\DANE_RAFAL\\obrazy\\notepad.PNG");
		s.wait(image2,10);
		s.type("Test aplikacji automat");
		
	*/	
   //--------------------------------------------------------------------
		
	
		
	
		
		
		
	}

}
