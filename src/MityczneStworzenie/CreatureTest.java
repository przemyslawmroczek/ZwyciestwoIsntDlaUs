package MityczneStworzenie;

import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

        import javax.imageio.ImageIO;
        import java.awt.image.BufferedImage;
        import java.io.File;
        import java.io.IOException;

public class CreatureTest {

    @Test
    void testImageLoading() {
        String[] imagePaths = {"src/resources/CENTAURZHEROES3.png", "src/resources/MAXOTAUR.png", "src/resources/TURBODINOROZEC.png"};
        for (String imagePath : imagePaths) {
            try {
                BufferedImage image = ImageIO.read(new File(imagePath));
                Assertions.assertNotNull(image);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
