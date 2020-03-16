/**
 * 
 */
package com.oracle.aq.jms.example.listener;


/**
 * @author amine.sagaama
 *
 */
public interface DataReceiverService {
	
	void dataReceived(String messageQueue) throws Exception;
	

}
