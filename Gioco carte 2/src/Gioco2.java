public class Gioco2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mazzo MazzoBase=new Mazzo();
		Mazzo MazzoGioco=new Mazzo();
		MazzoGioco.Mischia();
		/*MazzoGioco.Mostra();
		System.out.println("----------");*/
		 int i=0;
		 float Giocate=100000;
		 float NVittorie=0;
		 float NSconfitte=0;
		 int Prova=0;
		  for(Prova=0;Prova<Giocate;Prova++){
		 for(i=0;i<40;i++) {
			 if(MazzoGioco.get(0).getValore()!=10) 
			MazzoGioco.ScambiaPosizione(0, MazzoGioco.Ricerca(0,MazzoBase));
			else
				break;
			 }
		 int k=0;
		 for(k=0;k<40;k++) {
			 if(MazzoGioco.get(1).getValore()!=10) 
			MazzoGioco.ScambiaPosizione(1, MazzoGioco.Ricerca(1,MazzoBase));
			else
				break;
			 }
		 int j;
		 for(j=0;j<40;j++) {
			 if(MazzoGioco.get(2).getValore()!=10) 
			MazzoGioco.ScambiaPosizione(2, MazzoGioco.Ricerca(2,MazzoBase));
			else
				break;
			 }
		 int h;
		 for(h=0;h<40;h++) {
			 if(MazzoGioco.get(3).getValore()!=10) 
			MazzoGioco.ScambiaPosizione(3, MazzoGioco.Ricerca(3,MazzoBase));
			else
				break;
			 }
		 int contatore=0;
		 int l=0;
		 for(l=4;l<40;l++) {
			 if(MazzoGioco.get(l).getValore()==MazzoBase.get(l).getValore() && MazzoGioco.get(l).getSeme()==MazzoBase.get(l).getSeme())
				 contatore++;
		 }
		 if(contatore==36)
			 NVittorie++;
		 else
			 NSconfitte++;
		 MazzoGioco.Mischia();
		 }
		 System.out.println("Hai vinto n-volte:"+" "+NVittorie);
		 System.out.println("Hai perso n-volte:"+" "+NSconfitte);
		 float probabilità=1-NSconfitte/Giocate;
		 System.out.println("La probabilità di vittoria è:"+" "+probabilità);
		}}

