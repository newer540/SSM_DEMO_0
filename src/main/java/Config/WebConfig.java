package Config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"web"})
@PropertySource("classpath:validationsMessage.properties")
@ImportResource("classpath:springConfig.xml")
public class WebConfig implements WebMvcConfigurer {         //implements WebMvcConfigurer
/*
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver=
                new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);

        resolver.setExposeContextBeansAsAttributes(true);
        return  resolver;
    }
    */

        public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer
    ){
        configurer.enable();
    }









}
