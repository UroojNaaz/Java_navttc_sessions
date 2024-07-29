import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int pin;
        do{
            System.out.println("Enter your pincode : ");
            pin = s.nextInt();
        }
        while (pin != 5689);

        System.out.println("Welcome to dashboard..!");









//        boolean Life = true;
//        while(Life)
//        {
//            int num;
//            System.out.print("Enter any value : ");
//            num = s.nextInt();
//
//            if(num%2 == 0)
//            {
//                Life = true;
//                System.out.println("Good Shoot..!");
//            }
//            else
//            {
//                Life = false;
//                System.out.println("Game Over..Best of Luck for Next Time.");
//            }
//        }


//        int count=1;
//        for(int i=1;i<=6;i++)
//        {
//            if(count==3)
//            {
//                return;
//            }
//            else if(i>5)
//            {
//                count++;
//                i=-1;
//                System.out.println("\n");
//            }
//            else if(count==1)
//            {
//                System.out.print("1 * "+i+" = "+(1*i));
//                System.out.print("\t 2 * "+i+" = "+(2*i));
//                System.out.print("\t 3 * "+i+" = "+(3*i));
//                System.out.print("\t 4 * "+i+" = "+(4*i));
//                System.out.println("\t 5 * "+i+" = "+(5*i));
//            }
//            else{
//                System.out.print("6 * "+i+" = "+(6*i));
//                System.out.print("\t 7 * "+i+" = "+(7*i));
//                System.out.print("\t 8 * "+i+" = "+(8*i));
//                System.out.print("\t 9 * "+i+" = "+(9*i));
//                System.out.println("\t 10 * "+i+" = "+(10*i));
//            }
//
//
//
//        }
//        Scanner s = new Scanner(System.in);
//        System.out.println("*******MENU*******");
//        System.out.println("\t 1. SUM.");
//        System.out.println("\t 2. SUBTRACTION.");
//        System.out.println("\t 3. DIVISION.");
//        System.out.println("\t 4. MULTIPLICATION.");
//        System.out.println("\t 5. REMAINDER.");
//        System.out.println("\t 6. EXIT.");
//        int choice;
//        System.out.print("Choice any one of them : ");
//        choice = s.nextInt();
//
//        int num1,num2;
//        System.out.print("Enter first value : ");
//        num1 = s.nextInt();
//        System.out.print("Enter Second value : ");
//        num2 = s.nextInt();
//
//        switch (choice)
//        {
//            case 1:
//                System.out.println("Sum is : "+(num1+num2));
//                break;
//            case 2:
//                System.out.println("Subtraction is : "+(num1-num2));
//                break;
//            case 3:
//                System.out.println("Division is : "+(num1/num2));
//                break;
//            case 4:
//                System.out.println("Multiplication is : "+(num1*num2));
//                break;
//            case 5:
//                System.out.println("Remainder is : "+(num1%num2));
//                break;
//            case 6:
//                return;
//            default:
//                System.out.println("Invalid Choice");
//                break;
//        }
//


//        int eng,urdu,mth,phy,chm,obtain;
//        float Percentage;
//        System.out.print("Enter Marks of Eng : ");
//        eng = s.nextInt();
//        System.out.print("Enter Marks of Urdu : ");
//        urdu = s.nextInt();
//        System.out.print("Enter Marks of Maths : ");
//        mth = s.nextInt();
//        System.out.print("Enter Marks of Physics : ");
//        phy = s.nextInt();
//        System.out.print("Enter Marks of Chemistry : ");
//        chm = s.nextInt();
//        obtain = eng+urdu+mth+phy+chm;
//        System.out.println("Your Obtain Marks are : "+obtain);
//
//        Percentage = (obtain*100)/500;
//        System.out.println("Your percentage is : "+Percentage);
//
//        if (Percentage>=55.5)
//        {
//            System.out.println("Your are Pass..!");
//        }
//        else
//        {
//            System.out.println("Your are Fail...! ");
//        }
//
//        if(Percentage>=90)
//        {
//            System.out.println("Your Grade is A+");
//        }
//        else if (Percentage>=80)
//        {
//            System.out.println("Your Grade is A");
//        }
//        else if (Percentage>=70)
//        {
//            System.out.println("Your Grade is B+");
//        }
//        else if (Percentage>=60)
//        {
//            System.out.println("Your Grade is B");
//        }
//        else if (Percentage>=55) {
//            System.out.println("Your Grade is C");
//        }
//        else
//        {
//            System.out.println("Your Grade is F");
//        }


//        int age;
//        System.out.print("Enter your age : ");
//        age = s.nextInt();
//
//        if(age>=18) {
//            System.out.println("You can cast vote");
//            System.out.println("kes ko vote daa raha ho?");
//        }
//        else {
//            System.out.println("You can not cast vote");
//            System.out.println("Bada ho jawo phala?");
//        }





//        int a,b,temp;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter value for a : ");
//        a = s.nextInt();
//        System.out.print("Enter value for b : ");
//        b = s.nextInt();
//        System.out.println("Before Swapping");
//        System.out.println("A : "+a+" B : "+b);
//        a = a+b;
//        System.out.println(a);
//        b = a-b;
//        a = a-b;
//        a = a*b;
//        b = a/b;
//        a = a/b;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After Swapping");
//        System.out.println("A : "+a+" B : "+b);

    }
}