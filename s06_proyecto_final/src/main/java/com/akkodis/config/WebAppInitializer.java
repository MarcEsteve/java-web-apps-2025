package com.akkodis.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { SecurityConfig.class };  // Seguridad global
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class };       // Config MVC
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };                  // Mapea el DispatcherServlet
    }
}
