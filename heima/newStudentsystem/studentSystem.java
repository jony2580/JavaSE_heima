package com.heima.newStudentsystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class studentSystem {
    public static void main(String[] args) {

        ArrayList<User> list=new ArrayList<>();
        ArrayList<student> list1=new ArrayList<>();

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1.登录 2.注册 3.忘记密码 4.退出系统");
            Scanner sc=new Scanner(System.in);
            String choice=sc.next();
            switch(choice){
                case "1"-> {
                    boolean flag=enter(list);
                    if(flag){
                        boolean back=studentInfo(list1);
                    }
                }
                case "2"-> enroll(list);
                case "3"-> forgetPassword(list);
                case "4"-> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("输入无效数字");
            }
        }
    }

    //登录
    public static boolean enter(ArrayList<User> list){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("请输入用户名：");
            String userName=sc.next();
            int index=getIndex(userName,list);
            if(index<0){
                System.out.println("用户名未注册，请先注册！！！");
                return false;
            }

            System.out.println("请输入密码：");
            String passWord=sc.next();

            //录入并判断验证码
            while (true) {
                String ver=verification();
                System.out.println("验证码："+ver);
                System.out.print("请输入验证码：");
                String inputVer=sc.next();

                if(inputVer.equals(ver)){
                    System.out.println("验证码输入正确！！！");
                    break;
                }else{
                    System.out.println("验证码输入错误，请重新输入！！！");
                }
            }

            //判断用户名和密码是否正确，有3次机会
            String getName=list.get(index).getUsername();
            String getPassword=list.get(index).getPassword();
            if(userName.equals(getName)&&passWord.equals(getPassword)){
                System.out.println("用户名和密码输入正确！！！");
                return true;
            }else{
                System.out.println("用户名或密码输入错误，请重新输入，你还有"+(2-i)+"次机会");
                continue;
            }
        }
        return false;
    }

    //注册
    public static void enroll(ArrayList<User> list){
        //利用空参构造先创建学生对象
        User u=new User();

        Scanner sc=new Scanner(System.in);

        //输入用户名
        while (true) {
            System.out.println("请输入用户名");
            String userName=sc.next();
            int index=getIndex(userName,list);
            //判断用户名是否唯一
            if(index<0){
                //用户名长度是否在3~15
                if(userName.length()<=15&&userName.length()>=3){
                    boolean flag=checkUser(userName);
                    //用户名只能是字母加数字的组合，且不能是纯数字
                    if(flag){
                        u.setUsername(userName);
                        System.out.println("用户名输入成功");
                        break;
                    }
                    else{
                        System.out.println("用户名只能是字母加数字的组合，且不能是纯数字，请重新输入");
                    }
                }else{
                    System.out.println("用户名长度必须在3~15位之间,请重新输入");
                }
            }else{
                System.out.println("输入用户名已存在，请重新输入");
            }
        }

        //输入密码
        while (true) {
            System.out.println("请输入密码：");
            String passWord=sc.next();
            System.out.println("请再次输入密码：");
            String secpassWord=sc.next();

            //判断两次密码是否一致
            if(passWord.equals(secpassWord)){
                u.setPassword(passWord);
                System.out.println("密码输入成功!!!");
                break;
            }
            else{
                System.out.println("密码输入不一致，请重新输入");
            }
        }

        //身份证输入
        while(true){
            System.out.println("请输入身份证号码");
            String personid=sc.next();
            //身份证号码要求18位且第一位数字不能是0
            if(personid.length()==18&&personid.charAt(0)!='0'){
                boolean flag=checkPersonid(personid);
                //身份证号码前17位是否都是数字，最后一位可以是数字，也可以是大小写x
                if(flag){
                    u.setPersonid(personid);
                    System.out.println("身份证录入成功！！！");
                    break;
                }else{
                    System.out.println("身份证号码要求前17位是否都是数字，最后一位可以是数字，也可以是大小写x，请重新输入");
                }
            }else{
                System.out.println("身份证号码要求18位且第一位数字不能是0，请重新输入");
            }
        }

        //输入手机号码
        while(true){
            System.out.println("请输入电话号码");
            String phoneNumber=sc.next();
            //电话号码要求11位且第一位数字不能是0
            if(phoneNumber.length()==11&&phoneNumber.charAt(0)!='0'){

                //电话号码必须都是数字
                int count=0;
                for(int i=0;i<phoneNumber.length();i++){
                    if(phoneNumber.charAt(i)>='0'&&phoneNumber.charAt(i)<='9'){
                        count++;
                    }
                }

                if(count==11){
                    u.setPhoneNumber(phoneNumber);
                    System.out.println("电话号码录入成功！！！");
                    break;
                }else{
                    System.out.println("电话号码必须都是数字，请重新输入");
                }

            }else{
                System.out.println("电话号码要求11位且第一位数字不能是0，请重新输入");
            }
        }

        list.add(u);
        System.out.println("注册成功！！！");

    }

    //忘记密码
    public static void forgetPassword(ArrayList<User> list){
        System.out.println("请输入用户名：");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();

        int index =getIndex(name,list);
        if(index<0){
            System.out.println("用户名不存在，未注册！！！");
        }else{
            System.out.print("请录入身份证号：");
            String personid=sc.next();
            System.out.print("请录入电话号码：");
            String phoneNumber=sc.next();

            String getPersonid=list.get(index).getPersonid();
            String getPhonenumber = list.get(index).getPhoneNumber();
            if(personid.equals(getPersonid)&&phoneNumber.equals(getPhonenumber)){
                System.out.print("信息正确，请输入新密码：");
                String newName=sc.next();
                //获取当前要修改的对象密码并进行修改
                list.get(index).setPassword(newName);
                System.out.println("新密码输入成功！！！");
            }else{
                System.out.println("账号信息不匹配，修改失败！！！");
            }
        }
    }

    //验证码
    public static String verification(){

        //创建一个空白可变字符串对象
        StringBuilder sb=new StringBuilder();
        //在字符串中存入字母数字
        for (int i = 0; i < 62; i++) {
            if(i<26){
                //a~z
                sb.append((char)(97+i));
            }else if(i>=26&&i<52){
                //A~Z
                sb.append((char)(65+i-26));
            }else{
                //0~9
                sb.append((char)(48+i-52));
            }
        }

        //获取验证码
        String str=sb.toString();
        String sec="";
        Random r=new Random();
        int count1=0;//验证码中数字的数量
        int count2=0;//验证码中字母的数量
        for (int i = 0; i < 5; i++) {
            //大小写字母+数字
            int number=r.nextInt(62);
            //只有大小写字母
            int number1=r.nextInt(52);
            //只有数字
            int number2=r.nextInt(10)+52;

            if(str.charAt(number)>='0'&&str.charAt(number)<='9')
                count1++;

            if(count1==1){
                sec+=str.charAt(number);
            }else if(count2==4){
                sec+=str.charAt(number2);
            }else{
                sec+=str.charAt(number1);
                count2++;
            }
        }
        return sec;
    }

    //检查身份证号码前17位是否都是数字，最后一位可以是数字，也可以是大小写x
    public static boolean checkPersonid(String personid) {
        int count = 0;
        for (int i = 0; i < personid.length() - 1; i++) {
            if (personid.charAt(i) <= '9' && personid.charAt(i) >= '0')
                count++;
            else
                return false;
        }

        if (count==17 && (personid.charAt(17)=='x' || personid.charAt(17)=='X' || (personid.charAt(17)<='9' && personid.charAt(17)>='0'))) {
            return true;
        }else{
            return false;
        }
    }

    //检查用户名是否是字母加数字的组合，且不能是纯数字，是返回true
    public static boolean checkUser(String userName){
        int count=0;
        for (int i = 0; i < userName.length(); i++) {
            if((userName.charAt(i)<='z'&&userName.charAt(i)>='a')||(userName.charAt(i)<='Z'&&userName.charAt(i)>='A')||(userName.charAt(i)<='9'&&userName.charAt(i)>='0'))
            {
                if((userName.charAt(i)<='z'&&userName.charAt(i)>='a')||(userName.charAt(i)<='Z'&&userName.charAt(i)>='A')){
                    count++;
                }
            }else{
                return false;
            }
        }
        if(count>0){
            return true;
        }else {
            return false;
        }
    }

    //判断登录系统中是否包含此用户名，存在返回true
    public static boolean contains(String userName,ArrayList<User> list){
        return getIndex(userName,list)>=0;
    }
    //获取登录系统中是否存在的用户名索引，不存在返回-1
    public static int getIndex(String userName,ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            User pe=list.get(i);
            String name=pe.getUsername();
            if(userName.equals(name)){
                return i;
            }
        }
        return -1;
    }




    //学生信息系统
    public static boolean studentInfo(ArrayList<student> list){
        loop:while (true) {
            System.out.println("--------------------学生管理系统---------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.返回登录界面");
            System.out.println("6.退出系统");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> chargeStudent(list);
                case "4" -> quaryStudent(list);
                case "5" -> {
                    return true;
                }
                case "6" -> {
                    System.out.println("退出系统");
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
            boolean flag=containsInfo(id,list);
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

        //将对象添加到集合中
        list.add(info);
        System.out.println("信息录入成功！！！");
    }

    //删除学生
    public static void deleteStudent(ArrayList<student> list){
        System.out.println("请输入删除学生的id");
        Scanner sc=new Scanner(System.in);
        String id=sc.next();
        int index=getIndexInfo(id,list);
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

        int index =getIndexInfo(id,list);

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

    //判断信息系统中id是否存在
    public static boolean containsInfo(String id,ArrayList<student> list){
        /*for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
                return true;
            }
        }
        return false;*/
        return getIndexInfo(id,list)>=0;
    }

    //返回信息系统中id存在的索引，不存在返回-1
    public static int getIndexInfo(String id,ArrayList<student>list){
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
