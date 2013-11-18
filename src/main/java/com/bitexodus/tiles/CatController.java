package com.bitexodus.tiles;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cat")
public class CatController{
	
    @RequestMapping("/cat/view")
    public ModelAndView viewCat(){
    	Map<String, ?> modelMap = new HashMap<String, Object>();
        return new ModelAndView("view.cat", modelMap);
    }
    @RequestMapping("/cat/edit")
    public ModelAndView editCat(){ 
    	Map<String, ?> modelMap = new HashMap<String, Object>();
        return new ModelAndView("edit.cat", modelMap);
    }
    @RequestMapping("/cat/search")
    public ModelAndView searchCat(){ 
    	Map<String, ?> modelMap = new HashMap<String, Object>();
        return new ModelAndView("search.cat", modelMap);
    }
}