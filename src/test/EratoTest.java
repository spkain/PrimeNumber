package test;

import java.util.List;

import main.Erato;
import junit.framework.TestCase;

public class EratoTest extends TestCase {

	public void testStep1() {
		int max = 20;
		for (int i = 2; i <=max; i++) {
			assertEquals(i, (int)Erato._step1(max).get(i-2));
		}
	}
	
	public void testStep1_1() {
		int max = 50;
		for (int i = 2; i <= max; i++) {
			assertEquals(i, (int)Erato._step1(max).get(i-2));
		}
	}
	
	public void testStep2() {
		Erato._step1(20);
		List<Integer> actual = Erato._step2();
		assertEquals(1, actual.size());
		assertEquals(2, (int)actual.get(0));
		
	}
	
	public void testStep3() {
		Erato._step1(20);
		Erato._step2();
		List<Integer> actual = Erato._step3();
		assertEquals(9, actual.size());
		assertEquals(3, (int)actual.get(0));
		assertEquals(5, (int)actual.get(1));
		assertEquals(7, (int)actual.get(2));
		assertEquals(9, (int)actual.get(3));
		assertEquals(11, (int)actual.get(4));
		assertEquals(13, (int)actual.get(5));
		assertEquals(15, (int)actual.get(6));
		assertEquals(17, (int)actual.get(7));
		assertEquals(19, (int)actual.get(8));
	}
	
	public void testStep4() {
		List<Integer> actual = Erato.getPrimeList(5);
		assertEquals(3, actual.size());
		assertEquals(2, (int)actual.get(0));
		assertEquals(3, (int)actual.get(1));
		assertEquals(5, (int)actual.get(2));
	}
	
	public void test2357() {
		List<Integer> actual = Erato.getPrimeList(7);
		assertEquals(4, actual.size());
		assertEquals(2, (int)actual.get(0));
		assertEquals(3, (int)actual.get(1));
		assertEquals(5, (int)actual.get(2));
		assertEquals(7, (int)actual.get(3));
		
	}
	
	public void testPrimeListMax() {
		List<Integer> actual = Erato.getPrimeList(100);
		assertEquals(97, (int)actual.get(actual.size()-1));
	}
	
	public void testPrimeListMax100000() {
		List<Integer> actual = Erato.getPrimeList(100000);
		assertEquals(9592, actual.size());
		assertEquals(99991, (int)actual.get(actual.size()-1));
	}

	public void testPrimeListMax100000_1() {
		List<Integer> actual = Erato.getPrimeList(100000);
		assertEquals(9592, actual.size());
		assertEquals(99991, (int)actual.get(actual.size()-1));
	}

	public void testPrimeListMax100Retry() {
		List<Integer> actual = Erato.getPrimeList(100);
		assertEquals(97, (int)actual.get(actual.size()-1));
	}

	public void testPrimeListSeach3() {
		boolean actual = Erato.hasPrime(100, 3);
		assertTrue(actual);
	}
}
