import java.util.ArrayList;
import java.util.Scanner;

public class banque {
	
	ArrayList<compte> arrayCompte = new ArrayList<compte>();
	ArrayList<transaction> arrayTransaction = new ArrayList<transaction>();
	
	static Scanner sc = new Scanner(System.in);
	int idCompte = 000;
	int idClient;
	String nom;
	String date;
	float soldeAccount;
	float tauxAccount;
	float depotAccount;
	float retraitAccount;
	
	
	// creer un compte
		public void addCompte() {
			System.out.println("**************************************");
			do{
				for (int i = 000; i < arrayCompte.size(); i++) {
					if (idCompte == i){
						idCompte = idCompte + 001; 
					}
				}
			}while(idCompte <000);
			
			do{
			System.out.println("Entrer le numero du client : ");
			idClient = sc.nextInt();
			}while(idClient < 000);
			sc.nextLine();
			System.out.println("Entrer le nom du client: ");
			nom = sc.nextLine();
			System.out.println("Entrer le montant du compte : ");
			soldeAccount = sc.nextFloat();
			depotAccount = soldeAccount;
			System.out.println("Entrer le taux d'interet : ");
			tauxAccount = sc.nextFloat();
			sc.nextLine();
			System.out.println("Entrer le date : ");
			date = sc.nextLine();
			
			transaction transac = new transaction();
			
				transac.setDate_Transaction(date);
				transac.setDepot(depotAccount);
				transac.setRetrait(retraitAccount);
				transac.setMontant(soldeAccount);
			
			compte account = new compte(idCompte, idClient, nom, soldeAccount, tauxAccount,transac );
			arrayCompte.add(account);

			System.out.println("**************************************");
		}
		
		// depot sur un compte
		public void depotCompte() {
			System.out.println("=====================================");
			System.out.println("Entrer le numéro de compte : ");
			int noCompte;
			noCompte = sc.nextInt();
			System.out.println("=====================================");
			System.out.println("Le solde du compte " + "(" + noCompte + "): ");
			for (int j = 0; j < arrayCompte.size(); j++) {
				if(noCompte == arrayCompte.get(j).getNo_Compte()) {
					System.out.println(arrayCompte.get(j).getSolde());
					System.out.println("Entrer le montant du depot: ");
					soldeAccount = sc.nextFloat();
					arrayCompte.get(j).setSolde(soldeAccount + arrayCompte.get(j).getSolde());
				}
			}
			System.out.println("=====================================");
		}
			
			/*				else {
					System.out.println("Ce compte n'existe pas");
					break;
				}
			}
			System.out.println("=====================================");
			// showAllPerson();
		}*/
		
		
		// retrait sur un compte
				public void retraitCompte() {
					System.out.println("=====================================");
					System.out.println("Entrer le numéro de compte : ");
					int noCompte;
					noCompte = sc.nextInt();
					System.out.println("=====================================");
					System.out.println("Le solde du compte " + "(" + noCompte + "): ");
					for (int j = 0; j < arrayCompte.size(); j++) {
						if(noCompte == arrayCompte.get(j).getNo_Compte()) {
							System.out.println(arrayCompte.get(j).getSolde());
							System.out.println("Entrer le montant du retrait: ");
							soldeAccount = sc.nextFloat();
							arrayCompte.get(j).setSolde(arrayCompte.get(j).getSolde() - soldeAccount);
						}
					}
					System.out.println("=====================================");
				}
				
				 // calcul de l'interet
				public void interetCompte() {
					System.out.println("=====================================");
					for (int i = 0; i < arrayCompte.size(); i++) {
						System.out.println(arrayCompte.get(i).toString());
						arrayCompte.get(i).setSolde((arrayCompte.get(i).getSolde() * arrayCompte.get(i).getTaux()) + arrayCompte.get(i).getSolde());
						System.out.println("=====================================");
					}
					for (int i = 0; i < arrayCompte.size(); i++) {
						System.out.println(arrayCompte.get(i).toString());
						System.out.println("=====================================");
					}
				}
		
		//Consulter le solde d'un compte
		public void search(){
			System.out.println("Entrer le numéro de compte : ");
			int noCompte;
			noCompte = sc.nextInt();
			System.out.println("=====================================");
			System.out.println("Le solde du compte " + "(" + noCompte + "): ");
			for (int j = 0; j < arrayCompte.size(); j++) {
				if(noCompte == arrayCompte.get(j).getNo_Compte()) {
					System.out.println(arrayCompte.get(j).getSolde());
				}
			}
			System.out.println("=====================================");
		}
		
		// Lister les listes des comptes
		public void showAllCompte() {

			for (int i = 0; i < arrayCompte.size(); i++) {
				System.out.println(arrayCompte.get(i).toString());
				System.out.println("=====================================");
			}
		}
		
		
		//Checher les comptes d'un client
		public void searchAccount(){
			System.out.println("Entrer le numéro d’identification du client a recherche : ");
			int noClient;
			noClient = sc.nextInt();
			System.out.println("=====================================");
			System.out.println("Les comptes du client " + "(" + noClient + "): ");
			for (int j = 0; j < arrayCompte.size(); j++) {
				if(noClient == arrayCompte.get(j).getNo_Client()) {
					System.out.println(arrayCompte.get(j).toString());
				}
			}
			System.out.println("=====================================");
		}
		
		
		public int menu() {
			System.out.println("~~~~~~~~~~~*Gestion bancaire*~~~~~~~~~~~");
			System.out.println("1. Creer un compte.");
			System.out.println("2. Depot dans un compte");
			System.out.println("3. Retrait dans un compte");
			System.out.println("4. Consulter le solde d'un compte");
			System.out.println("5. Calculer l’intérêt pour tous les comptes et mettre à jours leur solde");
			System.out.println("6. Rapport des liste de comptes");
			System.out.println("7. Checher les comptes d'un client");
			System.out.print("Faire un choix: ");
			return sc.nextInt();
		}

		public void lancer() {
			int choix;
			do {
				choix = menu();
				operation(choix);

			} while (choix != 8 );
		}

		public void operation(int key) {
			switch (key) {
			case 1:
				System.out.println("Creer un compte : ");
				addCompte();
				break;
			case 2:
				System.out.println("Depot dans un compte : ");
				depotCompte();
				break;
			case 3:
				System.out.println("Retrait dans un compte : ");
				retraitCompte();
				break;
			case 4:
				System.out.println("Consulter le solde d'un compte :");
				search();
				break;
			case 5:
				System.out.println("Calculer l’intérêt pour tous les comptes et mettre à jours leur solde :");
				interetCompte();
				break;
			case 6:
				System.out.println("Rapport des liste de comptes :");
				showAllCompte();
				break;
			case 7:
				System.out.println("Checher les comptes d'un client :");
				searchAccount();
				break;
			default: 
				System.out.println("Erreur de saisi");
				break;
			}
		}	
		

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		banque banqueC = new banque();
		banqueC.lancer();
	}

}
