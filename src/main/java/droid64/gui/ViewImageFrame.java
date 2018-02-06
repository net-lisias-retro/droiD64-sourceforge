package droid64.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**<pre style='font-family:sans-serif;'>
 * Created on 2015-Oct-15
 *
 *   droiD64 - A graphical file manager for D64 files
 *   Copyright (C) 2015 Henrik Wetterström
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program; if not, write to the Free Software
 *   Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *   
 *   http://droid64.sourceforge.net
 *
 * @author Henrik
 * </pre>
 */
public class ViewImageFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private List<byte[]> dataList;
	private int currentIndex = 0;

	public ViewImageFrame(String title, List<byte[]> dataList) throws IOException {
		if (dataList == null || dataList.isEmpty()) {
			dispose();
		} else {
			this.dataList = dataList;
			setTitle(title);
			setup();
		}
	}
	
	private void setup() {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		GridBagConstraints gbc = new GridBagConstraints();		
		gbc.fill = GridBagConstraints.VERTICAL;
		int row = 0;
		
		final BufferedImage image = getNextImage();
		
		if (image != null) {
			final ImagePanel imgPanel = new ImagePanel(image, new Dimension(image.getWidth(), image.getHeight()));
			imgPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			imgPanel.addMouseListener(new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					BufferedImage img = getNextImage();
					imgPanel.setImage(img, new Dimension(img.getWidth(), img.getHeight()));
				}
				@Override
				public void mousePressed(MouseEvent e) {}
				@Override
				public void mouseReleased(MouseEvent e) {}
				@Override
				public void mouseEntered(MouseEvent e) {}
				@Override
				public void mouseExited(MouseEvent e) {}
			});
			addToGridBag(0, row++, 0.0, 0.0, gbc, panel, imgPanel);			
		} 
		
		cp.add(new JScrollPane(panel), BorderLayout.CENTER);
		
		final JButton okButton = new JButton("OK");
		okButton.setMnemonic('o');
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if ( event.getSource() == okButton ) {
					dispose();
				}
			}
		});

		final JButton saveButton = new JButton("Save PNG");
		saveButton.setMnemonic('s');
		saveButton.setEnabled(image != null);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if ( event.getSource() == saveButton ) {
					try {		
						File save = saveImageDialog();
						if (save != null) {
							ImageIO.write(image, "png", save);
						}
					} catch (IOException e) {
					}
				}
			}
		});
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(saveButton);
		buttonPanel.add(okButton);
		cp.add(buttonPanel, BorderLayout.SOUTH);		

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation( (int)((dim.width - getSize().getWidth()) / 3),	(int)((dim.height - getSize().getHeight()) / 3)	);		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
	}
	
	private BufferedImage getNextImage() {
		currentIndex = currentIndex % dataList.size();
		try {
			CbmPicture cbm = new CbmPicture(dataList.get(currentIndex++));
			return cbm.getImage();
		} catch (IOException e) {}
		return null;
	}

	
	private File saveImageDialog() {
		JFileChooser chooser = new JFileChooser();
		chooser.setMultiSelectionEnabled(false);
		if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			return chooser.getSelectedFile();
		}
		return null;
	}	
	
	private void addToGridBag(int x, int y, double weightx, double weighty, GridBagConstraints gbc, JComponent parent, JComponent component) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.weightx = weightx;
		gbc.weighty = weighty;
		parent.add(component, gbc);
	}
	
	class ImagePanel extends JPanel {
		private static final long serialVersionUID = 1L;
		private Image image;
		public ImagePanel(Image image, Dimension dim) {
			this.image = image;
			setSize(dim);
			setMinimumSize(dim);
			setPreferredSize(dim);
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this);
		}
		public void setImage(Image image, Dimension dim) {
			this.image = image;
			setSize(dim);
			setMinimumSize(dim);
			setPreferredSize(dim);
			invalidate();
			repaint();
		}
	}
}
