/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author willian
 */
public class ListarEquipamentos extends javax.swing.JFrame {

    /**
     * Creates new form ListarEquipamentos
     */
    public DefaultListModel listModel = new DefaultListModel();
    public ArrayList<Item> listPar = new ArrayList<Item>();

    public ListarEquipamentos() {
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        initComponents();
    }

    public ListarEquipamentos(ArrayList<Item> listRef) {
        listPar = listRef;
        System.out.println("tamanho array - " + listPar.size());
        for (int i = 0; i < listPar.size(); i++) {
            listModel.addElement(i + " - " + listPar.get(i).paraString());
            System.out.println("dados: " + listPar.get(i).paraString());
        }
        lista = new javax.swing.JList<>(listModel);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void limpaLista() {
        listModel.clear();
        lista = new javax.swing.JList<>(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>(listModel);
        jLabel1 = new javax.swing.JLabel();
        btRemover = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btEditar = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lista.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lista.setModel(listModel);
        lista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listaFocusGained(evt);
            }
        });
        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Lista dos Equipamentos");

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("ID - Equipamento | Custo | Requerente");

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btRemover)
                                .addGap(18, 18, 18)
                                .addComponent(btEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btAdicionar)
                                .addGap(18, 18, 18)
                                .addComponent(salvar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                .addGap(59, 59, 59))
                            .addComponent(jLabel2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemover)
                    .addComponent(btEditar)
                    .addComponent(btAdicionar)
                    .addComponent(salvar))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        // TODO add your handling code here:
        int t = lista.getSelectedIndex();
        System.out.println("valor mudou - " + lista.getSelectedIndex());
    }//GEN-LAST:event_listaValueChanged

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        // TODO add your handling code here:
        try {
            for (int i = 0; i < listPar.size(); i++) {
                System.out.println("lista -" + listPar.get(i).getTipo());
            }
            int selecionado = lista.getSelectedIndex();// pega o id do selecionado
            System.out.println("selecionado - " + selecionado);
            listModel.removeElementAt(selecionado);// remove a posição baseado no id do selecionado
            System.out.println("antes - " + listPar);
            listPar.remove(selecionado);// remove do arraylist baseado na posição do selecionado
            System.out.println("depois - " + listPar);
            //limpaLista();
            ListarEquipamentos novo = new ListarEquipamentos(listPar);
        } catch (ArrayIndexOutOfBoundsException err) {
            JOptionPane.showMessageDialog(rootPane, "Selecione alguma opçao!", "Erro ao remover da lista", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btRemoverActionPerformed

    private void listaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaFocusGained
        // TODO add your handling code here:
        int t = lista.getSelectedIndex();
        System.out.println("focus - " + lista.getSelectedIndex());
    }//GEN-LAST:event_listaFocusGained

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        int selecionado = lista.getSelectedIndex();
        System.out.println("selecionado (listar) - " + selecionado);
        CadastroEquipamento edit = new CadastroEquipamento(listPar, selecionado);
        setVisible(false);
        edit.setVisible(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        // TODO add your handling code here:
        CadastroEquipamento add = new CadastroEquipamento(listPar, 1000);
        setVisible(false);
        add.setVisible(true);
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
        //Salvar save = new Salvar();
        try {
            File arq = new File("Equipamentos.txt");
            BufferedWriter bf = new BufferedWriter(new FileWriter(arq, true));
            for (int i = 0; i < listPar.size(); i++) {
                bf.write(listPar.get(i).paraString());
                bf.newLine();
            }
            bf.flush();
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("erro ao criar arquivo");
        }
        setVisible(false);
    }//GEN-LAST:event_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarEquipamentos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarEquipamentos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarEquipamentos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarEquipamentos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarEquipamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
