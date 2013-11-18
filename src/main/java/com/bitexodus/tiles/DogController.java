package com.bitexodus.tiles;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dog")
public class DogController {

	@RequestMapping("/dog/view")
	public ModelAndView viewDog() {
		Map<String, ?> modelMap = new HashMap<String, Object>();
		return new ModelAndView("view.dog", modelMap);
	}

	@RequestMapping("/dog/edit")
	public ModelAndView editDog() {
		Map<String, ?> modelMap = new HashMap<String, Object>();
		return new ModelAndView("edit.dog", modelMap);
	}

	@RequestMapping("/dog/search")
	public ModelAndView searchDog() {
		Map<String, ?> modelMap = new HashMap<String, Object>();
		return new ModelAndView("search.dog", modelMap);
	}
}