
import org.springframework.web.client.RestTemplate;

public class RestTemplateTestAppl {
	static RestTemplate restTemplate = new RestTemplate();
	static String url = "http://api.fixer.io/latest";

	public static void main(String[] args) {
		
//		String json = restTemplate.getForObject(url, String.class);
		
		Currency json = restTemplate.getForObject(url,Currency.class);
		
		/*HttpEntity<Map<String,Object>> map = restTemplate.exchange(url, HttpMethod.GET,
				null, new ParameterizedTypeReference<Map<String,Object>>() {
				});*/
		/*HttpEntity<List<Currency>> list = restTemplate.exchange(url, HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Currency>>() {
				});*/
		
		System.out.println(json);
		double currencyValue = getCurrencyValue("RUB", json); 
		System.out.println(currencyValue);
		System.out.println(json.getDate());
	}

	private static double getCurrencyValue(String currency, Currency json) {
		return json.getRates().get(currency) ;
	}

}
