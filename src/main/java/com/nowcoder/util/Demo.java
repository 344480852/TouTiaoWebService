package com.nowcoder.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Demo {
    public static void main(String[] args){
        try{
            JedisPool pool=new JedisPool("127.0.0.1", 6379);
            Jedis j=pool.getResource();
            j.set("hello", "world");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
