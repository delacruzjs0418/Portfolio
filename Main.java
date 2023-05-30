public class Main extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 886, 674);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnEducationalFrames = new JButton("Educational");
        btnEducationalFrames.setBounds(116, 321, 623, 85);
        btnEducationalFrames.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnEducationalFrames.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Educational educationalFrame = new Educational();
                educationalFrame.setVisible(true);
            }
        });
        contentPane.add(btnEducationalFrames);

        JButton btnHobbies = new JButton("Hobbies");
        btnHobbies.setBounds(116, 522, 623, 80);
        btnHobbies.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnHobbies.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Hobbies hobbiesFrame = new Hobbies();
                hobbiesFrame.setVisible(true);
            }
        });
        contentPane.add(btnHobbies);

        JButton btnProfile = new JButton("Profile");
        btnProfile.setBounds(116, 120, 623, 86);
        btnProfile.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnProfile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Profile profileFrame = new Profile();
                profileFrame.setVisible(true);
            }
        });
        contentPane.add(btnProfile);

        JButton btnSkills = new JButton("Skills");
        btnSkills.setBounds(116, 417, 623, 88);
        btnSkills.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnSkills.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Skills skillsFrame = new Skills();
                skillsFrame.setVisible(true);
            }
        });
        contentPane.add(btnSkills);

        JButton btnAboutMe = new JButton("About Me");
        btnAboutMe.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnAboutMe.setBounds(116, 222, 623, 85);
        btnAboutMe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AboutMe aboutMeFrame = new AboutMe();
                aboutMeFrame.setVisible(true);
            }
        });
        contentPane.add(btnAboutMe);
        
        JLabel lblNewLabel = new JLabel("My Portfolio");
        lblNewLabel.setFont(new Font("Lucida Console", Font.BOLD, 20));
        lblNewLabel.setBounds(331, 41, 286, 21);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\50-Beautiful-and-Minimalist-Presentation-Backgrounds-03.jpg"));
        lblNewLabel_1.setBounds(0, 0, 870, 635);
        contentPane.add(lblNewLabel_1);
    }
}
