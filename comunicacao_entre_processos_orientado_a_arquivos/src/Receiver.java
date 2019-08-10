import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.lang.Thread;
import java.lang.Exception;


public class Receiver extends Thread{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
		File myObj = new File("file");

		while(!myObj.exists()){
			System.out.print(".");
			try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
		}
		
		while(myObj.exists()){
			Scanner myReader = new Scanner(myObj);
			int x = 1;
			while(myReader.hasNextLine()){
				String data = myReader.nextLine();
				System.out.println(x+"\t"+data);
				x++;
			}
			myReader.close();
			myObj.delete();
		}

		int i = sc.nextInt();
		} catch (FileNotFoundException e){
			System.out.println("Um erro ocorreu");
			e.printStackTrace();
		}
	}
}