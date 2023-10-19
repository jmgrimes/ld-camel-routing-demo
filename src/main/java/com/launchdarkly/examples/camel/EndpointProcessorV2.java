package com.launchdarkly.examples.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("endpointProcessorV2")
public class EndpointProcessorV2 implements Processor {

    public void process(final Exchange exchange) {
        exchange.getMessage()
                .setBody(new EndpointResponse("2.0", "Hello World from Version 2.0!"));
    }

}
