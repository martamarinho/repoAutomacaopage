package Elementos;

import org.openqa.selenium.By;

public class ElementosdeTela {
	
	private By btnLogar = By.id ("menuUser");
    private By cmpUserName = By.name("username");
    private By cmpUserSenha = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input");
    private By btnLogin = By.id("sign_in_btn");
	
    
    public By getBtnLogar() {
		return btnLogar;
	}
	public By getCmpUserName() {
		return cmpUserName;
	}
	public By getCmpUserSenha() {
		return cmpUserSenha;
	}
	public By getBtnLogin() {
		return btnLogin;
	}
	
    
    
    
    
    
   
    
    
}
