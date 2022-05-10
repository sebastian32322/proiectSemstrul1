package ProiectFinal;

/**
 * Cel mai simplu obiect ce poate fi creat
 * @author alexx
 *
 */
public class SimplePizza implements Pizza {
	 @Override
	 /**
	  *  Cost Pizza default (without ingredients)
	  */
	 public double getCost() {
	     return 15; 
	 }

	@Override
	/**
	 * cele mai simple atribute pe care le poate avea o Pizza
	 */
	public String getIngredients() {
		// TODO Auto-generated method stub
		return "Pizza simpla";
	}
	
	
	
}
