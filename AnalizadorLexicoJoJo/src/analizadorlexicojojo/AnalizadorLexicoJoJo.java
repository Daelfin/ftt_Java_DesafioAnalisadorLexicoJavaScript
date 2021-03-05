/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexicojojo;

import java.io.*;
import java.util.regex.*;
import java.util.Scanner;

public class AnalizadorLexicoJoJo {

    public static void main(String[] args) throws Exception {
        /*
        File file = new File("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\AnalizadorLexicoJoJo\\jquery-3.6.0.js");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sr = new StringBuilder();
        String auxstr;
        while ((auxstr = br.readLine().toString()) != null){
            auxstr = auxstr.trim();
            if (auxstr.length() == 0)
                continue;
            sr.append(auxstr + "╚");
        }
        String strfinal = sr.toString();
        System.out.println(sr.toString());
*/
        File file = new File("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\AnalizadorLexicoJoJo\\jquery-3.6.0.js");
        Scanner sc = new Scanner(file);
        StringBuilder sr = new StringBuilder();
        String auxstr;
        while (sc.hasNextLine()){
            auxstr = sc.nextLine().trim();
            sr.append(auxstr + "╚");
        }
        
    }
    
}
