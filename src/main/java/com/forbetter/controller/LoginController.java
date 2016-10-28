/*
 * 文件名：LoginController
 * 版权：Copyright by lichen
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/10/28
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 登录操作
 * <p>
 * Created On 2016年-10月-28日 10:25
 *
 * @author lichen
 * @version 1.0
 */
@Controller
public class LoginController
{
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String toLogin()
    {
        return "login";
    }

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public String login()
    {
        return "redirect:/admin/index";
    }

    @RequestMapping(value = "/admin/index", method = RequestMethod.GET)
    public String index()
    {
        return "/admin/index";
    }
}