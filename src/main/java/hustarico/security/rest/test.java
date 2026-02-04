package hustarico.security.rest;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class test {
    
    @GetMapping("/")
    public String getMethodName() {
        return "sup  nigga";
    }

    
    
}
