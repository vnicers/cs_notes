package me.tanwei.example.proxy.bean;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by kelp on 2017/6/17.
 */
@Slf4j
public class Tanwei implements Person {
    @Override
    public String getName() {
        return "tanwei";
    }

    @Override
    public String getSex() {
        return "男";
    }

    @Override
    public String findHouse() {
        return "想找一个一室一厅价格在200元以内的。";
    }
}
