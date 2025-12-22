package kr.soft.shopping.api;



import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class StudyController {

    Logger logger = LoggerFactory.getLogger(getClass());


    @GetMapping("/test1")
    public String test1() {
        logger.info("TEST ACTION");
        return "Hello World!";
    }
}
