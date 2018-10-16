import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.IOException;

import org.sikuli.script.Env;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.Mouse;
import org.sikuli.script.Region;
import org.sikuli.script.RobotDesktop;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Files;


public class TestNGan {

	
	String dir_scr = "C:\\DANE_RAFAL\\obrazy\\";
	Screen s = new Screen();
	

	
	@Test
	public void test1()
	{
		System.out.println("Test nag ");
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("Test 2 ");
		System.out.println(dir_scr+"_sd");	
	}
	
	
	
	public void testPowiadomieniaRejestracja() throws FindFailed
	{
        System.out.println("TestNG Automa");
		
		
		
	
	    //trzeci przyklad
		
		//org.sikuli.script.Pattern oknoGlowne = new  org.sikuli.script.Pattern("C:\\DANE_RAFAL\\obrazy\\oknoglowneSR.png");
		//s.wait(oknoGlowne,10);
		
		//s.doubleClick("C:\\DANE_RAFAL\\obrazy\\maksymalizuj.PNG");
		
		System.out.println("1. Wybór programu SR");
		s.click(dir_scr+"SR_start.png");
		
		
		 System.out.println("2. Lista osób");
		//wybor przycisku Osoby (Lista Osób)
	    s.click(dir_scr+"kliknnr2Osoby.png");
	    
        String imie =  "Bogus³aw";
        String nazwisko = "Albin";
        
	    
	    //wyszukuje osobê o nazwisku Albin
	    //s.click("C:\\DANE_RAFAL\\obrazy\\Nazwisko_filtr.png");
	    s.paste(imie);   // uzycie paste 'wkleja' imiê zamiast 'type' poniewa¿ ma problemy ze znakami '³' '¹' 'ê' wiec nalezy uzyc 'paste'.
	    
	   
	    s.type(Key.TAB);    // automatyczny przycisk TAB
	    s.type(nazwisko);    // wprowadza nazwisko
	    s.type(Key.ENTER); // automatyczny przycisk ENTER
	    
	    // Menu Operacje
	    
	    s.click(dir_scr+"menuOperacje.png");
	    
	    //Rejestracja zgody powiadomienia
	    s.click(dir_scr+"rejestracjaPowiadom.png");
	    

		
		
	}
	
	@Test
	public void testSlownikSzablonow(String tes, String tes2) throws FindFailed, IOException, AWTException, InterruptedException
	{
		//Robot przeniesDo = new Robot();
		
		String dir_text = "C:\\DANE_RAFAL\\obrazy\\slownikSzablon\\TextSzablon1.txt";
		//List<String> lines = FileUtils.readFile(dir_text);  //FileUtils.readFile(dir_text);
		
		//String kontent = Files.toString(new File(dir_text), Charsets.UTF_8);
		
		//System.out.println(kontent);
	
		System.out.println("1. Wybór programu SR");
		s.click(dir_scr+"SR_start.png");	
		
		System.out.println("2. Wybór zakladki administracja");
		s.click(dir_scr+"slownikSzablon\\Zakladka_admin.png");
	
		
		
		System.out.println("3. Wybór slownika szablonow");
		//przeniesDo.mouseMove(39, 509); 
		//s.highlight(3);
		//s.click();
		s.click(dir_scr+"slownikSzablon\\SlownikPowiadomien.png");
		
		System.out.println("4. Dodaj ");
		s.click(dir_scr+"slownikSzablon\\dodaj.png");
		
		System.out.println("5 klikniecie na akceptuj ");
		s.click(dir_scr+"slownikSzablon\\akceptuj.png");
		//	--------------------------------------------------------------- Test nr ...
		s.type("Test nr 14wd");
		s.click(dir_scr+"slownikSzablon\\akceptuj.png");
		
		//opusc okno
		s.click(dir_scr+"slownikSzablon\\opuscOkno.png");
		//s.click(dir_scr+"slownikSzablon\\akceptuj.png");
		
		//C:\DANE_RAFAL\obrazy\slownikSzablon\textboxz.png
		//s.click(dir_scr+"slownikSzablon\\textboxz.png");
			
		
		String terf = "Hello,\n Test szablon: \n Lorem ipsum dolor sit amet \n !@#$%^&*()_ \n QWERTYUIOP \n ASDFGHJKL:	\n ZXCVBNM<>? \n ¹ê¿ŸŸæñ \nPozdrawionka ";
	   String stexboxy = "Hello,\n Test szablon: \n Lorem ipsum dolor sit amet \n Pozdrowionka \n Pan Smith \n\n";
		
	
		s.type(dir_scr+"slownikSzablon\\textboxz2.png", stexboxy);
			
		s.click(dir_scr+"slownikSzablon\\strza³ka_dol.png");
		
		s.click(dir_scr+"slownikSzablon\\DATA_BIEZACA.png");

		s.click(dir_scr+"slownikSzablon\\WSTAW.png");

		s.click(dir_scr+"slownikSzablon\\akceptuj.png");		
		
		s.wait(dir_scr+"slownikSzablon\\Message_blad.png");
		
		s.click(dir_scr+"slownikSzablon\\opuscOkno.png");
		
		//s.click(dir_scr+"slownikSzablon\\opuscOkno.png");
		
		s.find(dir_scr+"slownikSzablon\\zdarzenie.png");
		
		s.click(dir_scr+"slownikSzablon\\strza³ka_dol_biala.png");
		
		s.click(dir_scr+"slownikSzablon\\wiadomosc_odPrac.png");
		
	
	//	s.type("Wiadomo");
		
	//	s.type(Key.ENTER);
		
		s.click(dir_scr+"slownikSzablon\\akceptuj.png");
		
		s.wait(dir_scr+"slownikSzablon\\Message_blad.png");
		
		s.click(dir_scr+"slownikSzablon\\opuscOkno.png");
		
		s.click(dir_scr+"slownikSzablon\\strza³ka_dol_szara.png");
		
		s.click(dir_scr+"slownikSzablon\\Emails.png");
		
		s.click(dir_scr+"slownikSzablon\\akceptuj.png");
		
		s.click(dir_scr+"slownikSzablon\\TAK.png");
	
		s.click(dir_scr+"slownikSzablon\\opuscOkno.png");
		
		s.click(dir_scr+"slownikSzablon\\Pomoc.png");
	
		s.click(dir_scr+"slownikSzablon\\swiadczeniaRodzinne.png");
		
		s.click(dir_scr+"SR_start.png");
		//C:\DANE_RAFAL\obrazy\slownikSzablon\swiadczeniaRodzinne.png
		
		//s.click(dir_scr+"slownikSzablon\\akceptuj.png");
		
	//Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
	
 // 
		
		
	//String mames =Env.getClipboard().contains(kontent);
	
	//s.findText(kontent).text();
	//System.out.println(s.toString());
	
	
	
	//System.out.println(Env.getClipboard().contains(kontent));
		
		// opusc okno C:\DANE_RAFAL\obrazy\slownikSzablon\opuscOkno.png
		//s.click(dir_scr+"slownikSzablon\\Nazwa_szablonu.png");
		//s.type("TEST");
	
		
	}
	
    
	public void testSkrin() throws FindFailed, AWTException
	{
		
		Screen er =  new Screen();
		
		er.click(dir_scr+"SR_start.png");
		//er.find(er.userCapture().getFile()).highlight(2);
		//Mouse.move(386, 719);
	    //er.mouseMove(719, 386);
	   // er.mouseUp();
	   // er.mouseMove(400, 600);
	///	er.mouseUp();
	
		Robot rt = new Robot();
		rt.mouseMove(139, 509); //przeciaganie  kursora w inne miejsce z uzyciem x i y 

		//er.click(s.mouseMove(40,5));
		
		
//	    er.setX(719);
	//    er.setY(719);
	    
		
		
	}
	
	public void testPetlaSlownik()
	{
		
		
		for(int i=0; i<2; i++)
		{
			
			
		}
		
		
		
	}
			
	
	
	
}
