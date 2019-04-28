package hello;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class DeepakImpl implements Deepak, Koirala{
	
	@Override
	public void show() {
		System.out.println("deepak-show");
	}
	
	@Override
	public void hide() {
		System.out.println("deepak-hide");
	}
	
	public void abc() {
		System.out.println("abc");
	}
}