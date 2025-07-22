package com.heima.main;
/*public class Main{
    public static void Student(String[] args){
        System.out.println("Hello World");
        System.out.println("name"+"age");
        System.out.println("nam"+"12");
        System.out.println("name\t"+"age");
        System.out.println("nam\t\t"+"12");


        int a=1,b=2,c=4;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        long x=111111L;
        System.out.println(x);
        float y=11.1F;
        System.out.println(y);
        double z=11.22;
        System.out.println(z);
        boolean bool=true;
        System.out.println(bool);
        char c0='话';
        System.out.println(c0);

        String c1="nih";
        System.out.println(c1);
    }
}*/

/*import java.util.Scanner;
public class Main{
    public static void Student(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入整数");
        int i=sc.nextInt();
        System.out.println(i);
    }
}*/

/*import java.util.Scanner;
public class Main{
    public static void Student(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("111111");
        int i=sc.nextInt();
        System.out.println(i);

        System.out.println("222222");
        int x=sc.nextInt();
        System.out.println(x);

        System.out.println("33333");
        int y=sc.nextInt();
        System.out.println(y);
        System.out.println(i+x+y);
    }
}*/

/*
import java.util.Scanner;
public class Main {
    public static void Student(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println(i);
    }
}
*/
/*数字6是一个真正伟大的数字，键盘录入两个整数。
如果其中一个为 6，最终结果输出true。
如果它们的和为 6的倍数。最终结果输出true。
其他情况都是false。*/

/*import java.util.Scanner;
public class Main{
    public static void Student(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        boolean result= i==6 || j==6;
        boolean result1=(i+j)%6==0;
        System.out.println(result);
        System.out.println(result1);
    }
}*/

/*import java.util.Scanner;
public class Main{
    public static void Student(String[] args){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        String result=number1==number2 ? "相同" : "不同";
        System.out.println(result);
    }
}*/


/*public class Main{
    public static void Student(String[] args){
        int i=10;
        int j=111;
        int k=123;
        int result=(i>j ? i : j)<k ? k : (i>j ? i : j );
        System.out.println(result);
    }
}*/

/*
import java.util.Scanner;
public class Main{
    public static void Student(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i>=100&&i<=1111){
            System.out.println("yes");
        }
    }
}
*/

/*import java.util.Scanner;
public class Main{
    public static void Student(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        switch(i){
            case 1:
                System.out.println("hhh");
                break;
            case 2:
                System.out.println("jjj");
                break;
            default:
                System.out.println("nnn");
                break;
        }

    }
}*/

/*import java.util.Scanner;
public class Main{
    public static void Student(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        switch(i){
            case 1 -> System.out.println("hhh");
            case 2 -> System.out.println("jjj");
            default -> System.out.println("nnn");
        }

    }
}*/


/*import java.util.Scanner;
public class Main{
    public static void Student(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int temp=i;
        int ge=0;
        int new_number=0;
        while(i!=0){
            ge= i%10;
            i /=10;
            new_number=new_number*10+ge;
        }
        if(new_number==temp){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        System.out.println(temp==new_number);

    }
}*/
/*
public class Main{
    public static void Student(String[] args) {
        //编程序, 计算 1~10 之间的各个乘数的阶乘, 并将结果输出到屏幕上
        int fac=1;
        for(int i=1;i<=10;i++) {
            fac *= i;
            System.out.println(i + "的阶乘为：" + fac);
        }

    }
}
*/

/*import java.util.Scanner;
public class Main{
    public static void Student(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int count=0;
        while(i>=j){
            i-=j;
            count++;
        }
        System.out.println("商是"+count);
        System.out.println("余数是"+i);
    }
}*/


/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=0;
        for(i=1;i<=num;i++){
            if(num<i*i){
                System.out.println(i-1);
                break;
            }
        }
    }
}*/


/*
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void Student(String[] args) {
        Random r =new Random();
        int num= r.nextInt(567);
        System.out.println(num);
        Scanner sc=new Scanner(System.in);

        boolean flag=true;
        while(flag){
            int gue= sc.nextInt();
            if(gue<num){
                System.out.println("小了");
            } else if (gue>num) {
                System.out.println("大了");
            }else{
                System.out.println("yes");
                break;
            }
        }

    }
}
*/




/*public class Main {
    public static void Student(String[] args) {
        int []arr={1,2,3,422,5,22,44};
        int []arr1= new int[10];
        System.out.println(arr.length);
        System.out.println(arr);
        System.out.println(arr1[1]);
    }
}*/

/*public class Main {
    public static void Student(String[] args) {
        int []arr={1,2,3999,422,5,22,44};
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                arr[i+1]=arr[i];
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}*/

/*需求:生成10个1~100之间的随机数存入数组。
1)求出所有数据的和
2)求所有数据的平均数
3)统计有多少个数据比平均值小*/

/*
import java.util.Random;
public class Main {
    public static void Student(String[] args) {
        Random r=new Random();

        int []arr=new int[10];
        int add=0;
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100)+1;
            arr[i]=number;
            add+=arr[i];
        }
        int ave=add/arr.length;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(ave>arr[i]){
                count++;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n"+add);
        System.out.println(ave);
        System.out.println(count);
    }
}
*/

/*public class Main {
    public static void Student(String[] args) {
        int []arr={1,2,3,4,5};
        for (int i = arr.length; i > 1; i--) {
            for (int j = 0; j < i-1; j++) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}*/

/*public class Main {
    public static void Student(String[] args) {
        int []arr={1,2,3,4,5};
        for (int i=0,j=arr.length-1; i <j; i++,j--) {
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");//5 4 3 2 1
        }
    }
}*/

/*import java.util.Random;
public class Main {
    public static void Student(String[] args) {
        Random r=new Random();
        int []arr={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            int num=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[num];
            arr[num]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}*/

/*
//需求:在方法里面定义两个变量并求和打印
public class Main {
    public static void Student(String[] args) {
        add1();
        add2();
    }
    public static void add1(){
        int i=1;
        System.out.println(i);
    }
    public static void add2(){
        int i=2;
        System.out.println(i);
    }
}
*/


/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        add(a,b);
    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
}*/

/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a,b);
        System.out.println(sum);
        System.out.println(add(a,b));
    }
    public static int add(int a,int b){
        return a+b;
    }
}*/

//需求:设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如:[11,22,33,44,55]

/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        int []arr={1,2,3,4,5};
        ever(arr);
    }
    public static void ever(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}*/

//需求:设计一个方法求数组的最大值，并将最大值返回
/*public class Main {
    public static void Student(String[] args) {
        int []arr={1,2,33,4,5};
        System.out.println(max(arr));
    }
    public static int max(int []arr){
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
}*/

//定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
/*public class Main {
    public static void Student(String[] args) {
        int []arr={1,2,33,4,5};
        int number=444;
        boolean re=shi(number,arr);
        System.out.println(re);
    }
    public static boolean shi(int number,int []arr){
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            if(number==arr[i]){
                return true;
            }
        }
        return false;
    }
}*/


/*需求:
定义一个方法copyOfRange(int[] arr,int from, int to)
功能:
将数组arr中从索引from(包含from)开始
到索引to结束(不包含to)的元素复制到新数组中
将新数组返回。*//*
public class Main {
    public static void Student(String[] args) {
        int []arr={1,2,3,44,55,4,5,2,2,1,1,445};
        int from=3;
        int to=9;
        int []copy=copyOfRange(arr,from,to);
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
    public static int[] copyOfRange(int[]arr,int form,int to){
        int []copyarr=new int[to-form];
        for(int i=0;i<to-form;i++){
            copyarr[i]=arr[form+i];
        }
        *//*int num=0;
        for(int i=form;i<to;i++)
        {
            copyarr[num]=arr[i];
            num++;
        }*//*
        return copyarr;
    }
}*/


/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        Scanner sc=new Scanner(System.in);
        int up=sc.nextInt();
        int down=sc.nextInt();
        int i=0;
        for (int j = up; j <= down; j++) {
            int qwer=0;
            if(j==1){
                continue;
            }
            boolean flag=true;
            for(i=1;i<=j;i++){//求数字的平方根
                if (j==1){
                    qwer=1;
                }
                if(j<i*i){
                    qwer=i-1;
                    break;
                }
            }
            for (int k = 2; k <= qwer; k++) {//判断是否为素数
                if(j%k==0){
                    flag=false;;
                    break;
                }
            }
            if(flag){
                System.out.println(j);
            }
        }
    }
}*/

/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        Scanner sc=new Scanner(System.in);
        int up=sc.nextInt();
        int down=sc.nextInt();
        for (int j = up; j <= down; j++) {
            int qwer=0;
            int count=0;
            if(j==1){
                continue;
            }
            boolean flag=true;
            for(int i=1;i<=j;i++){//求数字的平方根
                if (j==1){
                    qwer=1;
                }
                if(j<i*i){
                    qwer=i-1;
                    break;
                }
            }
            for (int k = 1; k <= qwer; k++) {//判断是否为素数

                if(j%k==0){
                    count++;;
                }

            }
            if(count>1){
                flag=false;
            }
            if(flag){
                System.out.println(j);
            }
        }
    }
}*/
//验证码
/*import java.util.Random;
public class Main {
    public static void Student(String[] args) {
        char[]chs=new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<26){
                chs[i]=(char)(97+i);
            }else{
                chs[i]=(char)(65+i-26);
            }
        }
        String sec="";
        Random r=new Random();
        for (int i = 0; i < 4; i++) {
            int num=r.nextInt(chs.length);
            sec+=chs[num];
        }
        int num1=r.nextInt(10);
        sec+=num1;
        System.out.println(sec);
    }
}*/


/*//在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。
//选手的最后得分为:去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
import java.util.Random;
public class Main{
    public static void Student(String[] args) {
        Random r=new Random();
        int []arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            int sco= r.nextInt(101);
            arr[i]=sco;
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.print(max);
        int min=111;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.print(min);
        System.out.println("\n");
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max||arr[i]==min){
                continue;
            }else {
                sum+=arr[i];
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        int average=sum/4;
        System.out.println(average);

    }

}*/

/*某系统的数字密码(大于0)。比如1983，采用加密方式进行传输
规则如下:
每位数加上5
再对10求余，
最后将所有数字反转，
得到一串新数。*//*
import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        int []arr=new int[count];
        int idex=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            int ge=temp%10;
            temp/=10;
            arr[idex]=ge;
            idex--;
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j]+=5;
            arr[j]%=10;
        }
        for (int k = 0,l=arr.length-1; k < l; k++,l--) {
            int lin=arr[k];
            arr[k]=arr[l];
            arr[l]=lin;
        }
        int re=0;
        for (int a = 0; a < arr.length; a++) {
            re=re*10+arr[a];
        }
        System.out.println(re);
    }
}*/

/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        int []arr=new int[count];
        int idex=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            int ge=temp%10;
            temp/=10;
            arr[idex]=ge;
            idex--;
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j]+=5;
            arr[j]%=10;
        }
        for (int k = 0,l=arr.length-1; k < l; k++,l--) {
            int lin=arr[k];
            arr[k]=arr[l];
            arr[l]=lin;
        }
        int re=0;
        for (int a = 0; a < arr.length; a++) {
            re=re*10+arr[a];
        }
        System.out.println(re);
        for (int k = 0,l=arr.length-1; k < l; k++,l--) {
            int lin=arr[k];
            arr[k]=arr[l];
            arr[l]=lin;
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>=5&&arr[j]<=9)
            {
                arr[j]=arr[j];
            }else if(arr[j]>=0&&arr[j]<=4){
                arr[j]+=10;
            }
            arr[j]-=5;
        }
        int or=0;
        for (int i = 0; i < arr.length; i++) {
            or=or*10+arr[i];
        }
        System.out.println(or);
    }
}*/


/*需求:
一个大V直播抽奖，奖品是现金红包，分别有{2，588，888，1000，10000}五个奖金。
请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
打印效果如下:(随机顺序，不一定是下面的顺序)
888元的奖金被抽出
588元的奖金被抽出
10000元的奖金被抽出
1000元的奖金被抽出
2元的奖金被抽出*/
/*
import java.util.Random;
public class Main {
    public static void Student(String[] args) {
        Random r=new Random();
        int []arr={2,588,888,1000,10000};
        for (int i = 0; i < arr.length; i++) {
            int num=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[num];
            arr[num]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}*/

/*import java.util.Random;
public class Main {
    public static void Student(String[] args) {
        Random r=new Random();
        int []arr={2,588,888,1000,10000};
        int []newarr=new int[arr.length];
        for (int i = 0; i < arr.length; ) {
            int num=r.nextInt(arr.length);
            int newnum=arr[num];
            while(stain(newarr,newnum))
            {
                newarr[i]=newnum;
                i++;
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
    public static boolean stain(int arr[],int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return false;
            }
        }
        return true;
    }
}*/

/*
import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void Student(String[] args)
    {
        Random r=new Random();
        //创建中奖号码数字
        int[] arr=creatNum();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        //创建输入号码
        int[] putarr=inputNum();
        //进行比较
        int redcount=0;
        int grecount=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[i]==putarr[j])
                {
                    redcount++;
                    break;
                }
            }
        }
        if(arr[arr.length-1]==putarr[putarr.length-1])
        {
            grecount++;
        }
        if(redcount ==6&&grecount==1)
        {
            System.out.println("恭喜你，中奖1000万");
        }else if(redcount ==6 && grecount == 0)
        {
            System.out.println("恭喜你，中奖500万");
        }else if(redcount ==5 && grecount == 1)
        {
            System.out.println("恭喜你，中奖3000");
        }else if((redcount ==5 && grecount == 0)||(redcount ==4&& grecount == 1))
        {
            System.out.println("恭喜你，中奖200");
        }else if((redcount ==4&& grecount==0)||(redcount ==3&& grecount == 1))
        {
            System.out.println("恭喜你，中奖10");
        }else if((redcount ==2&& grecount ==1)||(redcount ==1&& grecount ==1)||(redcount == 0 && grecount == 1))
        {
            System.out.println("恭喜你，中奖5");
        }else{
            System.out.println("谢谢参与，谢谢惠顾");
        }

    }
    public static int[] creatNum()
    {
        Random r=new Random();
        int[]arr=new int[7];
        //红色球1~33之间，创建6个
        for (int i = 0; i < arr.length-1; ) {
            int rednum=r.nextInt(33)+1;
            while(contain(arr,rednum))
            {
                arr[i]=rednum;
                i++;
            }
        }
        //绿色1-16,最后一个
        int grenum= r.nextInt(16)+1;
        arr[arr.length-1]=grenum;
        return arr;
    }
    public static int[] inputNum()
    {
        Scanner sc=new Scanner(System.in);
        int []putarr=new int[7];
        //输入红色
        for (int i = 0; i < putarr.length-1; ) {
            System.out.println("输入第"+(i+1)+"位红球");
            int input=sc.nextInt();
            if(input>0&&input<=33)
            {
                if(contain(putarr,input))
                {
                    putarr[i]=input;
                    i++;
                }
                else{
                    System.out.println("输入相同");
                }
            }else{
                System.out.println("输入错误");
            }
        }
        //输入绿色
        System.out.println("输入绿球");
        boolean flag=true;
        while(flag)
        {
            int inputgre=sc.nextInt();
            if(inputgre>0&&inputgre<=16)
            {
                putarr[putarr.length-1]=inputgre;
                flag=false;
            }else{
                System.out.println("输入错误");
            }
        }
        return putarr;
    }
    //让生成的随机变量不在数组里面重复
    public static boolean contain(int[]arr,int renum)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==renum)
                return false;
        }
        return true;
    }
}
*/

/*public class Main {
    public static void Student(String[] args) {
        int [][]arr={
                {11,232,31},
                {1,13,412},
                {12,33,12}
        };
        int addyear=0;
        for (int i = 0; i < arr.length; i++) {
            int[]newarr=arr[i];
            int sum=getnum(newarr);
            System.out.println(sum);
            addyear+=sum;
        }
        System.out.println(addyear);
    }
    public static int getnum(int[] newarr){
        int sum=0;
        for (int i = 0; i < newarr.length; i++) {
            sum+=newarr[i];
        }
        return sum;
    }
}*/

/*
public class Mai n {
    public static void Student(String []args){
        String s="jfskaljfk";
        int len =s.length();
        System.out.println(len);

        String ss=s.toUpperCase();
        System.out.println(ss);
    }
}
*/

/*public class Main{
    public static void Student(String[] args) {
        Peo hum=new Peo();
        hum.name="ni";
        hum.age=18;
        hum.sex="nan";
        System.out.println(hum.name);
        System.out.println(hum.age);
        System.out.println(hum.sex);
        hum.play();
        hum.sleep();
    }
}*/

/*
public class Main{
    public static void Student(String[] args) {
        Peo hum=new Peo();

        hum.setName("zhangsan");
        hum.setAge(19);
        hum.setSex("nan");

        System.out.println(hum.getName());
        System.out.println(hum.getAge());
        System.out.println(hum.getSex());

        hum.play();
        hum.sleep();
    }
}
*/

/*
public class Main{
    public static void Student(String[] args) {
        com.heima.test1.Peo hum=new com.heima.test1.Peo();
        com.heima.test1.Peo hums=new com.heima.test1.Peo("zzz",12,"nan");
        System.out.println(hums.getName());
        System.out.println(hums.getAge());
        System.out.println(hums.getSex());
        hum.play();
        hum.sleep();
    }
}
*/

/*public class Main{
    public static void Student(String[] args)
    {
        com.heima.test1.User pe=new com.heima.test1.User();
        com.heima.test1.User pe1=new com.heima.test1.User("zhang","nan",12,33);
        System.out.println(pe1.getName());
        System.out.println(pe1.getGender());
        System.out.println(pe1.getAge());
        System.out.println(pe1.getPassword());
    }
}*/

//字符串
/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();//123 1 + 回车
        System.out.println(num);//123

        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        System.out.println(line);//" 1"

    }
}*/

/*
import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        //键盘录入：
        //第一套体系:
        //nextInt(); 接收整数
        //nextDouble();接收小数
        //next();接收字符串
        //遇到空格，制表符，回车就停止接受。这些符号后面的数据就不会接受了

        //第二套体系：
        //nextLine();接收字符串
        //可以接收空格，制表符，遇到回车才停止接受数据


        */
/*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = sc.nextInt();
        System.out.println(num1);//123
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println(num2);*//*


 */
/*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");//abc bcd

        String str1 = sc.next();//abc
        System.out.println(str1);
        System.out.println("请输入第二个字符串");
        String str2 = sc.next();//bcd
        System.out.println(str2);*//*


 */
/*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");

        String line1 = sc.nextLine();//abc bcd
        System.out.println(line1);
        System.out.println("请输入第二个字符串");
        String line2 = sc.nextLine();
        System.out.println(line2);*//*



    }
}
*/


/*public class Main{
    public static void Student(String[] args){
        String s1=new String("aaa");
        System.out.println(s1);

        String s2=new String();
        System.out.println();

        char []s={'a','b','c'};
        String str=new String(s);
        System.out.println(str);

        byte []b={97,98,99};
        String bb=new String(b);
        System.out.println(bb);

        String a="abc";
        String b1="abc";
        String c=new String("abc");
        String d="ABC";
        System.out.println(a==b1);
        System.out.println(a==c);

        boolean result=a.equals(c);
        boolean r1=a.equalsIgnoreCase(d);
        boolean r2=a.equals(d);
        System.out.println(result);
        System.out.println(r1);
        System.out.println(r2);
    }
}*/

/*import java.util.ArrayList;
import java.util.StringJoiner;

public class Main{
    public static void Student(String[] args){
        String s1=new String("aaa");
        System.out.println(s1);

        String s2=new String();
        System.out.println();

        char []s={'a','b','c'};
        String str=new String(s);
        System.out.println(str);

        byte []b={97,98,99};
        String bb=new String(b);
        System.out.println(bb);

        String a="abc";
        String b1="abc";
        String c=new String("abc");
        String d="ABC";
        System.out.println(a==b1);
        System.out.println(a==c);

        boolean result=a.equals(c);
        boolean r1=a.equalsIgnoreCase(d);
        boolean r2=a.equals(d);
        System.out.println(result);
        System.out.println(r1);
        System.out.println(r2);
    }
}*/
/*public class Main{
    public static void Student(String[] args){
        String s1=new String("aaa");
        System.out.println(s1);

        String s2=new String();
        System.out.println();

        char []s={'a','b','c'};
        String str=new String(s);
        System.out.println(str);

        byte []b={97,98,99};
        String bb=new String(b);
        System.out.println(bb);

        String a="abc";
        String b1="abc";
        String c=new String("abc");
        String d="ABC";
        System.out.println(a==b1);
        System.out.println(a==c);

        boolean result=a.equals(c);
        boolean r1=a.equalsIgnoreCase(d);
        boolean r2=a.equals(d);
        System.out.println(result);
        System.out.println(r1);
        System.out.println(r2);
    }
}*/


/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        String rightsName="ll";
        String rightPassword="123";

        for (int i=0;i<3;i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("用户名");
            String userName=sc.next();
            System.out.println("密码");
            String userPassword=sc.next();

            if(userPassword.equals(rightPassword)&&userName.equals(rightsName))
            {
                System.out.println("yse");
                break;
            }else{
                if(i==2){
                    System.out.println("nono");
                }else{
                    System.out.println("no,have"+(2-i));
                }

            }
        }

    }
}*/

/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        System.out.println("输入：");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int big=0;
        int small=0;
        int num=0;
        int other=0;

        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z'){
                small++;
            }else if(c>='0'&&c<='9'){
                num++;
            }else if(c>='A'&&c<='Z'){
                big++;
            }else{
                other++;
            }
        }
        System.out.println(small);
        System.out.println(big);
        System.out.println(other);
        System.out.println(num);
    }
}*/

/*public class Main {
    public static void Student(String[] args) {
        int[]arr={1,2,3,3,3,4};
        String str=creatStr(arr);
        System.out.println(str);

    }
    public static String creatStr(int[]arr){
        String str="[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                str=str+arr[i]+"]";
            }else{
                str=str+arr[i]+",";
            }
        }
        return str;
    }

}*/

/*定义一个方法，实现字符串反转。
键盘录入一个字符串，调用该方法后，在控制台输出结果
例如，键盘录入 abc，输出结果 cba*/
/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        System.out.println("输入：");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        String reStr=reverse(str);
        System.out.println(reStr);

    }
    public static String reverse(String str){
        char[] c=new char[str.length()];
        for (int i = 0; i < c.length; i++) {
            c[i]=str.charAt(i);
        }
        for (int i = 0,j=c.length-1; i < j; i++,j--) {
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
        }
        System.out.println(c);
        String newstr=new String(c);
        return newstr;
    }
}*/

/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        System.out.println("输入：");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        String reStr=reverse(str);
        System.out.println(reStr);

    }
    public static String reverse(String str){
        String s="";
        for (int i = str.length()-1; i >=0; i--) {
            s+=str.charAt(i);
        }
        return s;
    }
}*/

/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        while (true) {
            if(number>=0||number<10000000){
                break;
            }else{
                System.out.println("no");
            }
        }

        String num="";
        while (true){
            int ge=number%10;
            String re=re(ge);
            num=re+num;
            number/=10;
            if(number==0)
                break;
        }

        int count= 7-num.length();        //i < count不能写成i<7-num.length(),原因是num的长度每次都在改变
        for (int i = 0; i < count; i++) {
            num="零"+num;

        }
        String renum="";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < num.length(); i++) {
            renum=renum+num.charAt(i)+arr[i];
        }
        System.out.println(renum);

    }
    public static String re(int number){
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}*/

/*public class Main {
    public static void Student(String[] args) {
        String num="1234567890";

        String start=num.substring(0,3);
        String end=num.substring(7);

        String add=start+"...."+end;
        System.out.println(add);
    }
}*/

/*public class Main{
    public static void Student(String[] args) {
        String id="620521200409180019";

        String year=id.substring(6,10);
        String mon=id.substring(10,12);
        String day=id.substring(12,14);

        System.out.println(year+mon+day);
        char sex=id.charAt(16);
        int num=sex-48;

        if(num%2==0){
            System.out.println("nv");
        }else{
            System.out.println("nan");
        }
    }
}*/

/*public class Main {
    public static void Student(String[] args) {
        String language="你好或公司的nm你你你ndy环境是否sb";

        String result=language.replace("nm","**");

        String[] ku={"nm","ndy","sb","nnn"};

        String n="";
        for (int i = 0; i < ku.length; i++) {
            n=language.replace(ku[i],"...");//注意这里n最终不变的原因是language每次循环传过去的总是全局变量"你好或公司的nm你你你ndy环境是否sb"
            System.out.println(n);
        }
        System.out.println(n);

        for (int i = 0; i < ku.length; i++) {
            language=language.replace(ku[i],"...");
        }
        System.out.println(result);
        System.out.println(language);
    }
}*/

// StringBuilder
/*public class Main {
    public static void Student(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("abd");


        System.out.println(sb1);
        sb1.reverse();
        sb1.append(1);
        sb1.append("afskj");
        sb1.append(1111);
        //上述内容也可以表示为sb1.append(1).append("afskj").append(1111);链式编程

        int len=sb1.length();
        System.out.println(len);
        System.out.println(sb1);

        String str=sb1.toString();//变回字符串
        System.out.println(str);
    }
}*/

/*import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        int len=getStr().substring(2).replace("a","1").length();
        System.out.println(len);

    }
    public static String getStr() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return str;
    }
}*/

/*//需求:键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
import java.util.Scanner;
public class Main{
    public static void Student(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String str1=sb.toString();
        //也可以写成String Str1=new StringBuilder().append(str).reverse().toString();（链式编程）

        if(str.equals(str1))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}*/

/*需求:定义一个方法，把 int数组中的数据按照指定的格式拼接成一个字符串返回
调用该方法，并在控制台输出结果。
例如:数组为int[]arr ={1,2,3};
执行方法后的输出结果为:[1,2,3]*/
/*
public class Main{
    public static void Student(String[] args) {
        int[]arr={1,2,3};
        String str="[";
        for(int i=0;i<arr.length;i++){
            if (i!=arr.length-1) {
                str+=new StringBuilder().append(arr[i]).append(",").toString();
            } else {
                str+=new StringBuilder().append(arr[i]).toString();
            }
            System.out.println(str);
        }
        str+="]";
        System.out.println(str);
    }
}
*/

/*public class Main {
    public static void Student(String[] args) {
        int []arr={1,2,3};
        String str=arrTostring(arr);
        System.out.println(str);
    }
    public static String arrTostring(int []arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<=arr.length-1;i++){
            if(i!=arr.length-1){
                sb.append(arr[i]).append(",");
            }else{
                sb.append(arr[i]);
            }
        }
        sb.append("]");

        return sb.toString();
    }
}*/


/*import java.util.StringJoiner;
public class Main {
    public static void Student(String[] args) {

        StringJoiner sj=new StringJoiner("---");
        sj.add("a").add("k").add("k");
        System.out.println(sj);

        StringJoiner sj1=new StringJoiner(",","[","]");
        sj1.add("s").add("a").add("j");
        System.out.println(sj1);

        int len=sj1.length();
        String str=sj1.toString();
        System.out.println(len);
        System.out.println(str);
    }
}*/

/*键盘录入一个字符串，
要求1:长度为小于等于9
要求2:只能是数字
将内容变成罗马数字
下面是阿拉伯数字跟罗马数字的对比关系:
I-1、Ⅱ-2、Ⅲ-3、Ⅳ-4、V-5、Ⅵ-6、Ⅶ-7、VIII-8、IX-9
注意点:
罗马数字里面是没有0的
如果键盘录入的数字包含0，可以变成""(长度为0的字符串)*/

/*import java.util.Scanner;

public class Main {
    public static void Student(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {
            System.out.println("print number");
            str = sc.next();
            boolean flag=checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("repeat print");
                continue;
            }
        }


        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int number = str.charAt(i) - 48;
            String s = changeLM(number);
            sb.append(s);
        }
        System.out.println(sb);


    }

    public static String changeLM(int num) {
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr[num];
    }


    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }

         for (int i = 0; i < str.length(); i++) {
             char c = str.charAt(i);
             if (c < '0' || c > '9') {
                 return false;
             }
         }
         return true;
     }
}*/


/*import java.util.Scanner;

public class Main {
    public static void Student(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {
            System.out.println("print number");
            str = sc.next();
            boolean flag=checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("repeat print");
                continue;
            }
        }


        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char number = str.charAt(i);
            String s = changeLM(number);
            sb.append(s+" ");
        }
        System.out.println(sb);


    }

    public static String changeLM(char num) {
        *//*String str;
        switch(num){
            case '0' -> str="";
            case '1' -> str="I";
            case '2' -> str="II";
            case '3' -> str="III";
            case '4' -> str="IV";
            case '5' -> str="V";
            case '6' -> str="VI";
            case '7' -> str="VII";
            case '8' -> str="VIII";
            case '9' -> str="IX";
            default ->str="";
        }*//*

        String str=switch(num){
            case '0' -> "";
            case '1' -> "I";
            case '2' -> "II";
            case '3' -> "III";
            case '4' -> "IV";
            case '5' -> "V";
            case '6' -> "VI";
            case '7' -> "VII";
            case '8' -> "VIII";
            case '9' -> "IX";
            default ->str="";
        };
        return str;
    }


    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}*/


/*给定两个字符串，A和B。
A的旋转操作就是将B, 最左边的字符移动到最右边。
例如，若A='abcde'，在移动一次之后结果就是'bcdea'
如果在若干次调整操作之后，A能变成B，那么返回True。
如果不能匹配成功，则返回false*/

/*public class Main{
    public static void Student(String[] args){
        String str1="abcdef";
        String str2="defab";
        boolean b=checkEqual(str1,str2);
        System.out.println(b);
    }
    public static boolean checkEqual(String str1,String str2){
        for(int i=0;i<str1.length();i++){
            str1=str1.substring(1)+str1.substring(0,1);
            if(str1.equals(str2)){
                return true;
            }
        }
        return false;
    }

}*/


/*public class Main {
    public static void Student(String []args){
        String str1="abcdef";
        String str2="defabc";

        boolean flag=check(str1,str2);
        System.out.println(flag);

    }
    public static boolean check(String str1,String str2){
        for(int i=0;i<str1.length();i++){
            str1=rotate(str1);
            if(str1.equals(str2)){
                return true;
            }
        }
        return false;
    }

    public static String rotate(String str){
        char[] arr=str.toCharArray();
        char first=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
        String result=new String(arr);
        return result;
    }
}*/


//集合
/*import java.util.ArrayList;
public class Main{
    public static void Student(String []args){
        ArrayList<String> list =new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        *//*boolean result1=list.remove("aaa");
        System.out.println(result1);*//*

 *//*String result2=list.remove(1);
        System.out.println(result2);*//*

 *//*String result=list.set(0,"11");
        System.out.println(result);*//*

 *//*String result=list.get(1);
        System.out.println(result);*//*

        for (int i = 0; i < list.size(); i++) {
            String re= list.get(i);
            System.out.println(re);
        }

        System.out.println(list);
    }
}*/

/*
import java.util.ArrayList;
public class Main{
    public static void Student(String []args){
        ArrayList<Integer> list =new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.print("[");
        for(int i=0;i<list.size();i++){
            if(i==list.size()-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("]");
    }
}
*/
/*public class Main {
    public static void Student(String[] args) {
        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);//[aaa, aaa, bbb, ccc]
        //3.删除元素
        boolean result1 = list.remove("aaa");
        System.out.println(result1);//true
        boolean result2 = list.remove("ddd");
        System.out.println(result2);//false
        System.out.println(list);//[aaa, bbb, ccc]

        String str = list.remove(2);
        System.out.println(str);//ccc
        System.out.println(list);//[aaa, bbb]

        //修改元素
        String result = list.set(1, "ddd");
        System.out.println(result);//bbb
        System.out.println(list);//[aaa,ddd]

        //查询元素
        String s = list.get(0);
        System.out.println(s);//aaa

        System.out.println("遍历集合：");
        for (int i = 0; i < list.size(); i++) {
            //i 索引
            //list.get(i) 元素
            String str1 = list.get(i);
            System.out.println(str1);//aaa ddd
        }
    }
}*/

/*import java.util.ArrayList;
public class Main{
    public static void Student(String []args){

        ArrayList<studentSystem> list=new ArrayList<>();

        studentSystem stu1=new studentSystem("zhang",11);
        studentSystem stu2=new studentSystem("nihao",21);
        studentSystem stu3=new studentSystem("nnnn",111111);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getName()+","+list.get(i).getAge());
        }

    }
}*/

/*import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void Student(String []args){

        ArrayList<studentSystem> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            studentSystem studentSystem=new studentSystem();
            System.out.println("name");
            studentSystem.setName(sc.next());
            System.out.println("age");
            studentSystem.setAge(sc.nextInt());

            list.add(studentSystem);
        }

        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            String name=list.get(i).getName();
            int age=list.get(i).getAge();
            System.out.println(name+","+age);
        }
    }
}*/

/*1，main方法中定义一个集合，存入三个用户对象。
   用户属性为:id，username，password
2，要求:定义一个方法，根据id查找对应的用户信息。
        如果存在，返回true
        如果不存在，返回false*/
/*import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void Student(String[] args){
        studentSystem stu1 =new studentSystem(1,"zhang",111);
        studentSystem stu2 =new studentSystem(2,"nihao",222);
        studentSystem stu3 =new studentSystem(3,"afasf",333);

        ArrayList<studentSystem> list=new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        Scanner sc=new Scanner(System.in);
        int inputId=sc.nextInt();

        boolean flag=checkId(inputId,list);

        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    public static boolean checkId(int id,ArrayList<studentSystem> list){
        for(int i=0;i<list.size();i++){
            int chId=list.get(i).getId();
            if(chId==id){
                return true;
            }
        }
        return false;

    }
}*/


/*需求:
1，main方法中定义一个集合，存入三个用户对象。
用户属性为:id，username，password
2，要求:定义一个方法，根据id查找对应的用户信息。
如果存在，返回索引
如果不存在，返回-1*/
/*
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void Student(String[] args){
        studentSystem stu1 =new studentSystem(1,"zhang",111);
        studentSystem stu2 =new studentSystem(2,"nihao",222);
        studentSystem stu3 =new studentSystem(3,"afasf",333);

        ArrayList<studentSystem> list=new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        Scanner sc=new Scanner(System.in);
        int inputId=sc.nextInt();

        int flag=getIndex(inputId,list);

        System.out.println(flag);

    }
    public static int getIndex(int id,ArrayList<studentSystem> list){
        for(int i=0;i<list.size();i++){
            int chId=list.get(i).getId();
            if(chId==id){
                return i;
            }
        }
        return -1;

    }
}
*/

//合并
/*import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void Student(String[] args){
        studentSystem stu1 =new studentSystem(1,"zhang",111);
        studentSystem stu2 =new studentSystem(2,"nihao",222);
        studentSystem stu3 =new studentSystem(3,"afasf",333);

        ArrayList<studentSystem> list=new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        Scanner sc=new Scanner(System.in);
        int inputId=sc.nextInt();

        int index=getIndex(inputId,list);
        System.out.println(index);

        boolean flag=checkId(inputId,list);
        System.out.println(flag);

    }

    public static boolean checkId(int id,ArrayList<studentSystem> list){
        return getIndex(id,list)>=0;
    }
    public static int getIndex(int id,ArrayList<studentSystem> list){
        for(int i=0;i<list.size();i++){
            int chId=list.get(i).getId();
            if(chId==id){
                return i;
            }
        }
        return -1;
    }
}*/


/*定义Javabean类:Phone
        Phone属性:品牌，价格。
        main方法中定义一个集合，存入三个手机对象。
        分别为:小米，1000。苹果，8000。锤子2999.
        定义一个方法，将价格低于3000的手机信息返回，*/
/*import java.util.ArrayList;
public class Main{
    public static void Student(String []args){
        ArrayList<phone> list =new ArrayList<>();
        phone ph1=new phone("hhh",111);
        phone ph2=new phone("jjjj",222);
        phone ph3=new phone("ffff",333);

        list.add(ph1);
        list.add(ph2);
        list.add(ph3);

        ArrayList<phone> resultList=new ArrayList<>();
        resultList=getPhoneInfo(list);
        for(int i=0;i<resultList.size();i++){
            String brand=resultList.get(i).getBrand();
            int price=resultList.get(i).getPrice();
            System.out.println(brand+","+price);
        }


    }
    //如果我们要返回多个数据，可以把这些数据先放到一个容器当中，再把容器返回
    public static ArrayList<phone> getPhoneInfo(ArrayList<phone> list){
        ArrayList<phone> resultList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            phone p=list.get(i);
            int price=p.getPrice();
            if(price>=200){
                resultList.add(p);
            }
        }
        return resultList;
    }
}*/

//身份证
/*
import java.util.Scanner;
public class Main {
    public static void Student(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean flag=checkPersonid(str);
        System.out.println(flag);

    }
    public static boolean checkPersonid(String personid) {
        int count = 0;
        for (int i = 0; i < personid.length() - 1; i++) {
            if (personid.charAt(i) <= '9' && personid.charAt(i) >= '0')
                count++;
            else
                return false;
        }

        System.out.println(count);
        if (count==17 && (personid.charAt(17)=='x' || personid.charAt(17)=='X' || (personid.charAt(17)<='9' && personid.charAt(17)>='0'))) {
            return true;
        }else{
            return false;
        }
    }
}
*/

/*public class Main{
    public static void Student(String[] args){
        String s1=new String("aaa");
        System.out.println(s1);

        String s2=new String();
        System.out.println();

        char []s={'a','b','c'};
        String str=new String(s);
        System.out.println(str);

        byte []b={97,98,99};
        String bb=new String(b);
        System.out.println(bb);

        String a="abc";
        String b1="abc";
        String c=new String("abc");
        String d="ABC";
        System.out.println(a==b1);
        System.out.println(a==c);

        boolean result=a.equals(c);
        boolean r1=a.equalsIgnoreCase(d);
        boolean r2=a.equals(d);
        System.out.println(result);
        System.out.println(r1);
        System.out.println(r2);
    }
}*/


//验证码
/*import java.util.Random;
public class Main {
    public static void Student(String[] args) {
        char[]chs=new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<26){
                chs[i]=(char)(97+i);
            }else{
                chs[i]=(char)(65+i-26);
            }
        }
        String sec="";
        Random r=new Random();
        for (int i = 0; i < 4; i++) {
            int num=r.nextInt(chs.length);
            sec+=chs[num];
        }
        int num1=r.nextInt(10);
        sec+=num1;
        System.out.println(sec);
    }
}*/

//长度为5
//由4位大写或者小写字母和1位数字组成，同一个字母可重复
//数字可以出现在任意位置
/*import java.util.Random;
public class Main {
    public static void Student(String[] args) {

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
        String str=sb.toString();
        //获取验证码
        for (int j=0;j<100;j++) {
            String sec="";
            Random r=new Random();
            int count1=0;//验证码中数字的数量
            int count2=0;//验证码中字母的数量
            for (int i = 0; i < 5; i++) {
                //大写字母+数字,提高前四位出现数字的频率
                int number=r.nextInt(36)+26;
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
            System.out.println(sec);
        }

    }
}*/

//在一个有返回值的方法中，如果加入一个死循环，就可以不需要返回值，或者将返回值放在循环里面
/*import java.util.Scanner;
public class Main {
    public static void Student(String []args){
        int a=number(1);
        System.out.println(a);
    }
    public static int number(int i){
        for (;;) {
            Scanner sc=new Scanner(System.in);
            System.out.println("11111111111");
            int a=sc.nextInt();
            int b=a+i;
            System.out.println(b);
        }

    }
}*/


/*import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        //集合中加入大小写字母
        for (int i = 0; i < 26; i++) {
            list.add((char) (i + 'a'));
            list.add((char) (i + 'A'));
        }

        //创建一个SB加入验证码
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //随机获取一个字母加入
            int c = r.nextInt(list.size());
            sb.append(list.get(c));
        }

        //再添加一个数字到末尾
        int number=r.nextInt(10);
        sb.append(number);

        //转化为字符串
        char[]arr=sb.toString().toCharArray();
        int len=arr.length;
        int index=r.nextInt(len);
        //将最后一个索引与随机索引交换
        char temp=arr[index];
        arr[index]=arr[len-1];
        arr[len-1]=arr[index];

        System.out.println(new String(arr));

    }
}*/


/*public class Main {
    public static void main(String[] args) {
        int []arr={2,7,22,14};
        int target=9;
        int []arr1=twoSum(arr,target);
        System.out.println(arr1[0]+","+arr1[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int []arr=new int[2];
        loop:for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j==i){
                    continue;
                }else{
                    if((nums[i]+nums[j])==target){
                        arr[0]=i;
                        arr[1]=j;
                        break loop;
                    }
                }
            }
        }
        return arr;
    }
}*/









































































