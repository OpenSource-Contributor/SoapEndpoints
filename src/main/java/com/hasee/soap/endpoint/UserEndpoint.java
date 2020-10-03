package com.hasee.soap.endpoint;

import com.hasee.soap.model.StarsRequest;
import com.hasee.soap.model.StarsResponse;
import com.hasee.soap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint
{

    @Autowired
    private UserService userService;


    @PayloadRoot(namespace = "http://hasee.com/soap-demo",
            localPart = "starsRequest")
    @ResponsePayload
    public StarsResponse getStarsRequest(@RequestPayload StarsRequest request) {
       return new StarsResponse();
    }
}
