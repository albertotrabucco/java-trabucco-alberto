import java.util.Scanner;
import java.util.Random;
public class esercizio1{
    public static void main(String[] args){
        int tentativi = 1;
        Scanner keyboard = new Scanner(System.in);
        int n = 5;
        
        int randomarray[]= new int[n];
        for(int i = 0; i < n; i++){
            Random rand = new Random();
            int randnum = rand.nextInt(9);
            randomarray[i] = randnum;
        }
        for(int k=0; k < n; k++){
            System.out.print(randomarray[k] + " ");
        }
        System.out.println("\n");

        int tries = 0;
        while(tries < tentativi){
            System.out.println("Inserisci un numero di 5 cifre: ");
            int userarray[] = new int[n];
            for(int j=0; j < n; j++){
                System.out.println((j+1)+"° numero:");
                userarray[j] = Integer.parseInt(keyboard.nextLine());
            }
            System.out.println("\n");
            System.out.print("Questo è il numero che hai scritto: ");
            for(int k=0; k < n; k++){                
                System.out.print(userarray[k]);
            }
            System.out.println("\n");
            System.out.print("Le cifre nella posizione giusta sono: ");
            int ncifre = 0;
            int sumcifre = 0;
            for(int i = 0; i < n; i++){
                if(userarray[i] == randomarray[i]){
                ncifre++;
                sumcifre += userarray[i];
                }
            }

            //compara con un array randomico generato in una funzione fuori dal main

            
            System.out.println("\n");
            System.out.println("-----------------------------------------------------------------");

            
        }
        


    }
}
