

import java.util.Date;
import java.util.HashMap;

import org.springframework.web.client.RestTemplate;

public class Currency {
	String base;
	Date date;
	HashMap<String,Double> rates;
		
	@Override
	public String toString() {
		return "Currency [base=" + base + ", date=" + date + ", rates=" + rates + "]";
	}

	public HashMap<String,Double> getRates(){
		return rates;
	}

	public String getBase() {
		return base;
	}

	public Date getDate() {
		return date;
	}

	public void addRate(String key, Double value) {
		rates.put(key, value);
	}
	

}
//список всех видов валют currencies
//курс какой-то валюты currency
//преоброзование из любой валюты в любую другую convert