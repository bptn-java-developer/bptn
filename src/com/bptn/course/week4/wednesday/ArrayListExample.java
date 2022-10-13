package com.bptn.course.week4.wednesday;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


class Person implements Serializable {
	
	private static final long serialVersionUID = -8718481362300068738L;
	
	String name;
	int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	/*
	 * It's important to create the hashCode() and the equals() method
	 * in your Customized Java Class especially when you use it with 
	 * Java Collections. 
	 * 
	 * equals() method
	 * When this equals() method is missing, some methods of the collections 
	 * will use the variable reference instead of the actual values 
	 * (weird behaviour, like for example an object is not found but we are 
	 * sure the object is the collection.
	 *  
	 * hashCode()
	 * 
	 * The hashCode() method is used by collections that use the hash algorithm 
	 * internally. For example: HashMap, HashSet, Hashtable, and others.
	 * 
	 */
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

public class ArrayListExample {


	
	
	public static void main(String[] args) {

		
		// Sets don't keep the insertion order.
		// Set keeps only unique values
		// LinkedHashSet keeps the insertion order.
		// TreeSet sorts the elements of the set.
		Set<String> set = new TreeSet<>();
		
		
		set.add("John");
		set.add("Jane");
		set.add("Jane");
		set.add("Mike");
		set.add("Pete");

		set.forEach(System.out::println);
		
		System.exit(0);
		
		List<Person> persons = new ArrayList<>();
		
		Person p1 = new Person("John",30);
		//Person p2 = new Person("John",30);
		
		persons.add(p1);
		
		// I am searching for a Person with name="John: and age="30"
		int index = persons.indexOf(new Person("John",29));
		
		System.out.println("Index: " + index);
		
		System.out.println(persons);
		
		
		
		
		
		//Create a list of Strings
		List<String> list = new ArrayList<>();
		
		String s1 = "Jane";
		
		list.add("John");
		list.add("Jane");
		list.add("Mike");
		list.add("Pete");


		
		// ["John","Jane","Mike","Pete"]
		//    0       1      2      3
		
		System.out.println("Size: " + list.size());
		
		System.out.println("The element at index=2: " + list.get(2));

		System.out.println("The index of Jane is : " + list.indexOf(new String("Jane")));
		
		// Prints out all the elements of the list with for loop
//		for (int i=0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// Prints out all the elements of the list with for-each
//		for (String str : list) {
//			System.out.println(str);
//		}
		
		// Prints out all the elements of the list with foreach
		
		//inserts an element in the list
		list.add(2,"Nick");

		//replaces an element in the list
		list.set(2,"Lily");

		//remove an element in the list
		list.remove(2);
		
		//list.clear();
		
		// OOP - Functional Programming - Method Reference
		// We are passing the code of the println method to
		// the foreach method.
		
		//list.forEach( n -> System.out.println(n + " Hello") ); // Lambda Expression
		
		//list.forEach( System.out::println ); // Method Reference
		
		int i =0;
		
		while( i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		System.out.println("Size: " + list.size());		
	}

}
