package com.example.configclientleo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @Autowired
    private ConfigData configData;

    @GetMapping(value = "/test")
    private String getUrlFromServer(){
        return configData.getUrl();
    }
}
