import javax.swing.*;

public class JavaApplication {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JRadioButton a = new JRadioButton("Dog");
        JRadioButton b = new JRadioButton("Cat");
        JRadioButton c = new JRadioButton("Rabbit");
        JRadioButton d = new JRadioButton("Bird");
        JRadioButton p = new JRadioButton("Pig");
        ButtonGroup g = new ButtonGroup();
        JButton btn = new JButton("Show");

        a.setBounds(20, 20, 100, 20);
        b.setBounds(20, 45, 100, 20);
        c.setBounds(20, 70, 100, 20);
        d.setBounds(20, 95, 100, 20);
        p.setBounds(20, 120, 100, 20);
        btn.setBounds(140, 70, 100, 30);

        g.add(a); g.add(b); g.add(c); g.add(d); g.add(p);

        btn.addActionListener(x -> {
            if (a.isSelected()) JOptionPane.showMessageDialog(f, "Dog");
            else if (b.isSelected()) JOptionPane.showMessageDialog(f, "Cat");
            else if (c.isSelected()) JOptionPane.showMessageDialog(f, "Rabbit");
            else if (d.isSelected()) JOptionPane.showMessageDialog(f, "Bird");
            else if (p.isSelected()) JOptionPane.showMessageDialog(f, "Pig");
            else JOptionPane.showMessageDialog(f, "Pick one!");
        });

        f.add(a); f.add(b); f.add(c); f.add(d); f.add(p); f.add(btn);
        f.setSize(300, 220);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
