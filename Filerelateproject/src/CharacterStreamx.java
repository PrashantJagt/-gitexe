import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamx {

	public static void main(String[] args) throws IOException{
		//create the channel-step1
		FileReader reader = new FileReader("abc");
		FileWriter writer = new FileWriter("xyz");
		
		//step2
		int c;
		while ((c=reader.read())!=-1) {
			System.out.println(c);
			writer.write(c);
		}
		

	}

}
