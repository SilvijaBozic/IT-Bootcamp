public class Homework19 {
    public static void main(String[] args) {

//        Napraviti proizvoljan niz imena, zatim napraviti metod koji ce kao parametre primati niz imena i String
//        koji zelimo da proverimo,ispisati poruku ukoliko se ime nalazi u nizu,
//        obavestiti ako nije tu. (Ime za proveru vi unosite)

        String niz[] = {"Mila", "Mira", "Dusan", "Marko", "Marijana"};
        String ime = "Mila";
        if (provera(niz,ime)){
            System.out.println("Ime se nalazi u nizu.");
        }else{
            System.out.println("Ime se ne nalazi u nizu");
        }
    }

    public static boolean provera(String[] a, String b){
        boolean rezultat=false;
        for(int i=0;i<a.length;i++) {
            if (b.equals(a[i])) {
                rezultat = true;
                break;
            }
        }
        return rezultat;
    }
}
