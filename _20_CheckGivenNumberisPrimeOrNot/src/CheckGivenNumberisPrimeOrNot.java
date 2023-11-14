import java.util.Scanner;

/**
 * @author A.C.Dilshan
 */
public class CheckGivenNumberisPrimeOrNot{
        public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enteranumber:");
        int number=scanner.nextInt();
        scanner.close();

        int count=0;

//        if(1<number){
//
//        for(int i=1;i<=number;i++){
//        if(number%i==0)
//        count++;
//        }
//        if(count==2){
//        System.out.println(number+"isprimenumber");
//        }else{
//
//        System.out.print("notaprimenumber");
//        }
//
//
//        }else{
//        System.out.print("notaprimenumber");
//        }

//method2
if(isPrime(number)){
System.out.println(number+"isaprimenumber.");
}else{
System.out.println(number+"isnotaprimenumber.");
}
}
public static boolean isPrime(int number){
if(number<=1){
return false;//Numberslessthanorequalto1arenotprime.
}
if(number<=3){
return true;//2and3areprime.
}
if(number%2==0||number%3==0){
return false;//Divisibleby2or3,notprime.
}

for(int i=5;i*i<=number;i+=6){
if(number%i==0||number%(i+2)==0){
return false;//Divisiblebynumbersoftheform6k±1,notprime.
}
}

return true;//Ifnodivisorsarefound,thenumberisprime.
        }
}
