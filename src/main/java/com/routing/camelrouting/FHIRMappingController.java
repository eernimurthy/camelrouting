package com.routing.camelrouting;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FHIRMappingController {
    @Autowired
    ProducerTemplate producerTemplate;

    @RequestMapping(value = "/patient")
    public void mapPatient() {
        producerTemplate.sendBody("direct:fhirRoute", "Sending to - (direct:fhirRoute) : for Patient");
    }
}