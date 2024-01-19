package com.springboot.code_challenge.java_epam.example_java_interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

final class PojoFinal {
    private String value;
    private Integer length;

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

//getter, setter for length
//hascode and equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PojoFinal pojoFinal = (PojoFinal) o;
        return Objects.equals(value, pojoFinal.value) && Objects.equals(length, pojoFinal.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, length);
    }


    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }


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
