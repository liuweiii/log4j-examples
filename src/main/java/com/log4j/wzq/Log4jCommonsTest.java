package com.log4j.wzq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Author:wangzhenqing
 * @Date:2015年03月17日17:39:21
 * @Description:log4j和commons-logging 结合使用
 */
public class Log4jCommonsTest {
    public static void main(String[] args) throws Exception{
        Log4jCommonsTest log4jCommonsTest = new Log4jCommonsTest();
        log4jCommonsTest.printInfo();
    }

    public void printInfo() {
        Log log = LogFactory.getLog(Log4jCommonsTest.class);
        log.debug("debugInfo");
        log.info("info");
        log.error("errorInfo");
        log.fatal("fatalInfo");
        log.warn("warnInfo");
        System.out.println(log.getClass());
    }
}
