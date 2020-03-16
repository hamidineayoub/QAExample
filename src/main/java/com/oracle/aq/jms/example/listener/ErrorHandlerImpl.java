/**
 * 
 */
package com.oracle.aq.jms.example.listener;


import org.springframework.stereotype.Service;
import org.springframework.util.ErrorHandler;

/**
 * @author amine.sagaama
 *
 */
@Service(value = "errorHandler")
public class ErrorHandlerImpl implements ErrorHandler {

	public void handleError(Throwable t) {
		t.printStackTrace();
		
	}


	

}
