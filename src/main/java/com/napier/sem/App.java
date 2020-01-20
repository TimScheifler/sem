package com.napier.sem;

import org.apache.log4j.spi.LoggerFactory;

import java.util.logging.Logger;

public class App {

    private final static Logger LOG = Logger.getLogger(String.valueOf(App.class));
    public static void main(String[] args){
        LOG.info("Boo yah!");
    }
}
