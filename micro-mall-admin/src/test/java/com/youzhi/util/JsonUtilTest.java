package com.youzhi.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cwj
 * @date 2020/1/6 9:47
 * JsonUtilTest测试类
 */
@SpringBootTest
public class JsonUtilTest {
    @Test
    public void test01(){
        A a = new A();
        a.setA(1);
        a.setB(2.35d);
        a.setC("string");
        List aList = new ArrayList();
        aList.add("d1");
        aList.add("d2");
        a.setD(aList);
        System.out.println(JsonUtil.objectToJson(a)); //可以解析list类型

        String str = "{\"a\":1,\"b\":2.35,\"c\":\"string\",\"d\":[\"d1\",\"d2\"]}";
        System.out.println(JsonUtil.jsonToPojo(str,A.class));

        List as = new ArrayList();
        as.add(a);
        as.add(a);
        System.out.println(JsonUtil.objectToJson(as));

        String str2 = "[{\"a\":1,\"b\":2.35,\"c\":\"string\",\"d\":[\"d1\",\"d2\"]},{\"a\":1,\"b\":2.35,\"c\":\"string\",\"d\":[\"d1\",\"d2\"]}]";
        System.out.println(JsonUtil.jsonToList(str2,A.class));

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class A{
        Integer a;
        Double b;
        String c;
        List d;

        @Override
        public String toString() {
            return "A{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c='" + c + '\'' +
                    ", d=" + d +
                    '}';
        }
    }
}
