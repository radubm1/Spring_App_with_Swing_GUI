package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class DemoApplication {

    private static ApplicationContext context;
    private static List<Furnizor> fz = new ArrayList<>();

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("Beans.xml");

        loadAllBeans();

        /*for(Furnizor f : fz)
            System.out.println(f.getNume() + "|"+ f.getOras());*/

        new Tree(fz);

    }

    public static void loadAllBeans() {
        String[] allBeanNames = context.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            //System.out.println(beanName);
            Furnizor i = (Furnizor) context.getBean(beanName);
            fz.add(i);
        }
    }

}
