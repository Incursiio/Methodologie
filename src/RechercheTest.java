import junit.framework.TestCase;


public class RechercheTest extends TestCase {

	public void testRechercheDicho() {
		int tab[] = { 1 , 2 , 3 } ;
		Recherche r = new Recherche(tab) ;
		
		
		int a1 = 5 ;
		assertTrue(" a n'est pas dans le tableau " , r.rechercheDicho( tab , a1 ) == -1 ) ;
		
		int a2 = -2 ;
		assertTrue(" a n'est pas dans le tableau " , r.rechercheDicho( tab , a2 ) == -1 ) ;
		
		float a3 = 1.0 ;
		assertTrue(" a n'est pas un int mais un float et n'est pas dans le tableau " , r.rechercheDicho( tab , a3 ) == -1 ) ;
		// Si on recherche un float alors rechercheDicho devrait retourner -1 car
		// ce float n'est ni un int ni une valeur dans tab
		
		Recherche a4 = new Recherche(tab) ; 
		assertTrue(" a n'est pas un int mais un objet Recherche et n'est pas dans le tableau " , r.rechercheDicho( tab , a4 ) == -1 ) ;
		// Si on recherche un objet Recherche alors rechercheDicho devrait retourner -1 car
		// cet objet n'est ni un int ni une valeur dans tab
		
		
	}
}
