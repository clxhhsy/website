/*
 * 文件名：CustomerException
 * 版权：Copyright by lichen
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/10/28
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.exception;


import freemarker.template.TemplateException;


/**
 * Created On 2016年-10月-28日 14:10
 *
 * @author lichen
 * @version 1.0
 */
public class CustomerException extends RuntimeException
{
    public CustomerException(String s, TemplateException e)
    {
        super("ERROR CODE: " + s + "[" + s + "]" + e.getMessage(), e);
    }
}
