package com.bitexodus.tiles;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cow")
public class CowController{
	
    @RequestMapping("/cow/view")
    public ModelAndView viewCow(){
    	Map<String, ?> modelMap = new HashMap<String, Object>();
        return new ModelAndView("view.cow", modelMap);
    }
    @RequestMapping("/cow/edit")
    public ModelAndView editCow(){ 
    	Map<String, ?> modelMap = new HashMap<String, Object>();
        return new ModelAndView("edit.cow", modelMap);
    }
    @RequestMapping("/cow/search")
    public ModelAndView searchCow(){ 
    	Map<String, ?> modelMap = new HashMap<String, Object>();
        return new ModelAndView("search.cow", modelMap);
    }
}