package org.demo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XmlWrite {
public static void main(String[] args) throws JAXBException {
	writeXml();
}
	
	public static void writeXml() throws JAXBException{
		JAXBContext jb = JAXBContext.newInstance(Employee.class);
		Marshaller mar = jb.createMarshaller();
		File loc = new File("D:\\workplace\\eclipse-wrokspace\\ApiDemo\\src\\test\\resources\\Xml\\write.xml");
		Employee emp=new Employee();
		emp.setId(100);
		emp.setName("Srini");
		emp.setSalary("10000");
		Employee emp1=new Employee();
		emp1.setId(200);
		emp1.setName("Vasan");
		emp1.setSalary("20000");
		mar.marshal(emp, loc);
		mar.marshal(emp1, loc);
		
	}
}
