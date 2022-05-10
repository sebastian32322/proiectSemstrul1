package ProiectFinal;

/**
 * decorator concret; extinde functionalitatea decoratorului de baza
 * @author alexx
 */
public class Pepper extends PizzaDecorator{

	/**
	 * Constructor Pepper
	 * @param pi
	 */
	public Pepper(Pizza pi){
		//this.decoratedPizza = pi;
		super(pi);
	}
	
	@Override
	/**
	 * Functie care mareste costul unei Pizza
	 */
	public double getCost(){    
		super.getCost();
		
		return decoratedPizza.getCost()+1;
	}
	
	 @Override
	 /** 
	  * Functie care adauga ingredient la obiectul Pizza
	  */
	  public String getIngredients() {
	      return decoratedPizza.getIngredients()+", cu Ardei ";
	  }
}
