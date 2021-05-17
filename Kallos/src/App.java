import FileHandler.FileHandler;

import java.util.Scanner;
import java.util.ArrayList;
import SlovaKonzole.SlovaKonzole;

public class App {
    public static void main(String[] args) throws Exception {

        String[] iniStudenti = {"Eldin", "Samed", "Mirza", "Mujo", "Selim"};
        
        FileHandler fileHandler = new FileHandler();
        
        Scanner unosScanner = new Scanner(System.in);
        ArrayList<String> studenti = new ArrayList<String>();
        
        /**Dobrodoslica */
        System.out.println(SlovaKonzole.ANSI_BLUE + "\n-----------------------------\nDOBRO DOSLI U " + SlovaKonzole.ANSI_RED +"KALLOS " + SlovaKonzole.ANSI_BLUE + "PROGRAM\n-----------------------------\n" + SlovaKonzole.ANSI_WHITE);

        System.out.println(SlovaKonzole.ANSI_PURPLE + "\nUnesite studente: " + SlovaKonzole.ANSI_WHITE);

        while(true){
            
            String unos = unosScanner.nextLine();

            if(unos.equals("izlaz")){
                break;
            }else {
                if(pretrazivacListe(iniStudenti, unos) == true){
                    if(pretrazivacListe(studenti.toArray(String[]::new), unos) == true){
                        System.out.println(SlovaKonzole.ANSI_YELLOW + "Student je vec unesen u listu." + SlovaKonzole.ANSI_WHITE);
                    }else{
                        studenti.add(unos);
                        System.out.println(SlovaKonzole.ANSI_GREEN + "Student unesen." + SlovaKonzole.ANSI_WHITE);
                    }
                }else{
                    System.out.print(SlovaKonzole.ANSI_RED + "Student ne postoji\n" + SlovaKonzole.ANSI_WHITE);
                }
            }
            
        }
        
        fileHandler.dodajStudenta(studenti);
        System.out.println(SlovaKonzole.ANSI_BLUE + "\nHVALA VAM STO STE KORISTILI KALLOS PROGRAM...\n" + SlovaKonzole.ANSI_WHITE);
        unosScanner.close();
    }

    public static Boolean pretrazivacListe(String[] lista, String unos){
        
        for(int i = 0; i < lista.length; i++){
            if(lista[i].equals(unos)) {
                return true;
            }
        }
        return false;
    }
    
    
}
