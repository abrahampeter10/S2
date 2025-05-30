import java.io.*;
import java.util.Scanner;

public class WriteRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            //Create and write
            System.out.println("Enter filename");
            String filename=sc.nextLine();
            FileOutputStream fos = new FileOutputStream(filename);
            System.out.println("Enter the content to write: ");
            String content= sc.nextLine();
            fos.write(content.getBytes());
            fos.close();

            //Read
            FileInputStream fis = new FileInputStream(filename);
            System.out.println("Content of " +filename+" is: ");
            int data;
            while((data=fis.read())!=-1){
                System.out.print((char)data);
            }            
        }
        catch(IOException e){
            
        }
    }
}
