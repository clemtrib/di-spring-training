package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
	
	public static final String HELLO_GURUS = "hello clemtrib! - Original";
	
	@Override
	public String sayGreeting() {
		return HELLO_GURUS;
	}
	
}
