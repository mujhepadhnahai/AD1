//compution nth power of a number
import java.util.*;
public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no and power to compute ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Ans: "+pow(x,y));
    }

    static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        return a*pow(a,b-1);
    }
} 
