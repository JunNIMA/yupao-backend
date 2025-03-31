package com.yupi.yupao.service;


import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.redisson.api.RList;
import org.redisson.api.RLock;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

@SpringBootTest
public class RedissonTest {

    @Resource
    private RedissonClient redissonClient;

    @Test
    void test(){
        //list 数据存在本地JVM内存中
        List<String> list = new ArrayList<>();
        list.add("yupi");
        System.out.println("list: " + list.get(0));
        list.remove(0);

        // 数据存在 redis 的内存中
        RList<String> rlist = redissonClient.getList("test-list");
        rlist.add("yupi");
        System.out.println("rlist: " + rlist.get(0));
        rlist.remove(0);

        //map
        Map<String,Integer> map = new HashMap<>();
        map.put("yupi",10);
        map.get("yupi");

        RMap<String,Integer> rmap = redissonClient.getMap("test-map");
        rmap.put("yupi",10);
        rmap.get("yupi");


    }

    @Test
    void testWatchDog() {
        RLock lock = redissonClient.getLock("yupao:precachejob:docache:lock");
            // 只有一个线程能获取到锁
        try {
            if (lock.tryLock(0, -1, TimeUnit.MILLISECONDS)) {
                sleep(10000000);
                System.out.println("getLock " + Thread.currentThread().getId());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            // 只能释放自己的锁
            if(lock.isHeldByCurrentThread()){
                System.out.println("unLock: " + Thread.currentThread().getId());
                lock.unlock();
            }
        }

    }

}
