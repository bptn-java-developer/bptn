package com.bptn.course.week4.thursday;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");

		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(al); //Serialization actually happens

			fos.close();
			oos.close();
			
			// Deserialization
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList list = (ArrayList) ois.readObject(); // Deserialization happens
			
			System.out.println(list);//print out the list
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
