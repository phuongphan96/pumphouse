import java.util.ArrayList;
import java.util.Scanner;

public class treningsmaskiner {
    public static void main(String[] args){

        //ny arrayliste 
        ArrayList<String> listeOverMaskiner = new ArrayList<String>();

        //legger til nye med add() eller i terminalen
        listeOverMaskiner.add("Belt squat (ATX)");
        listeOverMaskiner.add("Glute drive (Nautilus)");
        listeOverMaskiner.add("Hybrid inner/outer thigh (Prime)");
        listeOverMaskiner.add("PL leg press (Prime)");
        listeOverMaskiner.add("PL leg extension/leg curl (Prime)");
        listeOverMaskiner.add("Hybrid leg extension (Prime)");
        listeOverMaskiner.add("Hybrid seated leg curl (Prime)");
        listeOverMaskiner.add("Hybrid prone leg curl (Prime)");
        listeOverMaskiner.add("Pendulum squat (Gymleco)");
        listeOverMaskiner.add("Hack squat (Gymleco)");
        listeOverMaskiner.add("Horisontal leg press (Gymleco)");
        listeOverMaskiner.add("Seated calf (Gymleco)");
        listeOverMaskiner.add("Lying leg curl (Gym80)");
        listeOverMaskiner.add("Seated leg curl (Gym80)");
        listeOverMaskiner.add("Leg Extension (Gym80)");
        listeOverMaskiner.add("Squat press (Cybex)");
        listeOverMaskiner.add("Hack squat (Cybex)");
        listeOverMaskiner.add("Leg press bilateral (Arsenal)");
        listeOverMaskiner.add("Pendulum Squat (Arsenal)");
        listeOverMaskiner.add("Smith machine (Arsenal)");
        listeOverMaskiner.add("Beinpress (Arsenal)");
        listeOverMaskiner.add("Sumo monolift (TTEKA)");

        Scanner scanner = new Scanner(System.in);
        String kommando;

        while(true){
            System.out.println("Dette er et program med oversikt over alle treningsmaskiner på Pumphouse. Velg en handling: ");
            System.out.println(" ");
            System.out.println("1. Se maskiner");
            System.out.println("2. Legg til en maskin");
            System.out.println("3. Fjern en maskin");
            System.out.println("4. Søk etter en maskin");
            System.out.println("5. Avslutt program");

            System.out.print("Skriv inn et valg (1-5): ");
            kommando = scanner.nextLine();

            switch(kommando){
                case "1":
                    //se maskiner
                    System.out.println("\nMaskiner på Pumphouse: ");
                    for(int i=0; i<listeOverMaskiner.size(); i++){
                        System.out.println((i+1) + ". " + listeOverMaskiner.get(i));
                    }
                    break;
                case "2":
                    // Legg til en maskin
                    System.out.println("Skriv inn navnet på maskinen du vil legge til: ");
                    String nyMaskin = scanner.nextLine();
                    listeOverMaskiner.add(nyMaskin);
                    System.out.println("Maskinen \"" + nyMaskin + "\" er lagt til.");
                    break;
                case "3":
                    // Fjern en maskin
                    System.out.print("Skriv inn nummeret på maskinen du vil fjerne: ");
                    int index = Integer.parseInt(scanner.nextLine()) - 1;
                    if (index >= 0 && index < listeOverMaskiner.size()) {
                        String fjernetMaskin = listeOverMaskiner.remove(index);
                        System.out.println("Maskinen \"" + fjernetMaskin + "\" er fjernet. ");
                    }
                    else {
                        System.out.println("Ugyldig nummer!");
                    }
                    break;
                case "4":
                    // Søk etter en maskin
                    System.out.println("Skriv inn søkeord for maskinen: ");
                    String sok = scanner.nextLine().toLowerCase();
                    System.out.println("\nSøkeresultater: ");
                    boolean funnetSokeord = false;
                    for (String maskin : listeOverMaskiner){
                        if(maskin.toLowerCase().contains(sok)){
                            System.out.println(maskin);
                            funnetSokeord = true;
                        }
                    }
                    if(!funnetSokeord){
                        System.out.println("Ingen maskiner funnet med søkeordet: " + sok);
                    }
                    break;
                case "5":
                    // Avslutt programmet
                    System.out.println("Avslutter programmet.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
            }
        }

        
        /* TESTER

        //print ut antall med size()
        System.out.println("Pumhouse har " + listeOverMaskiner.size() + " beinmaskiner akkurat nå.");

        //henter ut index nr 5 med get()
        System.out.println("Maskin nr 20 er: " + listeOverMaskiner.get(20));

        //endre navn på index nr 20 med set()
        listeOverMaskiner.set(20, "Leg press (Arsenal)");
        System.out.println("Maskin nr 20 er endret til: " + listeOverMaskiner.get(20));

        //kan bruke remove() for å gjerne en maskin, f.eks listeOverMaskiner.remove(20);

        //finner ut av hva indexen til "Hack squat (Cybex)" er ved å bruke indexOf()
        int indexTilMaskin = listeOverMaskiner.indexOf("Hack squat (Cybex)");
        System.out.println("Index til Hack Squat Cybex er: " + indexTilMaskin);


        */

    
   
    }
}
