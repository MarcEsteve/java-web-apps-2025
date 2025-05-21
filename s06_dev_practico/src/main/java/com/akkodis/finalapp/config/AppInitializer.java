package com.akkodis.finalapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

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
