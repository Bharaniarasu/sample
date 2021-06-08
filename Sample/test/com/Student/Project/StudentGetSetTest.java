package com.Student.Project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentGetSetTest {

	@Test
	void testGetRollNumber() {
		StudentGetSet sgs=new StudentGetSet();
		sgs.setRollNumber(1101);
		int expected=1101;
		int actual=sgs.getRollNumber();
		assertEquals(expected,actual);
	}

	@Test
	void testSetRollNumber() {
			}

	@Test
	void testGetName() {
		StudentGetSet sgs=new StudentGetSet();
		sgs.setName("string Name");
		String expected="string Name";
		String actual=sgs.getName();
		assertEquals(expected,actual);
	}

	@Test
	void testSetName() {
		
	}

	@Test
	void testGetPlace() {
		StudentGetSet sgs=new StudentGetSet();
		sgs.setName("salem");
		String expected="salem";
		String actual=sgs.getName();
		assertEquals(expected,actual);
	}

	@Test
	void testSetPlace() {
	
	}

	@Test
	void testGetAge() {
		StudentGetSet sgs=new StudentGetSet();
		sgs.setName("23");
		String expected="23";
		String actual=sgs.getName();
		assertEquals(expected,actual);
	}

	@Test
	void testSetAge() {
		
	}

	@Test
	void testGetSex() {
		StudentGetSet sgs=new StudentGetSet();
		sgs.setName("male");
		String expected="male";
		String actual=sgs.getName();
		assertEquals(expected,actual);
	}

	@Test
	void testSetSex() {
		
	}

	@Test
	void testGetMoblileNUmber() {
		StudentGetSet sgs=new StudentGetSet();
		sgs.setName("0987654321");
		String expected="0987654321";
		String actual=sgs.getName();
		assertEquals(expected,actual);
	}

	@Test
	void testSetMobileNumber() {
	}

	@Test
	void testToString() {
		StudentGetSet sgs=new StudentGetSet();
		sgs.setRollNumber(1101);
		int expected=1101;
		int actual=sgs.getRollNumber();
		assertEquals(expected,actual);
	}

}
