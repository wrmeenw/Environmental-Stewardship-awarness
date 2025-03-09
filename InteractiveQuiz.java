import javax.swing.*;
import java.awt.*;
public class IntractiveQuiz extends JFrame
{
    public IntractiveQuiz() 
    {
         setTitle("Environmental Stewardship");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);

        // Add a label for the program title
        JLabel titleLabel = new JLabel("Environmental Stewardship Program", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        titleLabel.setPreferredSize(new Dimension(600, 40));
        add(titleLabel, BorderLayout.NORTH);

        // Add a panel for the program content
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Add a scroll pane for the program content
        JTextArea contentArea = new JTextArea();
        contentArea.setEditable(false);
        contentArea.setLineWrap(true);
        contentArea.setWrapStyleWord(true);
        contentArea.setText("The number one leading effect of harmful technology is natural resource depletion, as mentioned in section 1.2. Though it causes many scary problems it can be resolved. Ways to fix this problem include:\n\n- Sustainable Forest Management\n- Energy Efficiency\n- Renewable Energy\n\n\n The Environmental Protection Agency (EPA) is a government organization that creates and upholds environmental legislation, funds and conducts research, and guards against serious health threats to people and the environment. Their goal is to safeguard the environment and human health. They do this by:\n \n- Providing federal laws for enviromental health\n- Guaranteeing that hazardous and contaminated places be cleaned up and revived by any parties who may be in fault\n-Creating regulations to carry out environmental laws that Congress passes\n");

        JScrollPane scrollPane = new JScrollPane(contentArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        contentPanel.add(scrollPane, BorderLayout.CENTER);
        add(contentPanel, BorderLayout.CENTER);

        // Add interactive questions to test the user's understanding
        JLabel questionLabel1 = new JLabel("Question 1: What are some solutions to the negative effects of resource depletion caused by technology?");
        JTextField answerField1 = new JTextField();
        answerField1.setColumns(50);

        JLabel questionLabel2 = new JLabel("Question 2: Name one thing that the EPA does to ensure a safe and healthy enviroment");
        JTextField answerField2 = new JTextField();
        answerField2.setColumns(50);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> 
        {
            // Check the user's answers and display a message box with the result
            int correctAnswers = 0;
            if (answerField1.getText().toLowerCase().contains("Renewable Energy") && answerField1.getText().toLowerCase().contains("reuse") && answerField1.getText().toLowerCase().contains("recycle")) {
                correctAnswers++;
            }
            if (answerField1.getText().toLowerCase().contains("sustainable forest management") && answerField1.getText().toLowerCase().contains("monitors")) {
                correctAnswers++;
            }
            if (answerField1.getText().toLowerCase().contains("Energy Efficiency")) {
                correctAnswers++;
            }
            if (answerField1.getText().toLowerCase().contains("forest management")) {
                correctAnswers++;
            }
            if (answerField2.getText().toLowerCase().contains("federal laws ")) {
                correctAnswers++;
            }
            if (answerField2.getText().toLowerCase().contains("contaminated places cleaned") && answerField2.getText().toLowerCase().contains("recycle")) {
                correctAnswers++;
            }
            if (answerField2.getText().toLowerCase().contains("creating regulations")) {
                correctAnswers++;
            }
            if (answerField2.getText().toLowerCase().contains("environmental laws")) {
            correctAnswers++;
            }

            
             String message;
            if (correctAnswers == 0) {
                message = "Sorry, you did not get any correct answers. Please try again.";
            } else if (correctAnswers == 1) {
                message = "You got 1 correct answer. Please try again for a better score.";
            } else if (correctAnswers == 2) {
                message = "You got 2 correct answers. Please try again for a better score.";
            } else if (correctAnswers == 3) {
                message = "You got 3 correct answers. Good job!";
            } else{
                message = "You got 4 correct answers. Great job!";
            }
            JOptionPane.showMessageDialog(this, message);


   
        });
        
        JPanel questionPanel = new JPanel();
        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
        questionPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        questionPanel.add(questionLabel1);
        questionPanel.add(answerField1);
        questionPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        questionPanel.add(questionLabel2);
        questionPanel.add(answerField2);
        questionPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        questionPanel.add(submitButton);
    
        add(questionPanel, BorderLayout.SOUTH);
    
        setVisible(true);
    }

}
