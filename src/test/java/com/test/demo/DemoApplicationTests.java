package com.test.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    List<Transation> transations;

    /**
     * 1.找出2011年发生的所有交易，并按交易额排序（低到高）
     * 2.交易员都在那些不同城市工作过
     * 3。查找所有来自剑桥的交易员并按姓名排序
     * 4.返回所有交易员姓名的字符串，按字母顺序排序
     * 5.有没有交易员在米兰工作
     * 6.打印所有生活在剑桥的交易员的所有交易额
     * 7.所有交易中，最高的交易额是多少
     * 8.找到交易额最少的交易
     */

    @Test
    void contextLoads() {
    }

    @Test
    void setUp() throws Exception {
         Trader raoul = new Trader("Raoul",CityEnum.CITY_JQ);
         Trader mario = new Trader("Mario",CityEnum.CITY_JQ);
         Trader alan = new Trader("Alan",CityEnum.CITY_JQ);
         Trader brian = new Trader("Brian",CityEnum.CITY_JQ);

        transations = Arrays.asList(
            new Transation(brian,2011,300),
            new Transation(raoul,2012,1000),
            new Transation(raoul,2011,400),
            new Transation(mario,2012,710),
            new Transation(mario,2011,700),
            new Transation(alan,2011,950)
        );
    }

    List<Transation> getTransationsByYear(Integer year){

        return null;
    }




}


