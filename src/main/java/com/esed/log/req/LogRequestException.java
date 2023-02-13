package com.esed.log.req;

import org.apache.log4j.Logger;

public class LogRequestException extends Exception {
	 
	private static Logger logger = Logger.getLogger(LogRequestException.class);

	//private static final long serialVersionUID = 5532002375566753262L;
	private static final long serialVersionUID = 1L;

	public LogRequestException(String messaggiErrore) {
		super(messaggiErrore);
		logger.info(messaggiErrore);
		
	}

}
