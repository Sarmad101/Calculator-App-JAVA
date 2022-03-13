


public class calculator extends javax.swing.JFrame {

   String text1=null,text2=null;
   
   boolean t1=true,t2=false,doer=false,hint=false;
   
   
   
   
   
    public calculator() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jButton1.setText("9");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("6");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("5");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("7");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("C");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("=");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton11.setText("-");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("1");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("2");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("3");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("+");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("0");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("/");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("X");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
   if(doer==true){
            jLabel1.setText("");
        }
   doer=false;
       
   
        
         if(t1==true){
        text1="2";
       hint=true;
       
    text1=jLabel1.getText()+text1;
     
     jLabel1.setText(text1); 
     
         }
        
          if(t2==true){
                hint=false;
                jLabel1.setText(text2);
                 text2="2";
                
                 if(commer==true){
                     jLabel1.setText("");
                 
                 }
                 else{
                 
             
              
          
                 }
             text2=jLabel1.getText()+text2;
        commer=false;
        
            
     
     
     jLabel1.setText(text1+calc+ text2); 
    
         
         
          }
        
        
         
         
             // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        if(doer==true){
            jLabel1.setText("");
        }
        doer=false;
        
   
        
         if(t1==true){
        text1="0";
       hint=true;
       
    text1=jLabel1.getText()+text1;
     
     jLabel1.setText(text1); 
     
         }
        
          if(t2==true){
                hint=false;
                jLabel1.setText(text2);
                 text2="0";
                
                 if(commer==true){
                     jLabel1.setText("");
                 
                 }
                 else{
                 
             
              
          
                 }
             text2=jLabel1.getText()+text2;
        commer=false;
        
            
     
     
     jLabel1.setText(text1+calc+ text2); 
    
         
         
          }
        
        
         




    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

       if(doer==true){
            jLabel1.setText("");
        }
       doer=false;
       
   
        
         if(t1==true){
        text1="1";
       
       hint=true;
    text1=jLabel1.getText()+text1;
     
     jLabel1.setText(text1); 
     
         }
        
          if(t2==true){
                hint=false;
                jLabel1.setText(text2);
                 text2="1";
                
                 if(commer==true){
                     jLabel1.setText("");
                 
                 }
                 else{
                 
             
              
          
                 }
             text2=jLabel1.getText()+text2;
        commer=false;
        
            
     
     
     jLabel1.setText(text1+calc+ text2); 
    
         
         
          }
        
        
         
         
     

     
// TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

         if(doer==true){
            jLabel1.setText("");
        }
         doer=false;
      
   
        
         if(t1==true){
        text1="3";
       hint=true;
       
    text1=jLabel1.getText()+text1;
     
     jLabel1.setText(text1); 
     
         }
        
          if(t2==true){
                hint=false;
                jLabel1.setText(text2);
                 text2="3";
                
                 if(commer==true){
                     jLabel1.setText("");
                 
                 }
                 else{
                 
             
              
          
                 }
             text2=jLabel1.getText()+text2;
        commer=false;
        
            
     
     
     jLabel1.setText(text1+calc+ text2); 
    
         
         
          }
        
        
         
         
         
         
    
             // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 if(doer==true){
            jLabel1.setText("");
        }
 doer=false;
        
      
   
        
         if(t1==true){
        text1="4";
       hint=true;
       
    text1=jLabel1.getText()+text1;
     
     jLabel1.setText(text1); 
     
         }
        
          if(t2==true){
                hint=false;
                jLabel1.setText(text2);
                 text2="4";
                
                 if(commer==true){
                     jLabel1.setText("");
                 
                 }
                 else{
                 
             
              
          
                 }
             text2=jLabel1.getText()+text2;
        commer=false;
        
            
     
     
     jLabel1.setText(text1+calc+ text2); 
    
         
         
          }
        
        
         
         
         
         
             // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  if(doer==true){
            jLabel1.setText("");
        }
  doer=false;
        
       
   
        
         if(t1==true){
             hint=true;
        text1="5";
       
       
    text1=jLabel1.getText()+text1;
     
     jLabel1.setText(text1); 
     
         }
        
          if(t2==true){
                hint=false;
                jLabel1.setText(text2);
                 text2="5";
                
                 if(commer==true){
                     jLabel1.setText("");
                 
                 }
                 else{
                 
             
              
          
                 }
             text2=jLabel1.getText()+text2;
        commer=false;
        
            
     
     
     jLabel1.setText(text1+calc+ text2); 
    
         
         
          }
        
        
         
         
         
         
             // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
        if(doer==true){
            jLabel1.setText("");
        }
        doer=false;
        
   
        
         if(t1==true){
             hint=true;
        text1="6";
       
       
    text1=jLabel1.getText()+text1;
     
     jLabel1.setText(text1); 
     
         }
        
          if(t2==true){
                hint=false;
                jLabel1.setText(text2);
                 text2="6";
                
                 if(commer==true){
                     jLabel1.setText("");
                 
                 }
                 else{
                 
             
              
          
                 }
             text2=jLabel1.getText()+text2;
        commer=false;
        
            
     
     
     jLabel1.setText(text1+calc+ text2); 
    
         
         
          }
        
        
         
         
         
         
             // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  
        
        if(doer==true){
            jLabel1.setText("");
        }
        doer=false;
     
   
        
         if(t1==true){
        text1="7";
       hint=true;
       
    text1=jLabel1.getText()+text1;
     
     jLabel1.setText(text1); 
     
         }
        
          if(t2==true){
              hint=false;
                jLabel1.setText(text2);
                 text2="7";
                
                 if(commer==true){
                     jLabel1.setText("");
                 
                 }
                 else{
                 
             
              
          
                 }
             text2=jLabel1.getText()+text2;
        commer=false;
        
            
     
     
     jLabel1.setText(text1+calc+ text2); 
    
         
         
          }
        
        
         
         
         
             // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
String text3=null;
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 
        
        if(doer==true){
            jLabel1.setText("");
        }
        doer=false;
       
   
        
         if(t1==true){
        text1="8";
       hint=true;
       
    text1=jLabel1.getText()+text1;
     
     jLabel1.setText(text1); 
     
         }
        
          if(t2==true){
              hint=false;
                jLabel1.setText(text2);
                 text2="8";
                
                 if(commer==true){
                     jLabel1.setText("");
                 
                 }
                 else{
                 
             
              
          
                 }
             text2=jLabel1.getText()+text2;
        commer=false;
        
            
     
     
     jLabel1.setText(text1+calc+ text2); 
    
         
         
          }
        
        
         
         
         
         
             // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed
int counter=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
 
        if(doer==true){
            jLabel1.setText("");
        }
 doer=false;
     
        
        
         if(t1==true){
              hint=true;
        text1="9";
       
       
    text1=jLabel1.getText()+text1;
     
     jLabel1.setText(text1); 
     
         }
        
          if(t2==true){
              hint=false;
                jLabel1.setText(text2);
                 text2="9";
                
                 if(commer==true){
                     jLabel1.setText("");
                 
                 }
                 else{
                 
             
              
          
                 }
             text2=jLabel1.getText()+text2;
        commer=false;
        
            
     
     
     jLabel1.setText(text1+calc+ text2); 
    
         
         
          }
        
        
         
         
         
         
         
             // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    String calc;
    char select;
    int count1=0,count2=0,minus=0,divid=0;
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        
        
       if(hint==true){
           if(count1==0){
           commer=true;
           }
       t1=false;
        t2=true;
        if( count1==0){
        calc="+";
        
        select='+';
        jLabel1.setText(text1+"+"); 
        }
        count1++;
       }
        
        
    
       
   // text1=jLabel1.getText()+text1;
     
      
      
      


    }//GEN-LAST:event_jButton15ActionPerformed

    String rresult=null;
   
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

       doer=true;
    int a=0,b=0, result;
    a=Integer.parseInt(text1);
    
    b=Integer.parseInt(text2);
    
    try{
        switch(select){
            case '+':
                result=a+b;
                rresult=String.valueOf(result);
                jLabel1.setText(rresult);
                break;
            case '-':
                result=a-b;
                rresult=String.valueOf(result);
                jLabel1.setText(rresult);
                break;
            case '/':
                result=a/b;
                rresult=String.valueOf(result);
                jLabel1.setText(rresult);
                break;
            case '*':
                result=a*b;
                rresult=String.valueOf(result);
                jLabel1.setText(rresult);
                break;
        }
        
        
    }
    catch(Exception e){
        jLabel1.setText("Error");
    }
    
     count1=0;
       
        text1=null;
        text2=null;
        text3=null;
        t1=true;
        t2=false;
        counter=0;
        hint=false;
        commer=false;
    






// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 
         if(hint==true){
        
        t1=false;
        t2=true;
        
         if( count1==0){
             commer=true;
        calc="-";
        
        select='-';
        jLabel1.setText(text1+"-"); 
        }
        count1++;
        
         }




// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
 
         if(hint==true){
         t1=false;
        t2=true;
       
        if( count1==0){
            commer=true;
        calc="X";
        
        select='*';
        jLabel1.setText(text1+"X"); 
        }
        count1++;
        
         }
        
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
 
         if(hint==true){
         t1=false;
        t2=true;
        
        if( count1==0){
            commer=true;
        calc="/";
        
        select='/';
        jLabel1.setText(text1+"/"); 
        }
        count1++;
         }
        
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        count1=0;
        jLabel1.setText("");
        text1=null;
        text2=null;
        text3=null;
        t1=true;
        t2=false;
        counter=0;
        hint=false;
        commer=false;



    }//GEN-LAST:event_jButton6ActionPerformed

    boolean commer=false;
   
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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
