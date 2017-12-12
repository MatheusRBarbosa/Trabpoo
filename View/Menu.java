/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ItemControl;
import Control.LojaControl;
import Model.Eletronico;
import Model.FileR;
import Model.Item;
import Model.ItemCasa;
import Model.Livro;
import Model.Produto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

/**
 *
 * @author mathe
 */
public class Menu extends javax.swing.JFrame {

    FileR file;
    Produto produtos;
    ItemControl itemControl;
    Item item;
    LojaControl lojaControl;
    Map<Integer, ArrayList<Item>> itens;
    HistoricoCompra hc;
    private boolean finded = false;
    String[] info;
    String pathIn;

    SelectedItens si = new SelectedItens();
    ListaLojas lLojas = new ListaLojas();

    public Menu() {
        hc = new HistoricoCompra();
        info = new String[2];
        item = new Item();
        itemControl = new ItemControl();
        lojaControl = new LojaControl();
        initComponents();
    }

    /**
     * Creates new form NewJFrame
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textFieldBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnHistorico = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        fileSelect = new javax.swing.JButton();
        textFieldFileName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listItens = new javax.swing.JList<>();
        btnSalvarCompras = new javax.swing.JButton();
        btnExibirLojas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textFieldFileName1 = new javax.swing.JLabel();
        comprasSalvas = new javax.swing.JLabel();
        lblQtdItens = new javax.swing.JLabel();
        lblQtdLojas = new javax.swing.JLabel();
        lblQtdProdutos = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busca Produtos");

        jLabel1.setText("Busca:");

        textFieldBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBuscaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnHistorico.setText("Histórico de compra");
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        fileSelect.setText("...");
        fileSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSelectActionPerformed(evt);
            }
        });

        textFieldFileName.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        textFieldFileName.setText("Selecione o arquivo");
        textFieldFileName.setEnabled(false);

        jLabel2.setText("Arquivo de produtos:");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nome", "Tipo", "Loja" }));

        jScrollPane1.setViewportView(listItens);

        btnSalvarCompras.setText("Salvar compras");
        btnSalvarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarComprasActionPerformed(evt);
            }
        });

        btnExibirLojas.setText("Exibir lojas");
        btnExibirLojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirLojasActionPerformed(evt);
            }
        });

        jLabel3.setText("Arquivo de loja:");

        textFieldFileName1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        textFieldFileName1.setText("Selecione o arquivo");
        textFieldFileName1.setEnabled(false);

        comprasSalvas.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        lblQtdItens.setText("Qtd Itens");

        lblQtdLojas.setText("Qtd Lojas");

        lblQtdProdutos.setText("Qtd Produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFieldFileName1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(textFieldFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fileSelect))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnExibirLojas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(lblQtdItens)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblQtdProdutos)
                                            .addComponent(btnBuscar))))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQtdLojas)
                                    .addComponent(btnHistorico)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnComprar)
                        .addGap(70, 70, 70)
                        .addComponent(btnSalvarCompras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comprasSalvas)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldFileName1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(btnHistorico)
                            .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExibirLojas))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblQtdItens)
                        .addComponent(lblQtdLojas)
                        .addComponent(lblQtdProdutos)))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar)
                    .addComponent(btnSalvarCompras)
                    .addComponent(comprasSalvas))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBuscaActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        String n = (listItens.getSelectedValue());
        info[0] = n.substring(1, 5); // Pegar codigo da string quando clicado em 'comprar'
        String[] sAux = n.split(" - ");
        info[1] = sAux[1];
        si.setInfo(info);
        si.displayProduto();
        si.showTime();
    }//GEN-LAST:event_btnComprarActionPerformed

    private void fileSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSelectActionPerformed
        //Metodo para carregar os aquivos
        JFileChooser fileChooser = new JFileChooser();

        int returnVal = fileChooser.showOpenDialog(Menu.this);

        if (returnVal == fileChooser.APPROVE_OPTION) {

            setVisible(false);
            pathIn = fileChooser.getSelectedFile().getAbsolutePath();
            String filename = fileChooser.getSelectedFile().getName();

            String extensao = filename.substring(filename.lastIndexOf("."), filename.length());
            if (extensao.equals(".txt")) {
                try {
                    /*Carega o arquivo loja.txt. Precisa estar no ms diretorio 
                    de produtos.txt e precisa ter o nome 'lojas.txt'*/
                    file = new FileR();
                    String lojaPath = file.createNewPath(pathIn, "lojas.txt");
                    lojaControl.setLojas(file.readFile(lojaPath));

                    //Carrega o arquivo produtos (pode ter qlq nome)
                    file = new FileR();
                    produtos.setProdutos(file.readFile(pathIn));
                    itemControl.setItens(produtos.getProdutos());

                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (extensao.equals(".dat")) {
                Map<Integer, ArrayList<Item>> sItens = file.lerProdutos(pathIn);
                item.setItens(sItens);
            }

            textFieldFileName.setText(filename);
            textFieldFileName1.setText("lojas.txt");
            this.show();

        }
    }//GEN-LAST:event_fileSelectActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String conteudo = textFieldBusca.getText();
        String cb = (String) comboBox.getSelectedItem();

        int qProdutos = 0; // Conta e produtos
        List<Integer> qItens = new ArrayList<>();
        List<String> qLojas = new ArrayList<>(); //Conta as lojas listadas

        DefaultListModel dlm = new DefaultListModel();
        itens = item.getItens();

        for (Integer i : itens.keySet()) {
            Collections.sort(itens.get(i), new Item());
        }

        if (itens != null) {
            if (cb.equals("Codigo")) {
                int codigo = Integer.parseInt(conteudo);
                if (this.itens.containsKey(codigo)) {
                    qItens.add(codigo);
                    finded = true;
                    for (int j = 0; j < itens.get(codigo).size(); j++) {
                        qProdutos++;
                        if (!qLojas.contains(itens.get(codigo).get(j).getLoja().getCodigo())) {
                            qLojas.add(itens.get(codigo).get(j).getLoja().getCodigo());
                        }
                        dlm.addElement(itens.get(codigo).get(j).toString());
                    }
                }
            } else if (cb.equals("Nome")) {
                for (Integer i : itens.keySet()) {
                    for (int j = 0; j < itens.get(i).size(); j++) {
                        if (itens.get(i).get(j).getProduto().getNome().toUpperCase().contains(conteudo.toUpperCase())) {
                            finded = true;
                            /*Contador de quantidade de Itens produtos e lojas*/
                            qProdutos++;
                            if (!qItens.contains(itens.get(i).get(j).getProduto().getCodigo())) {
                                qItens.add(itens.get(i).get(j).getProduto().getCodigo());
                            }
                            if (!qLojas.contains(itens.get(i).get(j).getLoja().getCodigo())) {
                                qLojas.add(itens.get(i).get(j).getLoja().getCodigo());
                            }
                            /**/
                            dlm.addElement(itens.get(i).get(j).toString());
                        }
                    }
                }
            } else if (cb.equals("Tipo")) {
                if ("LIVRO".contains(conteudo.toUpperCase())) {
                    for (Integer i : itens.keySet()) {
                        for (int j = 0; j < itens.get(i).size(); j++) {
                            if (itens.get(i).get(j).getProduto() instanceof Livro) {
                                /*Contador de quantidade de Itens produtos e lojas*/
                                qProdutos++;
                                if (!qItens.contains(itens.get(i).get(j).getProduto().getCodigo())) {
                                    qItens.add(itens.get(i).get(j).getProduto().getCodigo());
                                }
                                if (!qLojas.contains(itens.get(i).get(j).getLoja().getCodigo())) {
                                    qLojas.add(itens.get(i).get(j).getLoja().getCodigo());
                                }
                                /**/
                                dlm.addElement(itens.get(i).get(j).toString());
                                finded = true;
                            }
                        }
                    }
                } else if ("ELETRONICO".contains(conteudo.toUpperCase())) {
                    for (Integer i : itens.keySet()) {
                        for (int j = 0; j < itens.get(i).size(); j++) {
                            if (itens.get(i).get(j).getProduto() instanceof Eletronico) {
                                /*Contador de quantidade de Itens produtos e lojas*/
                                qProdutos++;
                                if (!qItens.contains(itens.get(i).get(j).getProduto().getCodigo())) {
                                    qItens.add(itens.get(i).get(j).getProduto().getCodigo());
                                }
                                if (!qLojas.contains(itens.get(i).get(j).getLoja().getCodigo())) {
                                    qLojas.add(itens.get(i).get(j).getLoja().getCodigo());
                                }
                                /**/
                                dlm.addElement(itens.get(i).get(j).toString());
                                finded = true;
                            }
                        }
                    }
                } else if ("ITEMCASA".contains(conteudo.toUpperCase())) {
                    for (Integer i : itens.keySet()) {
                        for (int j = 0; j < itens.get(i).size(); j++) {
                            if (itens.get(i).get(j).getProduto() instanceof ItemCasa) {
                                /*Contador de quantidade de Itens produtos e lojas*/
                                qProdutos++;
                                if (!qItens.contains(itens.get(i).get(j).getProduto().getCodigo())) {
                                    qItens.add(itens.get(i).get(j).getProduto().getCodigo());
                                }
                                if (!qLojas.contains(itens.get(i).get(j).getLoja().getCodigo())) {
                                    qLojas.add(itens.get(i).get(j).getLoja().getCodigo());
                                }
                                /**/
                                dlm.addElement(itens.get(i).get(j).toString());
                                finded = true;
                            }
                        }
                    }
                }
            } else if (cb.equals("Loja")) {
                for (Integer i : itens.keySet()) {
                    for (int j = 0; j < itens.get(i).size(); j++) {
                        if (itens.get(i).get(j).getLoja().getNome().toUpperCase().contains(conteudo.toUpperCase())) {
                            /*Contador de quantidade de Itens produtos e lojas*/
                            qProdutos++;
                            if (!qItens.contains(itens.get(i).get(j).getProduto().getCodigo())) {
                                qItens.add(itens.get(i).get(j).getProduto().getCodigo());
                            }
                            if (!qLojas.contains(itens.get(i).get(j).getLoja().getCodigo())) {
                                qLojas.add(itens.get(i).get(j).getLoja().getCodigo());
                            }
                            /**/
                            dlm.addElement(itens.get(i).get(j).toString());
                            finded = true;
                        }
                    }
                }
            }
            if (!finded) {
                dlm.addElement("Nenhum item encontrado !");
            }
            lblQtdItens.setText("Qtd Itens: " + qItens.size());
            lblQtdProdutos.setText("Qtd Produtos: " + qProdutos);
            lblQtdLojas.setText("Qtd Lojas: " + qLojas.size());
            listItens.setModel(dlm);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
        hc.displayHistorico();
    }//GEN-LAST:event_btnHistoricoActionPerformed

    private void btnExibirLojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirLojasActionPerformed
        lLojas.showLojas();
    }//GEN-LAST:event_btnExibirLojasActionPerformed

    private void btnSalvarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarComprasActionPerformed

        String newPath = file.createNewPath(pathIn, "produtos.dat");
        file.writeFile(itens, newPath);
        comprasSalvas.setText("Compras salvas !");
    }//GEN-LAST:event_btnSalvarComprasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnExibirLojas;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton btnSalvarCompras;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel comprasSalvas;
    private javax.swing.JButton fileSelect;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblQtdItens;
    private javax.swing.JLabel lblQtdLojas;
    private javax.swing.JLabel lblQtdProdutos;
    private javax.swing.JList<String> listItens;
    private javax.swing.JTextField textFieldBusca;
    private javax.swing.JLabel textFieldFileName;
    private javax.swing.JLabel textFieldFileName1;
    // End of variables declaration//GEN-END:variables
}
