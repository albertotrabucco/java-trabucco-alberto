import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class esercizio2 {
    public static String checkSort(int[] a){
        String risposta = "";
        int arrcheckAsc[] = new int[10];
        int arrcheckDesc[] = new int[10];
        for(int i = 0; i < a.length ;i++){
            arrcheckAsc[i] = a[i];
            arrcheckDesc[i] = a[i];
        }
        Arrays.sort(arrcheckAsc);
        Arrays.sort(arrcheckDesc, Collections.reverseOrder());

        if(arrcheckDesc == a || arrcheckDesc != a){
            risposta = "Sono in ordine decrescente!";
        }if (arrcheckAsc == a) {
            risposta = "Sono in ordine crescente!";
        } else {
            risposta = "Non sono in ordine!";
        }
        
        return risposta;
    }
    
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Inserisci il"+(i+1)+"° numero: ");
            arr[i] = Integer.parseInt(keyboard.nextLine());
        }

        System.out.println(checkSort(arr));
    }


}