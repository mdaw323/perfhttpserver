package pl.mdaw.perfhttpserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/")
    public String handle() {
        return "Hello WebFlux";
    }
}
