package com.twilio.notifications.service;

import com.twilio.notifications.domain.twilio.Client;
import org.springframework.stereotype.Service;

/**
 * Created by Shakib Ahmed on 2/11/17.
 */

@Service
public class PanicService {
    public void triggerPanic(String phoneNumber, String panicMessage) {
        Client client = new Client();
        client.sendMessage(phoneNumber, panicMessage, "https://goo.gl/QKNqCJ");
    }
}
