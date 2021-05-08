package lyh7712.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    @GetMapping("/log-test")
    public String logTest() {

        String name = "spring";

        log.info("log = {} ", name);
        log.warn("warn = {} ", name);
        log.error("error = {} ", name);

        return "Ok";
    }
}
