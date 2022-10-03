package com.matrix.cloud.controller;

import com.matrix.cloud.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Matrix
 * @Date: 2022-10-01 11:30:41
 * @Version: v1.0.3
 * @Description: Message控制器
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    @Qualifier(value = "messageService-one")
    private MessageService messageService;

    @GetMapping("/info")
    public String info(@RequestParam String name) {
        return messageService.info(name);
    }
}
