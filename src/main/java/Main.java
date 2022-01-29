import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println(System.getenv("PATH"));
    System.out.println(System.getenv("HOME"));
  //  System.out.println(System.getenv(""));

    System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
   // File pathBinary = new File("src/main/resources/firefox");
  //  FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
   // DesiredCapabilities desired = new DesiredCapabilities();
    FirefoxOptions options = new FirefoxOptions();
   // desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
    WebDriver driver = new FirefoxDriver(options);

    //Todos los champios
    driver.get("https://www.leagueoflegends.com/es-es/champions/");

    List<Champion> champions = new ArrayList<>();
    WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));

    driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("osano-cm-accept-all")));
    driver.findElement(new By.ByClassName("osano-cm-accept-all")).click();

    driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("_2ltyqjDgmhFM6ahoMU0obg")));
    driver.findElement(new By.ByClassName("_2ltyqjDgmhFM6ahoMU0obg")).click();

    List<WebElement> link = driver.findElements(new By.ByClassName("style__Wrapper-n3ovyt-0"));
    List<String> li = new ArrayList<>();

    for (WebElement c: link) {
      li.add(c.getAttribute("href"));
    }
    List<WebElement> nombreList = new ArrayList<>();
    WebElement rol;
    WebElement historia;
    String nom,rols,historias;
    JAXB jaxb;
    CSV csv;
    int cont = 0;
    for (String c: li) {
      if (cont <5){
        driver.get(c);
        driverWait.until(ExpectedConditions.elementToBeClickable(new By.ByClassName("style__OptionIconBorder-sc-1ac4kmt-7")));
        nombreList = driver.findElements(new By.ByClassName("style__RevealWrapper-sc-14kr0ky-0"));
        nom = nombreList.get(1).getText();
        rol = driver.findElement(new By.ByClassName("style__SpecsItemValue-sc-8gkpub-15"));
        rols = rol.getText();
        historia = driver.findElement(new By.ByClassName("style__Desc-sc-8gkpub-9"));
        historias = historia.getText();
        champions.add(new Champion(nom,rols,historias));
        csv = new CSV(nom,rols,historias);
        cont++;
      }else{
        break;
      }
    }
    jaxb = new JAXB(champions);
  }
}
