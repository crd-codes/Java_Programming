import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyCalculator implements ActionListener
{
    //Characteristics
    JFrame fobj;                                        
    JButton bobjadd, bobjsub, bobjmult, bobjdiv;
    JTextField tobjnum1,tobjnum2;
    JLabel Number1label, Number2label, Resultlabel;
    
    public MyCalculator(String title, int width, int height)
    {
        fobj = new JFrame(title);

        Number1label = new JLabel("Number1");
        Number1label.setBounds(50,50,80,30);

        tobjnum1 = new JTextField();
        tobjnum1.setBounds(130,50,50,30);

        Number2label = new JLabel("Number2");
        Number2label.setBounds(50,100,80,30);

        tobjnum2 = new JTextField();
        tobjnum2.setBounds(130,100,50,30);

        bobjadd = new JButton("+");
        bobjadd.setBounds(50,170,45,35);

        bobjsub = new JButton("-");
        bobjsub.setBounds(120,170,45,35);

        bobjmult = new JButton("x");
        bobjmult.setBounds(190,170,45,35);

        bobjdiv = new JButton("/");
        bobjdiv.setBounds(260,170,45,35);
        
        Resultlabel = new JLabel(" ");
        Resultlabel.setBounds(150,220,150,30);
        
        fobj.add(bobjadd);
        fobj.add(bobjsub);
        fobj.add(bobjmult);
        fobj.add(bobjdiv);
        fobj.add(tobjnum1);
        fobj.add(tobjnum2);
        fobj.add(Number1label);
        fobj.add(Number2label);
        fobj.add(Resultlabel);
        
        bobjadd.addActionListener(this);
        bobjsub.addActionListener(this);
        bobjmult.addActionListener(this);
        bobjdiv.addActionListener(this);

        fobj.setLayout(null);    
        fobj.setSize(width,height);
        fobj.getContentPane().setBackground(Color.YELLOW);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        int num1 = Integer.parseInt(tobjnum1.getText());
        int num2 = Integer.parseInt(tobjnum2.getText());

        int result = 0;

        if(aobj.getSource() == bobjadd)
        {
            result = num1 + num2;
        }
        else if(aobj.getSource() == bobjsub)
        {
            result = num1 - num2;
        }
        else if(aobj.getSource() == bobjmult)
        {
            result = num1 * num2;
        }
        else if(aobj.getSource() == bobjdiv)
        {
            if(num2 == 0)
                {
                    Resultlabel.setText("Error: Cannot divide by 0");
                    return;
                }
                result = num1 / num2;
        }

        Resultlabel.setText("Result : " + result);
    }
}

class Calculator
{
    public static void main(String A[])
    {
        MyCalculator mobj = new MyCalculator("Calculator",400,300);
    }
}