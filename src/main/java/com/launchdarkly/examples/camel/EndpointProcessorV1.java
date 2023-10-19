package com.launchdarkly.examples.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("endpointProcessorV1")
public class EndpointProcessorV1 implements Processor {

    public void process(final Exchange exchange) {
        exchange.getMessage()
                .setBody(new EndpointResponse("1.0", "Hello World from Version 1.0!"));
    }

}
