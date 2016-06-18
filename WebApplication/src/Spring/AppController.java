package Spring;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
 @Controller
public class AppController {
 
 @RequestMapping(value="/login.html", method = RequestMethod.GET)
 public ModelAndView helloWorld(){
		ModelAndView modelandview = new ModelAndView("Hello");
		
		
		
		return modelandview;
 }
 @ModelAttribute
 public void addingCommonObjects(Model model){
	 model.addAttribute("he","Anwesh's India Shopping List");
	 model.addAttribute("person","Persons");
	 model.addAttribute("items","Items List");
 }
 @RequestMapping(value="/sucessful.html", method= RequestMethod.POST)
 public ModelAndView sucessful(@ModelAttribute("us") UsShopping us){
		ModelAndView modelandview = new ModelAndView("sucessful");
	modelandview.addObject("msg","Your Shopping list");
		
		
		return modelandview;
 }
	
}