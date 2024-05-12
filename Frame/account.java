package Frame;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.lang.*;
import javax.swing.*;


public class account {
 

    public static void changePassword(String name, String newPassword) {
        try {
            File oldFile = new File("Data/user.txt");
            Scanner sc = new Scanner(oldFile);
            String line;
            File newFile = new File("Data/tmp.txt");
            FileWriter writer = new FileWriter(newFile, true);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] parts = line.split("\t");
                if (parts[0].equals(name)) {
                    String newline = name + "\t" + newPassword + "\t" + parts[2]+"\t"+parts[3]+"\t"+parts[4]+"\n";
                    writer.write(newline);
                } else {
                    writer.write(line);
					writer.write("\n");
                }
            }
			
            sc.close();
			oldFile.delete();
			writer.flush();
            writer.close();

            File op = new File("Data/user.txt");
            newFile.renameTo(op);
 

        } catch (IOException e) {
            e.printStackTrace();
        }
    }  

	
	public static void addSubscription(String name) {
	   boolean flag=false;
        try {
            File oldFile = new File("Data/user.txt");
            Scanner sc = new Scanner(oldFile);
            String line;
            File newFile = new File("Data/tmp.txt");
            FileWriter writer = new FileWriter(newFile, true);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] parts = line.split("\t");
                if (parts[0].equals(name)) {
					flag=true;
                    String newline = name + "\t" + parts[1] + "\t" + parts[2]+"\t"+parts[3]+"\t"+"subscribed"+"\t"+parts[5]+"\n";
                    writer.write(newline);
					removeTransiction(name);
                } else {
                    writer.write(line);
					writer.write("\n");
                }
            }
			
            sc.close();
			oldFile.delete();
			writer.flush();
            writer.close();

            File op = new File("Data/user.txt");
            newFile.renameTo(op);
 

        } catch (IOException e) {
            e.printStackTrace();
        }
         if(flag){
            JOptionPane.showMessageDialog(null, "Subscription Succesfully Added", "Subscription", JOptionPane.INFORMATION_MESSAGE);
        }         
		 else{
            JOptionPane.showMessageDialog(null, "User not found. Please enter a valid email.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }	
	
	public static void removeSubscription(String name) {
	   boolean flag=false;
        try {
            File oldFile = new File("Data/user.txt");
            Scanner sc = new Scanner(oldFile);
            String line;
            File newFile = new File("Data/tmp.txt");
            FileWriter writer = new FileWriter(newFile, true);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] parts = line.split("\t");
                if (parts[0].equals(name)) {
					flag=true;
                    String newline = name + "\t" + parts[1] + "\t" + parts[2]+"\t"+parts[3]+"\t"+"unsubscribed"+"\n";
                    writer.write(newline);

                } else {
                    writer.write(line);
					writer.write("\n");
                }
            }
			
            sc.close();
			oldFile.delete();
			writer.flush();
            writer.close();

            File op = new File("Data/user.txt");
            newFile.renameTo(op);
 

        } catch (IOException e) {
            e.printStackTrace();
        }
         if(flag){
            JOptionPane.showMessageDialog(null, "Subscription Removed", "Unsubscribe", JOptionPane.INFORMATION_MESSAGE);
        }         
		 else{
            JOptionPane.showMessageDialog(null, "User not found. Please enter a valid email.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }	
	
	public static void addStar(String name) {
        try {
            File oldFile = new File("Data/user.txt");
            Scanner sc = new Scanner(oldFile);
            String line;
            File newFile = new File("Data/tmp.txt");
            FileWriter writer = new FileWriter(newFile, true);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] parts = line.split("\t");
                if (parts[0].equals(name)) {
                    String newline = name + "\t" + parts[1] + "\t" + parts[2]+"\t"+"Old User"+"\t"+parts[4]+"\t"+parts[5]+"\n";
                    writer.write(newline);
                } else {
                    writer.write(line);
					writer.write("\n");
                }
            }
			
            sc.close();
			oldFile.delete();
			writer.flush();
            writer.close();

            File op = new File("Data/user.txt");
            newFile.renameTo(op);
 

        } catch (IOException e) {
            e.printStackTrace();
        }
    }			
	
	public static void addWithout(String name) {
        try {
            File oldFile = new File("Data/user.txt");
            Scanner sc = new Scanner(oldFile);
            String line;
            File newFile = new File("Data/tmpx.txt");
            FileWriter writer = new FileWriter(newFile, true);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] parts = line.split("\t");
                if (parts[0].equals(name)) {
                    String newline = name + "\t" + parts[1] + "\t" + parts[2]+"\t"+parts[3]+"\t"+parts[4]+"\t"+"wo";
                    writer.write(newline);
					writer.write("\n");

                } else {
                    writer.write(line);
					writer.write("\n");
                }
            }
			
            sc.close();
			oldFile.delete();
			writer.flush();
            writer.close();

            File op = new File("Data/user.txt");
            newFile.renameTo(op);
 

        } catch (IOException e) {
            e.printStackTrace();
        }
    }			
	
	public static void addWith(String name) {
        try {
            File oldFile = new File("Data/user.txt");
            Scanner sc = new Scanner(oldFile);
            String line;
            File newFile = new File("Data/tmpx.txt");
            FileWriter writer = new FileWriter(newFile, true);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] parts = line.split("\t");
                if (parts[0].equals(name)) {
                    String newline = name + "\t" + parts[1] + "\t" + parts[2]+"\t"+parts[3]+"\t"+parts[4]+"\t"+"we";
                    writer.write(newline);
					writer.write("\n");

                } else {
                    writer.write(line);
					writer.write("\n");
                }
            }
			
            sc.close();
			oldFile.delete();
			writer.flush();
            writer.close();

            File op = new File("Data/user.txt");
            newFile.renameTo(op);
 

        } catch (IOException e) {
            e.printStackTrace();
        }
    }		
	

	public static void removeUser(String name) {
		boolean flag=false;
        try {
            File oldFile = new File("Data/user.txt");
            Scanner sc = new Scanner(oldFile);
            String line;
            File newFile = new File("Data/tmp.txt");
            FileWriter writer = new FileWriter(newFile, true);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] parts = line.split("\t");
                if (parts[0].equals(name)) {
					flag=true;

                } else {
                    writer.write(line);
					writer.write("\n");
                }
            }
			
            sc.close();
			oldFile.delete();
			writer.flush();
            writer.close();

            File op = new File("Data/user.txt");
            newFile.renameTo(op);
 

        } catch (IOException e) {
            e.printStackTrace();
        }
         if(flag){
            JOptionPane.showMessageDialog(null, "Account Succesfully Deleted", "Deleted", JOptionPane.WARNING_MESSAGE);
        }         
		 else{
            JOptionPane.showMessageDialog(null, "User not found. Please enter a valid email.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }	
	
	public static void removeTransiction(String name) {
		boolean flag=false;
        try {
            File oldFile = new File("Data/subscription.txt");
            Scanner sc = new Scanner(oldFile);
            String line;
            File newFile = new File("Data/tmpt.txt");
            FileWriter writer = new FileWriter(newFile, true);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] parts = line.split("\t");
                if (parts[0].equals(name)){
					flag=true;

                } else {
                    writer.write(line);
					writer.write("\n");
                }
            }
			
            sc.close();
			oldFile.delete();
			writer.flush();
            writer.close();

            File op = new File("Data/subscription.txt");
            newFile.renameTo(op);
 

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
     public static boolean starExists(String enteredName) {
		boolean flag=false;
		
		File file=new File("Data/user.txt");
		try{
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			String[] value=line.split("\t");
			if(value[0].equals(enteredName) && value[3].equals("Old User"))
			{
				flag=true;
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

	public static boolean getWorkout(String enteredName) {
		boolean flag=false;
		
		File file=new File("Data/user.txt");
		try{
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			String[] value=line.split("\t");
			if(value[0].equals(enteredName) && value[5].equals("wo"))
			{
				flag=true;
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
	public static String getContact(String name){
		String flag="*********";
		File file=new File("Data/user.txt");
		try{
		Scanner sc=new Scanner(file);

		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			String[] value=line.split("\t");
			String[] contact=value[2].split(":");
			if(value[0].equals(name))
			{
				flag=contact[1];
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
	public static boolean getSubscriber(String name){
		boolean flag = false;
		File file=new File("Data/user.txt");
		try{
		Scanner sc=new Scanner(file);

		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			String[] value=line.split("\t");
			if(value[0].equals(name) && value[4].equals("subscribed"))
			{
				flag=true;
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
	
	public static String getDetails(String files){
		String Details ="";
		File file=new File(files);
		try{
		Scanner sc=new Scanner(file);

		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			Details+=line+"\n";
		}
		sc.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return Details;		
	}
}
