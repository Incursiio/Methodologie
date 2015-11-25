import java.util.Scanner;


public class Menu {

	public Menu()
	{
		Scanner menu = new Scanner(System.in);
		Recherche rechercheur;
		Tri trieur;
		

		Scanner saisieNombre = new Scanner(System.in);
		System.out.println("Combien voulez-vous de valeur dans votre tableau : ");
		int nb = saisieNombre.nextInt();
			
		int[] tab = new int[nb];
		Scanner saisieValeur = new Scanner(System.in);
		System.out.println("Veuillez saisir les " + nb + " valeurs dans le tableau :");
		for (int i=0; i<nb; i++)
		{
			int a = saisieValeur.nextInt();
			tab[i] = a;
			
		}
			
		trieur = new Tri(tab);
		int valChercher;
		System.out.println("Saisir valeur à rechercher :");
		valChercher=saisieNombre.nextInt();
		rechercheur= new Recherche(tab);
		trieur.tri(tab);
		if (rechercheur.rechercheDicho(tab, valChercher)==-1)
		{
			System.out.println("Valeur non présente");
		}
		else
		{
			System.out.print("Valeur présente, l'indice de la valeur à rechercher est : ");
			System.out.print(rechercheur.rechercheDicho(tab, valChercher));
		}
			
			
	
		
		
		
		
		
	}
	
}
