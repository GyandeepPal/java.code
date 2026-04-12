import java.util.*;
public class switch_case{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int botton=sc.nextInt();
        // if(botton==1){
        //     System.out.println("Hello");
        // }else if(botton==2){
        //     System.out.println("Hey");

        // }else if(botton==3){
        //     System.out.println("Hii");
        // }

        switch(botton){
            case 1: System.out.println("Hello");
            break;
            case 2:System.out.println("Hey");
            break;
            case 3:System.out.println("Hii");
            break;
            default:System.out.println("Invalid botton");
        }
    }
}