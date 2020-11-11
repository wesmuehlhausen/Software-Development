package Farkle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/**
 *
 * @author apmil
 */
public class scorecardFrame extends javax.swing.JFrame {

    /**
     * Creates new form scorecardFrame
     */
    public scorecardFrame(String[] names) {
        initComponents();
        initArrays(names);
    }
    
    public void initArrays(String[] names)
    {
        playerNames = names;
        
        oneText = new JTextField[20];
        twoText = new JTextField[20];
        threeText = new JTextField[20];
        fourText = new JTextField[20];
        totalText = new JTextField[4];
        
        oneText[0] = P1Text1;
        oneText[1] = P1Text2;
        oneText[2] = P1Text3;
        oneText[3] = P1Text4;
        oneText[4] = P1Text5;
        oneText[5] = P1Text6;
        oneText[6] = P1Text7;
        oneText[7] = P1Text8;
        oneText[8] = P1Text9;
        oneText[9] = P1Text10;
        oneText[10] = P1Text11;
        oneText[11] = P1Text12;
        oneText[12] = P1Text13;
        oneText[13] = P1Text14;
        oneText[14] = P1Text15;
        oneText[15] = P1Text16;
        oneText[16] = P1Text17;
        oneText[17] = P1Text18;
        oneText[18] = P1Text19;
        oneText[19] = P1Text20;
        
        for(int i = 0; i < oneText.length; ++i)
        {
            oneText[i].setEnabled(false);
            oneText[i].setText("0");
        }
        
        twoText[0] = P2Text1;
        twoText[1] = P2Text2;
        twoText[2] = P2Text3;
        twoText[3] = P2Text4;
        twoText[4] = P2Text5;
        twoText[5] = P2Text6;
        twoText[6] = P2Text7;
        twoText[7] = P2Text8;
        twoText[8] = P2Text9;
        twoText[9] = P2Text10;
        twoText[10] = P2Text11;
        twoText[11] = P2Text12;
        twoText[12] = P2Text13;
        twoText[13] = P2Text14;
        twoText[14] = P2Text15;
        twoText[15] = P2Text16;
        twoText[16] = P2Text17;
        twoText[17] = P2Text18;
        twoText[18] = P2Text19;
        twoText[19] = P2Text20;
       
        for(int i = 0; i < twoText.length; ++i)
        {
            twoText[i].setEnabled(false);
            twoText[i].setText("0");
        }
        
        threeText[0] = P3Text1;
        threeText[1] = P3Text2;
        threeText[2] = P3Text3;
        threeText[3] = P3Text4;
        threeText[4] = P3Text5;
        threeText[5] = P3Text6;
        threeText[6] = P3Text7;
        threeText[7] = P3Text8;
        threeText[8] = P3Text9;
        threeText[9] = P3Text10;
        threeText[10] = P3Text11;
        threeText[11] = P3Text12;
        threeText[12] = P3Text13;
        threeText[13] = P3Text14;
        threeText[14] = P3Text15;
        threeText[15] = P3Text16;
        threeText[16] = P3Text17;
        threeText[17] = P3Text18;
        threeText[18] = P3Text19;
        threeText[19] = P3Text20;
        
        for(int i = 0; i < threeText.length; ++i)
        {
            threeText[i].setEnabled(false);
            threeText[i].setText("0");
        }
        
        fourText[0] = P4Text1;
        fourText[1] = P4Text2;
        fourText[2] = P4Text3;
        fourText[3] = P4Text4;
        fourText[4] = P4Text5;
        fourText[5] = P4Text6;
        fourText[6] = P4Text7;
        fourText[7] = P4Text8;
        fourText[8] = P4Text9;
        fourText[9] = P4Text10;
        fourText[10] = P4Text11;
        fourText[11] = P4Text12;
        fourText[12] = P4Text13;
        fourText[13] = P4Text14;
        fourText[14] = P4Text15;
        fourText[15] = P4Text16;
        fourText[16] = P4Text17;
        fourText[17] = P4Text18;
        fourText[18] = P4Text19;
        fourText[19] = P4Text20;
       
        for(int i = 0; i < fourText.length; ++i)
        {
            fourText[i].setEnabled(false);
            fourText[i].setText("0");
        }
        
        totalText[0] = P1TotalText;
        totalText[1] = P2TotalText;
        totalText[2] = P3TotalText;
        totalText[3] = P4TotalText;
      
        for(int i = 0; i < totalText.length; ++i)
        {
            totalText[i].setEnabled(false);
        }

        if(names.length == 1)
        {
            labelP1.setText(names[0]);
            labelP2.setEnabled(false);
            labelP3.setEnabled(false);
            labelP4.setEnabled(false);
            P2TotalText.setEnabled(false);
            P3TotalText.setEnabled(false);
            P4TotalText.setEnabled(false);
            for(int i = 0; i < 20; ++i)
            {
                twoText[i].setEnabled(false);
                threeText[i].setEnabled(false);
                fourText[i].setEnabled(false);
            }
            labelP2.setText("Empty");
            labelP3.setText("Empty");
            labelP4.setText("Empty");
        }
        if(names.length == 2)
        {
            labelP1.setText(names[0]);
            labelP2.setText(names[1]);
            labelP3.setEnabled(false);
            labelP4.setEnabled(false);
            P3TotalText.setEnabled(false);
            P4TotalText.setEnabled(false);
            for(int i = 0; i < 20; ++i)
            {
                threeText[i].setEnabled(false);
                fourText[i].setEnabled(false);
            }
            labelP3.setText("Empty");
            labelP4.setText("Empty");
        }
        if(names.length == 3)
        {
            labelP1.setText(names[0]);
            labelP2.setText(names[1]);
            labelP3.setText(names[2]);
            labelP4.setEnabled(false);
            P4TotalText.setEnabled(false);
            for(int i = 0; i < 20; ++i)
            {
                fourText[i].setEnabled(false);
            }
            labelP4.setText("Empty");
        }
        if(names.length == 4)
        {
            labelP1.setText(names[0]);
            labelP2.setText(names[1]);
            labelP3.setText(names[2]);
            labelP4.setText(names[3]);
        }
    }


    public void placeScore(int turn, int score, int player)
    {
       if(player == 0)
       {
           oneText[turn - 1].setText(Integer.toString(score));
       }
       else if(player == 1)
       {
           twoText[turn - 1].setText(Integer.toString(score));
       }
       else if(player == 2)
       {
           threeText[turn - 1].setText(Integer.toString(score));
       }
       else if(player == 3)
       {
           fourText[turn - 1].setText(Integer.toString(score));
       }
    }
    
    public void adjustTotalScores()
    {
        int score = 0;
        int temp;
        for(int i = 0; i < 20; ++i)
        {
            temp = Integer.valueOf(oneText[i].getText());
            score += temp;
        }
        P1TotalText.setText(Integer.toString(score));
        
        score = 0;
        for(int i = 0; i < 20; ++i)
        {
            temp = Integer.valueOf(twoText[i].getText());
            score += temp;
        }
        P2TotalText.setText(Integer.toString(score));
        
        score = 0;
        for(int i = 0; i < 20; ++i)
        {
            temp = Integer.valueOf(threeText[i].getText());
            score += temp;
        }
        P3TotalText.setText(Integer.toString(score));
        
        score = 0;
        for(int i = 0; i < 20; ++i)
        {
            temp = Integer.valueOf(fourText[i].getText());
            score += temp;
        }
        P4TotalText.setText(Integer.toString(score));
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scorecardPanel = new javax.swing.JPanel();
        turnLabel1 = new javax.swing.JLabel();
        P1Text1 = new javax.swing.JTextField();
        P1Text2 = new javax.swing.JTextField();
        P1Text3 = new javax.swing.JTextField();
        P1Text4 = new javax.swing.JTextField();
        P1Text5 = new javax.swing.JTextField();
        P1Text6 = new javax.swing.JTextField();
        P1Text7 = new javax.swing.JTextField();
        P1Text8 = new javax.swing.JTextField();
        P1Text9 = new javax.swing.JTextField();
        P1Text10 = new javax.swing.JTextField();
        P1Text11 = new javax.swing.JTextField();
        P1Text12 = new javax.swing.JTextField();
        P1Text13 = new javax.swing.JTextField();
        P1Text14 = new javax.swing.JTextField();
        P1Text15 = new javax.swing.JTextField();
        P1Text16 = new javax.swing.JTextField();
        turnLabel2 = new javax.swing.JLabel();
        turnLabel3 = new javax.swing.JLabel();
        turnLabel4 = new javax.swing.JLabel();
        turnLabel5 = new javax.swing.JLabel();
        turnLabel6 = new javax.swing.JLabel();
        turnLabel7 = new javax.swing.JLabel();
        turnLabel8 = new javax.swing.JLabel();
        turnLabel9 = new javax.swing.JLabel();
        turnLabel10 = new javax.swing.JLabel();
        turnLabel11 = new javax.swing.JLabel();
        turnLabel12 = new javax.swing.JLabel();
        turnLabel13 = new javax.swing.JLabel();
        turnLabel14 = new javax.swing.JLabel();
        turnLabel15 = new javax.swing.JLabel();
        turnLabel16 = new javax.swing.JLabel();
        turnLabel17 = new javax.swing.JLabel();
        turnLabel18 = new javax.swing.JLabel();
        turnLabel19 = new javax.swing.JLabel();
        labelP1 = new javax.swing.JLabel();
        turnLabel20 = new javax.swing.JLabel();
        labelP2 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        labelP3 = new javax.swing.JLabel();
        labelP4 = new javax.swing.JLabel();
        P1Text17 = new javax.swing.JTextField();
        P1Text18 = new javax.swing.JTextField();
        P1Text19 = new javax.swing.JTextField();
        P1Text20 = new javax.swing.JTextField();
        P2Text1 = new javax.swing.JTextField();
        P2Text2 = new javax.swing.JTextField();
        P2Text3 = new javax.swing.JTextField();
        P2Text4 = new javax.swing.JTextField();
        P2Text5 = new javax.swing.JTextField();
        P2Text6 = new javax.swing.JTextField();
        P2Text7 = new javax.swing.JTextField();
        P2Text8 = new javax.swing.JTextField();
        P2Text9 = new javax.swing.JTextField();
        P2Text10 = new javax.swing.JTextField();
        P2Text11 = new javax.swing.JTextField();
        P2Text12 = new javax.swing.JTextField();
        P2Text13 = new javax.swing.JTextField();
        P2Text14 = new javax.swing.JTextField();
        P2Text15 = new javax.swing.JTextField();
        P2Text16 = new javax.swing.JTextField();
        P2Text17 = new javax.swing.JTextField();
        P2Text18 = new javax.swing.JTextField();
        P2Text19 = new javax.swing.JTextField();
        P2Text20 = new javax.swing.JTextField();
        P3Text1 = new javax.swing.JTextField();
        P3Text2 = new javax.swing.JTextField();
        P3Text3 = new javax.swing.JTextField();
        P3Text4 = new javax.swing.JTextField();
        P3Text5 = new javax.swing.JTextField();
        P3Text6 = new javax.swing.JTextField();
        P3Text7 = new javax.swing.JTextField();
        P3Text8 = new javax.swing.JTextField();
        P3Text9 = new javax.swing.JTextField();
        P3Text10 = new javax.swing.JTextField();
        P3Text11 = new javax.swing.JTextField();
        P3Text12 = new javax.swing.JTextField();
        P3Text13 = new javax.swing.JTextField();
        P3Text14 = new javax.swing.JTextField();
        P3Text15 = new javax.swing.JTextField();
        P3Text16 = new javax.swing.JTextField();
        P3Text17 = new javax.swing.JTextField();
        P3Text18 = new javax.swing.JTextField();
        P3Text19 = new javax.swing.JTextField();
        P3Text20 = new javax.swing.JTextField();
        P4Text1 = new javax.swing.JTextField();
        P4Text2 = new javax.swing.JTextField();
        P4Text3 = new javax.swing.JTextField();
        P4Text4 = new javax.swing.JTextField();
        P4Text5 = new javax.swing.JTextField();
        P4Text6 = new javax.swing.JTextField();
        P4Text7 = new javax.swing.JTextField();
        P4Text8 = new javax.swing.JTextField();
        P4Text9 = new javax.swing.JTextField();
        P4Text10 = new javax.swing.JTextField();
        P4Text11 = new javax.swing.JTextField();
        P4Text12 = new javax.swing.JTextField();
        P4Text13 = new javax.swing.JTextField();
        P4Text14 = new javax.swing.JTextField();
        P4Text15 = new javax.swing.JTextField();
        P4Text16 = new javax.swing.JTextField();
        P4Text17 = new javax.swing.JTextField();
        P4Text18 = new javax.swing.JTextField();
        P4Text19 = new javax.swing.JTextField();
        P4Text20 = new javax.swing.JTextField();
        P1TotalText = new javax.swing.JTextField();
        P2TotalText = new javax.swing.JTextField();
        P3TotalText = new javax.swing.JTextField();
        P4TotalText = new javax.swing.JTextField();

        javax.swing.GroupLayout scorecardPanelLayout = new javax.swing.GroupLayout(scorecardPanel);
        scorecardPanel.setLayout(scorecardPanelLayout);
        scorecardPanelLayout.setHorizontalGroup(
            scorecardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        scorecardPanelLayout.setVerticalGroup(
            scorecardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        turnLabel1.setText("Turn 1");

        P1Text1.setText("0");
        P1Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1Text1ActionPerformed(evt);
            }
        });

        P1Text2.setText("0");

        P1Text3.setText("0");
        P1Text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1Text3ActionPerformed(evt);
            }
        });

        P1Text4.setText("0");

        P1Text5.setText("0");

        P1Text6.setText("0");

        P1Text7.setText("0");

        P1Text8.setText("0");

        P1Text9.setText("0");

        P1Text10.setText("0");

        P1Text11.setText("0");

        P1Text12.setText("0");

        P1Text13.setText("0");
        P1Text13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1Text13ActionPerformed(evt);
            }
        });

        P1Text14.setText("0");

        P1Text15.setText("0");

        P1Text16.setText("0");

        turnLabel2.setText("Turn 2");

        turnLabel3.setText("Turn 3");

        turnLabel4.setText("Turn 4");

        turnLabel5.setText("Turn 5");

        turnLabel6.setText("Turn 6");

        turnLabel7.setText("Turn 7");

        turnLabel8.setText("Turn 8");

        turnLabel9.setText("Turn 9");

        turnLabel10.setText("Turn 10");

        turnLabel11.setText("Turn 11");

        turnLabel12.setText("Turn 12");

        turnLabel13.setText("Turn 13");

        turnLabel14.setText("Turn 14");

        turnLabel15.setText("Turn 15");

        turnLabel16.setText("Turn 16");

        turnLabel17.setText("Turn 17");

        turnLabel18.setText("Turn 18");

        turnLabel19.setText("Turn 19");

        labelP1.setText("Player 1");

        turnLabel20.setText("Turn 20");

        labelP2.setText("Player 2");

        totalLabel.setText("Total ");

        labelP3.setText("Player 3");

        labelP4.setText("Player 4");

        P1Text17.setText("0");

        P1Text18.setText("0");

        P1Text19.setText("0");

        P1Text20.setText("0");

        P2Text1.setText("0");
        P2Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text1ActionPerformed(evt);
            }
        });

        P2Text2.setText("0");
        P2Text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text2ActionPerformed(evt);
            }
        });

        P2Text3.setText("0");
        P2Text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text3ActionPerformed(evt);
            }
        });

        P2Text4.setText("0");
        P2Text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text4ActionPerformed(evt);
            }
        });

        P2Text5.setText("0");
        P2Text5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text5ActionPerformed(evt);
            }
        });

        P2Text6.setText("0");
        P2Text6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text6ActionPerformed(evt);
            }
        });

        P2Text7.setText("0");
        P2Text7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text7ActionPerformed(evt);
            }
        });

        P2Text8.setText("0");
        P2Text8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text8ActionPerformed(evt);
            }
        });

        P2Text9.setText("0");
        P2Text9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text9ActionPerformed(evt);
            }
        });

        P2Text10.setText("0");
        P2Text10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text10ActionPerformed(evt);
            }
        });

        P2Text11.setText("0");
        P2Text11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text11ActionPerformed(evt);
            }
        });

        P2Text12.setText("0");
        P2Text12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text12ActionPerformed(evt);
            }
        });

        P2Text13.setText("0");
        P2Text13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text13ActionPerformed(evt);
            }
        });

        P2Text14.setText("0");
        P2Text14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text14ActionPerformed(evt);
            }
        });

        P2Text15.setText("0");
        P2Text15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text15ActionPerformed(evt);
            }
        });

        P2Text16.setText("0");
        P2Text16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text16ActionPerformed(evt);
            }
        });

        P2Text17.setText("0");
        P2Text17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text17ActionPerformed(evt);
            }
        });

        P2Text18.setText("0");
        P2Text18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text18ActionPerformed(evt);
            }
        });

        P2Text19.setText("0");
        P2Text19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text19ActionPerformed(evt);
            }
        });

        P2Text20.setText("0");
        P2Text20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2Text20ActionPerformed(evt);
            }
        });

        P3Text1.setText("0");
        P3Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text1ActionPerformed(evt);
            }
        });

        P3Text2.setText("0");
        P3Text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text2ActionPerformed(evt);
            }
        });

        P3Text3.setText("0");
        P3Text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text3ActionPerformed(evt);
            }
        });

        P3Text4.setText("0");
        P3Text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text4ActionPerformed(evt);
            }
        });

        P3Text5.setText("0");
        P3Text5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text5ActionPerformed(evt);
            }
        });

        P3Text6.setText("0");
        P3Text6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text6ActionPerformed(evt);
            }
        });

        P3Text7.setText("0");
        P3Text7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text7ActionPerformed(evt);
            }
        });

        P3Text8.setText("0");
        P3Text8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text8ActionPerformed(evt);
            }
        });

        P3Text9.setText("0");
        P3Text9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text9ActionPerformed(evt);
            }
        });

        P3Text10.setText("0");
        P3Text10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text10ActionPerformed(evt);
            }
        });

        P3Text11.setText("0");
        P3Text11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text11ActionPerformed(evt);
            }
        });

        P3Text12.setText("0");
        P3Text12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text12ActionPerformed(evt);
            }
        });

        P3Text13.setText("0");
        P3Text13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text13ActionPerformed(evt);
            }
        });

        P3Text14.setText("0");
        P3Text14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text14ActionPerformed(evt);
            }
        });

        P3Text15.setText("0");
        P3Text15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text15ActionPerformed(evt);
            }
        });

        P3Text16.setText("0");
        P3Text16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text16ActionPerformed(evt);
            }
        });

        P3Text17.setText("0");
        P3Text17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text17ActionPerformed(evt);
            }
        });

        P3Text18.setText("0");
        P3Text18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text18ActionPerformed(evt);
            }
        });

        P3Text19.setText("0");
        P3Text19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text19ActionPerformed(evt);
            }
        });

        P3Text20.setText("0");
        P3Text20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3Text20ActionPerformed(evt);
            }
        });

        P4Text1.setText("0");
        P4Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text1ActionPerformed(evt);
            }
        });

        P4Text2.setText("0");
        P4Text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text2ActionPerformed(evt);
            }
        });

        P4Text3.setText("0");
        P4Text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text3ActionPerformed(evt);
            }
        });

        P4Text4.setText("0");
        P4Text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text4ActionPerformed(evt);
            }
        });

        P4Text5.setText("0");
        P4Text5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text5ActionPerformed(evt);
            }
        });

        P4Text6.setText("0");
        P4Text6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text6ActionPerformed(evt);
            }
        });

        P4Text7.setText("0");
        P4Text7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text7ActionPerformed(evt);
            }
        });

        P4Text8.setText("0");
        P4Text8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text8ActionPerformed(evt);
            }
        });

        P4Text9.setText("0");
        P4Text9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text9ActionPerformed(evt);
            }
        });

        P4Text10.setText("0");
        P4Text10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text10ActionPerformed(evt);
            }
        });

        P4Text11.setText("0");
        P4Text11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text11ActionPerformed(evt);
            }
        });

        P4Text12.setText("0");
        P4Text12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text12ActionPerformed(evt);
            }
        });

        P4Text13.setText("0");
        P4Text13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text13ActionPerformed(evt);
            }
        });

        P4Text14.setText("0");
        P4Text14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text14ActionPerformed(evt);
            }
        });

        P4Text15.setText("0");
        P4Text15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text15ActionPerformed(evt);
            }
        });

        P4Text16.setText("0");
        P4Text16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text16ActionPerformed(evt);
            }
        });

        P4Text17.setText("0");
        P4Text17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text17ActionPerformed(evt);
            }
        });

        P4Text18.setText("0");
        P4Text18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text18ActionPerformed(evt);
            }
        });

        P4Text19.setText("0");
        P4Text19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text19ActionPerformed(evt);
            }
        });

        P4Text20.setText("0");
        P4Text20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4Text20ActionPerformed(evt);
            }
        });

        P1TotalText.setText("0");
        P1TotalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1TotalTextActionPerformed(evt);
            }
        });

        P2TotalText.setText("0");
        P2TotalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2TotalTextActionPerformed(evt);
            }
        });

        P3TotalText.setText("0");
        P3TotalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3TotalTextActionPerformed(evt);
            }
        });

        P4TotalText.setText("0");
        P4TotalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4TotalTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(turnLabel1)
                        .addComponent(turnLabel2)
                        .addComponent(turnLabel3)
                        .addComponent(turnLabel4)
                        .addComponent(turnLabel5)
                        .addComponent(turnLabel6)
                        .addComponent(turnLabel7)
                        .addComponent(turnLabel8)
                        .addComponent(turnLabel9))
                    .addComponent(turnLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(P1TotalText, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(P1Text19, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P1Text20, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(P2Text20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P3Text20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(P2TotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P3TotalText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4TotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P2Text19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P3Text19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(P1Text18)
                                .addComponent(P1Text16)
                                .addComponent(P1Text15, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text14, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text13, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1Text1)
                                .addComponent(P1Text17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                            .addComponent(labelP1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(P2Text2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(P2Text3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text13, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text14, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text15, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text16, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text17, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text18, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P2Text1))
                            .addComponent(labelP2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4Text17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P3Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(labelP3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P4Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(labelP4))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3Text18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P4Text19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P4Text18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P4Text20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelP1)
                    .addComponent(labelP2)
                    .addComponent(labelP3)
                    .addComponent(labelP4))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turnLabel1)
                    .addComponent(P1Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel2)
                    .addComponent(P2Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel3)
                    .addComponent(P2Text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel4)
                    .addComponent(P2Text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel5)
                    .addComponent(P2Text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel6)
                    .addComponent(P2Text6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel7)
                    .addComponent(P2Text7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel8)
                    .addComponent(P2Text8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel9)
                    .addComponent(P2Text9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel10)
                    .addComponent(P2Text10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel11)
                    .addComponent(P2Text11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel12)
                    .addComponent(P2Text12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel13)
                    .addComponent(P2Text13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel14)
                    .addComponent(P2Text14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel15)
                    .addComponent(P2Text15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Text16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnLabel16)
                    .addComponent(P2Text16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turnLabel17)
                    .addComponent(P1Text17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2Text17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turnLabel18)
                    .addComponent(P1Text18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2Text18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turnLabel19)
                    .addComponent(P1Text19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2Text19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turnLabel20)
                    .addComponent(P1Text20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2Text20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3Text20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4Text20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(P1TotalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2TotalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3TotalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4TotalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P1Text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1Text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P1Text1ActionPerformed

    private void P1Text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1Text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P1Text3ActionPerformed

    private void P1Text13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1Text13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P1Text13ActionPerformed

    private void P2Text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text1ActionPerformed

    private void P2Text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text2ActionPerformed

    private void P2Text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text3ActionPerformed

    private void P2Text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text4ActionPerformed

    private void P2Text5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text5ActionPerformed

    private void P2Text6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text6ActionPerformed

    private void P2Text7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text7ActionPerformed

    private void P2Text8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text8ActionPerformed

    private void P2Text9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text9ActionPerformed

    private void P2Text10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text10ActionPerformed

    private void P2Text11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text11ActionPerformed

    private void P2Text12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text12ActionPerformed

    private void P2Text13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text13ActionPerformed

    private void P2Text14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text14ActionPerformed

    private void P2Text15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text15ActionPerformed

    private void P2Text16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text16ActionPerformed

    private void P2Text17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text17ActionPerformed

    private void P2Text18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text18ActionPerformed

    private void P2Text19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text19ActionPerformed

    private void P2Text20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2Text20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2Text20ActionPerformed

    private void P3Text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text1ActionPerformed

    private void P3Text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text2ActionPerformed

    private void P3Text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text3ActionPerformed

    private void P3Text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text4ActionPerformed

    private void P3Text5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text5ActionPerformed

    private void P3Text6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text6ActionPerformed

    private void P3Text7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text7ActionPerformed

    private void P3Text8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text8ActionPerformed

    private void P3Text9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text9ActionPerformed

    private void P3Text10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text10ActionPerformed

    private void P3Text11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text11ActionPerformed

    private void P3Text12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text12ActionPerformed

    private void P3Text13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text13ActionPerformed

    private void P3Text14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text14ActionPerformed

    private void P3Text15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text15ActionPerformed

    private void P3Text16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text16ActionPerformed

    private void P3Text17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text17ActionPerformed

    private void P3Text18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text18ActionPerformed

    private void P3Text19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text19ActionPerformed

    private void P3Text20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3Text20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3Text20ActionPerformed

    private void P4Text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text1ActionPerformed

    private void P4Text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text2ActionPerformed

    private void P4Text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text3ActionPerformed

    private void P4Text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text4ActionPerformed

    private void P4Text5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text5ActionPerformed

    private void P4Text6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text6ActionPerformed

    private void P4Text7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text7ActionPerformed

    private void P4Text8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text8ActionPerformed

    private void P4Text9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text9ActionPerformed

    private void P4Text10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text10ActionPerformed

    private void P4Text11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text11ActionPerformed

    private void P4Text12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text12ActionPerformed

    private void P4Text13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text13ActionPerformed

    private void P4Text14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text14ActionPerformed

    private void P4Text15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text15ActionPerformed

    private void P4Text16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text16ActionPerformed

    private void P4Text17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text17ActionPerformed

    private void P4Text18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text18ActionPerformed

    private void P4Text19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text19ActionPerformed

    private void P4Text20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4Text20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4Text20ActionPerformed

    private void P1TotalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1TotalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P1TotalTextActionPerformed

    private void P2TotalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2TotalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2TotalTextActionPerformed

    private void P3TotalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3TotalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3TotalTextActionPerformed

    private void P4TotalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4TotalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4TotalTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(scorecardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scorecardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scorecardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scorecardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        String players[] = {"Joe", "Amy", "Karl", "Mallory"};

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scorecardFrame(players).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField P1Text1;
    private javax.swing.JTextField P1Text10;
    private javax.swing.JTextField P1Text11;
    private javax.swing.JTextField P1Text12;
    private javax.swing.JTextField P1Text13;
    private javax.swing.JTextField P1Text14;
    private javax.swing.JTextField P1Text15;
    private javax.swing.JTextField P1Text16;
    private javax.swing.JTextField P1Text17;
    private javax.swing.JTextField P1Text18;
    private javax.swing.JTextField P1Text19;
    private javax.swing.JTextField P1Text2;
    private javax.swing.JTextField P1Text20;
    private javax.swing.JTextField P1Text3;
    private javax.swing.JTextField P1Text4;
    private javax.swing.JTextField P1Text5;
    private javax.swing.JTextField P1Text6;
    private javax.swing.JTextField P1Text7;
    private javax.swing.JTextField P1Text8;
    private javax.swing.JTextField P1Text9;
    private javax.swing.JTextField P1TotalText;
    private javax.swing.JTextField P2Text1;
    private javax.swing.JTextField P2Text10;
    private javax.swing.JTextField P2Text11;
    private javax.swing.JTextField P2Text12;
    private javax.swing.JTextField P2Text13;
    private javax.swing.JTextField P2Text14;
    private javax.swing.JTextField P2Text15;
    private javax.swing.JTextField P2Text16;
    private javax.swing.JTextField P2Text17;
    private javax.swing.JTextField P2Text18;
    private javax.swing.JTextField P2Text19;
    private javax.swing.JTextField P2Text2;
    private javax.swing.JTextField P2Text20;
    private javax.swing.JTextField P2Text3;
    private javax.swing.JTextField P2Text4;
    private javax.swing.JTextField P2Text5;
    private javax.swing.JTextField P2Text6;
    private javax.swing.JTextField P2Text7;
    private javax.swing.JTextField P2Text8;
    private javax.swing.JTextField P2Text9;
    private javax.swing.JTextField P2TotalText;
    private javax.swing.JTextField P3Text1;
    private javax.swing.JTextField P3Text10;
    private javax.swing.JTextField P3Text11;
    private javax.swing.JTextField P3Text12;
    private javax.swing.JTextField P3Text13;
    private javax.swing.JTextField P3Text14;
    private javax.swing.JTextField P3Text15;
    private javax.swing.JTextField P3Text16;
    private javax.swing.JTextField P3Text17;
    private javax.swing.JTextField P3Text18;
    private javax.swing.JTextField P3Text19;
    private javax.swing.JTextField P3Text2;
    private javax.swing.JTextField P3Text20;
    private javax.swing.JTextField P3Text3;
    private javax.swing.JTextField P3Text4;
    private javax.swing.JTextField P3Text5;
    private javax.swing.JTextField P3Text6;
    private javax.swing.JTextField P3Text7;
    private javax.swing.JTextField P3Text8;
    private javax.swing.JTextField P3Text9;
    private javax.swing.JTextField P3TotalText;
    private javax.swing.JTextField P4Text1;
    private javax.swing.JTextField P4Text10;
    private javax.swing.JTextField P4Text11;
    private javax.swing.JTextField P4Text12;
    private javax.swing.JTextField P4Text13;
    private javax.swing.JTextField P4Text14;
    private javax.swing.JTextField P4Text15;
    private javax.swing.JTextField P4Text16;
    private javax.swing.JTextField P4Text17;
    private javax.swing.JTextField P4Text18;
    private javax.swing.JTextField P4Text19;
    private javax.swing.JTextField P4Text2;
    private javax.swing.JTextField P4Text20;
    private javax.swing.JTextField P4Text3;
    private javax.swing.JTextField P4Text4;
    private javax.swing.JTextField P4Text5;
    private javax.swing.JTextField P4Text6;
    private javax.swing.JTextField P4Text7;
    private javax.swing.JTextField P4Text8;
    private javax.swing.JTextField P4Text9;
    private javax.swing.JTextField P4TotalText;
    private javax.swing.JLabel labelP1;
    private javax.swing.JLabel labelP2;
    private javax.swing.JLabel labelP3;
    private javax.swing.JLabel labelP4;
    private javax.swing.JPanel scorecardPanel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel turnLabel1;
    private javax.swing.JLabel turnLabel10;
    private javax.swing.JLabel turnLabel11;
    private javax.swing.JLabel turnLabel12;
    private javax.swing.JLabel turnLabel13;
    private javax.swing.JLabel turnLabel14;
    private javax.swing.JLabel turnLabel15;
    private javax.swing.JLabel turnLabel16;
    private javax.swing.JLabel turnLabel17;
    private javax.swing.JLabel turnLabel18;
    private javax.swing.JLabel turnLabel19;
    private javax.swing.JLabel turnLabel2;
    private javax.swing.JLabel turnLabel20;
    private javax.swing.JLabel turnLabel3;
    private javax.swing.JLabel turnLabel4;
    private javax.swing.JLabel turnLabel5;
    private javax.swing.JLabel turnLabel6;
    private javax.swing.JLabel turnLabel7;
    private javax.swing.JLabel turnLabel8;
    private javax.swing.JLabel turnLabel9;
    // End of variables declaration//GEN-END:variables

private JTextField[] oneText;
private JTextField[] twoText;
private JTextField[] threeText;
private JTextField[] fourText;
private JTextField[] totalText;

private JLabel[] playerLabels;

private String[] playerNames;

}
