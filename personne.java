package tp1personne;
public class personne {

    private String nom;
    private String prenom;
    private int age;
    private char sexe;

    public personne() {
        nom = "Ben ALI";
        prenom = "Med";
        age = 30;
        sexe = 'M';
    }

    public personne(String nom, String prenom, int age, char sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    public String getName() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public char getSexe() {
        return sexe;
    }

    public void affiche() {
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Age : " + age);
        System.out.println("Sexe : " + sexe);
    }

    public boolean sameLastName(personne p) {
        return this.nom.equals(p.nom);
    }

    public static void main(String[] args) {
        personne p1 = new personne();
        personne p2 = new personne("Ben ALI", "Ahmed", 25, 'M');

        p1.affiche();
        System.out.println();

        p2.affiche();
        System.out.println();

        System.out.println("Meme nom : " + p1.sameLastName(p2));
    }
}