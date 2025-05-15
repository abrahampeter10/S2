import java.util.*;
class Matrix{
    Scanner sc=new Scanner (System.in);

int n,m;
int matrix[][];

 void inputMatrix(){

    System.out.print("Enter size of matrix: ");
    n=sc.nextInt();
    m=sc.nextInt();
    matrix=new int[n][m];
    System.out.println("Enter value of matrix  ");
    for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
    matrix[i][j]=sc.nextInt();
}

void addMatrix(Matrix b){
for(int i=0;i<n;i++)
for(int j=0;j<m;j++)
matrix[i][j]+=b.matrix[i][j];
System.out.println("Sum of matrix");
display();
}
void display(){
    for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
System.out.print(matrix[i][j]+" ");
System.out.println();
}
}
}

class MatrixAddition{
     public static void main(String[] args){

        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        m1.inputMatrix();
        m2.inputMatrix();
        m1.addMatrix(m2);

    }
}