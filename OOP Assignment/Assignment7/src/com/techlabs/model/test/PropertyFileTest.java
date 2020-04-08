package com.techlabs.model.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import java.util.Iterator;

public class PropertyFileTest {

	public static void main(String[] args) throws Exception {

		Properties props = new Properties();

		InputStream is = new FileInputStream("dataConfig.properties");
		props.load(is);
		Set<String> keys = props.stringPropertyNames();
		usingForEach(keys, props);
		usingIterator(props);
	}

	public static void usingIterator(Properties props) {
		Iterator keyIterator = props.keySet().iterator();
		while (keyIterator.hasNext()) {
			String key = (String) keyIterator.next();
			String value = props.getProperty(key);
			System.out.println(key + " = " + value);
		}
	}

	public static void usingForEach(Set<String> keys, Properties props) {
		for (String key : keys) {
			System.out.println(key + " : " + props.getProperty(key));
		}
	}
}
