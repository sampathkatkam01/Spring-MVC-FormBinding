package in.sampath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.sampath.entity.User;

@Controller
public class UserController {
	@GetMapping("/user")
	public ModelAndView Loadform() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userobject", new User());
		mav.setViewName("index");
		return mav;
	}
	@PostMapping("/user")
	public ModelAndView handledata(User user) {
		System.out.println(user);
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg", "User records saved sucessfully......");
		mav.setViewName("sucess");
		return mav;
		
	}

}
