package p1A;

import static org.junit.Assert.*;

import org.junit.Test;


public class classificationTest {
	
	
	@Test
	public void testKMaior() {
		classification c = new classification();
		int v[] = new int[10];
		v[0] = 1;
		v[1] = 2;
		v[2] = 3;
		v[3] = 4;
		v[4] = 5;
		v[5] = 6;
		v[6] = 7;
		v[7] = 8;
		v[8] = 9;
		v[9] = 10;
		
		c.finals(10,10,v);
		
	}
	
	@Test
	public void testIguais() {
		classification c = new classification();
		int v[] = new int[5];
		v[0] = 500;
		v[1] = 500;
		v[2] = 500;
		v[3] = 500;
		v[4] = 500;
		
		c.finals(5,2,v);
	}
	
	@Test
	public void testkZero() {
		classification c = new classification();
		int v[] = new int[5];
		v[0] = 500;
		v[1] = 250;
		v[2] = 700;
		v[3] = 110;
		v[4] = 335;
		
		c.finals(5,2,v);
	}
}
