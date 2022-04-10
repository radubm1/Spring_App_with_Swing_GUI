package com.example.demo;

import com.jakewharton.fliptables.FlipTableConverters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoApplication {

    private static ApplicationContext context;
    private static List<Livrare> liv;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("Beans.xml");

        //loadAllBeans();

        liv = Arrays.asList((Livrare)context.getBean("liv1"), (Livrare)context.getBean("liv2"));

        int i=100;
        for (Livrare l : liv)
            l.setCant(i++);

        //System.out.println(FlipTableConverters.fromIterable(liv, Livrare.class));
        new Tree(liv);

    }

    public static void loadAllBeans() {
        String[] allBeanNames = context.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            //System.out.println(beanName);
            Furnizor i = (Furnizor) context.getBean(beanName);
            //fz.add(i);
        }
    }

}
