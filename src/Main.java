import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quanti voti devi inserire?: ");
        int nStudenti = in.nextInt();
        Studente studenti = new Studente(nStudenti);
        studenti.inserisciDati();
        studenti.stampaDati();
    }
}