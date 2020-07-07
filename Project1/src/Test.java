import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
       
		Scanner scanner = new Scanner(new File("src/Names.txt"));
		List<String> lastName = new ArrayList<String>();
		
		
		while(scanner.hasNext()) {
			lastName.add(scanner.nextLine());
			
		}
		
		for (int i=0; i < lastName.size(); i++) {
			System.out.println("Your LastName is: " +lastName.get(i));
			
		}
		
		 scanner.close();
		
	}
	    
	
	
	
	public void tacos() {
		// TODO Auto-generated method stub
       System.out.println("you are hungry");
       
	}

}
