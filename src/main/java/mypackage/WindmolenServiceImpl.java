package mypackage;

import javax.jws.WebService;
import java.math.*;

@WebService( endpointInterface= "mypackage.WSInterface")
public class WindmolenServiceImpl implements WSInterface {

	@Override
	public Response calculatePower(Request request) {
		ObjectFactory factory = new ObjectFactory();
		Response response = factory.createResponse();
		Double watt = 0.5 * 1.59 * (Math.PI * Math.pow(30, 2)) * Math.pow(request.getWindsnelheid().doubleValue(), 3.0);
		Double kwh = watt * 1 / 1000;
		BigInteger actualResult = BigInteger.valueOf(kwh.longValue());
		response.setResult(actualResult);
		return response;
	}

}
