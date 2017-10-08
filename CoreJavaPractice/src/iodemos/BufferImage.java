package iodemos;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BufferImage {

	public static void main(String[] args) throws Exception{

		Image img = null;

		InputStream is = new BufferedInputStream(
				new FileInputStream("C:\\Users\\dines\\Desktop\\Dinesh\\IMG_9036.jpg"));

		img = ImageIO.read(is);

		JFrame frame = new JFrame();
		JLabel label = new JLabel(new ImageIcon(img));
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

}
