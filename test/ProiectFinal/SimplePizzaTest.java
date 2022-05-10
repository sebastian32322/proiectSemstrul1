package ProiectFinal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimplePizzaTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("inainte de testare");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("dupa testare");
	}

	
	@Test
	public void testGetCost() {
		//fail("Not yet implemented");
		SimplePizza p = new SimplePizza();
		assertEquals(p.getCost(), 15);
		
	}

	@Test
	public void testGetIngredients() {
		SimplePizza p = new SimplePizza();
		assertEquals(p.getIngredients(), "Pizza simpla");
	}

}
