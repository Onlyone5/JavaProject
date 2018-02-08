
public class compte {
	private int no_Compte;
	private int no_Client;
	private String nom_Client;
	private float solde;
	private float taux;
	private transaction Transaction;
	
	// constructeurs
	public compte() {
		
	}

	public compte(int no_Compte, int no_Client, String nom_Client, float solde, float taux, transaction Transaction) {
		this.no_Client = no_Client;
		this.no_Compte = no_Compte;
		this.nom_Client = nom_Client;
		this.solde = solde;
		this.taux = taux;
		this.Transaction = Transaction;
	}
	
	public int getNo_Compte() {
		return no_Compte;
	}
	public void setNo_Compte(int no_Compte) {
		this.no_Compte = no_Compte;
	}
	public int getNo_Client() {
		return no_Client;
	}
	public void setNo_Client(int no_Client) {
		this.no_Client = no_Client;
	}
	public String getNom_Client() {
		return nom_Client;
	}
	public void setNom_Client(String nom_Client) {
		this.nom_Client = nom_Client;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public float getTaux() {
		return taux;
	}
	public void setTaux(float taux) {
		this.taux = taux;
	}
	
	/**
	 * @return the transaction
	 */
	public transaction getTransaction() {
		return Transaction;
	}

	/**
	 * @param transaction the transaction to set
	 */
	public void setTransaction(transaction transaction) {
		Transaction = transaction;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "No Compte = " + no_Compte + "\n" + 
				"No Client = " + no_Client + "\n" + 
				"Nom Client = " + nom_Client + "\n" + 
				"Solde = " + solde + "\n" + 
				"Taux = " + taux + "\n" +
				"" + Transaction.toString() + "\n";
	}


	
	
}
