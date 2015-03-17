package com.log4j.wzq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Author:wangzhenqing
 * @Date:2015年03月17日16:48:06
 * @Description:单独使用commons-logging
 */
public class OnlyCommonsLogTest {
    public static void main(String[] args) {
        OnlyCommonsLogTest onlyCommonsLogTest = new OnlyCommonsLogTest();
        onlyCommonsLogTest.printInfo();
    }

    public void printInfo() {
        Log log = LogFactory.getLog(OnlyCommonsLogTest.class);
        log.debug("debugInfo");
        log.info("info");
        log.error("errorInfo");
        log.fatal("fatalInfo");
        log.warn("warnInfo");
        System.out.println(log.getClass());
    }
}
