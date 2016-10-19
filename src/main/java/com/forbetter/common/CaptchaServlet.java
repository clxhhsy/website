/*
 * 文件名：CaptchaServlet
 * 版权：Copyright by lichen
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/10/19
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.common;


import com.github.bingoohuang.patchca.background.BackgroundFactory;
import com.github.bingoohuang.patchca.color.ColorFactory;
import com.github.bingoohuang.patchca.color.RandomColorFactory;
import com.github.bingoohuang.patchca.custom.ConfigurableCaptchaService;
import com.github.bingoohuang.patchca.filter.predefined.*;
import com.github.bingoohuang.patchca.font.RandomFontFactory;
import com.github.bingoohuang.patchca.text.renderer.BestFitTextRenderer;
import com.github.bingoohuang.patchca.text.renderer.TextRenderer;
import com.github.bingoohuang.patchca.utils.encoder.EncoderHelper;
import com.github.bingoohuang.patchca.word.RandomWordFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;


/**
 * 验证码
 * <p>
 * Created On 2016年-10月-19日 10:27
 *
 * @author lichen
 * @version 1.0
 */
public class CaptchaServlet extends HttpServlet
{

    private static final long serialVersionUID = -7226322712856487939L;

    private static ConfigurableCaptchaService captchaService = null;

    private static ColorFactory colorFactory = null;

    private static RandomWordFactory wordFactory = null;

    private static RandomFontFactory fontFactory = null;

    private static Random r = new Random();

    private static TextRenderer textRenderer = null;

    private static CurvesRippleFilterFactory crff = null;

    private static MarbleRippleFilterFactory mrff = null;

    private static DoubleRippleFilterFactory drff = null;

    private static WobbleRippleFilterFactory wrff = null;

    private static DiffuseRippleFilterFactory dirff = null;

    private static final String VALIDATION_CODE = "validation_code";

    private static final String VALIDATION_NAME = "captcha";

    @Override
    public void init()
        throws ServletException
    {
        captchaService = new ConfigurableCaptchaService();
        // 颜色创建工厂，使用一定范围内的随机色
        colorFactory = new RandomColorFactory();
        captchaService.setColorFactory(colorFactory);
        // 随机字体生成器
        fontFactory = new RandomFontFactory();
        fontFactory.setMaxSize(32);
        fontFactory.setMinSize(28);
        captchaService.setFontFactory(fontFactory);
        // 随机字符生成器
        wordFactory = new RandomWordFactory();
        wordFactory.setCharacters("abcedfghjkmnpqstwxyz23456789");
        wordFactory.setMaxLength(5);
        wordFactory.setMinLength(4);
        captchaService.setWordFactory(wordFactory);
        // 图片滤镜
        crff = new CurvesRippleFilterFactory(captchaService.getColorFactory());
        mrff = new MarbleRippleFilterFactory();
        drff = new DoubleRippleFilterFactory();
        wrff = new WobbleRippleFilterFactory();
        dirff = new DiffuseRippleFilterFactory();
        // 文字渲染器设置
        textRenderer = new BestFitTextRenderer();
        textRenderer.setBottomMargin(3);
        textRenderer.setTopMargin(3);
        captchaService.setTextRenderer(textRenderer);
        // 自定义验证码图片背景
        CustomBackgroundFactory backgroundFactory = new CustomBackgroundFactory();
        captchaService.setBackgroundFactory(backgroundFactory);
        captchaService.setWidth(82);
        captchaService.setHeight(32);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        resp.setContentType("image/png");
        resp.setHeader("cache", "no-cache");
        HttpSession session = req.getSession();
        OutputStream os = resp.getOutputStream();
        switch (r.nextInt())
        {
            case 0:
                captchaService.setFilterFactory(crff);
                break;
            case 1:
                captchaService.setFilterFactory(mrff);
                break;
            case 2:
                captchaService.setFilterFactory(drff);
                break;
            case 3:
                captchaService.setFilterFactory(wrff);
                break;
            case 4:
                captchaService.setFilterFactory(dirff);
                break;
        }
        String captcha = EncoderHelper.getChallangeAndWriteImage(captchaService, "png", os);
        session.setAttribute(VALIDATION_CODE + session.getId(), captcha);
        os.flush();
        os.close();
    }

    @Override
    public void destroy()
    {
        colorFactory = null;
        wordFactory = null;
        fontFactory = null;
        r = null;
        textRenderer = null;
        crff = null;
        mrff = null;
        drff = null;
        wrff = null;
        dirff = null;
        super.destroy();
    }

    private class CustomBackgroundFactory implements BackgroundFactory
    {
        Random random = new Random();

        public void fillBackground(BufferedImage bufferedImage)
        {
            Graphics graphics = bufferedImage.getGraphics();
            int imgWidth = bufferedImage.getWidth();
            int imgHeight = bufferedImage.getHeight();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, imgWidth, imgHeight);
            // 画噪点
            for (int i = 0; i < 100; ++i)
            {
                // 随机颜色
                int rInt = random.nextInt(255);
                int gInt = random.nextInt(255);
                int bInt = random.nextInt(255);
                graphics.setColor(new Color(rInt, gInt, bInt));
                // 随机位置
                int xInt = random.nextInt(imgWidth - 3);
                int yInt = random.nextInt(imgHeight - 2);
                // 随机角度
                int sAngleInt = random.nextInt(360);
                int eAngleInt = random.nextInt(360);
                // 随机大小
                int wInt = random.nextInt(6);
                int hInt = random.nextInt(6);
                graphics.fillArc(xInt, yInt, wInt, hInt, sAngleInt, eAngleInt);
                // 画干扰线
                if (i % 20 == 0)
                {
                    int xInt2 = random.nextInt(imgWidth);
                    int yInt2 = random.nextInt(imgHeight);
                    graphics.drawLine(xInt, yInt, xInt2, yInt2);
                }

            }
        }
    }

    public Boolean isCaptcha(HttpServletRequest request)
    {
        if (request.getParameterMap().containsKey(VALIDATION_NAME))
        {
            String captcha = request.getParameter(VALIDATION_NAME);
            HttpSession session = request.getSession();
            String validationCode = (String)session.getAttribute(
                VALIDATION_CODE + session.getId());
            if (captcha.equals(validationCode))
            {
                return true;
            }
        }
        return false;
    }
}
