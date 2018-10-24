import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);


//        if (m==1){
//            System.out.println("one");
//        }
//        if (m==2){
//            System.out.println("two");
//        }
//        if (m==3){
//            System.out.println("three");
//        }
//        if (m==4){
//            System.out.println("four");
//        }
//        if (m==5){
//            System.out.println("five");
//        }
//        if (str.equals("one")){
//            System.out.println(1);
//        }else if (str.equals("two")){
//            System.out.println(2);
//        }else if (str.equals("three")){
//            System.out.println(3);
//        }else if (str.equals("four")){
//            System.out.println(4);
//        }else if (str.equals("five")){
//            System.out.println(5);
//        }
//        int n=scn.nextInt();
//        while (n>0){
//            if (n==1){
//                int m =scn.nextInt();
//                switch (m) {
//                    case 1:
//                        System.out.println("one");
//                        break;
//                    case 2:
//                        System.out.println("two");
//                        break;
//                    case 3:
//                        System.out.println("three");
//                        break;
//                    case 4:
//                        System.out.println("four");
//                        break;
//                    case 5:
//                        System.out.println("five");
//                        break;
//                }
//            }
//            else if (n==2){
//                String str =scn.next();
//                switch (str){
//                    case "one":
//                        System.out.println(1);
//                        break;
//                    case "two":
//                        System.out.println(2);
//                        break;
//                    case "three":
//                        System.out.println(3);
//                        break;
//                    case "four":
//                        System.out.println(4);
//                        break;
//                    case "five":
//                        System.out.println(5);
//                        break;
//                }
//            }
//           n=scn.nextInt();
//        }

//        switch (n){
//            case 1:
//                int m =scn.nextInt();
//                switch (m){
//                    case 1:
//                        System.out.println("one");
//                        break;
//                    case 2:
//                        System.out.println("two");
//                        break;
//                    case 3:
//                        System.out.println("three");
//                        break;
//                    case 4:
//                        System.out.println("four");
//                        break;
//                    case 5:
//                        System.out.println("five");
//                        break;
//                }
//                break;
//            case 2:
//                String str =scn.next();
//                switch (str){
//                    case "one":
//                        System.out.println(1);
//                        break;
//                    case "two":
//                        System.out.println(2);
//                        break;
//                    case "three":
//                        System.out.println(3);
//                        break;
//                    case "four":
//                        System.out.println(4);
//                        break;
//                    case "five":
//                        System.out.println(5);
//                        break;
//                }
//        }
//        int a=scn.nextInt(),b=scn.nextInt(),sum=0;
//        if (a<b){
//            for (int i=a;i<=b;i++){
//                sum+=i;
//            }
//            System.out.println(sum);
//        }

//        int n =scn.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("@");
//            }
//            System.out.println();
//        }

        int n =scn.nextInt();
        for (int a=n;a>=1;a--){
            for (int k=a/2+1;k>=1;k--){
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++){

            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


//        int n =scn.nextInt();
//        for (int i=1;i<=n;i++){
//            System.out.println(i +" "+ i*i);
//        }

//        int a=scn.nextInt(),b=scn.nextInt(),sum=0;
//        for (int i=a;i<=b;i++){
//            if (i%2==1){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);



    }
}
