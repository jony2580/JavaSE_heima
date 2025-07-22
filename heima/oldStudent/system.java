package com.heima.oldStudent;

import java.util.ArrayList;
import java.util.Scanner;
public class system {
    public static void main(String []args){

        ArrayList<student> list =new ArrayList<>();
        loop:while (true) {
            System.out.println("--------------------学生管理系统---------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> chargeStudent(list);
                case "4" -> quaryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    //break loop;
                    System.exit(0);
                }
                default -> System.out.println("输入错误");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<student> list){
        Scanner sc=new Scanner(System.in);
        student info=new student();

        while (true) {
            System.out.println("输入学生id");
            String id=sc.next();
            boolean flag=contains(id,list);
            if(flag){
                System.out.println("id已存在，请重新输入");
            }else{
                info.setId(id);
                break;
            }
        }

        System.out.println("输入学生姓名");
        info.setName(sc.next());
        System.out.println("输入学生年龄");
        info.setAge(sc.nextInt());
        System.out.println("输入学生地址");
        info.setAddress(sc.next());

        list.add(info);
        System.out.println("信息录入成功！！！");
    }

    //删除学生
    public static void deleteStudent(ArrayList<student> list){
        System.out.println("请输入删除学生的id");
        Scanner sc=new Scanner(System.in);
        String id=sc.next();
        int index=getIndex(id,list);
        if(index<0){
            System.out.println("删除id不存在");
        }else{
            list.remove(index);
            System.out.println("删除成功");
        }
    }

    //改变学生信息
    public static void chargeStudent(ArrayList<student> list){
        System.out.println("请输入要修改学生的id");
        Scanner sc=new Scanner(System.in);
        String id=sc.next();

        int index =getIndex(id,list);

        if(index<0){
            System.out.println("id不存在");
        }else{
            student stu=list.get(index);

            System.out.println("输入新名字");
            String newName=sc.next();
            stu.setName(newName);

            System.out.println("输入新年龄");
            int newAge=sc.nextInt();
            stu.setAge(newAge);

            System.out.println("输入新地址");
            String newAddress=sc.next();
            stu.setAddress(newAddress);

            System.out.println("修改完成");
        }
    }

    //查询学生
    public static void quaryStudent(ArrayList<student> list){
        if(list.size()==0){
            System.out.println("无内容，请添加学生信息");
            return;
        }
        System.out.println("id\t\tname\tage\taddress");
        for(int i=0;i<list.size();i++){
            student s=list.get(i);
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }
    }

    //判断id是否存在
    public static boolean contains(String id,ArrayList<student> list){
        /*for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
                return true;
            }
        }
        return false;*/
        return getIndex(id,list)>=0;
    }

    //返回id存在的索引，不存在返回-1
    public static int getIndex(String id,ArrayList<student>list){
        for(int i=0;i<list.size();i++){
            student stu = list.get(i);
            String quaryId=stu.getId();
            if(id.equals(quaryId)){
                return i;
            }
        }
        return -1;
    }
}
