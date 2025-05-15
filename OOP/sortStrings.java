import java.util.*;
class sortStr{
    Scanner sc=new Scanner(System.in);
String s[];
int size;
sortStr(){
    System.out.print("Enter no: of strings: ");
    size=sc.nextInt();
    s=new String[size];
    System.out.print("Enter "+size+" strings: ");
    for(int i=0;i<size;i++)
    s[i]=sc.next();
}

    void sort(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(s[j].compareTo(s[j+1])>1){
                    String temp = s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
    }

    void displayStr(){
        for(int i=0;i<size;i++){
            System.out.print(s[i]+" ");
        }

         System.out.println();
    }
}
    class sortStrings{

    public static void main(String[] args){
                sortStr srt = new sortStr();
        srt.displayStr();
        srt.sort();
         System.out.println("After sorting");
        srt.displayStr();
    }
    }
