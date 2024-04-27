
package view;

import controller.ControllerEtudiant;

/**
 * @author ib
 */
public class VueEtudiant extends javax.swing.JFrame {
        ControllerEtudiant etudiant = new ControllerEtudiant();
        public static VueEtudiant vueEtudiant = new VueEtudiant();

        /**
         * Vue de l'Etudiant
         */
        public VueEtudiant() {
                initComponents();
        }

        private void initComponents() {

                panel_notes = new javax.swing.JPanel();
                scroll_notes = new javax.swing.JScrollBar();
                liste = new javax.swing.JLayeredPane();
                etudiant_menu = new javax.swing.JMenuBar();
                liste_notes = new javax.swing.JMenu();

                panel_notes.setPreferredSize(new java.awt.Dimension(300, 300));

                javax.swing.GroupLayout listeLayout = new javax.swing.GroupLayout(liste);
                liste.setLayout(listeLayout);
                listeLayout.setHorizontalGroup(
                                listeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 266, Short.MAX_VALUE));
                listeLayout.setVerticalGroup(
                                listeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));

                javax.swing.GroupLayout panel_notesLayout = new javax.swing.GroupLayout(panel_notes);
                panel_notes.setLayout(panel_notesLayout);
                panel_notesLayout.setHorizontalGroup(
                                panel_notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_notesLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(liste)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(scroll_notes,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                panel_notesLayout.setVerticalGroup(
                                panel_notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_notesLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(panel_notesLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(liste)
                                                                                .addComponent(scroll_notes,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                288,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setPreferredSize(new java.awt.Dimension(400, 400));

                liste_notes.setText("Voir mes notes");
                liste_notes.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                liste_notesMouseClicked(evt);
                        }
                });
                etudiant_menu.add(liste_notes);

                setJMenuBar(etudiant_menu);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 400, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 375, Short.MAX_VALUE));

                pack();
        }

        private void liste_notesMouseClicked(java.awt.event.MouseEvent evt) {
        }

        // Variables
        private javax.swing.JMenuBar etudiant_menu;
        private javax.swing.JLayeredPane liste;
        private javax.swing.JMenu liste_notes;
        private javax.swing.JPanel panel_notes;
        private javax.swing.JScrollBar scroll_notes;
        // End of variables declaration
}