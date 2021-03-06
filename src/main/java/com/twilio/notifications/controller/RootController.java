package com.twilio.notifications.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SuppressWarnings("UnusedDeclaration")
public class RootController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index() throws Exception {
        return "If you want to trigger panic, POST to /panic";
    }


}
