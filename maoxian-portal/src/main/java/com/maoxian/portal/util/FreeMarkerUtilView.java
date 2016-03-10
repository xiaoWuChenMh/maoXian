package com.maoxian.portal.util;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by hui on 2016/3/7.
 */
public class FreeMarkerUtilView extends FreeMarkerView {
    private static final String CONTEXT_PATH = "base";
    protected void exposeHelpers(Map model,HttpServletRequest request) throws Exception {
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
        model.put(CONTEXT_PATH, basePath);
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        model.put("nowdate", format.format(new Date()));
        super.exposeHelpers(model, request);
    }
}
