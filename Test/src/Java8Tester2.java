
public class Java8Tester2 {

	   final static String salutation = "Hello! ";
	   final static String salutation2 = "Hello!!!! ";
	   
	   public static void main(String args[]){
	      GreetingService greetService1 = (message, name) -> { 
	      System.out.println(name+ " "+ salutation + message);
	      System.out.println(name + " "+ salutation2 + message);
	      };
	      
	      greetService1.sayMessage("ahn","w3big");
	      greetService1.sayMessage("Kim","w3big");
	   }
		
	   interface GreetingService {
	      void sayMessage(String message, String name);
	   }

}
