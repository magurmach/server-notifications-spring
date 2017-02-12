package com.twilio.notifications.domain.twilio;

import java.util.Map;

public class Credentials {
    private Map<String, String> env;

    public Credentials() {
        env = System.getenv();
    }

    public String getAccountSid() {
        //TODO
        return "AC26cafd7d8bcfd9c4c59621128191716d";
    }

    public String getAuthToken() {
        //TODO
        return "9566d2a8384bec3c6b28e7e5ed111a70";
    }

    public String getPhoneNumber() {
        //TODO
        return "+14242896993";
    }
}

