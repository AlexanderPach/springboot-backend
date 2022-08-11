package com.alexsExample.springboot.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class getErrorController implements ErrorController {

    @RequestMapping(value = "/error")
    public String handleError(HttpServletRequest req){
        Integer statusCode = (Integer) req.getAttribute("javax.servlet.error.status_code");
        Exception exception = (Exception) req.getAttribute("javax.servlet.error.status_code");
        return String.format("<html><body><h2>Error, Object Not Found!</h2><div>Status Code: <b>%s</b></div><div>Exception Message: <b>%s</b></div></body></html>",
                statusCode, exception == null? "N/A": exception.getMessage());
    }


    public String getErrorPath()
    {
        return "/error";
    }
}
