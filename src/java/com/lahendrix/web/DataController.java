package com.lahendrix.web;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction. MultiActionController;

import com.lahendrix.dao.DataDAO;
import com.lahendrix.domain.Data;

public class DataController extends MultiActionController {
 
    private DataDAO dataDAO;

    public void setDataDAO(DataDAO dataDAO) {
        this.dataDAO = dataDAO;
    }

    public ModelAndView add(HttpServletRequest request,
    HttpServletResponse response, Data data) throws Exception {
        dataDAO.saveData(data);
        return new ModelAndView("redirect:list.htm");
    }

    public ModelAndView list(HttpServletRequest request,
    HttpServletResponse response) throws Exception {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("dataList", dataDAO.listData());
        modelMap.addAttribute("data", new Data());
        return new ModelAndView("dataForm", modelMap);
    }
    
    public ModelAndView listUserData(HttpServletRequest request,
    HttpServletResponse response) throws Exception {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("dataList", dataDAO.listUserData(request.getParameter("email")));
        modelMap.addAttribute("data", new Data());
        return new ModelAndView("filteredData", modelMap);
    }
}
