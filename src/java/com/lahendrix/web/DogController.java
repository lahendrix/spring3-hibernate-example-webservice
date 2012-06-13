package com.lahendrix.web;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction. MultiActionController;

import com.lahendrix.dao.DogDAO;
import com.lahendrix.domain.Dog;
import java.util.ArrayList;

public class DogController extends MultiActionController {
 
    private DogDAO dogDAO;

    public void setDogDAO(DogDAO dogDAO) {
        this.dogDAO = dogDAO;
    }

    public ModelAndView add(HttpServletRequest request,
    HttpServletResponse response, Dog dog) throws Exception {
        dogDAO.saveDog(dog);
        return new ModelAndView("redirect:list.htm");
    }

    public ModelAndView list(HttpServletRequest request,
    HttpServletResponse response) throws Exception {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("dogList", dogDAO.listDog());
        modelMap.addAttribute("dog", new Dog());
        return new ModelAndView("dogForm", modelMap);
    }
}
