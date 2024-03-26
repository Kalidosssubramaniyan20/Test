package DominosStep;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Dominos.Dominos.DominosBaseclass;
import DominosPOM.DominosPOM;
import DominosRunner.DominosRunner;
import io.cucumber.java.en.*;
import io.cucumber.messages.IdGenerator.Incrementing;

public class DominosStepdef extends DominosBaseclass{
	


	public static WebDriver Driver =DominosRunner.driver1;
	
	DominosPOM ob5 = new DominosPOM(Driver);
	
	
	
	@Given("to add the pizza for Peppy Paneer")
	public void to_add_the_pizza_for_peppy_paneer() throws InterruptedException {
		maxi(Driver);
		Driver.get("https://pizzaonline.dominos.co.in/menu");
		Thread.sleep(3000);
		click(ob5.getVegbutton());
		//click(ob5.getAddbtnpaneer());
		click(ob5.getPeppypaneerpizza());
		Thread.sleep(4000);
		click(ob5.getAddbtnpaneer());
		click(ob5.getPaneerpizzaincrese());
		click(ob5.getCheckoutbtn());
		Thread.sleep(2000);
		click(ob5.getPaneerdecrese());
		Thread.sleep(3000);
		
		
		
	}


	@When("to add the Margherita pizza")
	public void to_add_the_margherita_pizza() throws InterruptedException {
		click(ob5.getExploremenu());
		click(ob5.getVegbutton());
		Thread.sleep(2000);
		click(ob5.getMarghrita());
		click(ob5.getAddmargheritapizza());
		click(ob5.getMargheritapizzaincrese());
		click(ob5.getCheckoutbtn());
		Thread.sleep(2000);;
		click(ob5.getMarghritacheckoutincrease());
		
	}

	@When("add to cart to add the BEVERAGES in pepsi")
	public void add_to_cart_to_add_the_beverages_in_pepsi() throws InterruptedException {
		click(ob5.getExploremenu());
		Thread.sleep(3000);
		click(ob5.getAllow());
		click(ob5.getBeveragesbutton());
		click(ob5.getPepsiAdd());
		Thread.sleep(2000);
		for(int i=1;i<12;i++) {
			click(ob5.getPepsixtraadd());	
		}
		
//		click(ob5.getQtyincresed());
//		click(ob5.getQtyincresed());
//		click(ob5.getQtyincresed());
//		click(ob5.getQtyincresed());
//		click(ob5.getQtyincresed());
//		click(ob5.getQtyincresed());
//		click(ob5.getQtyincresed());
//		click(ob5.getQtyincresed());
//		click(ob5.getQtyincresed());
//		click(ob5.getQtyincresed());
//		click(ob5.getQtyincresed());
//		click(ob5.getQtyincresed());
//		click(ob5.getCheckoutbtn());
	//	click(ob5.getQytdecrease());
		//click(ob5.getQytdecrease());
		//click(ob5.getQytdecrease());
		//click(ob5.getQytdecrease());
		//click(ob5.getQytdecrease());
		//click(ob5.getQytdecrease());
		
		
		
	   
	}

	@When("finally checkout the products less then and see the value")
	public void finally_checkout_the_products_less_then_and_see_the_value() throws InterruptedException {
		
		Thread.sleep(4000);
		click(ob5.getCheckoutbtn());
		Thread.sleep(2000);
		for(int i=0;i<6;i++) {
			Thread.sleep(2000);
			click(ob5.getPepsiminus());
		}
	    
	}


}
