package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest01 {
    @Test
    public void test01(){
        ApplicationContext app= new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao itemsDao = (ItemsDao) app.getBean(ItemsDao.class);
        Items items = itemsDao.findById(1);
        System.out.println(items);
    }
}
