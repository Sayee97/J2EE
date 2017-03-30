/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @ahor SAYEE Kohli;
 */
public class File_Demo  {
    public static void main(String[] args) throws Exception {
        
    
    File F89 = new File("intro.txt");
    F89.createNewFile();
    FileWriter fw = new FileWriter(F89);
    fw.write("Hello my name is sayee.We are enjoying!Enthusiast||Learner");
    fw.close();
    FileReader fr = new FileReader(F89);
    int ko=fr.read();
    while(ko!=-1){
        System.out.print((char)ko);
        ko=fr.read();
    }
    
    }
    
}
