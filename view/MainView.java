/**
 * View package
 */
package view;

import controller.MainController;

/**
 * MainView class
 * @author ib
 */
public class MainView extends javax.swing.JFrame {

        MainController main = new MainController();
        public static MainView mainView = new MainView();
        // Constructor
        public MainView() {
                initComponents();
        }

        //initialize Components
        private void initComponents() {

                panel_name = new javax.swing.JPanel();
                label_name = new javax.swing.JLabel();
                panel_tail = new javax.swing.JPanel();
                panel_form = new javax.swing.JPanel();
                form_login = new javax.swing.JLabel();
                form_password = new javax.swing.JLabel();
                forminput_password = new javax.swing.JPasswordField();
                forminput_login = new javax.swing.JTextField();
                form_submit = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));
                setBounds(new java.awt.Rectangle(0, 0, 0, 0));
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                setForeground(new java.awt.Color(255, 255, 255));
                setName("main"); // NOI18N
                setPreferredSize(new java.awt.Dimension(600, 500));
                setSize(new java.awt.Dimension(200, 200));

                label_name.setBackground(new java.awt.Color(255, 255, 255));
                label_name.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                label_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label_name.setText("AGS");

                javax.swing.GroupLayout panel_nameLayout = new javax.swing.GroupLayout(panel_name);
                panel_name.setLayout(panel_nameLayout);
                panel_nameLayout.setHorizontalGroup(
                                panel_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panel_nameLayout.createSequentialGroup()
                                                                .addGap(39, 39, 39)
                                                                .addComponent(label_name,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                104,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(45, Short.MAX_VALUE)));
                panel_nameLayout.setVerticalGroup(
                                panel_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_nameLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(47, Short.MAX_VALUE)
                                                                .addComponent(label_name,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                58,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(44, 44, 44)));

                javax.swing.GroupLayout panel_tailLayout = new javax.swing.GroupLayout(panel_tail);
                panel_tail.setLayout(panel_tailLayout);
                panel_tailLayout.setHorizontalGroup(
                                panel_tailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 182, Short.MAX_VALUE));
                panel_tailLayout.setVerticalGroup(
                                panel_tailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));

                form_login.setText("Login :");

                form_password.setText("Mot de passe :");

                forminput_password.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                forminput_passwordActionPerformed(evt);
                        }
                });

                forminput_login.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                forminput_loginActionPerformed(evt);
                        }
                });

                form_submit.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
                form_submit.setText("Se connecter");
                form_submit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                form_submit.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                form_submitMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout panel_formLayout = new javax.swing.GroupLayout(panel_form);
                panel_form.setLayout(panel_formLayout);
                panel_formLayout.setHorizontalGroup(
                                panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panel_formLayout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addGroup(panel_formLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(forminput_password)
                                                                                .addComponent(form_password,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(form_login,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(forminput_login)
                                                                                .addComponent(form_submit,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                137,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(191, Short.MAX_VALUE)));
                panel_formLayout.setVerticalGroup(
                                panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panel_formLayout.createSequentialGroup()
                                                                .addGap(150, 150, 150)
                                                                .addComponent(form_login)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(forminput_login,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(52, 52, 52)
                                                                .addComponent(form_password)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(forminput_password,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(64, 64, 64)
                                                                .addComponent(form_submit,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(72, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(panel_tail,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(panel_name,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(panel_form,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(panel_name,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(panel_tail,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(panel_form,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                pack();
        }

        // Event Handlers
        
        private void forminput_passwordActionPerformed(java.awt.event.ActionEvent evt) {
                String password = form_password.getText();
                main.setPassword(password);
        }

        private void forminput_loginActionPerformed(java.awt.event.ActionEvent evt) {
                String login = form_login.getText();
                main.setLogin(login);
        }

        private void form_submitMouseClicked(java.awt.event.MouseEvent evt) {
                main.verify(main.getLogin(), main.getPassword());
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                MainView.mainView.setVisible(true);
        }

        // Variables declaration
        private javax.swing.JLabel form_login;
        private javax.swing.JLabel form_password;
        private javax.swing.JButton form_submit;
        private javax.swing.JTextField forminput_login;
        private javax.swing.JPasswordField forminput_password;
        private javax.swing.JLabel label_name;
        private javax.swing.JPanel panel_form;
        private javax.swing.JPanel panel_name;
        private javax.swing.JPanel panel_tail;
        // End of variables declaration
}