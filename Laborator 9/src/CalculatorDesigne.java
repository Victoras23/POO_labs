import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorDesigne implements ActionListener{
    JFrame frame;
    JLabel in1,in2,error;
    JTextField input1;
    JTextField input2;
    JTextField output;
    JButton compute=new JButton("Compute");
    CalculatorDesigne(){
        frame=new JFrame("Division");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        in1=new JLabel("First number");
        in1.setBounds(45,20,300,50);
        in2=new JLabel("Second number");
        in2.setBounds(45,90,300,50);
        error=new JLabel("");
        input1=new JTextField();
        input2=new JTextField();
        output=new JTextField();
        error=new JLabel("");
        input1.setBounds(45,60,300,40);
        input2.setBounds(45,140,300,40);
        error.setBounds(45,190,300,40);
        error.setForeground(Color.RED);
        output.setBounds(45,240,300,40);
        compute.setBounds(45,280,300,40);
        compute.addActionListener(this);
        compute.setFocusable(false);
        frame.add(in1);
        frame.add(in2);
        frame.add(input2);
        frame.add(input1);
        frame.add(compute);
        frame.add(output);
        frame.add(error);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        CalculatorDesigne calc=  new CalculatorDesigne();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==compute){
            output.setText("");
            error.setText("");
            Exception ex= new Exception(input1.getText(), input2.getText());
            UnluckyException ex1=new UnluckyException(input1.getText(), input2.getText());
            String s=ex.wrong();
            String s1=ex1.exception();
            if (!s.equals("")) {error.setText(s);}
            else if(!s1.equals("")) {error.setText(s1);}
            else {
                double result;
                result=Double.parseDouble(input1.getText())/Double.parseDouble(input2.getText());
                output.setText(String.valueOf(result));
            }
        }
    }
}
