package com.techlabs.factory.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factory.IAuto;
import com.techlabs.factory.IAutoFactory;

public class Test2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		IAutoFactory factory = injectDependency();
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
	}

	private static IAutoFactory injectDependency() throws IOException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalAccessException, InvocationTargetException {
		Properties prop = readPropertiesFile("src\\dependancy\\factory.properties");
		Class classname = Class.forName(prop.getProperty("factory"));
		Method method = classname.getDeclaredMethod("getInstance", null);
		return (IAutoFactory) method.invoke(null, null);
	}

	public static Properties readPropertiesFile(String fileName) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			fis.close();
		}
		return prop;
	}

}
