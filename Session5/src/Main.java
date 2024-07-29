public class Main {
    public static void main(String[] args) {

        int[][] Age = {{2,3,5,8},{55,98,92,88,53}};
        int sum=0,min=100,max=0,size=0;
        for(int[] r:Age)
        {
            size += r.length;
            for(int c:r)
            {
                System.out.print(" "+c);
                sum += c;

                if(min>c)
                    min=c;

                if(max<c)
                    max=c;
            }
            System.out.println();
        }
        System.out.print("\n Sum : "+sum+" min : "+min+" max : "+max);
        System.out.println("Average : "+(sum/size));




//        System.out.println("For Loop");
//        for(int i=0;i< Age.length;i++)
//        {
//            for (int j=0;j<Age[i].length;j++)
//            {
//                System.out.print(" "+Age[i][j]);
//            }
//            System.out.println();
//        }
//
//        System.out.println("For Each Loop");


//        System.out.println(Age.length);
//        System.out.println(Age[0].length);
//        System.out.println(Age[1].length);
//        System.out.println(Age[1].length+Age[0].length);
//        System.out.println(Age[0][0]);
//        System.out.println(Age[0][1]);
//        System.out.println(Age[0][2]);
//        System.out.println(Age[1][0]);
//        System.out.println(Age[1][1]);
//        System.out.println(Age[1][2]);
//        int[][] Age = new int[2][3];
//        Age[0][0] = 50;
//        Age[0][1] = 98;
//        Age[0][2] = 100;
//        Age[1][0] = 66;
//        Age[1][1] = 49;
//        Age[1][2] = 25;




//        int marks[] = new int[]{50,32,12,45,69,75,100,45,67,89};
//        int sum=0,min=100,max=0,avg;
//
//        for(int m:marks)
//        {
//            System.out.print(" "+m+", ");
//            sum += m;
//
//            if(max<m)
//            {
//                max=m;
//            }
//            if(min>m)
//            {
//                min=m;
//            }
//        }
//        System.out.print("\n Sum : "+sum+" min : "+min+" max : "+max);
//        System.out.println("Average : "+(sum/marks.length));


//        String[][] name = {{"Abid","Asad"},{"Hussain","Atif"}};
//        char[][] n = new char[4][10];
//        int i=0;
//        for(String na[]:name)
//        {
//            for(String naa:na)
//            {
//                n[i]=naa.toCharArray();
//            }
//            i++;
//        }




//        System.out.println(marks.length);
//        System.out.println("\t DO-WHILE Loop");
//        int k=0;
//        do {
//            System.out.print(" "+marks[k]+", ");
//            k++;
//        }
//        while (k<marks.length);
//        System.out.println("\n\t While Loop");
//        int j=0;
//        while(j<marks.length)
//        {
//            System.out.print(" "+marks[j]+", ");
//            j++;
//        }
//        System.out.println("\n\t For Loop");
//        for(int i=0;i<marks.length;i++)
//        {
//            System.out.print(" "+marks[i]+", ");
//        }
//        System.out.println("\n\t For Each");
//        for(int m:marks)
//        {
//            System.out.print(" "+m+", ");
//        }
//        int marks[] = new int[4];
//        marks[0] = 10;
//        marks[1] = 20;
//        marks[2] = 30;
//        marks[3] = 5;

//        System.out.println(marks[0]+", "+marks[1]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
    }
}