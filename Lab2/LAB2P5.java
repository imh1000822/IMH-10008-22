import java.util.*;
public class LAB2P5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            int count=1;
            while(i<n-1 && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            System.out.println(arr[i]+"- "+count+" times.");
        }
    }

}