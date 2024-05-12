package Frame;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class SignUpHandler {
    public static void signUp(String username, String password,String contact) {
        try {
            FileWriter writer = new FileWriter("Data/user.txt", true);
            writer.write("username : "+username + "\t" +"password : " + password + "\t"+"contact : " +contact+"\t"+ "New User"+"\t"+"unsubsribed"+"\t");
			writer.write("we");
			writer.write("\n");
            writer.close();

			}
          catch (IOException e) {
            e.printStackTrace();
	}}
	
    public static boolean validateName(String username) {
		boolean flag=true;
		
		File file=new File("Data/user.txt");
		try{
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			String[] value=line.split("\t");
			if(value[0].equals(username))
			{
				flag=false;
			}

		}
				sc.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return flag;
		
	}
}
