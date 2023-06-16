package com.how2java.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.how2java.service.ProductService;
import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
public class TestSpring {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        ProductService ps=(ProductService) context.getBean("s");
        ps.doSomeService();

        Product p=(Product) context.getBean("p");
        System.out.println(p.getName());
        System.out.println(p.getCategory().getName());

        Category c=(Category)context.getBean("c");
        System.out.println(c.getName());
        System.out.println(c.getId());
    }
}
