/**
 * 
 */
package com.oracle.aq.jms.example.listener;


import org.springframework.stereotype.Component;



/**
 * 
 * @author Oumaima.Khouchfi
 *
 */
@Component
public class DataReceiverServiceILImpl  implements DataReceiverService {
	
	public static int nbrRetry = 1;

	public void dataReceived(String messageQueue) throws Exception {
		if(nbrRetry == 5) {
			System.out.println(messageQueue);
			nbrRetry = 0;
			return;
		}
		System.out.println("Retry : "+ nbrRetry);
		throw new Exception("retry "+nbrRetry++);
		
		
		
	}


	


	


}
