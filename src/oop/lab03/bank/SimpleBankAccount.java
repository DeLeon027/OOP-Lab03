package oop.lab03.bank;

import oop.lab03.bank.interfaces.BankAccount;

public class SimpleBankAccount implements BankAccount{

	
    /*
     * Aggiungere i seguenti campi:
     * - double balance: ammontare del conto
     * - int userID: id del possessore del conto (già dichiarato: si veda al riguardo il metodo checkUser dichiarato in fondo alla classe)
     * - int nTransactions: numero delle operazioni effettuate
     * - static double ATM_TRANSACTION_FEE = 1: costo delle operazioni via ATM
     */
	static double ATM_TRANSACTION_FEE = 1;
	
	private int userID;
	private double balance;
	private int nTransactions;
	

    /*
     * Creare un costruttore pubblico che prenda in ingresso un intero (ossia l'id
     * dell'utente) ed un double (ossia, l'ammontare iniziale del conto corrente).
     */

	public SimpleBankAccount(int userID, double balance) {

		this.userID=userID;
		this.balance = balance;
	}
    /*
     * Si aggiungano selettori per: 
     * - ottenere l'id utente del possessore del conto
     * - ottenere il numero di transazioni effettuate
     * - ottenere l'ammontare corrente del conto.
     */

    public void deposit(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto Nota: il deposito va a buon fine solo se l'id utente
         * corrisponde
         */
    	if(checkUser(usrID)) {
    		this.nTransactions++;
    		this.balance=this.balance+amount;
    	}
    	else System.out.println("Errore, user id non trovato");
    	
    }

    public void withdraw(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount al totale del
         * conto. Note: - Il conto puo' andare in rosso (ammontare negativo) -
         * Il prelievo va a buon fine solo se l'id utente corrisponde
         */
    	if(checkUser(usrID)) {
    		this.nTransactions++;
    		this.balance=this.balance-amount;
    	}
    	else System.out.println("Errore, user id non trovato");
    }

    public void depositFromATM(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto detraendo le spese (costante ATM_TRANSACTION_FEE) relative
         * all'uso dell'ATM (bancomat) Nota: il deposito va a buon fine solo se
         * l'id utente corrisponde
         */
    	if(checkUser(usrID)) {
    		this.nTransactions++;
    		this.balance=(this.balance+amount)-ATM_TRANSACTION_FEE;
    	}
    	else System.out.println("Errore, user id non trovato");
    }
    

    public void withdrawFromATM(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount + le spese
         * (costante ATM_TRANSACTION_FEE) relative all'uso dell'ATM (bancomat)
         * al totale del conto. Note: - Il conto puo' andare in rosso (ammontare
         * negativo) - Il prelievo va a buon fine solo se l'id utente
         * corrisponde
         */	
    	  
        if(checkUser(usrID)) {
       		this.nTransactions++;
       		this.balance=(this.balance-amount)-ATM_TRANSACTION_FEE;
       	}
       	else System.out.println("Errore, user id non trovato");
       }
    
    void chargeManagementFees(int usrID) {
    	//
    }
    

    /* Utility method per controllare lo user */
    private boolean checkUser(final int id) {
        return this.getUserID() == id;
    }

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getTransactionsCount() {
		return nTransactions;
	}

	public void setnTransactions(int nTransactions) {
		this.nTransactions = nTransactions;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

}
