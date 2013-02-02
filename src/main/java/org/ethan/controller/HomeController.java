package org.ethan.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}

    @RequestMapping(value="/list")
    public ModelAndView list(HttpServletResponse response) throws IOException{
        return new ModelAndView("list");
    }

    @RequestMapping(value = "/edit")
    public ModelAndView edit(){

        return new ModelAndView("edit");
    }

    @RequestMapping(value = "/doEdit")
    public ModelAndView doEdit(HttpServletRequest request,HttpServletResponse response){

        String name = request.getParameter("name");
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("name",name);
        return mv ;
    }

}
