 
public class transaction {
	private String date_Transaction ;
	private float depot;
	private float retrait;
	private float montant;
	
	// constructeurs
	public transaction() {
		
	}

	public transaction(String date_Transaction, float depot, float retrait, float montant) {
		this.date_Transaction = date_Transaction;
		this.montant = montant;
		this.depot = depot;
		this.retrait = retrait;
	}

	/**
	 * @return the date_Transaction
	 */
	public String getDate_Transaction() {
		return date_Transaction;
	}

	/**
	 * @param date_Transaction the date_Transaction to set
	 */
	public void setDate_Transaction(String date_Transaction) {
		this.date_Transaction = date_Transaction;
	}

	/**
	 * @return the depot
	 */
	public float getDepot() {
		return depot;
	}

	/**
	 * @param depot the depot to set
	 */
	public void setDepot(float depot) {
		this.depot = depot;
	}

	/**
	 * @return the retrait
	 */
	public float getRetrait() {
		return retrait;
	}

	/**
	 * @param retrait the retrait to set
	 */
	public void setRetrait(float retrait) {
		this.retrait = retrait;
	}

	/**
	 * @return the montant
	 */
	public float getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(float montant) {
		this.montant = montant;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Date Transaction = " + date_Transaction + "\n" +
				"Depot = " + depot + "\n" + 
				"Retrait = " + retrait + "\n" +
				"Montant = " + montant + "\n";
	}
	

	
}
