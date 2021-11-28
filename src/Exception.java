public class Exception {
    String input1;
    String input2;
    Exception(String in1,String in2){
        this.input1=in1;
        this.input2=in2;
    }
    String wrong(){
        if(input1.equals(""))return "Input 1 is empty";
        else if(input2.equals(""))return "Input 2 is empty";
        else if (!isNumeric(input1)) return "Input 1 is not a number";
        else if(!isNumeric(input2))return "Input 2 in not a number";
        else if(input2.equals("0"))return "The divisor can't be 0";
        else return"";
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
