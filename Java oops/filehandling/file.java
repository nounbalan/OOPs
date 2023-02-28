import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;  
import java.io.IOException;   
 class file {  
    public static void main(String args[]) {
      int ch=0;
      String path="/home/balan23/Documents/college/Java oops/filehandling/testfile.text";
      Scanner scan =new Scanner(System.in);
      try { 
        File f = new File(path);
        do{
          System.out.print("Enter the operation:");
          ch=scan.nextInt();
          switch(ch){
            case 1: 
            if (f.createNewFile()) {  
              System.out.println("File " + f.getName() + " is created successfully.");  
              } else {  
                System.out.println("File is already exist in the directory.");  
              } break;
            case 2:
                
            FileWriter fw = new FileWriter(path);  
            if(f.canWrite()){
              fw.write("This a text file created in java for file handling \nThis is a test file");   
              fw.close();   
              System.out.println("Content wrote successfully into this file.");  
              }
              else{
                 System.out.println("This file un-writable");
              }break;
            case 3:  
            if(f.canRead()){
              Scanner Filereader = new Scanner(f);  
              while (Filereader.hasNextLine()) {  
                String fileData = Filereader.nextLine();  
                System.out.println(fileData); 
              } 
              Filereader.close();
              }
            else{
                  System.out.println("This file un-readable");
            }break;
            case 4:
            if (f.exists()) {  
              System.out.println("The File name  is: " + f.getName());             
              System.out.println("The Path of the file is: " + f.getAbsolutePath()); 
              System.out.println("File Writeable: " + f.canWrite());    
              System.out.println("File Readable: " + f.canRead());    
              System.out.println("File Size (in Bytes): " + f.length());    
            } 
            else {
              System.out.println("The file does not exist.");  
            }break;  
            case 5:
            if (f.delete()) {
              System.out.println(f.getName()+ " File Deleted Successfully.");  
            } else {  
              System.out.println("Unexpected error found in deletion of the file");  
            } break;  

        }
      }while(ch!=6); 
        scan.close();
      } //try
      catch (IOException e) {  
        System.out.println("Unexpected error occurred");  
        e.printStackTrace();  
        }  
    }
  }
