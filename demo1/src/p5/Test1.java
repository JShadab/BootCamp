package p5;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		List dogList = new ArrayList();

		dogList.add(new Car()); //0
		dogList.add(new Dog()); //1
		dogList.add(new Cat()); //2
		dogList.add(10); //3
		dogList.add(.5); //4
		
		
		Dog[] dogArr= new Dog[5];
		dogArr[0] = new Dog();
		dogArr[1] = new Dog();
		//dogArr[2] = new Cat();
		
		
		Dog d = dogArr[0];

	
		Object obj = dogList.get(1);
		Car c1= (Car) obj;

		System.out.println(dogList.size());
	}

}
