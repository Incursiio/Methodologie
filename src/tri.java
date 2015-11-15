
public class tri {
	
	private int[] tab;
	
	public tri (int tab[]){
		this.tab=tab;
	}
	public int[] getTab() {
		return tab;
	}

	public void setTab(int[] tableau1) {
		this.tab = tableau1;
	}
	
	public void tri(int tab[]){
		/*for (int i=0; i<tab.length; i++){
			System.out.println(tab[i]);
		}*/
		
		for (int i=0; i<tab.length; i++){
			if(i<tab.length-1){
				if(tab[i]>tab[i+1]){
					int tampon = tab[i];
					tab[i]=tab[i+1];
					tab[i+1]=tampon;
				}
			}
			System.out.println(tab[i]);
		}
	}
	
	public static void main (String[] args){
		int tableau1 [] = {4, 17, 6, 31, 29};
		tri li = new tri(tableau1);
		li.tri(tableau1);
		
	}
}
