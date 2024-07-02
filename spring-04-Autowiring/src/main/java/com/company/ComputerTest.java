package com.company;

import com.company.config.PcConfig;
import com.company.streotype_annotation.PC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        PC myPc = container.getBean(PC.class);

       // System.out.println(myPc.getTheCase().getDimensions().getDept());

    }
}
