//Versione meno 'ottimizzata' rispetto alla precedente con Array.sort (Commit 2)

import java.util.Scanner;

public class ArrayOrdinatoVersioneNonOttimale {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] parole = new String[100];
        int paroleinserite=0;
        String temp;
        System.out.println("Inserire le stringhe che si vuole (max 100) quando si vuole terminare inserire <fine>");
        System.out.println();
        do {
            //Inserimento
            System.out.print("Stringa "+(paroleinserite+1)+":");
            parole[paroleinserite++]=in.nextLine();
            
            //Controllo se abbiamo finito o se non ci sono abbastanza parole per riordinare
            if (!parole[paroleinserite-1].equalsIgnoreCase("fine") && paroleinserite>=2){

                //Verifico se bisogna attuare il riordino
                if (parole[paroleinserite-1].compareToIgnoreCase(parole[paroleinserite-2])<0){

                    //Salvo la parola presa in input in una variabile temporanea per comodità
                    temp=parole[paroleinserite-1];

                    //Riordino
                    for (int i=0;i<paroleinserite;i++){               //Trovo la prima posizione da cui partire con il riordino che sarà = i
                        if (temp.compareToIgnoreCase(parole[i])<0) {
                            for (int j=paroleinserite-1;j>i;j--){     //"Sposto in avanti" tutte le parole dopo la posizione (=i), ove sarà inserita la parola presa in input
                                parole[j]=parole[j-1];
                            }
                            parole[i]=temp;
                            break;                                    //Posso terminare il ciclo più esterno, tanto è tutto in ordine
                        }
                    }
                }
            }
        }while (!parole[paroleinserite-1].equalsIgnoreCase("fine") && paroleinserite< parole.length);
        //Stampa dell'array in ordine, ignorando la parola 'fine'
        System.out.println("Array ordinato:");
        System.out.println();
        for (int i=0;i<paroleinserite;i++){
            System.out.print(parole[i]+" ");
        }
    }
}
