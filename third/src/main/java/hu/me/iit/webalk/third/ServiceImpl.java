package hu.me.iit.webalk.third;

import org.springframework.beans.factory.annotation.Value;

public class ServiceImpl implements Service {
	//private final Dependency dependency;
	private String value;

	@Value("${sajat-cucc}")
	public void setValue(String value) {
		this.value = value;
	}
	
	public ServiceImpl() {
		this.value = Double.toString(Math.random());
	}
	
	@Override
	public String getValue() {
		return value;
	}

}
