package ProiectFinal;

/**
 * Decorator
 * @author alexx
 *
 */
public abstract class PizzaDecorator implements Pizza {
	/**
	 * Variabila la care se adauga ingrediente si trebuie sa fie vizibila claselor ce o extind
	 */
	  protected Pizza decoratedPizza;  

	  /**
	   * Constructor clasa abstracta
	   * @param pi
	   */
	  public PizzaDecorator(Pizza pi) {
	      this.decoratedPizza = pi;
	  }

	  @Override
	/**
	 *  Implementing methods of the interface
	 */
	  public double getCost() {  
	      return decoratedPizza.getCost();
	  }

	  @Override
	  /**
	   * Implementing methods of the interface
	   */
	  public String getIngredients() {
	      return decoratedPizza.getIngredients();
	  }
	  
	  
}