package iut.bad;

public abstract class Humain {
	protected String nom;
	protected String prenom;
	protected int age;
	
protected void details() {
	System.out.println("Nom: "+nom+"\nPrenom: "+ prenom +"\nAge: "+ age);
	}
@Override
public String toString() {
	return "Nom : "+nom+"\nPrenom: "+ prenom +"\nAge: "+ age;
}
public void manger() {
	System.out.println(nom+ " "+prenom+ " mange");

}
public void boire() {
	System.out.println(nom+ " "+prenom+" boire");
}
}
