import java.util.Scanner;

public class HmSol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
       // int number1 = scanner.nextInt();
        //System.out.println("MAth ans = "+Math.pow(number1,3));
       // int ans=1;
       // for (int i =0 ; i<3 ; i++){
       //     ans = ans*number1;
       // }
       // System.out.println(ans);


        //2
        //for (int i = 0 ; i<14;i++){
        //    System.out.println("hiiiii");
        //}
//
        //int counter= 0;
//
        //while (counter < 14){
        //    System.out.println("hiiiii");
        //    counter++;
        //}

        //4


        //for (int i = 0 ; i <= 100; i++){
        //    if (i%3 == 0 )
        //        System.out.println(i);
        //}
        //
        //for (int i = 0 ; i <= 100; i=3+i){
        //    System.out.println(i);
        //}

        //5
        //int input;
        //int sum=0;
        //for (int i=0; i<8;i++){
        //    System.out.println("please enter the " + (i+1) + " number");
        //    input=scanner.nextInt();
        //    sum = sum + input;
        //}
        //System.out.println("the sum is :" + sum);

        //6
       //int number6=10;
       //int multi = 1;

       //while (number6 >0){
       //    multi = multi * number6;
       //    number6--;
       //}
       //System.out.println(multi);

        //7
        //int input,sum=0,multi=1;

       // for (int i = 0 ; i<10;i++){
       //     input= scanner.nextInt();
       //     if (i%2==0)
       //         sum=sum+input;
       //     else
       //         multi = multi* input;
       // }
//
       // System.out.println("the sum is "+sum);
       // System.out.println("the multi is "+multi);



        int input,sum=0;

        do{
            input=scanner.nextInt();
            sum = sum +input;

        }while (input>=0);



        input=scanner.nextInt();
        while (input>=0){
            sum=sum +input;
            input=scanner.nextInt();
        }
        System.out.println(sum);


    }
}
