public class Main {
//    static void display_array(int[][] a)
//    {
//        for (int r[]:a)
//        {
//            for(int c:r)
//            {
//                System.out.print(" "+c+",");
//            }
//            System.out.println();
//        }
//        System.out.println();

//    }
//

//
//    static void m1(String name,int a)
//    {
//        if(a<5)
//        {
//            System.out.println("AOA, Mr."+name);
//            a++;
//            m1(name,a);
//        }
//    }

    static void sum_array(int[][] array1,int[][] array2)
    {
        if(array1.length==array2.length)
        {
            for(int r=0;r<array1.length;r++)
            {
                if(array1[r].length==array2[r].length)
                {
                    for(int c=0;c<array1[r].length;c++)
                    {
                        System.out.print(" "+(array1[r][c]+array2[r][c]));
                    }
                    System.out.println();
                }
                else
                {
                    System.out.println("Column are not equal..!");
                }
            }
        }
        else
        {
            System.out.println("Rows are not equal in both array");
        }
    }

    public static void main(String[] args) {
        int[][] a = {{9,8,9,6},{2,5,8,7}};
        int[][] b = {{4,3,6},{9,5,1}};
        Main.sum_array(a,b);



//        int[][] marks = {{8,9,5,6,4,7},{6,5,4,8,9},{5,6,8},{9100,562,4565}};
//        Main.display_array(marks);
 //        int[] a = new int[]{5,6,8,9,8,7,4,5};
//        Main.display_array(a);
//        int[] b = new int[]{5,6,7,4,5};
//        Main.display_array(b);
//        int[] c = new int[]{5,56,78,98,4,5};
//        Main.display_array(c);
//        int[] d = new int[]{5,6,8,9100,562,4565};
//        Main.display_array(d);
//        int[] e = new int[]{0,2,4,5,6,9,8,7,4,5,6};
//        Main.display_array(e);
    }
}