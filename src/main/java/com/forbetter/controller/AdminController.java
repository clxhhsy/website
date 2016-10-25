/**
 * Project Name:home-website
 * <p>
 * File Name:AdminController
 * <p>
 * Package Name:com.forbetter.controller
 * <p>
 * Date:2016/10/22 13:05
 * <p>
 * Copyright (c) 2016, clxhhsy@126.com All Rights Reserved.
 */
package com.forbetter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * ClassName: AdminController <br/>
 *
 * date: 2016/10/22 13:05 <br/>
 *
 * @author lichen
 * @version 1.0
 * @since JDK 1.6
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController
{

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage()
    {
        return "login";
    }
}
