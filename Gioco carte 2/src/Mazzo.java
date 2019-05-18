import java.util.ArrayList;
import java.util.Collections;

public class Mazzo {
	int[]Valori=new int [] {1,2,3,4,5,6,7,8,9,10};
	String[]Semi= new String[] {"Oro","Spade","Coppe","Bastoni"};
	ArrayList<Carta>Mazzo=new ArrayList<Carta>();
	Carta CartaAppoggio= new Carta(1,"Oro");
	public Mazzo() {
		int k;
		for(k=0;k<Semi.length;k++) {
			Mazzo.add(new Carta(Valori[9],Semi[k]));
		}
		for(int j=0;j<Semi.length;j++)
			for(int i=0;i<Valori.length-1;i++) {
				Mazzo.add(new Carta(Valori[i],Semi[j]));
				}
		/*int k;
		for(k=0;k<Semi.length;k++) {
			Mazzo.add(new Carta(Valori[9],Semi[k]));
		}*/
		}
		public void Mischia() {
			Collections.shuffle(Mazzo);
		}
		public void Mostra() {
			for(Carta u: Mazzo)
				System.out.println(u.getValore()+" "+u.getSeme());
		}
		public void ScambiaPosizione(int i, int j) {
			Carta CartaAppoggio= new Carta(1,"Oro");
			CartaAppoggio=Mazzo.get(i);
			Mazzo.set(i,Mazzo.get(j));
			Mazzo.set(j,CartaAppoggio);
		}
		public Carta get(int i) {
			return Mazzo.get(i);
		}
		public int Ricerca(int i,Mazzo Ricerca) {
			int t=0;
			int j;
				for(j=0;j<40;j++) {
					if(Ricerca.get(j).getValore()==Mazzo.get(i).getValore() && Ricerca.get(j).getSeme()==Mazzo.get(i).getSeme())
						t=j;
				}
			return t;
			}
		}
		


