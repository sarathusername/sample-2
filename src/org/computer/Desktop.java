package org.computer;

public class Desktop implements Hardware,Software {
	@Override
	public void hardwareResource() {
		System.out.println("monitor");
	}
	@Override
	public void softwareResources() {
		System.out.println("Eclipse");
	}
	public static void main(String[] args) {
		Desktop det= new Desktop();
		det.hardwareResource();
		det.softwareResources();
		}
}
