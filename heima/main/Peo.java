package com.heima.main;

public class Peo {

    private String name;
    private int age;
    private String sex;

    public Peo(){
        System.out.println("diaoyongle");
    }
    public Peo(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age)
    {
        if(age>=18&&age<=30){
            this.age=age;
        }else{
            System.out.println("feifa");
        }
    }
    public int getAge() {
        return age;
    }
    public void setSex(String sex) {
        this.sex=sex;
    }
    public String getSex() {
        return sex;
    }
    public void sleep(){
        System.out.println("shuijiao");
    }
    public void play(){
        System.out.println("play");
    }
}
