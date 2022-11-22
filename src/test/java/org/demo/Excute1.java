package org.demo;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Excute1 {
	public static void main(String[] args) throws JAXBException {
		runxml();
	}

	public static void runxml() throws JAXBException {
		JAXBContext jb = JAXBContext.newInstance(EmpDetails.class);
		Unmarshaller un = jb.createUnmarshaller();
		File fo = new File("D:\\workplace\\eclipse-wrokspace\\ApiDemo\\src\\test\\resources\\Xml\\demo1.xml");
		Object al = un.unmarshal(fo);
		EmpDetails em = (EmpDetails)al;
		List<Employeess> emmm = em.getEmployeess();
		for (Employeess x : emmm) {
			System.out.println("id===>" + x.getId());
			System.out.println("Name==>" + x.getName());
			System.out.println("salary===>" + x.getSalary());
			Address ad = x.getAddress();
			System.out.println("Street===>" + ad.getStreet());
			System.out.println("City===>" + ad.getCity());
			System.out.println("state===>" + ad.getState());
			MobileNumber mb = x.getMobilenumber();
			System.out.println("local==>" + mb.getLocal());
			System.out.println("international===>" + mb.getInternational());
			System.out.println("============================");
		}
	}
}