package Listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListen.class)
public class TestNGDemo {

	
	@Test
	public void test1() {

		System.out.println("Test 1");
	}

	@Test
	public void test2() {


		System.out.println("Test 2");
	}

	@Test
	public void test3() {


		System.out.println("Test 3");
	}


}
