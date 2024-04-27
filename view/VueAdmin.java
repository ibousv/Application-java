
package view;

import controller.ControllerAdmin;

/**
 * @author ib
 */
public class VueAdmin extends javax.swing.JFrame {

  ControllerAdmin admin = new ControllerAdmin();
  public static VueAdmin vueAdmin = new VueAdmin();

  /**
   * Vue de l'administrateur
   */
  public VueAdmin() {
    initComponents();
  }

  private void initComponents() {

    form_cours = new javax.swing.JPanel();
    name_cours = new javax.swing.JLabel();
    en_cours = new javax.swing.JLabel();
    nameinput_cours = new javax.swing.JTextField();
    eninput_cours = new javax.swing.JTextField();
    cours_button = new javax.swing.JButton();
    form_etudiants = new javax.swing.JPanel();
    pre_et = new javax.swing.JLabel();
    nom_et = new javax.swing.JLabel();
    login_et = new javax.swing.JLabel();
    mdp_et = new javax.swing.JLabel();
    etudiant_button = new javax.swing.JButton();
    pre_input = new javax.swing.JTextField();
    nom_input = new javax.swing.JTextField();
    login_input = new javax.swing.JTextField();
    mdp_input = new javax.swing.JTextField();
    form_notes = new javax.swing.JPanel();
    val_note = new javax.swing.JLabel();
    et_note = new javax.swing.JLabel();
    cours_note = new javax.swing.JLabel();
    val_input = new javax.swing.JTextField();
    et_input = new javax.swing.JTextField();
    cours_input = new javax.swing.JTextField();
    note_button = new javax.swing.JButton();
    panel_export = new javax.swing.JPanel();
    generer = new javax.swing.JButton();
    admin_menu = new javax.swing.JMenuBar();
    admin_gc = new javax.swing.JMenu();
    ajout_cours = new javax.swing.JMenuItem();
    modif_cours = new javax.swing.JMenuItem();
    supp_cours = new javax.swing.JMenuItem();
    admin_ge = new javax.swing.JMenu();
    ajout_et = new javax.swing.JMenuItem();
    modif_et = new javax.swing.JMenuItem();
    supp_et = new javax.swing.JMenuItem();
    admin_gn = new javax.swing.JMenu();
    ajout_notes = new javax.swing.JMenuItem();
    modif_notes = new javax.swing.JMenuItem();
    export = new javax.swing.JMenu();

    form_cours.setPreferredSize(new java.awt.Dimension(300, 400));

    name_cours.setText("Nom du Cours : ");

    en_cours.setText("L'enseignant :");

    nameinput_cours.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nameinput_coursActionPerformed(evt);
      }
    });

    cours_button.setText("valider");

    javax.swing.GroupLayout form_coursLayout = new javax.swing.GroupLayout(form_cours);
    form_cours.setLayout(form_coursLayout);
    form_coursLayout.setHorizontalGroup(
        form_coursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_coursLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(form_coursLayout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_cours)
                    .addComponent(en_cours)
                    .addGroup(form_coursLayout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(eninput_cours, javax.swing.GroupLayout.Alignment.LEADING,
                            javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(nameinput_cours,
                            javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(form_coursLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cours_button)))
                .addContainerGap(75, Short.MAX_VALUE)));
    form_coursLayout.setVerticalGroup(
        form_coursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_coursLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(name_cours)
                .addGap(18, 18, 18)
                .addComponent(nameinput_cours, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(en_cours)
                .addGap(18, 18, 18)
                .addComponent(eninput_cours, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(cours_button, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51)));

    form_etudiants.setPreferredSize(new java.awt.Dimension(300, 400));

    pre_et.setText("Prenom :");

    nom_et.setText("Nom :");

    login_et.setText("Login :");

    mdp_et.setText("Mot de passe :");

    etudiant_button.setText("valider");

    javax.swing.GroupLayout form_etudiantsLayout = new javax.swing.GroupLayout(form_etudiants);
    form_etudiants.setLayout(form_etudiantsLayout);
    form_etudiantsLayout.setHorizontalGroup(
        form_etudiantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_etudiantsLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(form_etudiantsLayout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(form_etudiantsLayout.createSequentialGroup()
                        .addComponent(etudiant_button)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, form_etudiantsLayout
                        .createSequentialGroup()
                        .addGroup(form_etudiantsLayout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(form_etudiantsLayout.createSequentialGroup()
                                .addComponent(mdp_et)
                                .addPreferredGap(
                                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mdp_input,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 79,
                                    Short.MAX_VALUE))
                            .addGroup(form_etudiantsLayout.createSequentialGroup()
                                .addComponent(login_et)
                                .addPreferredGap(
                                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(login_input))
                            .addGroup(form_etudiantsLayout.createSequentialGroup()
                                .addComponent(nom_et)
                                .addPreferredGap(
                                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nom_input))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                form_etudiantsLayout.createSequentialGroup()
                                    .addComponent(pre_et)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pre_input)))
                        .addGap(47, 47, 47)))));
    form_etudiantsLayout.setVerticalGroup(
        form_etudiantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_etudiantsLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(form_etudiantsLayout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pre_et)
                    .addComponent(pre_input, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(form_etudiantsLayout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom_et)
                    .addComponent(nom_input, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(form_etudiantsLayout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_et)
                    .addComponent(login_input, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(form_etudiantsLayout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mdp_et)
                    .addComponent(mdp_input, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80,
                    Short.MAX_VALUE)
                .addComponent(etudiant_button)
                .addGap(30, 30, 30)));

    form_notes.setPreferredSize(new java.awt.Dimension(300, 400));

    val_note.setText("Note :");

    et_note.setText("Login Etudiant :");

    cours_note.setText("Cours :");

    note_button.setText("valider");

    javax.swing.GroupLayout form_notesLayout = new javax.swing.GroupLayout(form_notes);
    form_notes.setLayout(form_notesLayout);
    form_notesLayout.setHorizontalGroup(
        form_notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_notesLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(form_notesLayout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(note_button)
                    .addComponent(val_note)
                    .addComponent(et_note, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cours_note)
                    .addComponent(val_input)
                    .addComponent(et_input)
                    .addComponent(cours_input))
                .addContainerGap(83, Short.MAX_VALUE)));
    form_notesLayout.setVerticalGroup(
        form_notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_notesLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(val_note)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(val_input, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(et_note)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(et_input, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(cours_note)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cours_input, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58,
                    Short.MAX_VALUE)
                .addComponent(note_button)
                .addGap(51, 51, 51)));

    panel_export.setPreferredSize(new java.awt.Dimension(300, 300));

    generer.setText("Générer");

    javax.swing.GroupLayout panel_exportLayout = new javax.swing.GroupLayout(panel_export);
    panel_export.setLayout(panel_exportLayout);
    panel_exportLayout.setHorizontalGroup(
        panel_exportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exportLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(generer)
                .addGap(105, 105, 105)));
    panel_exportLayout.setVerticalGroup(
        panel_exportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_exportLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(generer)
                .addContainerGap(146, Short.MAX_VALUE)));

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    admin_menu.setBorder(javax.swing.BorderFactory.createCompoundBorder());

    admin_gc.setText("Gestion Cours");
    admin_gc.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        admin_gcMouseClicked(evt);
      }
    });

    ajout_cours.setText("Ajouter un Cours");
    ajout_cours.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        ajout_coursMouseClicked(evt);
      }
    });
    admin_gc.add(ajout_cours);

    modif_cours.setText("Modifier un Cours");
    modif_cours.setBorderPainted(false);
    modif_cours.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        modif_coursMouseClicked(evt);
      }
    });
    admin_gc.add(modif_cours);

    supp_cours.setText("Supprimer un Cours");
    supp_cours.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        supp_coursMouseClicked(evt);
      }
    });
    admin_gc.add(supp_cours);

    admin_menu.add(admin_gc);

    admin_ge.setText("Gestion Etudiants");

    ajout_et.setText("Ajouter un Etudiant");
    ajout_et.setToolTipText("");
    ajout_et.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        ajout_etMouseClicked(evt);
      }
    });
    admin_ge.add(ajout_et);

    modif_et.setText("Modifier un Etudiant");
    modif_et.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        modif_etMouseClicked(evt);
      }
    });
    admin_ge.add(modif_et);

    supp_et.setText("Supprimer un Etudiant");
    supp_et.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        supp_etMouseClicked(evt);
      }
    });
    admin_ge.add(supp_et);

    admin_menu.add(admin_ge);

    admin_gn.setText("Gestion Notes");

    ajout_notes.setText("Ajouter une Note");
    ajout_notes.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        ajout_notesMouseClicked(evt);
      }
    });
    admin_gn.add(ajout_notes);

    modif_notes.setText("Modifier une Notes");
    modif_notes.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        modif_notesMouseClicked(evt);
      }
    });
    modif_notes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        modif_notesActionPerformed(evt);
      }
    });
    admin_gn.add(modif_notes);

    admin_menu.add(admin_gn);

    export.setText("Exporter les informations");
    export.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        exportMouseClicked(evt);
      }
    });
    admin_menu.add(export);

    setJMenuBar(admin_menu);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE));

    pack();
  }

  private void modif_notesActionPerformed(java.awt.event.ActionEvent evt) {

  }

  private void ajout_coursMouseClicked(java.awt.event.MouseEvent evt) {

  }

  private void admin_gcMouseClicked(java.awt.event.MouseEvent evt) {

  }

  private void nameinput_coursActionPerformed(java.awt.event.ActionEvent evt) {

  }

  private void modif_coursMouseClicked(java.awt.event.MouseEvent evt) {

  }

  private void supp_coursMouseClicked(java.awt.event.MouseEvent evt) {

  }

  private void ajout_etMouseClicked(java.awt.event.MouseEvent evt) {

  }

  private void modif_etMouseClicked(java.awt.event.MouseEvent evt) {

  }

  private void supp_etMouseClicked(java.awt.event.MouseEvent evt) {

  }

  private void ajout_notesMouseClicked(java.awt.event.MouseEvent evt) {

  }

  private void modif_notesMouseClicked(java.awt.event.MouseEvent evt) {

  }

  private void exportMouseClicked(java.awt.event.MouseEvent evt) {

  }

  // Variables declaration
  private javax.swing.JMenu admin_gc;
  private javax.swing.JMenu admin_ge;
  private javax.swing.JMenu admin_gn;
  private javax.swing.JMenuBar admin_menu;
  private javax.swing.JMenuItem ajout_cours;
  private javax.swing.JMenuItem ajout_et;
  private javax.swing.JMenuItem ajout_notes;
  private javax.swing.JButton cours_button;
  private javax.swing.JTextField cours_input;
  private javax.swing.JLabel cours_note;
  private javax.swing.JLabel en_cours;
  private javax.swing.JTextField eninput_cours;
  private javax.swing.JTextField et_input;
  private javax.swing.JLabel et_note;
  private javax.swing.JButton etudiant_button;
  private javax.swing.JMenu export;
  private javax.swing.JPanel form_cours;
  private javax.swing.JPanel form_etudiants;
  private javax.swing.JPanel form_notes;
  private javax.swing.JButton generer;
  private javax.swing.JLabel login_et;
  private javax.swing.JTextField login_input;
  private javax.swing.JLabel mdp_et;
  private javax.swing.JTextField mdp_input;
  private javax.swing.JMenuItem modif_cours;
  private javax.swing.JMenuItem modif_et;
  private javax.swing.JMenuItem modif_notes;
  private javax.swing.JLabel name_cours;
  private javax.swing.JTextField nameinput_cours;
  private javax.swing.JLabel nom_et;
  private javax.swing.JTextField nom_input;
  private javax.swing.JButton note_button;
  private javax.swing.JPanel panel_export;
  private javax.swing.JLabel pre_et;
  private javax.swing.JTextField pre_input;
  private javax.swing.JMenuItem supp_cours;
  private javax.swing.JMenuItem supp_et;
  private javax.swing.JTextField val_input;
  private javax.swing.JLabel val_note;
  // fin des variables
}