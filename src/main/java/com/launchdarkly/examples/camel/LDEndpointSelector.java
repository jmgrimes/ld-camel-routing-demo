package com.launchdarkly.examples.camel;

import com.launchdarkly.sdk.LDUser;
import com.launchdarkly.sdk.server.interfaces.LDClientInterface;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Component("endpointSelector")
public class LDEndpointSelector implements EndpointSelector {

    private LDClientInterface ldClient;

    public String getEndpoint() {
        var ldUser = new LDUser.Builder(UUID.randomUUID().toString()).anonymous(true).build();
        return ldClient.stringVariation("endpoint-version", ldUser, "v1");
    }

}
