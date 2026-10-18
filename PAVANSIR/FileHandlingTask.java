package PAVANSIR;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingTask {
    public static void main(String[] args)throws IOException {
        File f=new File("./sample.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        //Finding the no.of lines in a text file
        // Scanner sc=new Scanner(f);int count=0;
        // while(sc.hasNextLine()){
        //     count++;
        //     System.out.println(sc.nextLine());
        // }
        // System.out.println(count);
        // sc.close();

        //Findingthe LengthyLine in a TextFile
        // Scanner sc=new Scanner(f);
        // String ans="";String s=sc.nextLine();
        // while(sc.hasNext()){ 
        //    if(s.length()<sc.nextLine().length()){
        //     s=sc.nextLine();
        //    }
        // }
        // System.out.println(s);
        // sc.close();

        //Finding the word count in textfile
        // Scanner sc=new Scanner(f);
        // int count=0;
        // while(sc.hasNext()){
        //     sc.next();
        //     count++;
        //     // System.out.println(sc.next());
        // }
        // System.out.println(count);
        // sc.close();
        Scanner sc=new Scanner(f);
        String target="Iam";int count=0;
        while(sc.hasNext()){
            // count++;
            String word=sc.next();
           if(word.equals(target)) count++;
            // System.out.print(sc.next());
        }
        System.out.println(count);
        sc.close();
    }
}
