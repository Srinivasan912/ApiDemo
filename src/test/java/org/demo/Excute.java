package org.demo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Excute {
	public static void main(String[] args) throws JAXBException {
		runxml();
	}
	
	
	public static void runxml() throws JAXBException {
		JAXBContext jb = JAXBContext.newInstance(Employee.class);
		Unmarshaller un = jb.createUnmarshaller();
		File f= new File("D:\\workplace\\eclipse-wrokspace\\ApiDemo\\src\\test\\resources\\Xml\\demo.xml");
		Object a = un.unmarshal(f);
		Employee em = (Employee)a;
		System.out.println("ID====>"+em.getId());
		System.out.println("Name==>"+em.getName());
		System.out.println("Salary==>"+em.getSalary());
	}
}
