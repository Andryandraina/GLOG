package iut.bad;

public abstract class Humain {
	protected String nom;
	protected String prenom;
	protected int age;
	
protected void details() {
	System.out.println("Nom: "+nom+"\nPrenom: "+ prenom +"\nAge: "+ age);
	}

}
