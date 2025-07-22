package com.heima.main;

public class User {
    private String name;
    private String gender;
    private int age;
    private int password;
    public User(){}//空参构造
    public User(String name, String gender, int age, int password){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.password=password;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public String getGender()
    {
        return gender;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }public void setPassword(int password)
    {
        this.password=password;
    }
    public int getPassword()
    {
        return password;
    }

}
