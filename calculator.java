class Calculator{
    float addition(float operand_1, float operand_2){
    return(operand_1 + operand_2);
}
    float substraction(float operand_1, float operand_2){
    return(operand_1 - operand_2);
    }
    
    float multiplication(float operand_1, float operand_2){
    return(operand_1 * operand_2);
    }

    float division(float operand_1, float operand_2){
    return(operand_1 /operand_2);
    }

public static void main(String[] args){
    float operand_1 =10;
float operand_2= 8;
    Calculator calc = new Calculator();
    float add_result = calc.addition(operand_1,operand_2);
    System.out.println("result of addition is:" +add_result);

    float sub_result = calc.substraction(operand_1,operand_2);
    System.out.println("result of Substraction is:" +sub_result);

    float mul_result = calc.multiplication(operand_1,operand_2);
    System.out.println("result of multiplication is:" +mul_result);


    float div_result = calc.division(operand_1,operand_2);
    System.out.println("result of division is:" +div_result);

}
}
