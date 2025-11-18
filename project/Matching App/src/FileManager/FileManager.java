/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileManager;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Sai Lin Htet
 */
public class FileManager {
    public static List<String[]> getAllUser() throws IOException {
        List<String[]> userList = new ArrayList<>();
        Scanner in = new Scanner(new File("src/db/user.txt"));

        while (in.hasNextLine()) {
            String[] info = in.nextLine().split(",", -1);
            userList.add(info);
        }
        in.close();
        return userList;
    }
    public static void updateUser(String[] userInfo) throws IOException {
    List<String[]> userList = getAllUser();
    PrintWriter writer = new PrintWriter(new File("src/db/user.txt"));
    
    for (int i = 0; i < userList.size(); i++) {
        String[] arr = userList.get(i);
        String line = "";
        if(i!=0){
               line= line.concat("\n");
            }
        if (arr[0].equals(userInfo[0])) {
           
            
            for (int z = 0; z < userInfo.length; z++) {
                if (z == 0) {
                    line = line.concat(userInfo[z]);
                } else {
                    line = line.concat("," + userInfo[z]);
                }

            }
        } else {
            for (int z = 0; z < arr.length; z++) {
                if (z == 0) {
                    line = line.concat(arr[z]);
                } else {
                    line = line.concat("," + arr[z]);
                }
            }
        }
        writer.printf(line);
       
    } 
    writer.close();
    }
    public static void addUser(String[] arr) throws IOException {
        PrintStream out = new PrintStream(new FileOutputStream("src/db/user.txt", true));
        String line = "\n";

        for (int i = 0; i < 12; i++) {
            try {
                if (i == 0) {
                    line = line.concat(arr[i]);
                } else {
                    line = line.concat("," + arr[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                line = line.concat("," + "");

            }
            
        }

        out.append(line);
        out.close();
    }
    
}
