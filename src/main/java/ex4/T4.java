package ex4;

import java.util.Map;

public class T4 {
    public static void main(String[] args) {
        MyHashMap<String , String> map =new MyHashMap<>();
        System.out.println(map.isEmpty());
        map.put("aa","bb");
        map.put("ss","dd");
        map.put("ee","pp");
        map.put("qq","ll");
        map.put("ii","mm");
        map.put("kk","gg");
        map.put("oo","zz");
        map.findAll();
        System.out.println(map.isEmpty());
        map.setValue("kk","sina");
        map.findAll();

    }
}
