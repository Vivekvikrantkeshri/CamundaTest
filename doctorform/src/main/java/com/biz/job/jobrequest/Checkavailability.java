package com.biz.job.jobrequest;

import java.util.Random;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Checkavailability implements JavaDelegate {
	//private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
	/*	boolean flag = false;
	  	Integer Experience = (Integer) execution.getVariable("Experience") ;
	  	if ( Experience == 2) flag = true;
	  	else flag = false;
			
			execution.setVariable("interviewmessage", flag);
			
			LOGGER.info("\n-----------------------------------------------");
			LOGGER.info("\nTesting '" + 
						"\nPerson Name : " + execution.getVariable("person name") + "'..." + 
						"\nExperience : " + execution.getVariable("Experience") + "'..." + 
							"\nCondition : "+ flag);
			LOGGER.info("\n-----------------------------------------------\n"); */
		
		Random rando = new Random();
		
		execution.setVariable("name", "vivek");
		execution.setVariable("experianceOk", rando.nextBoolean());

	}

}
