package com.kevin.console.utils.entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by msi on 2017/2/16.
 */
public class StratService {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"services.xml", "daos.xml"});
    }

}
