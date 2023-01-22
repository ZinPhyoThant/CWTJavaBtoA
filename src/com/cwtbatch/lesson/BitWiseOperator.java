package com.cwtbatch.lesson;

public class BitWiseOperator {
    public static void main(String[] args) {
        //OR(|)
        System.out.println("OR(|");
        int operand1 = 190, operand2 = 53, output1;
        // bitwise OR between 190 and 53
        output1 = operand1 | operand2;
        System.out.println(output1);    //191

        //AND (&)
        System.out.println("AND(&");
        int operand3 = 190, operand4 = 53, output2;
        // bitwise OR between 190 and 53
        output2 = operand3 | operand4;
        System.out.println(output2);    //52

        //Inclusive OR/XOR(^)
        System.out.println("Invlusive (OR/XOR)(^)");
        int operand5 = 190, operand6 = 53, output3;
        // bitwise OR between 190 and 53
        output3 = operand5 | operand6;
        System.out.println(output3);    //131

        //Complement (~)
        System.out.println("Complement(~)");
        int operand7 = 190, output4;
        // bitwise complement of 190
        output4 = ~operand7;
        System.out.println(output4);    //-191

    }
}

/**
 * Bitwise AND	|	Preserves a bit in the result if and only if it exists in both operands.
 * Bitwise OR	&	Preserves a bit if it exists in either of the two operands.
 * Bitwise XOR	^	Preserves a bit if it is present only in one operand but not both.
 * Bitwise COMPLEMENT	~	Also known as 1’s complement. Just reverse the bits of the operand.
 * Bitwise LEFT SHIFT	<<	The bits in the left operand are shifted to the left by the number of places specified in the right operand.
 * SIGNED RIGHT SHIFT	>>	The bits in the left operand are shifted to the right by the number of places specified in the right operand.
 * UNSIGNED RIGHT SHIFT	>>>	Exactly like SIGNED RIGHT SHIFT plus shifted bits are filled with zero.
 */
