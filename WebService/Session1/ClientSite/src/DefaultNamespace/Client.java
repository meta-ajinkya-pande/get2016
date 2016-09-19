package DefaultNamespace;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Client {
	public static void main(String ar[]){
		ServerServiceLocator serverServiceLocator = new ServerServiceLocator();
		serverServiceLocator.setServerEndpointAddress("http://localhost:8080/ServerSite/services/Server");
		
		try {
			Server server = serverServiceLocator.getServer();
			System.out.println(server.convertFahrenheitToCelsius(100));
		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
		}
	}
}
