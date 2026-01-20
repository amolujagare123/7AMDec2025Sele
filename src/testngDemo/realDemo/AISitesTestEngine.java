
package testngDemo.realDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISitesTestEngine extends  Base{



    @Test
    public void chatgpt() {
        driver.get("https://chat.openai.com");
    }

    @Test
    public void gemini() {
        driver.get("https://gemini.google.com");
    }

    @Test
    public void claude() {
        driver.get("https://claude.ai");
    }

    @Test
    public void perplexity() {
        driver.get("https://www.perplexity.ai");
    }
}
