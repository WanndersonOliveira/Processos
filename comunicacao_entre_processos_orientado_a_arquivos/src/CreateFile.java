import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			FileWriter myObj = new FileWriter("file");

			System.out.println("Escreva: ");
			int i = 0;

			while(i < 5){
				String linha = sc.nextLine();
				myObj.write(linha+"\n");
				i++;
			}


			myObj.close();
		} catch (IOException e){
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}