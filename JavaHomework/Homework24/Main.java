package Homework24;

public class Main {
    public static void main(String[] args) {
        //Napraviti klasu Jelo, koje će imati atribute za naziv, listu sastojaka, i boolean vrednost bezLaktoze. Klase Corba,
        //Torta i Sarma nasleđuju klasu Jelo.
        //Ukoliko je jedan od sastojaka mleko, podesicemo boolean vrednost za laktozu false, u suprotnom na true.
        //U main klasi kreirati i istampati bar tri jela
        //(njihov naziv, sastojke i da li je lactose-free)

        Jelo jelo1 = new Jelo("Corba");
        Jelo jelo2 = new Jelo ("Sarma");
        Jelo jelo3 = new Jelo ("Torta");

        Corba corba1 = new Corba("Corba");
        Sarma sarma1 = new Sarma ("Sarma");
        Torta torta1 = new Torta("Dobos");

        jelo1.dodajSastojak("Krompir");
        jelo1.dodajSastojak("Sargarepa");
        System.out.println("Naziv jela: " + corba1.naziv);
        jelo1.stampaLista();
        jelo1.stampaLaktoza();

        System.out.println("--------------------------------");

        jelo2.dodajSastojak("Kupus");
        jelo2.dodajSastojak("Meso");
        jelo2.dodajSastojak("Pirinac");
        System.out.println("Naziv jela: " + sarma1.naziv);
        jelo2.stampaLista();
        jelo2.stampaLaktoza();

        System.out.println("--------------------------------");

        jelo3.dodajSastojak("Brasno");
        jelo3.dodajSastojak("Mleko");
        jelo3.dodajSastojak("Cokolada");
        System.out.println("Naziv jela: " + torta1.naziv);
        jelo3.stampaLista();
        jelo3.stampaLaktoza();

    }
}
