package ProiectFinal;

/**
 * decorator concret; extinde functionalitatea decoratorului de baza
 * @author alexx
 */
public class Onion extends PizzaDecorator{

	/**
	 * Constructor Olive
	 * @param pi
	 */
	public Onion(Pizza pi){
		//this.decoratedPizza = pi;
		super(pi);
	}
	
	@Override
	/**
	 * Functie care mareste costul unei Pizza
	 */
	public double getCost(){    
		super.getCost();
		
		return decoratedPizza.getCost()+0.5;
	}
	
	 @Override
	 /** 
	  * Functie care adauga ingredient la obiectul Pizza
	  */
	  public String getIngredients() {
	      return decoratedPizza.getIngredients()+", cu Ceapa ";
	  }
}
