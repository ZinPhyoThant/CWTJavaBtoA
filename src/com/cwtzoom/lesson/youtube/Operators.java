package com.cwtzoom.lesson.youtube;

public class Operators {
    public static void main(String[] args) {
        int a =45+4; // do work beside
        //Syntax -> a(operand) |+(operator) 45 & 4 (operand)

        int n1=10;
        int n2=9;
        int n3=8;

        boolean flag    = n1>n2 && n2>n3; //Ture
        boolean flag1   = n1==n2 || n1>=n2; //false || true

        System.out.println(flag);
        System.out.println(flag1);

        int number = 10 <<2;
        System.out.println(number);

        //Ternary Operator
        int number1 =23;
        int number2 =55;
        int f =(number1>number2)? number2: number2;
        //မှန်ရင်ရှေ့ကထွက်မယ် မှားရင်နောက်ကထွက်မယ်
        System.out.println(f);

        int num1=10;
        num1 += 3;
        // num1 = 10+3;
        System.out.println(num1);

    }

    /**
     *
     * Unary Operator
     * @Arithmethic
     * @Relational
     * @Bitwise
     * @Logical
     * @Shift Operator
     * @Comparsion Operator
     * @Ternary Operator
     * @Assignment Operator
     *
     * @Binary Operator
     *
     * @Precedence
     *
     * @Arithmetic Operator * / % -
     *
     * @Relational Operator or comparsion operator < > <= =>
     * instacne of -> bel class ka lae so tr ko sit py tr
     * == !=
     * ^ relational operator က ture false ပဲရမယ်
     *
     * @Logical Operator
     *
     * &&(and - တစ်ခုမှားရင် false)  ||(OR - တစ်ခုမှန်ရင် ture)
     *
     * @Bitwise Operator
     *& bitwise and
     * ^ bitwise exclusive or
     * | bitwise inclusive or
     *
     * @Shift Operator
     * << leftshift
     * >> rightshift
     * >>> right shift 0 fill
     */

    /**
     *
     */

    /**
     * @bitwise
     *
     * 00
     * 01
     * 10
     * 11
     *
     * 00 =0
     *  +1
     *
     * 01 =1
     * +1
     *
     * 10 =2
     * 11 =3
     * 100 =4
     */
    /**
     * @Shift Operator
     * 0 0 0 0 = 0
     * 0 0 0 1 = 1
     * 0 0 1 0 = 2
     * 0 0 1 1 = 3
     * 0 1 0 0 = 4
     * 0 1 0 1 = 5
     * 0 1 1 0 = 6
     * 0 1 1 1 = 7
     * 1 0 0 0 = 8
     * 1 0 0 1 = 9
     * 1 0 1 0 = 10
     *
     * 3 2 1 0
     * 1 0 1 1

     * 2^1 =2
     * 2^3 =8
     *
     * 20
     * (1 2 4 8 16) အနီးကပ်ဆုံးတန်ဖိုးကိုယူ 32
     *
     * 1 2 4 8 16
     * 0 1 2 3 4
     *
     * 4 3 2 1 0
     * 1 0 1 0 0 =20
     *
     * 2** ^
     *
     * << LeftShift ညာကိုပေါင်း
     * 10<<2
     * 101000
     * 543210
     * 2^5 =32
     * 2^3 =8
     *  * ပုံသေနည်း
     *      * 10 * 2^2 =2
     *
     * >>right shift ဘယ်ကိုပေါင်း
     * 10>>2
     * 0010 =>2
     * ပုံသေနည်း
     * 10 / 2^2 =2
     */

    /**
     * @Assignment Operator
     * = += -= /= %= &= |= <<= >>= >>>=
     *
     */

    /**
     * Unary Operator
     *      * -(a++(postfix))
     *      * -(++a(prefix))
     *
     * Binary Operator
     * Tenary Operator
     * //(condition)? true:false;
     *
     * (1<2)? true: flase;
     *

     */
}
