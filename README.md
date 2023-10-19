# Camel Routing Example with LaunchDarkly Feature Flags

This application demonstrates the use of a LaunchDarkly feature flag
to route between two implementations of an HTTP API.

When run, this application will stand up an endpoint at 
```http://localhost:8080/camel/api/latest/my-endpoint``` and serve a
simple payload with a version number and a message in a JSON object. By 
toggling a feature flag, you can swap from version 1.0 of the api to 
version 2.0 of the api, and perform progressive rollouts of this change.

## Building and Running the Application

To download the applications dependencies and build it you will need to
add your LaunchDarkly SDK key in the ```CamelRoutingApplication.java``` 
file, and create a feature flag in the corresponding LaunchDarkly project 
with the key ```endpoint-version```.  The variations for ths flag must be 
```v1``` and ```v2```.  After this is complete run the following command 
to build the application:

```shell
./mvnw package
```

To run the application, use the following command

```shell
./mvnw spring-boot:run
```