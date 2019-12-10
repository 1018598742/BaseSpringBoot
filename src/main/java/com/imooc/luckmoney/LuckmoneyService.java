package com.imooc.luckmoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class LuckmoneyService {

    @Autowired
    private LuckmoneyRepository repository;

    /**
     * 事务，数据库中限制了长度，有一个不符合，都不会添加进数据库中。
     */
    @Transactional
    public void createTwo(){
        Luckmoney luckmoney1 = new Luckmoney();
        luckmoney1.setProducer("小米");
        luckmoney1.setMoney(new BigDecimal("520"));
        repository.save(luckmoney1);


        Luckmoney luckmoney2 = new Luckmoney();
        luckmoney2.setProducer("小米");
        luckmoney2.setMoney(new BigDecimal("1314"));
        repository.save(luckmoney2);
    }
}
