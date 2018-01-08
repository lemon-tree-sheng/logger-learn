package org.sheng.logger;

import lombok.extern.slf4j.Slf4j;

/**
 * @author shengxingyue, created on 2018/1/8
 */

/**
 * 当使用 lombok 的时候需要带上具体依赖包，@slf4j 只是动态加上了获取日志对象的代码，具体依赖 lombok 并没有带上
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("hello");
        log.warn("world");
    }
}
