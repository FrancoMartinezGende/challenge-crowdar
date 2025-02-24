package com.crowdar;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;

    @Rule
    public TestRule watcher = new TestWatcher() {
        @Override
        protected void failed(Throwable throwable, Description description) {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File("error_" + description.getMethodName() + ".png"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/fmartinez/Documentos/challenge/challenge-crowdar/chromedriver");
        // System.setProperty("webdriver.gecko.driver", "/home/fmartinez/Documentos/challenge/challenge-crowdar/geckodriver");
        // System.setProperty("browser", "firefox");
        String browser = System.getProperty("browser", "chrome");
        if ("firefox".equalsIgnoreCase(browser)) {
            System.setProperty("webdriver.gecko.driver", "/home/fmartinez/Documentos/challenge/challenge-crowdar/geckodriver");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "/home/fmartinez/Documentos/challenge/challenge-crowdar/chromedriver");
            driver = new ChromeDriver();
        }
        loginPage = new LoginPage(driver);
        loginPage.openURL("https://www.saucedemo.com/");
        loginPage.loginAs("standard_user", "secret_sauce");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
