package com.hyperion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AutoHyperion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("开始ʼ");
		 System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\IEDriverServer.64.exe");
		DesiredCapabilities capability=DesiredCapabilities.internetExplorer(); 
		 capability.setCapability( InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS , true); 
		 WebDriver webdriver = new InternetExplorerDriver(capability);
		 webdriver.get("http://172.20.4.49:19000/workspace/index.jsp");
		 System.out.println(webdriver.getTitle());
		 System.out.println(webdriver.getPageSource());
		 webdriver.switchTo().frame(0);
		 System.out.println("frame0:" + webdriver.getPageSource());
//		 webdriver.switchTo().frame(1);
//		 System.out.println("frame1:" + webdriver.getPageSource());
		 webdriver.findElement(By.id("bpm.Logon.1.txtUser"));
		System.out.println("读取用户名：" + webdriver.findElement(By.id("bpm.Logon.1.txtUser")).getText());
	}

}
