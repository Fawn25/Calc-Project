import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calcolatrice extends JFrame{

    Container c = getContentPane();
    JLabel titolo = new JLabel("CALCOLATRICE");
    JLabel risultato = new JLabel("");
    Font font = new Font("Consolas",Font.BOLD,20);

    JButton n0 = new JButton("0");
    JButton n1 = new JButton("1");
    JButton n2 = new JButton("2");
    JButton n3 = new JButton("3");
    JButton n4 = new JButton("4");
    JButton n5 = new JButton("5");
    JButton n6 = new JButton("6");
    JButton n7 = new JButton("7");
    JButton n8 = new JButton("8");
    JButton n9 = new JButton("9");

    JButton piu = new JButton("+");
    JButton meno = new JButton("-");
    JButton per = new JButton("x");
    JButton diviso = new JButton(":"); 
    JButton uguale =new JButton("=");
    JButton exit =new JButton("C");


    double meno1=0;
    double piu1=0;
    double per1=0;
    double diviso1=0;

    String finale= new String();
    String[] numeri= new String[50];

    Color tasti= Color.GRAY;
    Color testo= Color.BLACK;

    public Calcolatrice(){
        
        setLayout(null);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(1200, 100, 400, 400);
        c.setBackground(Color.lightGray);


        //LABEL TITOLO
        titolo.setBounds(0, 0, 400, 30);
        titolo.setFont(font);
        titolo.setBackground(Color.yellow);
        titolo.setOpaque(true);
        titolo.setHorizontalAlignment(JLabel.CENTER);
        titolo.setBackground(Color.DARK_GRAY);
        titolo.setForeground(testo);
        c.add(titolo);
        //LABEL TITOLO
        


        //LABEL RISULTATO
        risultato.setBounds(40, 40, 320, 40);
        risultato.setBackground(Color.gray);
        risultato.setOpaque(true);
        risultato.setFont(font);
        risultato.setHorizontalAlignment(JLabel.LEFT);
        risultato.setBackground(Color.DARK_GRAY);
        risultato.setForeground(Color.white);
        c.add(risultato);
        //LABEL RISULTATO


        
    
        button();



        setVisible(true);
    }



    public void button(){
        n1.setBounds(95,100,45,45);
        n1.setFont(font);
        n1.addActionListener(new Ascolto());
        n1.setBackground(tasti);
        n1.setForeground(testo);
        c.add(n1);

        n2.setBounds(150,100,45,45);
        n2.setFont(font);
        n2.addActionListener(new Ascolto());
        n2.setBackground(tasti);
        n2.setForeground(testo);
        c.add(n2);

        n3.setBounds(205,100,45,45);
        n3.setFont(font);
        n3.addActionListener(new Ascolto());
        n3.setBackground(tasti);
        n3.setForeground(testo);
        c.add(n3);

        ////////////////

        n4.setBounds(95,155,45,45);
        n4.setFont(font);
        n4.addActionListener(new Ascolto());
        n4.setBackground(tasti);
        n4.setForeground(testo);
        c.add(n4);

        n5.setBounds(150,155,45,45);
        n5.setFont(font);
        n5.setBackground(tasti);
        n5.setForeground(testo);
        n5.addActionListener(new Ascolto());
        c.add(n5);

        n6.setBounds(205,155,45,45);
        n6.setFont(font);
        n6.addActionListener(new Ascolto());
        n6.setBackground(tasti);
        n6.setForeground(testo);
        c.add(n6);
        
        ////////////

        n7.setBounds(95,210,45,45);
        n7.setFont(font);
        n7.addActionListener(new Ascolto());
        n7.setBackground(tasti);
        n7.setForeground(testo);
        c.add(n7);

        n8.setBounds(150,210,45,45);
        n8.setFont(font);
        n8.addActionListener(new Ascolto());
        n8.setBackground(tasti);
        n8.setForeground(testo);
        c.add(n8);

        n9.setBounds(205,210,45,45);
        n9.setFont(font);
        n9.addActionListener(new Ascolto());
        n9.setBackground(tasti);
        n9.setForeground(testo);
        c.add(n9);

        ///////

        n0.setBounds(150,265,45,45);
        n0.setFont(font);
        n0.addActionListener(new Ascolto());
        n0.setBackground(tasti);
        n0.setForeground(testo);
        c.add(n0);

        ///////

        piu.setBounds(260, 100, 45, 45);
        piu.setFont(font);
        piu.addActionListener(new AscoltoSegni());
        piu.setBackground(tasti);
        piu.setForeground(testo);
        c.add(piu);

        meno.setBounds(260, 155, 45, 45);
        meno.setFont(font);
        meno.addActionListener(new AscoltoSegni());
        meno.setBackground(tasti);
        meno.setForeground(testo);
        c.add(meno);

        per.setBounds(260, 210, 45, 45);
        per.setFont(font);
        per.addActionListener(new AscoltoSegni());
        per.setBackground(tasti);
        per.setForeground(testo);
        c.add(per);

        diviso.setBounds(260, 265, 45, 45);
        diviso.setFont(font);
        diviso.addActionListener(new AscoltoSegni());
        diviso.setBackground(tasti);
        diviso.setForeground(testo);
        c.add(diviso);

        uguale.setBounds(205, 265, 45, 45);
        uguale.setFont(font);
        uguale.addActionListener(new AscoltoSegni());
        uguale.setBackground(tasti);
        uguale.setForeground(testo);
        c.add(uguale);

        exit.setBounds(95, 265, 45, 45);
        exit.addActionListener(new AscoltoSegni());
        exit.setFont(new Font("Consolas",Font.BOLD,16));
        exit.setBackground(tasti);
        exit.setForeground(testo);
        c.add(exit);
    }

    public void uguale(){
        String ris= new String(); 
        ris=risultato.getText();//1+2
        //String cast= new String();
        Integer risultatoFinale=0;
        Integer cast1=0;
        
        String ris1= new String(); 
        ris1=risultato.getText();//1+2
        Double risultatoFinale1=0.0;
        Double cast2=0.0;


        if(piu1==1){
            String[] cast=ris.split("[+]");
            for(int i=0;i<cast.length;i++){
                //System.out.println(cast[i]);
                cast1=Integer.parseInt(cast[i]);
                risultatoFinale=(risultatoFinale+cast1);
            }
            String finale=Integer.toString(risultatoFinale);
            risultato.setText(finale);
            
        }
         
        else if(meno1==1){
            String[] cast=ris.split("[-]");
            cast1=Integer.parseInt(cast[0]);
            risultatoFinale=cast1;
            for(int i=1;i<cast.length;i++){
                //System.out.println(cast[i]);
                cast1=Integer.parseInt(cast[i]);
                risultatoFinale=(risultatoFinale-cast1);
            }
            String finale=Integer.toString(risultatoFinale);
            risultato.setText(finale);
        }


        else if(per1==1){
            String[] cast=ris.split("[x]");
            cast1=Integer.parseInt(cast[0]);
            risultatoFinale=cast1;
            for(int i=1;i<cast.length;i++){
                //System.out.println(cast[i]);
                cast1=Integer.parseInt(cast[i]);
                risultatoFinale=(risultatoFinale*cast1);
            }
            String finale=Integer.toString(risultatoFinale);
            risultato.setText(finale);
        }


        else if(diviso1==1){
            String[] cast=ris1.split("[:]");
            cast2=Double.parseDouble(cast[0]);
            risultatoFinale1=cast2;
            for(int i=1;i<cast.length;i++){
                //System.out.println(cast[i]);
                cast2=Double.parseDouble(cast[i]);
                risultatoFinale1=(risultatoFinale1/cast2);
            }
            
            String finale=Double.toString(risultatoFinale1);
            risultato.setText(finale);
        }
        
    
    }

    public static void main(String[] args) {

        new Calcolatrice();
        
    } 

    
    public class Ascolto implements ActionListener{

        public void actionPerformed(ActionEvent ev){
            Object og= ev.getSource();
            if(og==n1){
               
               System.out.println("1");
                risultato.setText(risultato.getText()+"1");
                
            }
            if(og==n2){
                
                System.out.println("2");
                 risultato.setText(risultato.getText()+"2");
             }
             if(og==n3){
                
                System.out.println("3");
                 risultato.setText(risultato.getText()+"3");
             }
             if(og==n4){
                
                System.out.println("4");
                 risultato.setText(risultato.getText()+"4");
             }
             if(og==n5){
                
                System.out.println("5");
                 risultato.setText(risultato.getText()+"5");
             }
             if(og==n6){
                
                System.out.println("6");
                 risultato.setText(risultato.getText()+"6");
             }
             if(og==n7){
                
                System.out.println("7");
                 risultato.setText(risultato.getText()+"7");
             }
             if(og==n8){
                
                System.out.println("8");
                 risultato.setText(risultato.getText()+"8");
             }
             if(og==n9){
                
                System.out.println("9");
                 risultato.setText(risultato.getText()+"9");
             }
             if(og==n0){
                
                System.out.println("0");
                 risultato.setText(risultato.getText()+"0");
             }
        }



    }
    public class AscoltoSegni implements ActionListener{

        public void actionPerformed(ActionEvent eve){

            Object oj = eve.getSource();
            if(oj==piu){
                System.out.println("+");
                risultato.setText(risultato.getText()+"+");   
                piu1=1;

            }
            if(oj==meno){
                System.out.println("-");
                risultato.setText(risultato.getText()+"-");   
                meno1=1;
            }
            if(oj==per){
                System.out.println("x");
                risultato.setText(risultato.getText()+"x");   
                per1=1;
            }
            if(oj==diviso){
                System.out.println(":");
                risultato.setText(risultato.getText()+":");   
                diviso1=1;
            }
            if(oj==uguale){
                System.out.println("=");
                uguale();
            }
            if(oj==exit){
                System.out.println("Exit");
                dispose();
                new Calcolatrice();
            }
        }



    }
}