package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

	@Autowired
	Deepak deepak;
	
	@Autowired
	Koirala koirala;
		
	@RequestMapping("/deepak")
    public String deeps(){
//    	Deepak deepak = new DeepakImpl();
    	
    	deepak.show();
    	
//    	Deepak koirala = new KoiralaImpl();
//    	Koirala koirala = new DeepakImpl();
    	
//    	koirala.show();
    	koirala.hide();
    	    	
    	
    	return "deepak";
    }
	
}
