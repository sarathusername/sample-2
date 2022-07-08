package org.univ;

public class College extends University {
	@Override
	public void ug() {
	System.out.println("BE");
		}
	@Override
	public void pg() {
		System.out.println("MBA");	
	}
	public static void main(String[] args) {
		College det=new College();
		det.ug();
		det.pg();
	}

}
