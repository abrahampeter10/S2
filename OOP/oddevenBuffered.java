import java.io.*;
import java.util.Scanner;
class oddevenBuffered{
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename="nums.txt";
        String evenFile="even.txt";
        String oddFile="odd.txt";
        try(
        BufferedReader inputFile= new BufferedReader( new FileReader(filename));
        BufferedWriter evenWriter= new BufferedWriter( new FileWriter(evenFile));
        BufferedWriter oddWriter= new BufferedWriter( new FileWriter(oddFile));
        ){
        String line;
        while((line=inputFile.readLine())!=null){
            int num=Integer.parseInt(line);

            if(num%2==0){
                evenWriter.write(line);
                evenWriter.newLine();

            }
            else{
                oddWriter.write(line);
                oddWriter.newLine();
            }
        }
        }
System.out.println("Even and odd numbers separated successfully.");



    }
}