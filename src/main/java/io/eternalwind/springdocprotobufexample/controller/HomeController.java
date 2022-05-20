package io.eternalwind.springdocprotobufexample.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.eternalwind.springdocprotobufexample.ProtoRequestOuterClass.ProtoRequest;
import io.eternalwind.springdocprotobufexample.ProtoRequestOuterClass.ProtoResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HomeController {
    @PostMapping
    public ProtoResponse post(@RequestBody ProtoRequest request) {
        log.info("Received {}", request);
        
        return ProtoResponse.newBuilder()
            .setResult("hello")
            .build();
    }
}
