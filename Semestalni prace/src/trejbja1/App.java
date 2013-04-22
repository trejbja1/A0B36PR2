/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trejbja1;

import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Jan
 */
public class App extends javax.swing.JFrame {
    private BridgeAppCode bridge;
    private DefaultComboBoxModel IPmodel = new javax.swing.DefaultComboBoxModel(new String[] {});
    private DefaultComboBoxModel LangModel = new javax.swing.DefaultComboBoxModel(new String[] {});
    private String sLastIp="";
    private String sPort="";
    private String sLang="";
    private Map<String, String> langValues;

    public App() {
        setIcon();
        bridgeInit();
        initComponents();
        setVisible(true);   
    }
    
    public void setLangValues(Map<String, String> langValues) {
        this.langValues = langValues;
    }

    public void setLastIp(String sLastIp) {
        this.sLastIp=sLastIp;
    }

    public void setPort(String sPort) {
        this.sPort=sPort;
    }
    
    public void setLang(String sLang) {
        this.sLang=sLang;
    }

    public void setPort(DefaultComboBoxModel IPmodel) {
        this.IPmodel=IPmodel;
    }

    public DefaultComboBoxModel getIpModul() {
        return IPmodel;
    }
    
    public DefaultComboBoxModel getLangModul() {
        return LangModel;
    }

    public String getIP() {
        return ipAddress.getSelectedItem().toString();
    }

    public int getPort() {
        return Integer.parseInt(port.getText());
    }

    private void bridgeInit() {
        if (bridge==null) {
            bridge = new BridgeAppCode(this);
            langValues=bridge.getLangValues();
        }
    }

    private void setIcon() {
        ImageIcon img = new ImageIcon(getClass().getResource("/resources/ship.png"));

        this.setIconImage(img.getImage());
    }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        conn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ipAddress = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        port = new javax.swing.JFormattedTextField();
        save = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ipAddress1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setName("LBoat"); // NOI18N

        conn.setText(langValues.get("Connect"));
        conn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connActionPerformed(evt);
            }
        });

        jButton1.setText("Fotka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("rCam");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(415, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conn)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(321, Short.MAX_VALUE))
        );

        conn.getAccessibleContext().setAccessibleName("conn");

        jTabbedPane1.addTab(langValues.get("mainLabel"), jPanel1);
        jPanel1.getAccessibleContext().setAccessibleName("control");

        ipAddress.setEditable(true);
        ipAddress.setModel(IPmodel);
        ipAddress.setSelectedItem(sLastIp);
        ipAddress.setToolTipText("");

        jLabel1.setText(langValues.get("IpAddress"));

        jLabel2.setText(langValues.get("Port"));

        port.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        port.setText(sPort);

        save.setText(langValues.get("Save"));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel3.setText(langValues.get("Language"));

        ipAddress1.setEditable(true);
        ipAddress1.setModel(LangModel);
        ipAddress1.setSelectedItem(sLang);
        ipAddress1.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ipAddress1, 0, 1, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(ipAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ipAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        ipAddress.getAccessibleContext().setAccessibleName("ipBox");
        save.getAccessibleContext().setAccessibleName("save");
        ipAddress1.getAccessibleContext().setAccessibleName("LangBox");

        jTabbedPane1.addTab(langValues.get("ConnectSettings"), jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("settings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
  private void connActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connActionPerformed
    // TODO add your handling code here:
    //bridgeInit();
    bridge.connButton();
  }//GEN-LAST:event_connActionPerformed

  private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
    // TODO add your handling code here:
    bridge.saveSettings();
  }//GEN-LAST:event_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        bridge.getPhoto();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        bridge.rCam();
    }//GEN-LAST:event_jButton2ActionPerformed
  
/*  public void redesign() {
    try {
      //UIManager.setLookAndFeel("javax.swing.plaf.synth.SynthLookAndFeel");
      UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    } 
    
    catch (ClassNotFoundException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    } catch (UnsupportedLookAndFeelException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
  }*/
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton conn;
    public javax.swing.JComboBox ipAddress;
    public javax.swing.JComboBox ipAddress1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JFormattedTextField port;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
