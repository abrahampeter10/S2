import java.util.*;
import java.io.File;
class listSearch{

    static void listFiles(File directory){
        File[] filelist = directory.listFiles();  // error chance
        for(File files: filelist){
        System.out.println(files.getName());
            if(files.isDirectory()){
                listFiles(files);
            }
        }
    }

    static boolean searchFiles(File directory, String filename){
     File[] filelist = directory.listFiles();  // error chance
    if(filelist!=null){
    for(File files: filelist){
            if(files.isFile() && files.getName().equals(filename)){
                System.out.println("File found at path: " +files.getAbsolutePath());        
                return true;
            }
            else if(files.isDirectory()){
                boolean found = searchFiles(files,filename);
                if(found)
                return true;
            }

        }

    }
    return false;
    }


    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String directoryPath= "C:\\Extras\\Learning";
    File directory = new File(directoryPath);
    if(directory.exists() && directory.isDirectory()){
        System.out.println("Files and directory");
        listFiles(directory);
        System.out.println("Enter file name to search");
        String filename=sc.nextLine();
        boolean found =searchFiles(directory,filename);
        if(!found)
        System.out.println("File not found");

    }
    }
}
