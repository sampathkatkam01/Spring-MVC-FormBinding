package in.sampath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.sampath.entity.Book;

@Controller
public class bookcontroller {
	@GetMapping("/book")
	public ModelAndView loadformbook() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("bookobj", new Book());
		mav.setViewName("book");
		return mav;
	}
	
	@PostMapping("/book")
	public ModelAndView handleform(Book book) {
		System.out.println(book);
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Book records saved sucessfully.....");
		mav.setViewName("sucess");
		return mav;
	}

}
