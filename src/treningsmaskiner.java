import java.util.ArrayList;

public class treningsmaskiner {
    public static void main(String[] args){

        //ny arrayliste 
        ArrayList<String> listeOverMaskiner = new ArrayList<String>();

        //for bein & rumpe
        //legger til nye med add()
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




    
   
    }
}
