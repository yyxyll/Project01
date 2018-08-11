package com.zzy.java;

import com.zzy.bean.Customer;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2018-08-10 16:42
 *
 *1、IDEA中代码模板所处的位置：settings - Editor - LiveTemplates / Postfix Completion
 *2、常用的模板
 */
public class TemplatesTest {

    //模板6：prsf：可生成 private static final
        private static final Customer CUST = new Customer();

    //变形：psf
        public static final int NUM = 10;
    //变形：psfi
        public static final int NUM2 = 20;
    //变形：psfs
        public static final String  NATION = "CHINA";

    //模板1：psvm
    public static void main(String[] args) {

        //模板2：sout
        System.out.println("HelloIDEA!");
        //变形：soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        
        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        //模板3：fori
        String arr[] = new String[]{"Tom","Jerrt","Lilei","Hanmeimei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板4：List.for
        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(134);
        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public static void method(){
        System.out.println("TemplatesTest.method");

        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(134);

        //模板5：ifn
        if (list == null) {
            
        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }

    }




}
