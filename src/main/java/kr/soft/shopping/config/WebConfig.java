package kr.soft.shopping.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
* Web에 대한 설정을 모아두는 공간
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173/")
                .allowedMethods("GET","POST")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3000);
    }
}
