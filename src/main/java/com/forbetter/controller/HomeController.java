/*
 * 文件名：HomeController
 * 版权：Copyright by lichen
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/10/18
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.controller;


import com.forbetter.pojo.Example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


/**
 * 首页
 * <p>
 * Created On 2016年-10月-18日 16:26
 *
 * @author lichen
 * @version 1.0
 */
@Controller
public class HomeController
{

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String index(Model model)
    {
        Example example = new Example();
        List<Example> list = new ArrayList<Example>();
        list.add(example);
        example.setName("aaa");
        example.setDeveloper("lichen");
        model.addAttribute("title", "首页");
        model.addAttribute("exampleObject", example);
        model.addAttribute("systems", list);
        return "login";
    }
}
