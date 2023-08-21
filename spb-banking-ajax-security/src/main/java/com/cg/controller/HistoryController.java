package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/histories")
public class HistoryController {
    @GetMapping
    public ModelAndView showTransferInfoPage() {
        ModelAndView modelAndView = new ModelAndView("/histories/transfer");
        //modelAndView.addObject("username", getPrincipal());
        return modelAndView;
    }
}
