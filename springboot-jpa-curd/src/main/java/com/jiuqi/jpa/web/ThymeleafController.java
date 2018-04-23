/*
 * @(#)ThymeleafController.java  
 */
package com.jiuqi.jpa.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *<p>Title:</p>
 * @author: zenglizhi
 * @date: 2018/04/20
 * @version: v1.0
 */
@Controller
public class ThymeleafController {
	
    @RequestMapping("/hi")
	public String hello(Locale locale, Model model) {
		model.addAttribute("greeting", "Hello!");

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);        
		String formattedDate = dateFormat.format(date);
		model.addAttribute("currentTime", formattedDate);

		return "hello";
	}

	
}
