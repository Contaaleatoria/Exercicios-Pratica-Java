import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;





public class CalculadoraBronema{
    

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("calculadora.png");
        
        JFrame janela = new JFrame();
            janela.setTitle("Calculadora Bronema");
            janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            janela.setResizable(false);
            janela.setSize(500, 500);
            janela.setLayout(new GridLayout(3, 1));
            janela.setIconImage(image.getImage());
            

        JPanel OpPanel = new JPanel();
            OpPanel.setLayout(new GridLayout(1, 2));
            

        JPanel nPanel = new JPanel();
            nPanel.setLayout(new GridLayout(2, 2));
           

        JPanel rPanel = new JPanel();
            rPanel.setLayout(new GridLayout(1, 4));
           
            rPanel.setSize(500, 100);

            JLabel rTXT = new JLabel();
            rTXT.setText("Resposta:");
            rTXT.setFont(new Font("Calibri", Font.PLAIN, 28));

        JLabel r = new JLabel();
            r.setText("--");
            r.setFont(new Font("Calibri", Font.PLAIN, 28));

        JLabel n1TXT = new JLabel();
            n1TXT.setText("Primeiro Número:");
            n1TXT.setFont(new Font("Calibri", Font.PLAIN, 16));

        JLabel n2TXT = new JLabel();
            n2TXT.setText("Segundo Número:");
            n2TXT.setFont(new Font("Calibri", Font.PLAIN, 16));

        JTextField tN1 = new JTextField();
  
        JTextField tN2 = new JTextField();
        
        JButton butaoS = new JButton();
            butaoS.setText("Soma");

            butaoS.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    if(e.getSource() == butaoS){
                        double n1 = Double.parseDouble(tN1.getText());
                        double n2 = Double.parseDouble(tN2.getText());
                        
                        String re = Double.toString(n1 + n2);
                        r.setText(re);}
                    }});
            
        JButton butaoSub = new JButton();
            butaoSub.setText("Subtração");

            butaoSub.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    if(e.getSource() == butaoSub){
                        double n1 = Double.parseDouble(tN1.getText());
                        double n2 = Double.parseDouble(tN2.getText());
                        
                        String re = Double.toString(n1 - n2);
                        r.setText(re);}
                    }});

        JButton butaoM = new JButton();
            butaoM.setText("Multiplicação");

            butaoM.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    if(e.getSource() == butaoM){
                        double n1 = Double.parseDouble(tN1.getText());
                        double n2 = Double.parseDouble(tN2.getText());
                        
                        String re = Double.toString(n1 * n2);
                        r.setText(re);}
                    }});


        JButton butaoD = new JButton();
            butaoD.setText("Divisão");

            butaoD.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    if(e.getSource() == butaoD){
                        double n1 = Double.parseDouble(tN1.getText());
                        double n2 = Double.parseDouble(tN2.getText());
                        
                        String re = Double.toString(n1 / n2);
                        r.setText(re);}
                    }});


        janela.add(rPanel);
        janela.add(nPanel);
        janela.add(OpPanel);
        nPanel.add(butaoS);
        nPanel.add(butaoSub);
        nPanel.add(butaoM);
        nPanel.add(butaoD);
        OpPanel.add(rTXT);
        OpPanel.add(r);
        rPanel.add(n1TXT);
        rPanel.add(tN1);
        rPanel.add(n2TXT);
        rPanel.add(tN2);

        janela.setVisible(true);

    }

    
}
