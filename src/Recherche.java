
public class Recherche {
	private int tab[] ;
		
	public Recherche( int tab[]  ) {
		this.tab = tab ;
	}
	
	public int[] getTab() {
		return this.tab ;
	}
	
	public void setTab( int tab[]) {
		this.tab = tab ;
	}

		
		
	int rechercheDicho( int tab[] , int valrecherche ){
		
		boolean trouve; 
		int idebut; 
		int ifin; 
		int imilieux; 
		
		trouve = false ; 
		idebut = 0 ; 
		ifin = this.tab.length ;
		
		while( !trouve && ( ( ifin - idebut) > 1 ) ) {
		imilieux = ( idebut + ifin ) / 2 ; 
		trouve = ( tab[imilieux] == valrecherche ) ; 
		if( tab[imilieux] > valrecherche ) ifin = imilieux ; 
		else idebut = imilieux ; 
		}
	
		if( tab[idebut] == valrecherche) return(idebut); 
		else return(-1) ; 
		} 
	// retourne -1 si valrecherche n'existe pas 
	// sinon retourne l'indice de valrecherche 
	
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int tab[] = { 1 , 2 , 3 , 4 } ; 
		
		Recherche t = new Recherche(tab);
		
		System.out.println( t.rechercheDicho( tab , 4 ) ) ;

	}

}
