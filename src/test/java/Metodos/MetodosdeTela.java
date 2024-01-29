package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosdeTela {
	
	WebDriver driver;
	
	public void abrirNavegador(String url) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
		
	}

	public void clicar (By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void pausar (int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	
	public void preencher (By elemnto, String texto) {
	driver.findElement(elemnto).sendKeys(texto);
}
	
	public void fecharNavegador() {
		driver.quit();
	}

	}
