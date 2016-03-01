/*package org.maro.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = RestController.class)
public class ControllerAdvisor {

    @ModelAttribute
    public void addAttributes(HttpServletRequest request, HttpServletResponse response,Model model, @RequestBody String requestString, @RequestHeader(value = "User-Agent") String userAgent) {
        // do whatever you want to do on the request body and header. 
        // with request object you can get the request method and request path etc.
        System.out.println("requestString" + requestString);
        System.out.println("userAgent" + userAgent);
        model.addAttribute("attr1", "value1");
        model.addAttribute("attr2", "value2");
    }   

}
*/