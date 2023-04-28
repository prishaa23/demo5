package com.example.demo.endpoint;

import com.example.demo.service.BirthdayService;
import mypackage.GetAgeResponse;
import mypackage.GetBirthdayRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BirthdayEndpoint {
    private static final String NAMESPACE = "http://www.webservicesoap.org/birthday";

    @Autowired
    private BirthdayService service;

    @PayloadRoot(localPart = "getBirthdayRequest", namespace = NAMESPACE)
    @ResponsePayload
    public GetAgeResponse getBirthdayRequest(@RequestPayload GetBirthdayRequest request) {
        return service.age(request);
    }
}
