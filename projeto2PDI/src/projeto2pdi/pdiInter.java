/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * pdiInter.java
 *
 * Created on 30/09/2011, 13:23:12
 */
package projeto2pdi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;


/**
 *
 * @author Ramon
 */
public class pdiInter extends javax.swing.JFrame {
   private static BufferedImage NULL;
  
    /** Creates new form pdiInter */
    public pdiInter() {
        initComponents();
        a1.setText("a.1");
        a2.setText("a.2");
        agucamento.setText("Aguçamento");
        Inicio();
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMascaraArquivo = new javax.swing.JMenu();
        agucamento = new javax.swing.JMenu();
        a1 = new javax.swing.JMenuItem();
        a2 = new javax.swing.JMenuItem();
        bordas = new javax.swing.JMenu();
        b1 = new javax.swing.JMenuItem();
        b2 = new javax.swing.JMenuItem();
        b3 = new javax.swing.JMenuItem();
        b4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        c1 = new javax.swing.JMenuItem();
        c2 = new javax.swing.JMenuItem();
        c3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        media = new javax.swing.JMenu();
        histograma = new javax.swing.JMenu();
        expansao = new javax.swing.JMenuItem();
        equalizacao = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jFrame1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jFrame1ComponentResized(evt);
            }
        });

        jMenuMascaraArquivo.setText("Mascara arquivo");
        jMenuMascaraArquivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMascaraArquivoMouseClicked(evt);
            }
        });
        jMenuMascaraArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMascaraArquivoActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuMascaraArquivo);

        agucamento.setText("Aguçamento");

        a1.setText("a.1");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        agucamento.add(a1);

        a2.setText("a.2");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        agucamento.add(a2);

        jMenuBar1.add(agucamento);

        bordas.setText("Bordas");

        b1.setText("b.1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        bordas.add(b1);

        b2.setText("b.2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        bordas.add(b2);

        b3.setText("b.3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        bordas.add(b3);

        b4.setText("b.4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        bordas.add(b4);

        jMenuBar1.add(bordas);

        jMenu3.setText("Relevo");

        c1.setText("c.1");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jMenu3.add(c1);

        c2.setText("c.2");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        jMenu3.add(c2);

        c3.setText("c.3");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        jMenu3.add(c3);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Gaussiano");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        media.setText("Média");
        media.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mediaMouseClicked(evt);
            }
        });
        media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaActionPerformed(evt);
            }
        });
        jMenuBar1.add(media);

        histograma.setText("Histograma");

        expansao.setText("Expansao");
        expansao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expansaoActionPerformed(evt);
            }
        });
        histograma.add(expansao);

        equalizacao.setText("Equalizacao");
        equalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalizacaoActionPerformed(evt);
            }
        });
        histograma.add(equalizacao);

        jMenuBar1.add(histograma);

        jMenu1.setText("Fechar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Voltar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("pDI"); // NOI18N

        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jFileChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jFileChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jLayeredPane1.add(jPanel1);
        jPanel1.setBounds(10, 30, 700, 480);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("h 1,0");

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("h 1,1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("h 1,-1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("h 0,1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("h 0,0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("h -1,0");

        jLabel7.setBackground(new java.awt.Color(255, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("h -1,1");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("h -1,-1");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("h 0,-1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, 0, 0, Short.MAX_VALUE)
                    .addComponent(jTextField3, 0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField5)
                            .addComponent(jTextField2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(572, 572, 572))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(284, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel2);
        jPanel2.setBounds(0, 0, 710, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
private void Inicio(){
    jPanel2.setVisible(false);
   
}








    
public BufferedImage LeImagem(){
            File foto=jFileChooser2.getSelectedFile();
            BufferedImage imagem1=NULL;
            
           try{
               
            imagem1 = ImageIO.read(foto);
            
            ImageIcon icon = new ImageIcon(imagem1);
            
            
            //icon.setImage(icon.getImage().getScaledInstance(200, 200, 10));  
            
           
            JLabel imageMi = new JLabel(icon);
            FlowLayout flow = new FlowLayout();
            
            Container novo=jFrame1.getLayeredPane();
            novo.setLayout(flow);
            
            novo.setSize(1000, 700);
            novo.remove(0);
            novo.add(new JScrollPane(imageMi));
            
            
            jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame1.setSize(1300, 700);
            jFrame1.setVisible(true);
            
            
             
           }
           
           catch(IOException e){
            e.printStackTrace();
            System.out.println("Erro! Verifique se o arquivo especificado existe e tente novamente.");
        }
            catch(Exception e){
            System.out.println("Erro! !" + e.getMessage());
            e.printStackTrace();
        }
        return imagem1;
}


private void jFrame1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jFrame1ComponentResized
// TODO add your handling code here:
}//GEN-LAST:event_jFrame1ComponentResized

private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed
        
           
        File foto=jFileChooser2.getSelectedFile();
       
      try{
            
            BufferedImage imagem1 = ImageIO.read(foto);
            BufferedImage imagem2=imagem1;
            ImageIcon icon = new ImageIcon(imagem1);
            JLabel imageMi = new JLabel(icon);
            
            ImageIcon icon2 = new ImageIcon(imagem2);
            JLabel imageMi2 = new JLabel(icon2);
            FlowLayout flow = new FlowLayout();
            
            Container novo=jFrame1.getLayeredPane();
            novo.setLayout(flow);
            novo.setSize(1000,650);
            novo.add(new JScrollPane(imageMi));
            novo.add(new JScrollPane(imageMi2));
            
            jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame1.setSize(1300, 1000);
            
            
            jFrame1.setVisible(true);
            
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Erro! Verifique se o arquivo especificado existe e tente novamente.");
        }
        catch(Exception e){
            System.out.println("Erro! !" + e.getMessage());
            e.printStackTrace();
        }
   
}//GEN-LAST:event_jFileChooser2ActionPerformed

private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
            BufferedImage imagem1=LeImagem();
            Convolution filtro=new Convolution();
            String c1=JOptionPane.showInputDialog("Digite o valor de c",null);
            String d1=JOptionPane.showInputDialog("Digite o valor de d",null);
            double c=Double.parseDouble(c1);
            double d=Double.parseDouble(d1);
            filtro.convAgucamento1(imagem1,c,d);
            imagem1=LeImagem();
}//GEN-LAST:event_a1ActionPerformed

private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
            BufferedImage imagem1=LeImagem();
            Convolution filtro=new Convolution();
            String c1=JOptionPane.showInputDialog("Digite o valor de c",null);
            String d1=JOptionPane.showInputDialog("Digite o valor de d",null);
            double c=Double.parseDouble(c1);
            double d=Double.parseDouble(d1);
            filtro.convAgucamento2(imagem1,c,d);
            imagem1=LeImagem();

}//GEN-LAST:event_a2ActionPerformed

private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
            BufferedImage imagem1=LeImagem();
            Convolution filtro=new Convolution();
            filtro.convBordas1(imagem1);
            imagem1=LeImagem();
}//GEN-LAST:event_b1ActionPerformed

private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
            BufferedImage imagem1=LeImagem();
            Convolution filtro=new Convolution();
            filtro.convBordas2(imagem1);
            imagem1=LeImagem();
}//GEN-LAST:event_b2ActionPerformed

private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
            BufferedImage imagem1=LeImagem();
            Convolution filtro=new Convolution();
            filtro.convBordas3(imagem1);
            imagem1=LeImagem();
}//GEN-LAST:event_b3ActionPerformed

private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
            BufferedImage imagem1=LeImagem();
            Convolution filtro=new Convolution();
            filtro.convBordas4(imagem1);
            imagem1=LeImagem();
}//GEN-LAST:event_b4ActionPerformed

private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
            BufferedImage imagem1=LeImagem();
            Convolution filtro=new Convolution();
            filtro.convRelevo1(imagem1);
            imagem1=LeImagem();
}//GEN-LAST:event_c1ActionPerformed

private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
            BufferedImage imagem1=LeImagem();
            Convolution filtro=new Convolution();
            filtro.convBordas2(imagem1);
            imagem1=LeImagem();
}//GEN-LAST:event_c2ActionPerformed

private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
            BufferedImage imagem1=LeImagem();
            Convolution filtro=new Convolution();
            filtro.convBordas3(imagem1);
            imagem1=LeImagem();
}//GEN-LAST:event_c3ActionPerformed

private void expansaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expansaoActionPerformed
            BufferedImage imagem1=LeImagem();
            Filtro filtro=new Filtro();
            filtro.expansao(imagem1);
            imagem1=LeImagem();
}//GEN-LAST:event_expansaoActionPerformed

private void equalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalizacaoActionPerformed
            BufferedImage imagem1=LeImagem();
            Filtro filtro=new Filtro();
            filtro.equalizacao(imagem1);
            imagem1=LeImagem();
}//GEN-LAST:event_equalizacaoActionPerformed

private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
}//GEN-LAST:event_jMenu1ActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jFrame1.setVisible(false);
        Inicio();
        //LeImagem();
        Container novo=jFrame1.getLayeredPane();
        novo.remove(0);
        novo.remove(0);
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaActionPerformed
            
}//GEN-LAST:event_mediaActionPerformed

private void mediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediaMouseClicked
            BufferedImage imagem1=LeImagem();
            Convolution filtro=new Convolution();
            String m1=JOptionPane.showInputDialog("Digite o valor de M",null);
            String n1=JOptionPane.showInputDialog("Digite o valor de N",null);
            int m=Integer.parseInt(m1);
            int n=Integer.parseInt(n1);
            filtro.convMedia(imagem1,m,n);
            imagem1=LeImagem();
}//GEN-LAST:event_mediaMouseClicked

private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
            BufferedImage imagem1=LeImagem();
            Convolution filtro=new Convolution();
            filtro.convGauss(imagem1);
            imagem1=LeImagem();
}//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuMascaraArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMascaraArquivoActionPerformed
         
    }//GEN-LAST:event_jMenuMascaraArquivoActionPerformed

    private void jMenuMascaraArquivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMascaraArquivoMouseClicked
        double[][] mascara = new double[3][3];
        
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);
                    if(res == JFileChooser.APPROVE_OPTION){
                        try{
                            File fileName = fc.getSelectedFile();
                            FileReader input = new FileReader(fileName);
                            BufferedReader bufRead = new BufferedReader(input);
                            String linha;
                            int conta = 0;
                            linha = bufRead.readLine();
                            bufRead.close();
                            
                            String numeros[] = linha.split(" ");
                            
                            //preenche mascara
                            mascara[0][0]= Double.parseDouble(numeros[0]);
                            mascara[0][1]= Double.parseDouble(numeros[1]);
                            mascara[0][2]= Double.parseDouble(numeros[2]);

                            mascara[1][0]= Double.parseDouble(numeros[3]);
                            mascara[1][1]= Double.parseDouble(numeros[4]);
                            mascara[1][2]= Double.parseDouble(numeros[5]);
                            
                            mascara[2][0]= Double.parseDouble(numeros[6]);
                            mascara[2][1]= Double.parseDouble(numeros[7]);
                            mascara[2][2]= Double.parseDouble(numeros[8]);
                            
                            
                            BufferedImage imagem1=LeImagem();
                            Convolution filtro=new Convolution();
                            filtro.convMascara(imagem1, mascara);
                            imagem1=LeImagem();
                            
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, "Erro ao abrir arquivo");
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
    }//GEN-LAST:event_jMenuMascaraArquivoMouseClicked


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
            java.util.logging.Logger.getLogger(pdiInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pdiInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pdiInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pdiInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
                new pdiInter().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem a1;
    private javax.swing.JMenuItem a2;
    private javax.swing.JMenu agucamento;
    private javax.swing.JMenuItem b1;
    private javax.swing.JMenuItem b2;
    private javax.swing.JMenuItem b3;
    private javax.swing.JMenuItem b4;
    private javax.swing.JMenu bordas;
    private javax.swing.JMenuItem c1;
    private javax.swing.JMenuItem c2;
    private javax.swing.JMenuItem c3;
    private javax.swing.JMenuItem equalizacao;
    private javax.swing.JMenuItem expansao;
    private javax.swing.JMenu histograma;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuMascaraArquivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JMenu media;
    // End of variables declaration//GEN-END:variables
}






