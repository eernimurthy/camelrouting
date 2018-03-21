package com.routing.camelrouting;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRoutes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("direct:fhirRoute")
                .log("Camel body: ${body}");
    }
}