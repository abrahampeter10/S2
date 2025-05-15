import java.io.File;
import java.util.Scanner;
class fileSearch{

        static void listandFiles(File directory){
            File[] fileList = directory.listFiles();
            if(fileList!=null){
                for(File file:fileList){
                     System.out.println(file.getName());
                     if(file.isDirectory())
                     listandFiles(file);
                }
            }
        }

        static void searchFile(File directory, String filename){
            File[] fileList = directory.listFiles();
            if(fileList!=null){
                for(File file:fileList){
                    if((file.isFile()) && (file.getName().equals(filename))){
                         System.out.println("File found At: " +file.getAbsolutePath());
                        return;
                    }else if(file.isDirectory()){
                      searchFile(file,filename);
                    }
                }
                System.out.println("File not found ");

            }
        }




    public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);
         if(directory.exists() && directory.isDirectory())
         System.out.print("Files and subpath: ");
         listandFiles(directory);
         System.out.print("Enter file name to search ");
         String fileName = scanner.nextLine();

        System.out.println("Searching for file '" + fileName + "'...");

        searchFile(directory,fileName);


    }
}