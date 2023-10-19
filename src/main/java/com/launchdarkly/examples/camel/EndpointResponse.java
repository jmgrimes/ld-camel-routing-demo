package com.launchdarkly.examples.camel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EndpointResponse {

    private String version;
    private String message;

}
