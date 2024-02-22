package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnectionShallowCopy implements Cloneable {

	private String ipAddress;
	private String complexData;
	private List<String> domains = new ArrayList<>();

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
		return super.clone();
	}

}
