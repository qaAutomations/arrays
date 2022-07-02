import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
       // int x1= 5;
       // int x2=5;
//
       // System.out.println("x1 "+x1);
       // System.out.println("x2 "+x2);
       // x1++;
       // System.out.println("x1 "+x1);
       // System.out.println("x2 "+x2);
//
       // String name1=scanner.next();
       // String name2=scanner.next();
       // System.out.println("name1 "+name1);
       // System.out.println("name2 "+name2);
//
       // System.out.println("name1 == hani   " +(name1.equals("hani")));

       // String name ;
       // do{
       //     name= scanner.next();
       // }while(!name.equals("hodi"));
       // System.out.println("hi");
       // String[] names = new String[5];
       // int[] grades = new int[8];
       // for (int i=0 ; i<5 ; i++) {
       //     names[i] = scanner.next();
       // }
//
       // for (int i = 0;i<5;i++){
       //     System.out.println(names[i]);
       // }
        //System.out.println(names[0]);
        //System.out.println(names[1]);
        //System.out.println(names[2]);
        //System.out.println(names[3]);

       // int[] numbers = new int[10];
         //numbers[0] = 5;
         //numbers[1]  = 6;
         //numbers[2]  = 12;
       // for (int i=0 ; i < 10 ; i++) {
       //     numbers[i] = scanner.nextInt();
       // }
       // //print array
       // for (int i=0 ; i < 10 ; i++) {
       //     System.out.println(numbers[i]);
       // }
       // //print array
       // System.out.println(Arrays.toString(numbers));


        double[] top5 = new double[5];


        for (int i=0 ; i < top5.length ;i++){
            top5[i] = scanner.nextDouble();
        }

        double c= scanner.nextDouble();

        for (int i=0 ; i < top5.length ;i++){
            if (c == top5[i])
                System.out.println("we found a match");
        }

        double sum = 0;

        for (int i=0 ; i < top5.length ;i++){
             sum = sum + top5[i];
        }



    }
}
