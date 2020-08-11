package br.com.cbm.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/")
    public String index(){
        logger.trace("A TRACE Menssage");
        logger.debug("A Debug Menssage");
        logger.info("An Info Menssage");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "Check out the Logs to see ";
    }
}
