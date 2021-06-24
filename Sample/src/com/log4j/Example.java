package com.log4j;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example {
	private int rollNumber;
	private String name;
	private static Logger log = Logger.getLogger(Example.class);

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) throws IOException {
		/*
		 * Layout lay=new PatternLayout("%d{dd//mm//yyyy HH//MM//SS},%m,%c,%n,%l");
		 * Appender app=new FileAppender(lay,"E:/Java/log4j/logs/logg.log");
		 * log.addAppender(app); log.debug("debug message"); log.error("error message");
		 */
		// log.debug("Debug message");
		// log.error("Error");
		//PropertyConfigurator.configure("log4j.properties");
		log.debug(" debug message");
		log.info("info msg");
		log.warn("warning msg");
		log.error("Error msg");
		log.fatal(" fatal msg");
	}

}
