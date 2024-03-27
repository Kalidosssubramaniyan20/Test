package DominosPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DominosPOM {

	

 WebDriver Driver;

	public DominosPOM(WebDriver driver1) {
		this.Driver=driver1;
		PageFactory.initElements(driver1,this);
		
		
	}
	
	public WebElement getAllowbtn() {
		return allowbtn;
	}

	public void setAllowbtn(WebElement allowbtn) {
		this.allowbtn = allowbtn;
	}
	
	
	
	

 

	@FindBy(xpath="//div[@data-label='Veg Pizza']//span[.='VEG PIZZA']")
	private WebElement Vegbutton;
	

	public WebElement getVegbutton() {
		return Vegbutton;
	}

	public void setVegbutton(WebElement vegbutton) {
		Vegbutton = vegbutton;
	}

	public WebElement getMargheritapizza() {
		return margheritapizza;
	}

	public void setMargheritapizza(WebElement margheritapizza) {
		this.margheritapizza = margheritapizza;
	}

	public WebElement getPeppypaneerpizza() {
		return peppypaneerpizza;
	}

	public void setPeppypaneerpizza(WebElement peppypaneerpizza) {
		this.peppypaneerpizza = peppypaneerpizza;
	}

	public WebElement getBeveragesbutton() {
		return beveragesbutton;
	}

	public void setBeveragesbutton(WebElement beveragesbutton) {
		this.beveragesbutton = beveragesbutton;
	}

	public WebElement getPepsiAdd() {
		return PepsiAdd;
	}

	public void setPepsiAdd(WebElement pepsiAdd) {
		PepsiAdd = pepsiAdd;
	}

	public WebElement getPepsiquantityincresed() {
		return pepsiquantityincresed;
	}

	public void setPepsiquantityincresed(WebElement pepsiquantityincresed) {
		this.pepsiquantityincresed = pepsiquantityincresed;
	}

	public WebElement getPepsiquantitydecrease() {
		return pepsiquantitydecrease;
	}

	public void setPepsiquantitydecrease(WebElement pepsiquantitydecrease) {
		this.pepsiquantitydecrease = pepsiquantitydecrease;
	}

	public WebElement getMargheritapizzaincrese() {
		return Margheritapizzaincrese;
	}

	public void setMargheritapizzaincrese(WebElement margheritapizzaincrese) {
		Margheritapizzaincrese = margheritapizzaincrese;
	}

	public WebElement getMargheritapizzadecrease() {
		return Margheritapizzadecrease;
	}

	public void setMargheritapizzadecrease(WebElement margheritapizzadecrease) {
		Margheritapizzadecrease = margheritapizzadecrease;
	}

	public WebElement getPaneerpizzaincrese() {
		return paneerpizzaincrese;
	}

	public void setPaneerpizzaincrese(WebElement paneerpizzaincrese) {
		this.paneerpizzaincrese = paneerpizzaincrese;
	}

	public WebElement getPaneerdecrese() {
		return paneerdecrese;
	}

	public void setPaneerdecrese(WebElement paneerdecrese) {
		this.paneerdecrese = paneerdecrese;
	}

	public WebElement getAddbtnpaneer() {
		return addbtnpaneerpizza;
	}

	public void setAddbtnpaneer(WebElement addbtnpaneer) {
		this.addbtnpaneerpizza = addbtnpaneer;
	}

	public WebElement getAddmargheritapizza() {
		return addmargheritapizza;
	}

	public void setAddmargheritapizza(WebElement addmargheritapizza) {
		this.addmargheritapizza = addmargheritapizza;
	}

	public WebElement getCheckoutbtn() {
		return checkoutbtn;
	}

	public void setCheckoutbtn(WebElement checkoutbtn) {
		this.checkoutbtn = checkoutbtn;
	}

	public WebElement getPlacetheorder() {
		return placetheorder;
	}

	public void setPlacetheorder(WebElement placetheorder) {
		this.placetheorder = placetheorder;
	}

	public WebElement getExploremenu() {
		return Exploremenu;
	}

	public void setExploremenu(WebElement exploremenu) {
		Exploremenu = exploremenu;
	}







	@FindBy(xpath="//*[@id=\"optInText\"]")
	private WebElement allowbtn;
	
	@FindBy(xpath="(//div[@data-label='Margherita'])[2]//span[.='ADD TO CART']")
	private WebElement margheritapizza;
	
	@FindBy(xpath="(//div[@data-label='Peppy Paneer'])[2]//span[.='ADD TO CART']")
	private WebElement peppypaneerpizza;
	
	@FindBy(xpath="(//div[@data-label='Beverages'])[1]//span[.='BEVERAGES']")
	private WebElement beveragesbutton;
	
	
	@FindBy(xpath="//div[@data-label='Pepsi 295 ml']//button[@data-label='addTocart']//span[.='ADD TO CART']")
	private WebElement PepsiAdd;
	
	@FindBy(xpath="(//div[@data-label='quantity']//div[@data-label='increase'])[2]")
	private WebElement pepsiquantityincresed;
	
	@FindBy(xpath="(//div[@data-label='quantity']//div[@data-label='decrease'])[2]")
	private WebElement pepsiquantitydecrease;
	
	@FindBy(xpath="(//div[@data-label='quantity']//div[@data-label='increase'])[4]")
	private WebElement Margheritapizzaincrese;
	
	@FindBy(xpath="(//div[@data-label='quantity']//div[@data-label='decrease'])[4]")
	private WebElement Margheritapizzadecrease;
	
	@FindBy(xpath="//div[@class='crt-itms']//div[@data-label='increase']")
	private WebElement paneerpizzaincrese;
	
	@FindBy(xpath ="//div[@data-label='cart-item-entry']//div[@data-label='decrease']")
	private WebElement paneerdecrese;
	
	
	@FindBy(xpath="//div[@class='injectStyles-sc-1jy9bcf-0 jvymXv']//button[@data-label='No thanks button']//span[.='ADD']")
	private WebElement addbtnpaneerpizza;
	
	@FindBy(xpath="//span[.='ADD']")
	private WebElement addmargheritapizza;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/button")
	private WebElement checkoutbtn;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[2]/div/div[6]/div/div/div[7]/button/span")
	private WebElement placetheorder;
	
	@FindBy(xpath="//div[@class='injectStyles-sc-1jy9bcf-0 jZjFZo']//button[@datalabel='Explore Menu']//span[.='Explore Menu']")
	private WebElement Exploremenu;
	
	@FindBy(xpath="(//div[@data-label='Margherita'])[2]//span[.='ADD TO CART']")
	private WebElement marghrita;

	public WebDriver getDriver() {
		return Driver;
	}

	public WebElement getAddbtnpaneerpizza() {
		return addbtnpaneerpizza;
	}

	public WebElement getMarghrita() {
		return marghrita;
	}
	
	@FindBy(xpath="(//div[@data-label='cart-item-entry'])[1]//div[@data-label='increase']")
	private WebElement marghritacheckoutincrease;

	public WebElement getMarghritacheckoutincrease() {
		return marghritacheckoutincrease;
	}

	public void setMarghritacheckoutincrease(WebElement marghritacheckoutincrease) {
		this.marghritacheckoutincrease = marghritacheckoutincrease;
	}
	
	@FindBy(xpath="//button[.='Allow']")
	private WebElement allow;

	public WebElement getAllow() {
		return allow;
	}

	public void setAllow(WebElement allow) {
		this.allow = allow;
	}
	
	@FindBy(xpath="//div[@data-label='Pepsi 295 ml']//div[@data-label='increase']")
	private WebElement pepsixtraadd;

	public WebElement getPepsixtraadd() {
		return pepsixtraadd;
	}

	public void setPepsixtraadd(WebElement pepsixtraadd) {
		this.pepsixtraadd = pepsixtraadd;
	}
	
	@FindBy(xpath="(//div[@data-label='cart-item-entry'])[3]//div[@data-label='decrease']")
	private WebElement pepsiminus;

	public WebElement getPepsiminus() {
		return pepsiminus;
	}

	public void setPepsiminus(WebElement pepsiminus) {
		this.pepsiminus = pepsiminus;
	}
	
	@FindBy(xpath="//span[@data-label='Sub Total']")
	private WebElement subtotal;
	
	@FindBy(xpath="//span[@data-label='Discount']")
	private WebElement Discount;
	
	@FindBy(xpath="//span[@data-label='Taxes and Charges']")
	private WebElement taxes;
	
	@FindBy(xpath="//span[@data-label='Grand Total']")
	private WebElement grandtotal;

	public WebElement getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(WebElement subtotal) {
		this.subtotal = subtotal;
	}

	public WebElement getDiscount() {
		return Discount;
	}

	public void setDiscount(WebElement discount) {
		Discount = discount;
	}

	public WebElement getTaxes() {
		return taxes;
	}

	public void setTaxes(WebElement taxes) {
		this.taxes = taxes;
	}

	public WebElement getGrandtotal() {
		return grandtotal;
	}

	public void setGrandtotal(WebElement grandtotal) {
		this.grandtotal = grandtotal;
	}

	public void setAddbtnpaneerpizza(WebElement addbtnpaneerpizza) {
		this.addbtnpaneerpizza = addbtnpaneerpizza;
	}

	public void setMarghrita(WebElement marghrita) {
		this.marghrita = marghrita;
	}
	

}
