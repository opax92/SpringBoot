package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * Created by Seb on 2016-01-29.
 */

@Controller
public class ControllerTest1 {
    @RequestMapping("/test1")
    @ResponseBody
    public String test(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        try {
            RequestsCounter.increase();
            Thread.sleep(40000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        RequestsCounter.decrease();
        return "DONE1";
    }
}
