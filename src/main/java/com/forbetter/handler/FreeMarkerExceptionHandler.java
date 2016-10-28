/*
 * 文件名：FreeMarkerExceptionHandler
 * 版权：Copyright by lichen
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/10/28
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.handler;


import com.forbetter.exception.CustomerException;
import freemarker.core.Environment;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Writer;


/**
 * Freemarker异常处理类
 * <p>
 * Created On 2016年-10月-28日 14:01
 *
 * @author lichen
 * @version 1.0
 */
public class FreeMarkerExceptionHandler implements TemplateExceptionHandler
{

    private static final Logger logger = LogManager.getLogger(
        FreeMarkerExceptionHandler.class.getName());

    public void handleTemplateException(TemplateException e, Environment environment,
                                        Writer writer)
        throws TemplateException
    {
        logger.warn("freemarker template exception {}", e.getMessage());
        throw new CustomerException("freemarker error ", e);
    }
}
