package hello;

import org.springframework.beans.factory.annotation.Autowired;
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
    	return this.st.test;
    }

}
