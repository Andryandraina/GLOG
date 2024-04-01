package iut.bad;

public abstract class Humain implements Consommation {
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
@Override
public void manger() {
	System.out.println(nom+ " "+prenom+ " mange");

}
@Override
public void boire() {
	System.out.println(nom+ " "+prenom+" boire");
}

public void ami(Humain h) {
    System.out.println( nom+ " "+ prenom + "et "+ h.nom+" "+h.prenom+ " sont des amis ");	
}
public void ami( Humain h, int dureeAmitie ) {
	System.out.println(nom+ " "+ prenom + "et "+ h.nom+" "+h.prenom+ " sont des amis depuis" + dureeAmitie+ "jours");
}
}
