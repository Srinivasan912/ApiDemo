package org.demo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmpDetails {
	private List<Employeess> employeess;

	public List<Employeess> getEmployeess() {
		return employeess;
	}

	public void setEmployeess(List<Employeess> employeess) {
		this.employeess = employeess;
	}

}
