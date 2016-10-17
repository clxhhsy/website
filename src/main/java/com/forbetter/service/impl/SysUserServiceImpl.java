/*
 * �ļ�����SysUserServiceImpl
 * ��Ȩ��Copyright by lichen
 * ������
 * �޸��ˣ�lichen
 * �޸�ʱ�䣺2016/10/17
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */
package com.forbetter.service.impl;


import com.forbetter.mapper.SysUserMapper;
import com.forbetter.pojo.SysUser;
import com.forbetter.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SysUserServiceImpl implements ISysUserService
{
    @Autowired
    private SysUserMapper userMapper;

    public void saveSysUser(SysUser user)
    {
        userMapper.insert(user);
    }
}
