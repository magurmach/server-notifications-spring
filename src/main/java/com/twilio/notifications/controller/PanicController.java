package com.twilio.notifications.controller;

import com.twilio.notifications.domain.request.Panic;
import com.twilio.notifications.domain.response.PanicResponse;
import com.twilio.notifications.service.PanicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Shakib Ahmed on 2/11/17.
 */

@Controller
public class PanicController {
    PanicService panicService = new PanicService();

    @RequestMapping(value = "/panic", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<PanicResponse> triggerPanic(@RequestBody Panic panic) {
        panicService.triggerPanic(panic.phoneNumber, panic.message);
        PanicResponse response = new PanicResponse();
        response.message = "Panic sent!";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
