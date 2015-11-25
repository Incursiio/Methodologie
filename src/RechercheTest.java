package test.java;


public class RechercheTest {
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int tab[] = { 1 , 2 , 3 , 4 } ; 
		
		Recherche t = new Recherche(tab);
		
		assertEquals(t.rechercheDicho( tab , 4 ) ) ;

	}

}
