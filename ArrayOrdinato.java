import java.util.Scanner;

public class ArrayOrdinato {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] parole = new String[100];
        int paroleinserite=0;
        System.out.println("Inserire le stringhe che si vuole (max 100) quando si vuole terminare inserire <fine>");
        System.out.println();
        do {
            //Inserimento
            System.out.print("Stringa "+(paroleinserite+1)+":");
            parole[paroleinserite++]=in.nextLine();
            //Riordino
            
        }while (!parole[paroleinserite].equalsIgnoreCase("fine"));
        //Stampa
        System.out.println("Array ordinato:");
        System.out.println();
        for (int i=0;i<paroleinserite;i++){
            System.out.print(parole[i]+" ");
        }
    }
}