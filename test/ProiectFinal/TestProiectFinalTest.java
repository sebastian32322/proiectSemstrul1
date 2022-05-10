package ProiectFinal;

import static org.junit.Assert.*;

import javax.swing.JToggleButton;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestProiectFinalTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("setting up...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("dupa testare");
	}

	@Test
	public void testFinalizare() {
		TestProiectFinal p = new TestProiectFinal();
		
		JToggleButton TogglePizzaSimpla = new JToggleButton("Pizza Simpla");
		
		assertTrue(TogglePizzaSimpla.isSelected() == false );
	}


}
