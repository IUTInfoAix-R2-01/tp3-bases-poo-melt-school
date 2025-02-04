package Bibliotheque;

public class TestLivre {

	public static void main(String[] args) {
		Livre l1 = new Livre();
	    System.out.println("Le livre s'appelle " 
	    + l1.getName() + ", il coute " + l1.getPrice() + ", et il y a " +
	    		l1.getQuantity() + "Exemplaire");
	      
	    System.out.println(l1.toString());
	    
	    l1.setQuantity(16);
	    System.out.println("Nouvelle quantité " + l1.getQuantity());
	}

}
