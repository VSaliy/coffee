package com.sebastian_daschner.coffee_shop.boundary;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;

@Health
@ApplicationScoped
public class HealthResource implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("coffee-shop").withData("app-version", "2").up().build();
    }
}
