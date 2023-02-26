public class Methods_DoesUserHave18Years {
    public static void main(String[] args) {
        //Korisnik unosi godiste, treba proveriti da li je punoletan
        int godiste = 1998;

        //godine(godiste) - kada prosledim 1998 racuna se koliko korisnik ima godina - godine(godiste) == 24
        //punoletan(godine(godiste)) - kada prosledim 24 u proveru, a 24 sam dobio iz godine(godiste)

        //punoletan(godiste) - mogu da prosledim i godiste u punoletan ali bi se vrsila provera gde je u metodi y = 1998
        //punoletan(12) - mogu da prosledim i broj gde ce se vrsiti provera

        if (punoletan(godine(godiste))){
            System.out.println("Korisnik je punoletan");
        } else {
            System.out.println("Korisnik je maloletan");
        }

    }

    public static int godine(int x) {
        return 2022-x;
    }

    public static boolean punoletan(int y) {
        if (y>=18) {
            return true;
        } else {
            return false;
        }
    }
}
