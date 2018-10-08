package info.mintzlaff;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletContext;

//@EnableWebMvc
//@Configuration
//@ComponentScan
public class WebAppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext sc) {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        sc.addListener(new ContextLoaderListener(context));
    }
}
