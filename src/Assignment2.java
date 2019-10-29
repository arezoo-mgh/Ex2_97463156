import java.io.IOException;
import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("plz enter two numbers :");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("row is:");
        int a = myScanner.nextInt();
        System.out.print("column is:");
        int b = myScanner.nextInt();
        
        Random rd = new Random();
        int[][] arr = new int[a][b];
        System.out.println("first array :");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = rd.nextInt();
                System.out.println(arr[i][j]);
            }

        }
        System.out.println("plz enter row and column:");
        String c = myScanner.next();
        if(c.equals("r")){
            System.out.println("plz enter the number of row: ");
        }
        else{
            System.out.println("plz enter the number of column: ");
        }
        int d = myScanner.nextInt();
        
        if(c.equals("r")){
            int temp;
            boolean flag = false;
            for (int r = 0; r < b; r++) {
                for (int i = 0; i < b-1; i++) {
                    if(arr[d][i]>arr[d][i+1]){
                        flag = true;
                        for (int j = 0; j < a; j++) {
                           temp = arr[j][i+1]; 
                           arr[j][i+1] = arr[j][i];
                           arr[j][i] = temp;
                        }
                    }
                }
                if(flag==false){
                    break;
                }
                System.out.println("second array :");
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < b; j++) {
                        System.out.println(arr[i][j]);
                    }
                }
            }
        }
        else if(c.equals("c")){
            int temp;
            boolean flag = false;
            for (int r = 0; r < a; r++) {
                for (int i = 0; i < a-1; i++) {
                    if(arr[i][d]>arr[i][d+1]){
                        flag = true;
                        for (int j = 0; j < b; j++) {
                            temp = arr[i+1][j];
                            arr[i+1][j] = arr[i][j];
                            arr[i][j] = temp;
                        }
                    }
                }
                if(flag==false){
                    break;
                }
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < b; j++) {
                        System.out.println(arr[i][j]);
                    }
                }
            }
        }
        else{
            System.out.println("Your number should be smaller!!");
        }
        try{
            System.in.read();
        }catch(IOException  e){}
    }
    
}
