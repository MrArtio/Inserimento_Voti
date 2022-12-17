import java.util.Scanner;

public class Studente {
    private String[][] dati;

    public Studente(int numeroStudenti) {
        dati = new String[numeroStudenti][4];
    }

    public void inserisciDati() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < dati.length; i++) {
            System.out.print("Inserisci il nome " + (i+1) + ": ");
            dati[i][0] = scanner.nextLine();

            System.out.print("Inserisci il cognome " + (i+1) + ": ");
            dati[i][1] = scanner.nextLine();

            System.out.print("Inserisci la data " + (i+1) + ": ");
            dati[i][2] = scanner.nextLine();

            System.out.print("Inserisci il voto " + (i+1) + ": ");
            dati[i][3] = scanner.nextLine();
        }
    }

    public void stampaDati() {
        for (int i = 0; i < dati.length; i++) {
            System.out.println("Nome: " + dati[i][0]);
            System.out.println("Cognome: " + dati[i][1]);
            System.out.println("Data: " + dati[i][2]);
            System.out.println("Voto: " + dati[i][3]);
            System.out.println();
        }
    }
}
