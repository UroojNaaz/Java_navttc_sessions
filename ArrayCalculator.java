import java.util.Scanner;

public class ArrayCalculator {
private int Row,Col,Matrix[][];
Scanner s = new Scanner(System.in);
public ArrayCalculator()
{
this.Row = 5;
this.Col = 5;
this.Matrix = new int[this.Row][this.Col];
}
public ArrayCalculator(int row, int col, int[][] matrix) {
if(Row>4 & Col>5)
{
Row = row;
Col = col;
Matrix = matrix;
}
else
{
System.out.println("Row and Column Size must be greater then 4");
}
}

public void inputElement()
{
//For Input
for(int i = 0;i<Matrix.length;i++)
{
for(int j =0;j<Matrix[i].length;j++)
{
System.out.print("Enter Value at Index ["+i+"]["+j+"] : ");
Matrix[i][j] = s.nextInt();
}
}
//For Output
for(int r[]:Matrix)
{
for (int c:r)
{
System.out.print(" "+c);
}
System.out.println();
}
}

public void printBorderElement()
{
for(int i = 0;i<Matrix.length;i++)
{
for(int j =0;j<Matrix[i].length;j++)
{
if(i==0 || i == (Matrix.length-1) || j==0 || j==(Matrix[i].length-1))
{
System.out.print(" "+Matrix[i][j]+" ");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
public int sumBorderElement()
{
int sum = 0;
for(int i = 0;i<Matrix.length;i++)
{
for(int j =0;j<Matrix[i].length;j++)
{
if(i==0 || i == (Matrix.length-1) || j==0 || j==(Matrix[i].length-1))
{
sum += Matrix[i][j];
}
}
}
return sum;
}

public int maxBorderElement()
{
int max = 0;
for(int i = 0;i<Matrix.length;i++)
{
for(int j =0;j<Matrix[i].length;j++)
{
if(i==0 || i == (Matrix.length-1) || j==0 || j==(Matrix[i].length-1))
{
if(max<Matrix[i][j])
{
max = Matrix[i][j];
}
}
}
}
return max;
}

public int minBorderElement()
{
int min = 999;
for(int i = 0;i<Matrix.length;i++)
{
for(int j =0;j<Matrix[i].length;j++)
{
if(i==0 || i == (Matrix.length-1) || j==0 || j==(Matrix[i].length-1))
{
if(min>Matrix[i][j])
{
min = Matrix[i][j];
}
}
}
}
return min;
}

}
