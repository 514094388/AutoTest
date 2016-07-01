package com.baidu;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 测试百度
 */
public class AutoBaidu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver webdriver = null;
		try {
//		System.out.println("开始ʼ");
//		 System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\IEDriverServer。64.exe");
//		DesiredCapabilities capability=DesiredCapabilities.internetExplorer(); 
//		 capability.setCapability( InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS , true); 
//		 WebDriver webdriver = new InternetExplorerDriver(capability);
//		 webdriver.get("http://www.百度.com/");
//		 System.out.println(webdriver.getTitle());
//		 System.out.println(webdriver.getPageSource());
//		 webdriver.findElement(By.className("h")).click();
			/*
			 * 测试淘宝
			 */
			System.out.println("开始ʼ");
//		 System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\IEDriverServer.64.exe");
			System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.bin", "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
			System.setProperty("webdriver.ie.logfile", "E:\\IEDriverServer.log");
			DesiredCapabilities capability=DesiredCapabilities.internetExplorer(); 
			 capability.setCapability( InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS , true); 
			 capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			 capability.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "https://www.taobao.com/");
			 webdriver = new InternetExplorerDriver(capability);
			 System.out.println("创建webdriver");
//			 webdriver.get("https://www.taobao.com/");
			 System.out.println("打开淘宝网站");
			 System.out.println(webdriver.getWindowHandle());
			 webdriver.switchTo().defaultContent();
			 webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 System.out.println(webdriver.getTitle());
			 System.out.println("获取标题");
			 System.out.println(webdriver.getPageSource());
			 System.out.println("获取源码");
			 webdriver.findElement(By.className("h")).click();
			 System.out.println("进入登录页面");
			 webdriver.findElement(By.id("J_Quick2Static")).click();
			 System.out.println("使用账号密码登录");
			 webdriver.findElement(By.id("TPL_username_1")).sendKeys("linminzhong11");
			 webdriver.findElement(By.id("TPL_password_1")).sendKeys("minzhong8127285");
			 webdriver.findElement(By.id("J_SubmitStatic")).click();
			 System.out.println("登录账号");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 webdriver.close();
		}finally{
			 webdriver.quit();
		}
	}
}
