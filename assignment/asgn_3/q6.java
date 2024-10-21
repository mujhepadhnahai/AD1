//convertion from decimal to hexadecimal no
import java.util.*;
public class q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no: ");
        int no = sc.nextInt();
        System.out.print("Ans: ");
        DectoHexdec(no);
    }

    static void DectoHexdec(int n){
        if(n == 0){
            return;
        }
        DectoHexdec(n/16);
        int remainder = n%16;
        if(remainder < 10 ){
            System.out.print(remainder);
        }else{
            System.out.print((char)(remainder-10 +'A'));
        }
    }
} 
