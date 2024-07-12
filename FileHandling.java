import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
    //     try{
    //         File myfile=new File("file.txt");

    //     myfile.createNewFile();
    //     System.out.println("File created");
    // }catch(Exception e){
    //     System.out.println(e);
    // }
    // try{
    //     FileWriter writerfile =new FileWriter("file.txt");
    //     writerfile.write("Subhadeep");
    //     System.out.println("Done");
    //     writerfile.close();

    // }catch(Exception e){
    //     System.out.println(e);
    // }
    File myFile=new File("file.txt");
    
    try{
        Scanner sc=new Scanner(myFile);
        while(sc.hasNextLine()){
        String line=sc.nextLine();
        System.out.println(line);
    }
}catch(FileNotFoundException e){
    System.out.println(e);
}
}
    
}
