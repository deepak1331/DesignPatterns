package com.learn.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnectionDeepCopy implements Cloneable {

	private String ipAddress;
	private String complexData;
	private List<String> domains = new ArrayList<>();;

	public void assignData(String ip) throws InterruptedException {
		Thread.sleep(1000);
		ipAddress = ip;
		this.complexData = "Complex data processed & assigned";
		domains.add("www.facebook.com");
		domains.add("www.google.com");
		domains.add("www.yahoo.com");
	}

	public void removeDomain(String domainName) {
		domains.remove(domainName);
	}

	@Override
	public String toString() {
		return "Data: [ipAddress=" + ipAddress + ", complexData=" + complexData + ", domains=" + domains + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		NetworkConnectionDeepCopy myClone = new NetworkConnectionDeepCopy();
		myClone.setIpAddress(this.getIpAddress());
		myClone.setComplexData(this.getComplexData());
		for (String d : this.getDomains())
			myClone.getDomains().add(d);

		return myClone;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getComplexData() {
		return complexData;
	}

	public void setComplexData(String complexData) {
		this.complexData = complexData;
	}

	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

}
