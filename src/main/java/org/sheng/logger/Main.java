package org.sheng.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author shengxingyue, created on 2018/1/8
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("hello");
        logger.warn("world");
    }
}
