package com.colak.springnettytutorial.controller;

import com.colak.springnettytutorial.service.PushMsgService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/push")
@RequiredArgsConstructor
public class TestController {

    private final PushMsgService pushMsgService;

    // http://localhost:8088/push/sss
    @GetMapping("/{uid}")
    public void pushOne(@PathVariable String uid) {
        pushMsgService.pushMsgToOne(uid, "hello-------------------------");
    }

    // http://localhost:8088/push/pushAll
    @GetMapping("/pushAll")
    public void pushAll() {
        pushMsgService.pushMsgToAll("hello all-------------------------");
    }
}
