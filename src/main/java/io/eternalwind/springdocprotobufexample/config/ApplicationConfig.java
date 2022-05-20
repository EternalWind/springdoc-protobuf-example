package io.eternalwind.springdocprotobufexample.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hubspot.jackson.datatype.protobuf.ProtobufModule;
import com.innogames.springfox_protobuf.ProtobufPropertiesModule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.core.jackson.ModelResolver;

@Configuration
public class ApplicationConfig {
    @Bean
    public ObjectMapper objectMapper() {
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new ProtobufPropertiesModule());
        objectMapper.registerModule(new ProtobufModule());

        return objectMapper;
    }

    @Bean
    public ModelResolver modelResolver(final ObjectMapper objectMapper) {
        return new ModelResolver(objectMapper);
    }
}
