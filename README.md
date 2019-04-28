# Java-Project-Ucbm
Creazione Programma/i Java che calcoli la probabilità di successo nei 3 Solitari
import java.util.ArrayList;
import java.util.Collections;

public class MainMazzo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] Semi= new String[] {"Oro","Coppe","Spade","Bastoni"};
		int [] Valori= new int[] {1,2,3,4,5,6,7,8,9,10};
		 ArrayList<Carta>Mazzo= new ArrayList<Carta>();
        for (int i =0; i<Semi.length; i++) {
			for(int j=0; j<Valori.length; j++) {
				Mazzo.add(new Carta(Valori[j],Semi[i]));}
			}
       Collections.shuffle(Mazzo);
       /*for( Carta s : Mazzo )
			System.out.println(s.getNumero()+""+s.getSeme());
			System.out.println("----------------------------");*/
       double Sconfitta=0;
       double Vittoria=0;
       double Giocate=1000000;
       for(int k=0;k<=Giocate-1;k++) {
       int Perso1=0;
       for(int i=0;i<39;i=i+3) {
    	   if(Mazzo.get(i).getNumero()==1)
    		   Perso1++;}
       int Perso2=0;
       for(int i=1;i<39;i=i+3) {
    	   if(Mazzo.get(i).getNumero()==2)
    		   Perso2++;
    	   }
       int Perso3=0;
       for(int i=2;i<=39;i=i+3) {
    	   if(Mazzo.get(i).getNumero()==3)
    		   Perso3++;
    	   }
       if(Perso1==0 && Perso2==00 && Perso3==0)
    	   Vittoria++;
       else
    	   Sconfitta++;
       Collections.shuffle(Mazzo);
       }
       System.out.println("Numero di Vittorie:"+""+Vittoria);
       System.out.println("Numero di Sconfitte:"+""+Sconfitta);
       System.out.println("La probabilit� di vittoria �:");
        double probabilit�=1-Sconfitta/Giocate;
        System.out.println(probabilit�);
     }
	}
