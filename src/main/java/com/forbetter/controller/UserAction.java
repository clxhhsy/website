/*
 * �ļ�����UserAction
 * ��Ȩ��Copyright by lichen
 * ������
 * �޸��ˣ�lichen
 * �޸�ʱ�䣺2016/10/17
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */
package com.forbetter.controller;


import com.forbetter.pojo.SysUser;
import com.forbetter.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserAction
{
    @Autowired
    private ISysUserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public void saveUser(SysUser user)
    {
        userService.saveSysUser(user);
    }

}