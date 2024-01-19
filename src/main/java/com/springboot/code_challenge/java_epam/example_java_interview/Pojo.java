package com.springboot.code_challenge.java_epam.example_java_interview;

import java.util.HashMap;
import java.util.Map;

class Pojo{
    private String value;
    private Integer length;

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
//getter, setter for length

    public static void main(String[] args){
        Map<Pojo, Integer> map = new HashMap();
        Pojo key = new Pojo();
        key.setValue("abc");
        map.put(key, 1);
        key.setLength(3);
        Integer result = map.get(key);
        System.out.println(result);
    }


}
