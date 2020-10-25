package oop.lab03.bank;

public final class TestSimpleBankAccount {

    private TestSimpleBankAccount() { }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1 2) Creare
         * l' AccountHolder relativo a Luigi Bianchi con id 2 3) Creare i due
         * SimpleBankAccount corrispondenti 4) Effettuare una serie di depositi e
         * prelievi 5) Stampare a video l'ammontare dei due conti e verificare
         * la correttezza del risultato 6) Provare a prelevare fornendo un idUsr
         * sbagliato 7) Controllare nuovamente l'ammontare
         */
    	
    	AccountHolder user1 = new AccountHolder("Mario", "Rossi", 1);
    	AccountHolder user2 = new AccountHolder("Luigi", "Bianchi", 2);
    	
    	SimpleBankAccount accountUser1 = new SimpleBankAccount(user1.getUserID(), 1000);
    	SimpleBankAccount accountUser2 = new SimpleBankAccount(user2.getUserID(), 4000);
    	
    	accountUser1.deposit(user1.getUserID(), 10);
    	accountUser2.withdrawFromATM(user2.getUserID(), 4300);
    	
    	System.out.println("Account 1 ha: "+accountUser1.getBalance());
    	System.out.println("Account 2 ha: "+accountUser2.getBalance());
    	
    	accountUser2.withdraw(15, 140);
    	
    	System.out.println("Account 1 ha: "+accountUser1.getBalance());
    	System.out.println("Account 2 ha: "+accountUser2.getBalance());
    }
}
