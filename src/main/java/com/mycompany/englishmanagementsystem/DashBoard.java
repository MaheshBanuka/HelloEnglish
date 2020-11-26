/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.englishmanagementsystem;

/**
 *
 * @author manul
 */
public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ButtonPanel = new javax.swing.JPanel();
        taskOne_btn = new javax.swing.JButton();
        taskTwo_btn = new javax.swing.JButton();
        taskThree_btn = new javax.swing.JButton();
        taskFive_btn = new javax.swing.JButton();
        taskFour_btn = new javax.swing.JButton();
        CardLayOut = new javax.swing.JPanel();
        TaskOnePanel = new javax.swing.JPanel();
        ButtonPanelTaskOne = new javax.swing.JPanel();
        test_btn = new javax.swing.JButton();
        introduction_btn = new javax.swing.JButton();
        tutorial_btn = new javax.swing.JButton();
        TaskOneMainPanel = new javax.swing.JPanel();
        Introduction = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tutorial = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Test = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TaskTwoPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonPanel.setBackground(new java.awt.Color(204, 204, 255));

        taskOne_btn.setText("Task 1");
        taskOne_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskOne_btnActionPerformed(evt);
            }
        });

        taskTwo_btn.setText("Task 2");
        taskTwo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskTwo_btnActionPerformed(evt);
            }
        });

        taskThree_btn.setText("Task 3");
        taskThree_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskThree_btnActionPerformed(evt);
            }
        });

        taskFive_btn.setText("Task 5");
        taskFive_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskFive_btnActionPerformed(evt);
            }
        });

        taskFour_btn.setText("Task 4");
        taskFour_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskFour_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taskOne_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taskTwo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(taskThree_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(taskFour_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(taskFive_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskOne_btn)
                    .addComponent(taskTwo_btn)
                    .addComponent(taskThree_btn)
                    .addComponent(taskFive_btn)
                    .addComponent(taskFour_btn))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        CardLayOut.setBackground(new java.awt.Color(204, 204, 255));
        CardLayOut.setLayout(new java.awt.CardLayout());

        TaskOnePanel.setBackground(new java.awt.Color(204, 204, 255));

        test_btn.setText("Test");
        test_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test_btnActionPerformed(evt);
            }
        });

        introduction_btn.setText("Instruction");
        introduction_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introduction_btnActionPerformed(evt);
            }
        });

        tutorial_btn.setText("Tutorial");
        tutorial_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorial_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelTaskOneLayout = new javax.swing.GroupLayout(ButtonPanelTaskOne);
        ButtonPanelTaskOne.setLayout(ButtonPanelTaskOneLayout);
        ButtonPanelTaskOneLayout.setHorizontalGroup(
            ButtonPanelTaskOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelTaskOneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(introduction_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(tutorial_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(test_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        ButtonPanelTaskOneLayout.setVerticalGroup(
            ButtonPanelTaskOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelTaskOneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ButtonPanelTaskOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(test_btn)
                    .addComponent(introduction_btn)
                    .addComponent(tutorial_btn))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        TaskOneMainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Introduction");

        javax.swing.GroupLayout IntroductionLayout = new javax.swing.GroupLayout(Introduction);
        Introduction.setLayout(IntroductionLayout);
        IntroductionLayout.setHorizontalGroup(
            IntroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntroductionLayout.createSequentialGroup()
                .addGap(635, 635, 635)
                .addComponent(jLabel1)
                .addContainerGap(646, Short.MAX_VALUE))
        );
        IntroductionLayout.setVerticalGroup(
            IntroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntroductionLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        TaskOneMainPanel.add(Introduction, "card4");

        jLabel2.setText("Tutorial");

        javax.swing.GroupLayout TutorialLayout = new javax.swing.GroupLayout(Tutorial);
        Tutorial.setLayout(TutorialLayout);
        TutorialLayout.setHorizontalGroup(
            TutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TutorialLayout.createSequentialGroup()
                .addGap(596, 596, 596)
                .addComponent(jLabel2)
                .addContainerGap(709, Short.MAX_VALUE))
        );
        TutorialLayout.setVerticalGroup(
            TutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TutorialLayout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(208, 208, 208))
        );

        TaskOneMainPanel.add(Tutorial, "card3");

        jLabel3.setText("Test");

        javax.swing.GroupLayout TestLayout = new javax.swing.GroupLayout(Test);
        Test.setLayout(TestLayout);
        TestLayout.setHorizontalGroup(
            TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestLayout.createSequentialGroup()
                .addGap(583, 583, 583)
                .addComponent(jLabel3)
                .addContainerGap(741, Short.MAX_VALUE))
        );
        TestLayout.setVerticalGroup(
            TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel3)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        TaskOneMainPanel.add(Test, "card2");

        javax.swing.GroupLayout TaskOnePanelLayout = new javax.swing.GroupLayout(TaskOnePanel);
        TaskOnePanel.setLayout(TaskOnePanelLayout);
        TaskOnePanelLayout.setHorizontalGroup(
            TaskOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaskOnePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TaskOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonPanelTaskOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TaskOneMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        TaskOnePanelLayout.setVerticalGroup(
            TaskOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaskOnePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonPanelTaskOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TaskOneMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        CardLayOut.add(TaskOnePanel, "card3");

        javax.swing.GroupLayout TaskTwoPanelLayout = new javax.swing.GroupLayout(TaskTwoPanel);
        TaskTwoPanel.setLayout(TaskTwoPanelLayout);
        TaskTwoPanelLayout.setHorizontalGroup(
            TaskTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1369, Short.MAX_VALUE)
        );
        TaskTwoPanelLayout.setVerticalGroup(
            TaskTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        CardLayOut.add(TaskTwoPanel, "card2");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CardLayOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CardLayOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taskOne_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskOne_btnActionPerformed
        CardLayOut.removeAll();
        CardLayOut.repaint();
        CardLayOut.revalidate();

        CardLayOut.add(TaskOnePanel);
    }//GEN-LAST:event_taskOne_btnActionPerformed

    private void taskTwo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskTwo_btnActionPerformed
        CardLayOut.removeAll();
        CardLayOut.repaint();
        CardLayOut.revalidate();

        CardLayOut.add(TaskTwoPanel);
    }//GEN-LAST:event_taskTwo_btnActionPerformed

    private void taskThree_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskThree_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskThree_btnActionPerformed

    private void taskFive_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskFive_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskFive_btnActionPerformed

    private void taskFour_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskFour_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskFour_btnActionPerformed

    private void test_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_test_btnActionPerformed

    private void introduction_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introduction_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_introduction_btnActionPerformed

    private void tutorial_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorial_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tutorial_btnActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel ButtonPanelTaskOne;
    private javax.swing.JPanel CardLayOut;
    private javax.swing.JPanel Introduction;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel TaskOneMainPanel;
    private javax.swing.JPanel TaskOnePanel;
    private javax.swing.JPanel TaskTwoPanel;
    private javax.swing.JPanel Test;
    private javax.swing.JPanel Tutorial;
    private javax.swing.JButton introduction_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton taskFive_btn;
    private javax.swing.JButton taskFour_btn;
    private javax.swing.JButton taskOne_btn;
    private javax.swing.JButton taskThree_btn;
    private javax.swing.JButton taskTwo_btn;
    private javax.swing.JButton test_btn;
    private javax.swing.JButton tutorial_btn;
    // End of variables declaration//GEN-END:variables
}
