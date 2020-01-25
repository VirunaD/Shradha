package com.csi.thread;

public class GetNameSetNameConcept extends Thread {
	public void run() {
		System.out.println("Running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetNameSetNameConcept gs = new GetNameSetNameConcept();
		GetNameSetNameConcept gs1 = new GetNameSetNameConcept();
		System.out.println("Name of gs: " + gs.getName());
		System.out.println("Name of gs1: " + gs1.getName());
		System.out.println("Id of gs:" + gs.getId());
		gs.setName("Aruna");
		gs.start();

		System.out.println("After changing name of gs: " + gs.getName());
		gs1.start();
	}

}
