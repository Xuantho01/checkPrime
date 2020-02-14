import java.util.Scanner;
public class checkPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number to check: ");
        int num = input.nextInt();

        if(num < 2){
            System.out.println(num+ " is not a prime");
        }else{
            int i = 2;
            boolean flag = true;
            while(i <= Math.sqrt(num)){
                if(num % i == 0){
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag)
                System.out.println(num +" is a prime");
            else
                System.out.println(num +" is not a prime");
        }
    }
}
