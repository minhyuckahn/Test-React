import java.util.Arrays;
import java.util.List;

public class Java8Tester3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,60,70,80,90,1000};
		String[] arr2 = {"one", "two", "three"};
	
		for(int i: arr) {
			System.out.println(i);
		}
		
		for (String i : arr2) {
			System.out.println(i);
		}
		
		Person[] pArry = { new Person("안민혁", 40), new Person("안수빈", 20)};
		
		
		for (Person person : pArry) {
			System.out.println(person.name+ "의 나이는 " + person.age +"입니다.");
		}
		
		Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
		
		List<Person> pl = Arrays.asList(pArry);
		pl.forEach(p-> {
			System.out.print(p.name);
			System.out.println(p.age);
			System.out.println("=====================");
		});
	}

}


class Person{
	public String name;
	public int age ;
	public Person(String n, int age) {
		this.name = n;
		this.age = age;
	}
	
	
}