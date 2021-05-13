package com.harika;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SimpleInterestController {
		@RequestMapping(value="/interestt",method=RequestMethod.GET)
		public ModelAndView gethmple() {
			ModelAndView jec=new ModelAndView("interestt");
			return jec;		
		}
		@RequestMapping(value="/interest",method=RequestMethod.POST)
		public ModelAndView resultForm(@RequestParam("anal") int validate,@RequestParam("rate") int range,@RequestParam("time") int timing) {
			ModelAndView jec=new ModelAndView("interest");
			jec.addObject("hiding" ," Principal: " +validate+" range: "+range+" % "+"\t timing: "+timing+" month ");
			double h;
			h=(validate*range*timing)/100;
			jec.addObject("hiding1"," Simple Interest: "+h);
			
			return jec;		
		}
}

