package com.michelle.springanalysis;

import com.michelle.springanalysis.bean.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        context.setAllowBeanDefinitionOverriding(true);
        context.setAllowCircularReferences(true);  //allow circular references
        SimpleBean bean = context.getBean(SimpleBean.class);
        bean.send();
        context.close();
    }

    public class ClassA{
        private ClassB b;

        public ClassA(ClassB b) {
            this.b = b;
        }
    }

    public class  ClassB{
        private ClassB b;

        public ClassB(ClassB b) {
            this.b = b;
        }
    }

    public class ClassC{
        private ClassA a;

        public ClassC(ClassA a) {
            this.a = a;
        }
    }
}
