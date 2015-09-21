package au.com.bluemix.training.appb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService(serviceName = "ServiceBService", portName = "ServiceBPort", endpointInterface = "au.com.bluemix.training.appb.IServiceB", targetNamespace = "http://appa/ServiceA")
public class ServiceB implements IServiceB {

	@Override
	public int minus(int left, int right) {
		return left - right;
	}

}
