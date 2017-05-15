package com.jolly.upms.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 启动解压jollyAdmin-x.x.x.jar到resources目录
 * Created by berkeley on 2016/12/18.
 */
public class JollyAdminUtil implements InitializingBean, ServletContextAware {

    private static Logger _log = LoggerFactory.getLogger(JollyAdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        _log.info("===== 开始解压upms-admin =====");
        String version = PropertiesFileUtil.getInstance().get("upms-admin.version");
        _log.info("upms-admin.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/upms-admin-" + version + ".jar");
        _log.info("upms-admin.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/upms-admin";
        _log.info("upms-admin.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        _log.info("===== upms-admin完成 =====");
    }

}
