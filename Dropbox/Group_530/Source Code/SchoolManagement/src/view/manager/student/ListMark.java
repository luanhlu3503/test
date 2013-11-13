/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.manager.student;

import export.ExportFile;
import controller.Manager;
import entity.MarkEntity;
import entity.StudentEntity;
import entity.SubjectEntity;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import model.Mark;
import model.Subject;
import view.home.UIInterface;

/**
 *
 * @author luan
 */
public class ListMark extends javax.swing.JInternalFrame implements UIInterface {

    private int act;
    private MarkEntity entity;
    private SubjectEntity subjectEntity;
    private StudentEntity studentEntity;
    private Mark mark;

    /**
     * Creates new form SearchMark
     */
    public ListMark(int w, int h) {
        initComponents();
        this.entity = new MarkEntity();
        this.subjectEntity=new SubjectEntity();
        this.studentEntity=new StudentEntity();
        initUI();
        setSize(w, h);
    }

    @Override
    public void initUI() {
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        enableEditAddPanel(false);
        entity.loadList(tblMark);
        List<String> subjectList=subjectEntity.getNameList();
        comboSubject.removeAllItems();
        comboSubject.addItem("Choose");
        for(String s:subjectList){
            comboSubject.addItem(s);
        }
        
        enableButton(false);
    }
    private void export(){

        ExportFile export=new ExportFile(tblMark, ExportFile.MARK);
        export.toExcel();
    
    }

    private void studentChooser() {
        StudentChooser studentChooser = new StudentChooser(null, true);
        studentChooser.setVisible(true);
        if (studentChooser.getChooser() > 0) {
            if(mark==null){
                mark=new Mark();
            }
            mark.setStudent(new StudentEntity().findByID(studentChooser.getChooser()));
            labelStudentNo.setText(mark.getStudent().getNo() + "");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bannerPanel = new javax.swing.JPanel();
        txtYearSearch = new javax.swing.JTextField();
        comboSearchSubject = new javax.swing.JComboBox();
        comboMonthSearch = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
        txtSearchStudentName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSearchStudentNo = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnSearchReset = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMark = new javax.swing.JTable();
        editAddPanel = new javax.swing.JPanel();
        labelAction = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelStudentNo = new javax.swing.JLabel();
        btnStudentChooser = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPoint = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dPicTime = new com.toedter.calendar.JDateChooser();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboSubject = new javax.swing.JComboBox();
        actionPanel = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1024, 700));

        comboMonthSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/20x20/search.png"))); // NOI18N
        btnSearch.setText("Search");

        jLabel6.setText("Time");

        jLabel44.setText("Student name");

        jLabel47.setText("Subject");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel14.setText("Mark");

        jLabel15.setText("Student no");

        btnSearchReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/20x20/reset.gif"))); // NOI18N
        btnSearchReset.setText("Reset");

        javax.swing.GroupLayout bannerPanelLayout = new javax.swing.GroupLayout(bannerPanel);
        bannerPanel.setLayout(bannerPanelLayout);
        bannerPanelLayout.setHorizontalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bannerPanelLayout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jLabel14))
                    .addGroup(bannerPanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bannerPanelLayout.createSequentialGroup()
                                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel15))
                                .addGap(26, 26, 26)
                                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSearchStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSearchStudentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerPanelLayout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addGap(42, 42, 42)))
                        .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bannerPanelLayout.createSequentialGroup()
                                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboSearchSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bannerPanelLayout.createSequentialGroup()
                                        .addComponent(comboMonthSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtYearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(bannerPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchReset)))))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        bannerPanelLayout.setVerticalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboSearchSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47))
                    .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtSearchStudentNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44)
                        .addComponent(txtSearchStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(comboMonthSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtYearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(btnSearchReset))
                .addGap(499, 499, 499))
        );

        tblMark.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Subject", "Student No", "Student", "Point", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMarkMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMark);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        editAddPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAction.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        labelAction.setText("Mark");
        editAddPanel.add(labelAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel1.setText("Student No");
        editAddPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 81, -1, -1));

        labelStudentNo.setText("Unknown");
        editAddPanel.add(labelStudentNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 81, -1, -1));

        btnStudentChooser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/20x20/student.png"))); // NOI18N
        btnStudentChooser.setText("Choose");
        btnStudentChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentChooserActionPerformed(evt);
            }
        });
        editAddPanel.add(btnStudentChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 75, -1, -1));

        jLabel4.setText("Point");
        editAddPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));
        editAddPanel.add(txtPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 96, -1));

        jLabel5.setText("Time");
        editAddPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));
        editAddPanel.add(dPicTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 138, -1));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/20x20/save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        editAddPanel.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/20x20/reset.gif"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        editAddPanel.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/20x20/cancel.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        editAddPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        jLabel2.setText("Subject");
        editAddPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 127, -1, -1));

        editAddPanel.add(comboSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 122, 117, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/20x20/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/20x20/edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/20x20/delete.png"))); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/20x20/Export.png"))); // NOI18N
        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(btnAdd)
                .addGap(52, 52, 52)
                .addComponent(btnEdit)
                .addGap(42, 42, 42)
                .addComponent(btnRemove)
                .addGap(46, 46, 46)
                .addComponent(btnExport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnRemove)
                    .addComponent(btnExport))
                .addGap(0, 49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editAddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bannerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bannerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editAddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMarkMouseClicked
        enableButton(true);
    }//GEN-LAST:event_tblMarkMouseClicked
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        act = ADD;
        enableEditAddPanel(true);
        btnReset.setVisible(false);
    }//GEN-LAST:event_btnAddActionPerformed
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        act = EDIT;
        enableEditAddPanel(true);
        btnReset.setVisible(false);
    }//GEN-LAST:event_btnEditActionPerformed
    
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int confirm = entity.confirmRemove(this, "Are you Sure");
        if (confirm == 0) {
            int res=entity.remove(entity.getSelectID(tblMark));
            if(res==Manager.SUCCESS){
                initUI();
            }
            entity.showMessage(res, this);
            
        }
    }//GEN-LAST:event_btnRemoveActionPerformed
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        save();
    }//GEN-LAST:event_btnSaveActionPerformed
    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
    }//GEN-LAST:event_btnResetActionPerformed
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        enableEditAddPanel(false);
    }//GEN-LAST:event_btnCancelActionPerformed
    
    private void btnStudentChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentChooserActionPerformed
        studentChooser();
    }//GEN-LAST:event_btnStudentChooserActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        export();
    }//GEN-LAST:event_btnExportActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JPanel bannerPanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchReset;
    private javax.swing.JButton btnStudentChooser;
    private javax.swing.JComboBox comboMonthSearch;
    private javax.swing.JComboBox comboSearchSubject;
    private javax.swing.JComboBox comboSubject;
    private javax.swing.JPanel contentPanel;
    private com.toedter.calendar.JDateChooser dPicTime;
    private javax.swing.JPanel editAddPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAction;
    private javax.swing.JLabel labelStudentNo;
    private javax.swing.JTable tblMark;
    private javax.swing.JTextField txtPoint;
    private javax.swing.JTextField txtSearchStudentName;
    private javax.swing.JTextField txtSearchStudentNo;
    private javax.swing.JTextField txtYearSearch;
    // End of variables declaration//GEN-END:variables

    @Override
    public void enableEditAddPanel(boolean b) {
        if (b == false) {
            tblMark.setEnabled(true);
            labelStudentNo.setText("");
            txtPoint.setText("");
            dPicTime.setDate(null);
            
            editAddPanel.setVisible(false);
            actionPanel.setVisible(true);
            bannerPanel.setVisible(true);
        } else {
            if (act == EDIT) {
                labelAction.setText("Edit Mark");
                loadEdit();
            } else if (act == ADD) {
                labelAction.setText("Add Mark");
            }
            tblMark.setEnabled(false);
            editAddPanel.setVisible(true);
            btnReset.setVisible(true);
            
            actionPanel.setVisible(false);
            bannerPanel.setVisible(false);
        }
    }
    
    @Override
    public void enableButton(boolean b) {
        btnEdit.setEnabled(b);
        btnRemove.setEnabled(b);
    }
    
    @Override
    public void loadEdit() {
        mark = entity.findByID(entity.getSelectID(tblMark));
        labelStudentNo.setText(mark.getStudent().getNo());
        comboSubject.setSelectedItem(mark.getSubject().getName());
        txtPoint.setText(mark.getPoint() + "");
        dPicTime.setDate(mark.getTime());
    }
    
    @Override
    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void save(){
        if(!validateForm()){
             return;
         }
         if(mark==null){
             mark=new Mark();
         }
         Subject sub=subjectEntity.findByName(comboSubject.getSelectedItem().toString());
         int point=0;
         Date date=null;
         try{
         point=Integer.parseInt(txtPoint.getText());
         }catch(NumberFormatException ex){}
         date=dPicTime.getDate();
         mark.setSubject(sub);
         mark.setPoint(point);
         mark.setTime(date);
         entity.setMark(mark);
         int res=entity.save();
         initUI();
    }
    
    @Override
    public void deactive() {
        
    }
    
    @Override
    public boolean validateForm() {
        if(mark==null || mark.getStudent()==null || mark.getStudent().getID() <1){
            JOptionPane.showMessageDialog(this, "You must be choose Student !");
            return false;
        }
        if(comboSubject.getSelectedIndex()==0){
           JOptionPane.showMessageDialog(this, "You must be choose subject !");
            return false;
        }
        return true;
    }
}
