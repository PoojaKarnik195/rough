
package com.cg.dependent;

import java.awt.List;
import java.time.LocalDate;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Organization {

	private String name;
	private Address address;
	private double marketValue;
	private LocalDate established;
	private int EmployeeCount;
	private Set<> globalPresence = new Set<>();
	private List<> boardMember = new List<>();
	private Map<String, String> projectManager = new Map<>();
	private Properties proxyServerList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}
	public LocalDate getEstablished() {
		return established;
	}
	public void setEstablished(LocalDate established) {
		this.established = established;
	}
	public int getEmployeeCount() {
		return EmployeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		EmployeeCount = employeeCount;
	}
	public Set<> getGlobalPresence() {
		return globalPresence;
	}
	public void setGlobalPresence(Set<> globalPresence) {
		this.globalPresence = globalPresence;
	}
	public List<> getBoardMember() {
		return boardMember;
	}
	public void setBoardMember(List<> boardMember) {
		this.boardMember = boardMember;
	}
	public Map<String, String> getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(Map<String, String> projectManager) {
		this.projectManager = projectManager;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + EmployeeCount;
		result = prime * result + ((established == null) ? 0 : established.hashCode());
		long temp;
		temp = Double.doubleToLongBits(marketValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((projectManager == null) ? 0 : projectManager.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organization other = (Organization) obj;
		if (EmployeeCount != other.EmployeeCount)
			return false;
		if (established == null) {
			if (other.established != null)
				return false;
		} else if (!established.equals(other.established))
			return false;
		if (Double.doubleToLongBits(marketValue) != Double.doubleToLongBits(other.marketValue))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (projectManager == null) {
			if (other.projectManager != null)
				return false;
		} else if (!projectManager.equals(other.projectManager))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Organization [name=" + name + ", marketValue=" + marketValue + ", established=" + established
				+ ", EmployeeCount=" + EmployeeCount + ", projectManager=" + projectManager + "]";
	}
	
}
