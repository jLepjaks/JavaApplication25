/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.sql.Array;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeString.search;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jurijs
 */
public class FormMain extends javax.swing.JFrame {

    private User user = new User(" userN", " userL", "user", 0);

    ArrayList<Book> books;

    /**
     * Creates new form FormMain
     */
    public FormMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        libraryPannel = new javax.swing.JTabbedPane();
        myLibraryTab = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        myLibraryTable = new javax.swing.JTable();
        myLibraryRequestButton = new javax.swing.JButton();
        myLibraryRemoveButton = new javax.swing.JButton();
        requestTab = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();
        requestListRemoveButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        readingListRequestButton = new javax.swing.JButton();
        reabingTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        readingListTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        searchtab = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        requestButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        userNameLebel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        myLibraryTab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setText("My Library");

        myLibraryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Gender", "Date borrowed", "Date returned", "Avaliability"
            }
        ));
        myLibraryTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(myLibraryTable);

        myLibraryRequestButton.setText("Request");
        myLibraryRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myLibraryRequestButtonActionPerformed(evt);
            }
        });

        myLibraryRemoveButton.setText("Remove");

        javax.swing.GroupLayout myLibraryTabLayout = new javax.swing.GroupLayout(myLibraryTab);
        myLibraryTab.setLayout(myLibraryTabLayout);
        myLibraryTabLayout.setHorizontalGroup(
            myLibraryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myLibraryTabLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(myLibraryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(myLibraryTabLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(170, 170, 170)
                        .addComponent(myLibraryRequestButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myLibraryRemoveButton)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        myLibraryTabLayout.setVerticalGroup(
            myLibraryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myLibraryTabLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(myLibraryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myLibraryRequestButton)
                    .addComponent(myLibraryRemoveButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        libraryPannel.addTab("Mylibrary", myLibraryTab);

        requestTab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        requestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Gender", "Avaliability"
            }
        ));
        requestsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(requestsTable);

        requestListRemoveButton.setText("Remove");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setText("Requests");

        readingListRequestButton.setText("Request");

        javax.swing.GroupLayout requestTabLayout = new javax.swing.GroupLayout(requestTab);
        requestTab.setLayout(requestTabLayout);
        requestTabLayout.setHorizontalGroup(
            requestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestTabLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, requestTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(requestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, requestTabLayout.createSequentialGroup()
                        .addComponent(readingListRequestButton)
                        .addGap(42, 42, 42)
                        .addComponent(requestListRemoveButton)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, requestTabLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(406, 406, 406))))
        );
        requestTabLayout.setVerticalGroup(
            requestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, requestTabLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(requestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestListRemoveButton)
                    .addComponent(readingListRequestButton))
                .addGap(30, 30, 30))
        );

        libraryPannel.addTab("Requests", requestTab);

        reabingTab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        readingListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Gender", "Date borrowed", "Due date"
            }
        ));
        readingListTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(readingListTable);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setText("Reading List");

        javax.swing.GroupLayout reabingTabLayout = new javax.swing.GroupLayout(reabingTab);
        reabingTab.setLayout(reabingTabLayout);
        reabingTabLayout.setHorizontalGroup(
            reabingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reabingTabLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reabingTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(398, 398, 398))
        );
        reabingTabLayout.setVerticalGroup(
            reabingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reabingTabLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        libraryPannel.addTab("Reading List", reabingTab);

        searchtab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        requestButton.setText("Request");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Library search");

        searchTable.setAutoCreateRowSorter(true);
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Edition", "ISBN", "Publisher", "Publication Year", "Loan Time", "Avalability"
            }
        ));
        searchTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(searchTable);

        javax.swing.GroupLayout searchtabLayout = new javax.swing.GroupLayout(searchtab);
        searchtab.setLayout(searchtabLayout);
        searchtabLayout.setHorizontalGroup(
            searchtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchtabLayout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchtabLayout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addGroup(searchtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(requestButton)
                    .addGroup(searchtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(searchtabLayout.createSequentialGroup()
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(125, 125, 125)
                            .addComponent(searchButton))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
        );
        searchtabLayout.setVerticalGroup(
            searchtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchtabLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(searchtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(requestButton)
                .addGap(23, 23, 23))
        );

        libraryPannel.addTab("Search", searchtab);

        userNameLebel.setText("userName");

        jLabel2.setText("Welcome: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(libraryPannel)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLebel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(libraryPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        DBManager dbm = new DBManager();

        books = dbm.searchByTitle(searchTextField.getText());

        DefaultTableModel model = (DefaultTableModel) searchTable.getModel();

        
        
        for (int i = 0; i < books.size(); i++) {

            model.addRow(new Object[]{books.get(i).getTitle(),books.get(i).getAuthor(), books.get(i).getEdition(), books.get(i).getIsbn(),
                books.get(i).getPublisher(), books.get(i).getPubDate(), books.get(i).getLoantime(), books.get(i).getAvaliable()});

        }

        
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void myLibraryRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myLibraryRequestButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myLibraryRequestButtonActionPerformed

    public void setUser(User lUser) {
        user = lUser;
        userNameLebel.setText(user.getUserName().substring(0, 1).toUpperCase() + user.getUserName().substring(1) + " "
                + "" + user.getUserLastName().substring(0, 1).toUpperCase() + user.getUserLastName().substring(1));

    }

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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane libraryPannel;
    private javax.swing.JButton myLibraryRemoveButton;
    private javax.swing.JButton myLibraryRequestButton;
    private javax.swing.JPanel myLibraryTab;
    private javax.swing.JTable myLibraryTable;
    private javax.swing.JPanel reabingTab;
    private javax.swing.JButton readingListRequestButton;
    private javax.swing.JTable readingListTable;
    private javax.swing.JButton requestButton;
    private javax.swing.JButton requestListRemoveButton;
    private javax.swing.JPanel requestTab;
    private javax.swing.JTable requestsTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable searchTable;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JPanel searchtab;
    private javax.swing.JLabel userNameLebel;
    // End of variables declaration//GEN-END:variables
}
