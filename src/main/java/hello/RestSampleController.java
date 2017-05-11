package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestSampleController {

    @GetMapping("/hello")
    public String hello() {
        return "hello!!";
    }

    @GetMapping("/account")
    public Account account() {
        return new Account("hoge", 20);
    }
}
