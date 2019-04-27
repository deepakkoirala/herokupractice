package hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

//	@Autowired
//	private CurrentTime mytemp;
	
	@Autowired
	private ScheduledTasks st;

    @RequestMapping("/")
    public String deepak(@RequestParam(value="name", defaultValue="World") String name) {
        //return mytemp.currentTime;
    	return "Under Construction - " + this.st.test;
    }
    
    @RequestMapping("/cars")
    public Cars cars() {
    	Cars car = new Cars("Toyota","10","4");
    	return car;
    }
    
    @RequestMapping("/bus")
    public Bus bus() {
    	Bus bus = new Bus("Tata","10","8");
    	return bus;
    }
    
    @PostMapping("/getCar")
    public String cars(@RequestBody Cars car) {
      	return car.getName();
    }

}
