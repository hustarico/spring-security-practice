package hustarico.security.rest;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1")
public class test {
    
    @GetMapping("/")
    public String getMethodName() {
        return "sup  nigga";
    }

    @GetMapping("/test")
    public ResponseEntity<String> Test() {
        return ResponseEntity.ok("hello secured");
    }

    @GetMapping("/greet")
    public ResponseEntity<String> greet(Authentication auth) {
        return ResponseEntity.ok("hello "+auth.getName());
    }
    
    
    
}
