package com.waterstone.web;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waterstone.model.User;

/**
 * 主页控制类。
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * 首页显示。
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Locale locale, Model model) {
        return "index";
    }

    /**
     * 圆圆首页显示。
     */
    @RequestMapping(value = "/yyindex", method = RequestMethod.GET)
    public String yyindex(Locale locale, Model model) {
        logger.info("Welcome yy's home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "yyindex";
    }

    /**
     * 圆圆学习生活页面的显示。
     */
    @RequestMapping(value = "/yystudy", method = RequestMethod.GET)
    public String yystudy(Locale locale, Model model) {
        logger.info("Welcome yy study's home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "yystudy";
    }

    /**
     * 圆圆学习生活帖子的显示。
     */
    @RequestMapping(value = "/yypost", method = RequestMethod.GET)
    public String yypost(Locale locale, Model model) {
        logger.info("Welcome yy post's home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "post";
    }

    /**
     * 测试FreeMarker用
     */
    @RequestMapping(value = "/addTest", method = RequestMethod.GET)
    public String add(Locale locale, Model model) {
        User user = new User();
        user.setName("hjzgg");
        user.setPassword("5211314");
        List<User> users = new ArrayList<User>();
        users.add(user);
        model.addAttribute("users", users);
        
        return "index";
    }
}
