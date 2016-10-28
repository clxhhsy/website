/*
 * 文件名：BaseFreeMarkerView
 * 版权：Copyright by lichen
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/10/28
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.extension;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * 扩展
 * <p>
 * Created On 2016年-10月-28日 15:10
 *
 * @author lichen
 * @version 1.0
 */
public class BaseFreeMarkerView extends FreeMarkerView
{
    private static final Logger logger = LogManager.getLogger(BaseFreeMarkerView.class.getName());

    private static final String CONTEXT_PATH = "basePath";

    @Override
    protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request)
        throws Exception
    {
        String schema = request.getScheme();
        String serverName = request.getServerName();
        int port = request.getServerPort();
        String path = request.getContextPath();
        String basePath = schema + "://" + serverName + ":" + port + path;
        logger.debug("freemarker basePath variable : {}",basePath);
        model.put(CONTEXT_PATH,basePath);
        super.exposeHelpers(model, request);
    }
}
