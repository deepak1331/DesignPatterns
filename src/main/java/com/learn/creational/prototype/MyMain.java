package com.learn.creational.prototype;

public class MyMain {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

		System.out.println("Creating Connection Objects : ");
		NetworkConnectionShallowCopy conn1 = new NetworkConnectionShallowCopy();
		conn1.assignData("192.168.13.13");

		NetworkConnectionShallowCopy conn2 = (NetworkConnectionShallowCopy) conn1.clone();
		
		System.out.println(conn1);
		System.out.println(conn2);
		System.out.println("\nRemoving Yahoo from the domain list in conn1 object...\n");
		conn1.removeDomain("www.yahoo.com");
		System.out.println(conn1);
		System.out.println(conn2);
		
		
		System.out.println("Creating Connection Objects(Deep Copy Demo) : ");
		NetworkConnectionDeepCopy conn3 = new NetworkConnectionDeepCopy();
		conn3.assignData("192.168.13.13");

		NetworkConnectionDeepCopy conn4 = (NetworkConnectionDeepCopy) conn3.clone();
		
		System.out.println(conn3);
		System.out.println(conn4);
		System.out.println("\nRemoving Yahoo from the domain list in conn3 Deep Copy object\n here conn4 object won't be effected due to this...\n");
		conn3.removeDomain("www.yahoo.com");
		System.out.println(conn3);
		System.out.println(conn4);

	}

}
