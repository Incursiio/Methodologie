package test.java;

public class TriTest {
	
	@Test
	public static void main (String[] args){
		int tableau1 [] = {4, 17, 6, 31, 29};
		tri li = new tri(tableau1);
		assertEquals(li.tri(tableau1));
		
	}
}
