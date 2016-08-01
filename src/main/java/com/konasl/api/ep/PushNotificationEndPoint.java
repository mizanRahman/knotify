package com.konasl.api.ep;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mac on 7/28/16.
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class PushNotificationEndPoint {

    @RequestMapping("/push")
    public ResponseEntity<String> sendPush() {
        log.debug("sending push message");
        return ResponseEntity.ok("push sent...");
    }
}
