import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Server {
	@WebMethod
	public Double convertFahrenheitToCelsius(Double far){
		Double celcius = (far-32)*5/9;
		return celcius;
	}
}
