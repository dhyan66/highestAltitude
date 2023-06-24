import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = kb.nextInt();
        int[] array = new int [length];
        for(int i =0; i<length;i++){
            System.out.println("Enter altitude number "+(i+1));
            array[i] = kb.nextInt();
        }
        System.out.println("The highest Altitude recorded is "+largestAltitude(array));
    }
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for(int i =0; i<gain.length;i++){
            sum += gain[i];
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }
}