package com.comlog;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class AutoComLog {
	
	public Log log = LogFactory.getLog(this.getClass());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoComLog autoComLog = new AutoComLog();
		DataInputStream dis = null;
		try {
			boolean s = true;
			System.out.println("t电动");
			while(s){
				autoComLog.log.trace("trace测试");
				autoComLog.log.debug("Debug测试");
				autoComLog.log.info("info测试");
				autoComLog.log.warn("warn测试");
				autoComLog.log.error("error测试");
				autoComLog.log.fatal("fatal测试");
				dis = new DataInputStream(System.in);
				String t = dis.readLine();
				if(t.equals("e")){
					s = false;
				}else if(t.equals("warn")){
					((Logger) autoComLog.log.getClass().getDeclaredMethod("getLogger").invoke(autoComLog.log)).setLevel(Level.WARN);
//					LogManager.getLogger(autoComLog.log);
				}else if(t.equals("reflesh")){
					PropertyConfigurator.configure(Thread.currentThread().getContextClassLoader().getResource("log4j.properties"));
				}else if(t.equals(".")){
					System.out.println(autoComLog.getClass().getResource(t));
				}else if(t.equals("..")){
					System.out.println(autoComLog.getClass().getResource(t));
				}else if(t.equals("/")){
					System.out.println(autoComLog.getClass().getResource(t));
				}else if(t.equals("null")){
					System.out.println(autoComLog.getClass().getResource(""));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
