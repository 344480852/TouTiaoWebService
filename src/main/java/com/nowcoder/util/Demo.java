package com.nowcoder.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by 344480852 on 2016/8/4.
 */
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
