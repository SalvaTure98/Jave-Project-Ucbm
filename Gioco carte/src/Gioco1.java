import java.util.ArrayList;
import java.util.Collections;

public class Gioco1 {

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
       int Perso1=0;// Conta quante volte è uscito 1 a prima girata 
       for(int i=0;i<40;i=i+3) {
    	   if(Mazzo.get(i).getNumero()==1)
    		   Perso1++;
    	   }
       int Perso2=0;
       for(int i=1;i<40;i=i+3) {
    	   if(Mazzo.get(i).getNumero()==2)
    		   Perso2++;
    	   }
       int Perso3=0;
       for(int i=2;i<=40;i=i+3) {
    	   if(Mazzo.get(i).getNumero()==3)
    		   Perso3++;
    	   }
       if(Perso1==0 && Perso2==0 && Perso3==0)
    	   Vittoria++;
       else
    	   Sconfitta++;
       Collections.shuffle(Mazzo);
       }
      System.out.println("--------------------------------");
      System.out.println("|                               |");
      System.out.println("| Hai perso :"+""+Sconfitta+" volte     |");
      System.out.println("|                               |");
      System.out.println("|                               |");
      System.out.println("| Hai vinto:"+""+Vittoria+" volte        |");
      System.out.println("|                               |");
      System.out.println("|                               |");
      System.out.println("|La probabilità di vittoria è:  |");
      System.out.println("|                               |");
        double probabilità = 1-Sconfitta/Giocate ;
      System.out.println("|         "+probabilità+"  |");
      System.out.println("|                               |");
      System.out.println("---------------------------------");
	}

	}