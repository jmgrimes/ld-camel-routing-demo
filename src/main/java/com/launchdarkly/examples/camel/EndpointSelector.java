package com.launchdarkly.examples.camel;

public interface EndpointSelector {

    public String getEndpoint(final String flagKey, final String defaultEndpoint);

}
