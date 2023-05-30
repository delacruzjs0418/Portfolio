public class Skills extends JFrame {
    private DefaultListModel<String> skillsListModel;

    public Skills() {
        setTitle("Skills");
        setSize(598, 284);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        skillsListModel = new DefaultListModel<>();
        setContentPane(mainPanel);
        mainPanel.setLayout(null);

        JLabel lblNewLabel = new JLabel("VIDEO EDITING");
        lblNewLabel.setBounds(170, 21, 207, 58);
        lblNewLabel.setFont(new Font("Lucida Console", Font.BOLD, 20));
        mainPanel.add(lblNewLabel);

        JLabel lblIndesign = new JLabel("INDESIGN");
        lblIndesign.setBounds(170, 90, 207, 51);
        lblIndesign.setFont(new Font("Lucida Console", Font.BOLD, 20));
        mainPanel.add(lblIndesign);

        JLabel lblTimeManagement = new JLabel("TIME MANAGEMENT");
        lblTimeManagement.setBounds(170, 154, 207, 58);
        lblTimeManagement.setFont(new Font("Lucida Console", Font.BOLD, 20));
        mainPanel.add(lblTimeManagement);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\50-Beautiful-and-Minimalist-Presentation-Backgrounds-03.jpg"));
        lblNewLabel_1.setBounds(0, 0, 582, 245);
        mainPanel.add(lblNewLabel_1);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // dispose the frame
            }
        });
        backButton.setBounds(502, 0, 80, 25);
        mainPanel.add(backButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Skills();
            }
        });
    }
}