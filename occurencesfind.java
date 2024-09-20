import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int size;
        System.out.print("Enter the Sise: ");
        size = input.nextInt();
        
        int[] a = new int[size];
        
        int i = 0;
        while(i<a.length){
            System.out.print("Enter the array " + (i+1) + ": ");
            a[i] = input.nextInt();
            i++;
        }
        
        int n;
        System.out.print("enter the search no: ");
        n = input.nextInt();
        
        int occ = occ(a,n);
        System.out.print(occ);
    }
    
    public static int occ(int[] a, int n){
        int kitna=0;
        int i=0;
        while(i<a.length){
            if(a[i]==n){
                kitna++;
            }
            i++;
        }
        return kitna;
    }
}
