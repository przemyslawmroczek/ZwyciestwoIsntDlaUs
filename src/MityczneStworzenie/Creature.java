package MityczneStworzenie;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Creature {
    public static void main(String[] args) {
        String[] imageNames = {"Centaur", "Maxotaur", "Turbodinorozec"};
        String[] imageOptions = {"src/resources/CENTAURZHEROES3.png", "src/resources/MAXOTAUR.png", "src/resources/TURBODINOROZEC.png"};
        List<String> selectedImages = new ArrayList<>();

        JList<String> imageSelector = new JList<>(imageNames);
        imageSelector.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JButton displayButton = new JButton("Wyświetl obrazy");
        displayButton.addActionListener(e -> {
            for (String imageName : selectedImages) {
                Image image = null;
                try {
                    image = ImageIO.read(new File(imageName));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                JLabel label = new JLabel(new ImageIcon(image));
                JFrame frame = new JFrame();
                frame.getContentPane().add(label, BorderLayout.CENTER);
                frame.setSize(1200, 1200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });

        imageSelector.addListSelectionListener(e -> {
            selectedImages.clear();
            for (Object selectedItem : imageSelector.getSelectedValuesList()) {
                selectedImages.add(imageOptions[imageSelector.getSelectedIndex()]);
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(imageSelector, BorderLayout.NORTH);
        panel.add(displayButton, BorderLayout.SOUTH);
        JFrame frame = new JFrame();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}