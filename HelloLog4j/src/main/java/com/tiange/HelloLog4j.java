package com.tiange;

import org.apache.log4j.Logger;

public class HelloLog4j
{
	private static final Logger log = Logger.getLogger(HelloLog4j.class);
	public static void main(String[] args)
	{
		log.debug("log debug...");
		log.info("log info...");
		log.error("log error...");
	}

}
