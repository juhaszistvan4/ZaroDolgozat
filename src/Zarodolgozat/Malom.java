package Zarodolgozat;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Malom extends JFrame {
	private JPanel contentPane;
	static String[][] matrix=new String[13][13];
	static JLabel[][] labels=new JLabel[13][13];
	static JPanel panel;
	static int szamlalo=1, dbfeher=9, dbfekete=9;
	static Border border = BorderFactory.createLineBorder(Color.red);
	static JLabel lbkijon;
	static int lep=0, lep_i=0, lep_j=0;
	static String aktualis="";
	static boolean f_malom=false, feher_malom=false;
	static int feher_jatekban=0, fekete_jatekban=0;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Malom frame = new Malom();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void beolv() {
		File fajl=new File("src/alap.txt");
		Scanner beolv=null;
		try {
			beolv=new Scanner(fajl);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String sor;
		for(int i=0;i<13;i++) {
			sor=beolv.nextLine();
			for(int j=0;j<13;j++) {
				matrix[i][j]=sor.charAt(j)+"";
			}
		}
		
		/*for(int i=0;i<13;i++) {
			for(int j=0;j<13;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}*/
	}
	
	public static void kiir() {
		for(int i=0;i<13;i++) {
			for(int j=0;j<13;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void feltolt() {
		for(int i=0;i<13;i++) {
			for(int j=0;j<13;j++) {
				labels[i][j]=new JLabel();
				panel.add(labels[i][j]);
				
						if(matrix[i][j].equals("x"))
							labels[i][j].setIcon(new ImageIcon(Malom.class.getResource("/img/pont.png")));
						else if(matrix[i][j].equals("2"))
							labels[i][j].setIcon(new ImageIcon(Malom.class.getResource("/img/fel-le.png")));
							else if(matrix[i][j].equals("1"))
								labels[i][j].setIcon(new ImageIcon(Malom.class.getResource("/img/balra-jobbra.png")));
								else
									labels[i][j].setIcon(new ImageIcon(Malom.class.getResource("/img/sima.png")));
			
					
				
			}
		}
		
	}
	
	
	public static void kijon() {
		
		if(szamlalo%2==1) {
			if(f_malom){
				lbkijon.setText("Fekete vesz");
			}
			else {
				if(dbfekete!=0)
					lbkijon.setText("Fekete rak");
				else
					lbkijon.setText("Fekete lép");
			}
		}
		else {
			if(feher_malom) {
				lbkijon.setText("Fehér vesz");
			}
			else {
				if(dbfeher!=0)
					lbkijon.setText("Fehér rak");
				else
					lbkijon.setText("Fehér lép");
			}
		}
	}
	
	public static void matrix_malom() {
		if((matrix[0][0].equals("b") || matrix[0][0].equals("bm")) && (matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[0][12].equals("b") || matrix[0][12].equals("bm"))) {
			matrix[0][0]="bm";
			matrix[0][6]="bm";
			matrix[0][12]="bm";
		}
		if((matrix[0][0].equals("b") || matrix[0][0].equals("bm")) && (matrix[6][0].equals("b") || matrix[6][0].equals("bm")) && (matrix[12][0].equals("b") || matrix[12][0].equals("bm"))) {
			matrix[0][0]="bm";
			matrix[6][0]="bm";
			matrix[12][0]="bm";

		}
		if((matrix[0][0].equals("b") || matrix[0][0].equals("bm")) && (matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[0][12].equals("b") || matrix[0][12].equals("bm"))) {
			matrix[0][0]="bm";
			matrix[0][6]="bm";
			matrix[0][12]="bm";

		}
		if((matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[2][6].equals("b") || matrix[2][6].equals("bm")) && (matrix[4][6].equals("b") || matrix[4][6].equals("bm"))) {
			matrix[0][6]="bm";
			matrix[2][6]="bm";
			matrix[4][6]="bm";

		}
		if((matrix[0][0].equals("b") || matrix[0][0].equals("bm")) && (matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[0][12].equals("b") || matrix[0][12].equals("bm"))) {
			matrix[0][0]="bm";
			matrix[0][6]="bm";
			matrix[0][12]="bm";

		}
		if((matrix[0][12].equals("b") || matrix[0][12].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
			matrix[0][12]="bm";
			matrix[6][12]="bm";
			matrix[12][12]="bm";

		}
		if((matrix[0][0].equals("b") || matrix[0][0].equals("bm")) && (matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[0][12].equals("b") || matrix[0][12].equals("bm"))) {
			matrix[0][0]="bm";
			matrix[0][6]="bm";
			matrix[0][12]="bm";

		}
		if((matrix[0][12].equals("b") || matrix[0][12].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
			matrix[0][12]="bm";
			matrix[6][12]="bm";
			matrix[12][12]="bm";

		}
		if((matrix[0][0].equals("b") || matrix[0][0].equals("bm")) && (matrix[6][0].equals("b") || matrix[6][0].equals("bm")) && (matrix[12][0].equals("b") || matrix[12][0].equals("bm"))) {
			matrix[0][0]="bm";
			matrix[6][0]="bm";
			matrix[12][0]="bm";

		}
		if((matrix[12][0].equals("b") || matrix[12][0].equals("bm")) && (matrix[12][6].equals("b") || matrix[12][6].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
			matrix[12][0]="bm";
			matrix[12][6]="bm";
			matrix[12][12]="bm";

		}
		if((matrix[12][0].equals("b") || matrix[12][0].equals("bm")) && (matrix[12][6].equals("b") || matrix[12][6].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
			matrix[12][0]="bm";
			matrix[12][6]="bm";
			matrix[12][12]="bm";

		}
		if((matrix[8][6].equals("b") || matrix[8][6].equals("bm")) && (matrix[10][6].equals("b") || matrix[10][6].equals("bm")) && (matrix[12][6].equals("b") || matrix[12][6].equals("bm"))) {
			matrix[8][6]="bm";
			matrix[10][6]="bm";
			matrix[12][6]="bm";

		}
		if((matrix[12][0].equals("b") || matrix[12][0].equals("bm")) && (matrix[12][6].equals("b") || matrix[12][6].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
			matrix[12][0]="bm";
			matrix[12][6]="bm";
			matrix[12][12]="bm";

		}
		if((matrix[0][12].equals("b") || matrix[0][12].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
			matrix[0][12]="bm";
			matrix[6][12]="bm";
			matrix[12][12]="bm";

		}
		if((matrix[0][12].equals("b") || matrix[0][12].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
			matrix[0][12]="bm";
			matrix[6][12]="bm";
			matrix[12][12]="bm";

		}
		if((matrix[6][8].equals("b") || matrix[6][8].equals("bm")) && (matrix[6][10].equals("b") || matrix[6][10].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm"))) {
			matrix[6][8]="bm";
			matrix[6][10]="bm";
			matrix[6][12]="bm";

		}
		if((matrix[2][2].equals("b") || matrix[2][2].equals("bm")) && (matrix[2][6].equals("b") || matrix[2][6].equals("bm")) && (matrix[2][10].equals("b") || matrix[2][10].equals("bm"))) {
			matrix[2][2]="bm";
			matrix[2][6]="bm";
			matrix[2][10]="bm";

		}
		if((matrix[2][2].equals("b") || matrix[2][2].equals("bm")) && (matrix[6][2].equals("b") || matrix[6][2].equals("bm")) && (matrix[10][2].equals("b") || matrix[10][2].equals("bm"))) {
			matrix[2][2]="bm";
			matrix[6][2]="bm";
			matrix[10][2]="bm";

		}
		if((matrix[2][2].equals("b") || matrix[2][2].equals("bm")) && (matrix[2][6].equals("b") || matrix[2][6].equals("bm")) && (matrix[2][10].equals("b") || matrix[2][10].equals("bm"))) {
			matrix[2][2]="bm";
			matrix[2][6]="bm";
			matrix[2][10]="bm";

		}
		if((matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[2][6].equals("b") || matrix[2][6].equals("bm")) && (matrix[4][6].equals("b") || matrix[4][6].equals("bm"))) {
			matrix[0][6]="bm";
			matrix[2][6]="bm";
			matrix[4][6]="bm";

		}
		if((matrix[2][2].equals("b") || matrix[2][2].equals("bm")) && (matrix[2][6].equals("b") || matrix[2][6].equals("bm")) && (matrix[2][10].equals("b") || matrix[2][10].equals("bm"))) {
			matrix[2][2]="bm";
			matrix[2][6]="bm";
			matrix[2][10]="bm";

		}
		if((matrix[10][10].equals("b") || matrix[10][10].equals("bm")) && (matrix[6][10].equals("b") || matrix[6][10].equals("bm")) && (matrix[2][10].equals("b") || matrix[2][10].equals("bm"))) {
			matrix[10][10]="bm";
			matrix[6][10]="bm";
			matrix[2][10]="bm";
	
		}
		if((matrix[2][2].equals("b") || matrix[2][2].equals("bm")) && (matrix[6][2].equals("b") || matrix[6][2].equals("bm")) && (matrix[10][2].equals("b") || matrix[10][2].equals("bm"))) {
			matrix[2][2]="bm";
			matrix[6][2]="bm";
			matrix[10][2]="bm";

		}
		if((matrix[6][0].equals("b") || matrix[6][0].equals("bm")) && (matrix[6][2].equals("b") || matrix[6][2].equals("bm")) && (matrix[6][4].equals("b") || matrix[6][4].equals("bm"))) {
			matrix[6][0]="bm";
			matrix[6][2]="bm";
			matrix[6][4]="bm";

		}
		if((matrix[2][2].equals("b") || matrix[2][2].equals("bm")) && (matrix[6][2].equals("b") || matrix[6][2].equals("bm")) && (matrix[10][2].equals("b") || matrix[10][2].equals("bm"))) {
			matrix[2][2]="bm";
			matrix[6][2]="bm";
			matrix[10][2]="bm";

		}
		if((matrix[10][2].equals("b") || matrix[10][2].equals("bm")) && (matrix[10][6].equals("b") || matrix[10][6].equals("bm")) && (matrix[10][10].equals("b") || matrix[10][10].equals("bm"))) {
			matrix[10][2]="bm";
			matrix[10][6]="bm";
			matrix[10][10]="bm";
	
		}
		if((matrix[10][2].equals("b") || matrix[10][2].equals("bm")) && (matrix[10][6].equals("b") || matrix[10][6].equals("bm")) && (matrix[10][10].equals("b") || matrix[10][10].equals("bm"))) {
			matrix[10][2]="bm";
			matrix[10][6]="bm";
			matrix[10][10]="bm";

		}
		if((matrix[8][6].equals("b") || matrix[8][6].equals("bm")) && (matrix[10][6].equals("b") || matrix[10][6].equals("bm")) && (matrix[12][6].equals("b") || matrix[12][6].equals("bm"))) {
			matrix[8][6]="bm";
			matrix[10][6]="bm";
			matrix[12][6]="bm";

		}
		if((matrix[10][2].equals("b") || matrix[10][2].equals("bm")) && (matrix[10][6].equals("b") || matrix[10][6].equals("bm")) && (matrix[10][10].equals("b") || matrix[10][10].equals("bm"))) {
			matrix[10][2]="bm";
			matrix[10][6]="bm";
			matrix[10][10]="bm";

		}
		if((matrix[10][10].equals("b") || matrix[10][10].equals("bm")) && (matrix[6][10].equals("b") || matrix[6][10].equals("bm")) && (matrix[2][10].equals("b") || matrix[2][10].equals("bm"))) {
			matrix[10][10]="bm";
			matrix[6][10]="bm";
			matrix[2][10]="bm";
	
		}
		if((matrix[10][10].equals("b") || matrix[10][10].equals("bm")) && (matrix[6][10].equals("b") || matrix[6][10].equals("bm")) && (matrix[2][10].equals("b") || matrix[2][10].equals("bm"))) {
			matrix[10][10]="bm";
			matrix[6][10]="bm";
			matrix[2][10]="bm";

		}
		if((matrix[6][8].equals("b") || matrix[6][8].equals("bm")) && (matrix[6][10].equals("b") || matrix[6][10].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm"))) {
			matrix[6][8]="bm";
			matrix[6][10]="bm";
			matrix[6][12]="bm";

		}
		if((matrix[4][4].equals("b") || matrix[4][4].equals("bm")) && (matrix[4][6].equals("b") || matrix[4][6].equals("bm")) && (matrix[4][8].equals("b") || matrix[4][8].equals("bm"))) {
			matrix[4][4]="bm";
			matrix[4][6]="bm";
			matrix[4][8]="bm";

		}
		if((matrix[4][4].equals("b") || matrix[4][4].equals("bm")) && (matrix[6][4].equals("b") || matrix[6][4].equals("bm")) && (matrix[8][4].equals("b") || matrix[8][4].equals("bm"))) {
			matrix[4][4]="bm";
			matrix[6][4]="bm";
			matrix[8][4]="bm";

		}	
		if((matrix[4][4].equals("b") || matrix[4][4].equals("bm")) && (matrix[4][6].equals("b") || matrix[4][6].equals("bm")) && (matrix[4][8].equals("b") || matrix[4][8].equals("bm"))) {
			matrix[4][4]="bm";
			matrix[4][6]="bm";
			matrix[4][8]="bm";

		}
		if((matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[2][6].equals("b") || matrix[2][6].equals("bm")) && (matrix[4][6].equals("b") || matrix[4][6].equals("bm"))) {
			matrix[0][6]="bm";
			matrix[2][6]="bm";
			matrix[4][6]="bm";

		}
		if((matrix[4][4].equals("b") || matrix[4][4].equals("bm")) && (matrix[4][6].equals("b") || matrix[4][6].equals("bm")) && (matrix[4][8].equals("b") || matrix[4][8].equals("bm"))) {
			matrix[4][4]="bm";
			matrix[4][6]="bm";
			matrix[4][8]="bm";

		}
		if((matrix[8][8].equals("b") || matrix[8][8].equals("bm")) && (matrix[6][8].equals("b") || matrix[6][8].equals("bm")) && (matrix[4][8].equals("b") || matrix[4][8].equals("bm"))) {
			matrix[8][8]="bm";
			matrix[6][8]="bm";
			matrix[4][8]="bm";

		}
		if((matrix[4][4].equals("b") || matrix[4][4].equals("bm")) && (matrix[6][4].equals("b") || matrix[6][4].equals("bm")) && (matrix[8][4].equals("b") || matrix[8][4].equals("bm"))) {
			matrix[4][4]="bm";
			matrix[6][4]="bm";
			matrix[8][4]="bm";
	
		}
		if((matrix[6][0].equals("b") || matrix[6][0].equals("bm")) && (matrix[6][2].equals("b") || matrix[6][2].equals("bm")) && (matrix[6][4].equals("b") || matrix[6][4].equals("bm"))) {
			matrix[6][0]="bm";
			matrix[6][2]="bm";
			matrix[6][4]="bm";

		}
		if((matrix[4][4].equals("b") || matrix[4][4].equals("bm")) && (matrix[6][4].equals("b") || matrix[6][4].equals("bm")) && (matrix[8][4].equals("b") || matrix[8][4].equals("bm"))) {
			matrix[4][4]="bm";
			matrix[6][4]="bm";
			matrix[8][4]="bm";

		}
		if((matrix[8][4].equals("b") || matrix[8][4].equals("bm")) && (matrix[8][6].equals("b") || matrix[8][6].equals("bm")) && (matrix[8][8].equals("b") || matrix[8][8].equals("bm"))) {
			matrix[8][4]="bm";
			matrix[8][6]="bm";
			matrix[8][8]="bm";

		}
		if((matrix[8][4].equals("b") ||  matrix[8][4].equals("bm")) && (matrix[8][6].equals("b") || matrix[8][6].equals("bm")) && (matrix[8][8].equals("b") || matrix[8][8].equals("bm"))) {
			matrix[8][4]="bm";
			matrix[8][6]="bm";
			matrix[8][8]="bm";
	
		}
		if((matrix[8][6].equals("b") || matrix[8][6].equals("bm")) && (matrix[10][6].equals("b") || matrix[10][6].equals("bm")) && (matrix[12][6].equals("b") || matrix[12][6].equals("bm"))) {
			matrix[8][6]="bm";
			matrix[10][6]="bm";
			matrix[12][6]="bm";

		}
		if((matrix[8][4].equals("b") || matrix[8][4].equals("bm")) && (matrix[8][6].equals("b") || matrix[8][6].equals("bm")) && (matrix[8][8].equals("b") || matrix[8][8].equals("bm"))) {
			matrix[8][4]="bm";
			matrix[8][6]="bm";
			matrix[8][8]="bm";
	
		}
		if((matrix[8][8].equals("b") || matrix[8][8].equals("bm")) && (matrix[6][8].equals("b") || matrix[6][8].equals("bm")) && (matrix[4][8].equals("b") || matrix[4][8].equals("bm"))) {
			matrix[8][8]="bm";
			matrix[6][8]="bm";
			matrix[4][8]="bm";
	
		}
		if((matrix[8][8].equals("b") || matrix[8][8].equals("bm")) && (matrix[6][8].equals("b") || matrix[6][8].equals("bm")) && (matrix[4][8].equals("b") || matrix[4][8].equals("bm"))) {
			matrix[8][8]="bm";
			matrix[6][8]="bm";
			matrix[4][8]="bm";
	
		}
		if((matrix[6][8].equals("b") || matrix[6][8].equals("bm")) && (matrix[6][10].equals("b") || matrix[6][10].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm"))) {
			matrix[6][8]="bm";
			matrix[6][10]="bm";
			matrix[6][12]="bm";
		
		}
		
		if((matrix[0][0].equals("w") || matrix[0][0].equals("wm")) && (matrix[0][6].equals("w") || matrix[0][6].equals("wm")) && (matrix[0][12].equals("w") || matrix[0][12].equals("wm"))) {
			matrix[0][0]="wm";
			matrix[0][6]="wm";
			matrix[0][12]="wm";
		
		}
		if((matrix[0][0].equals("w") || matrix[0][0].equals("wm")) && (matrix[6][0].equals("w") || matrix[6][0].equals("wm")) && (matrix[12][0].equals("w") || matrix[12][0].equals("wm"))) {
			matrix[0][0]="wm";
			matrix[6][0]="wm";
			matrix[12][0]="wm";
		
		}
		if((matrix[0][0].equals("w") || matrix[0][0].equals("wm")) && (matrix[0][6].equals("w") || matrix[0][6].equals("wm")) && (matrix[0][12].equals("w") || matrix[0][12].equals("wm"))) {
		matrix[0][0]="wm";
		matrix[0][6]="wm";
		matrix[0][12]="wm";

		}
		if((matrix[0][6].equals("w") || matrix[0][6].equals("wm")) && (matrix[2][6].equals("w") || matrix[2][6].equals("wm")) && (matrix[4][6].equals("w") || matrix[4][6].equals("wm"))) {
		matrix[0][6]="wm";
		matrix[2][6]="wm";
		matrix[4][6]="wm";
	
		}
		if((matrix[0][0].equals("w") || matrix[0][0].equals("wm")) && (matrix[0][6].equals("w") || matrix[0][6].equals("wm")) && (matrix[0][12].equals("w") || matrix[0][12].equals("wm"))) {
		matrix[0][0]="wm";
		matrix[0][6]="wm";
		matrix[0][12]="wm";
	
		}
		if((matrix[0][12].equals("w") || matrix[0][12].equals("wm")) && (matrix[6][12].equals("w") || matrix[6][12].equals("wm")) && (matrix[12][12].equals("w") || matrix[12][12].equals("wm"))) {
		matrix[0][12]="wm";
		matrix[6][12]="wm";
		matrix[12][12]="wm";

		}
		if((matrix[0][0].equals("w") || matrix[0][0].equals("wm")) && (matrix[6][0].equals("w") || matrix[6][0].equals("wm")) && (matrix[12][0].equals("w") || matrix[12][0].equals("wm"))) {
		matrix[0][0]="wm";
		matrix[6][0]="wm";
		matrix[12][0]="wm";

		}
		if((matrix[6][0].equals("w") || matrix[6][0].equals("wm")) && (matrix[6][2].equals("w") || matrix[6][2].equals("wm")) && (matrix[6][4].equals("w") || matrix[6][4].equals("wm"))) {
		matrix[6][0]="wm";
		matrix[6][2]="wm";
		matrix[6][4]="wm";

		}
		if((matrix[0][0].equals("w") || matrix[0][0].equals("wm")) && (matrix[6][0].equals("w") || matrix[6][0].equals("wm")) && (matrix[12][0].equals("w") || matrix[12][0].equals("wm"))) {
		matrix[0][0]="wm";
		matrix[6][0]="wm";
		matrix[12][0]="wm";

		}
		if((matrix[12][0].equals("w") || matrix[12][0].equals("wm")) && (matrix[12][6].equals("w") || matrix[12][6].equals("wm")) && (matrix[12][12].equals("w") || matrix[12][12].equals("wm"))) {
		matrix[12][0]="wm";
		matrix[12][6]="wm";
		matrix[12][12]="wm";
	
		}
		if((matrix[12][0].equals("w") || matrix[12][0].equals("wm")) && (matrix[12][6].equals("w") || matrix[12][6].equals("wm")) && (matrix[12][12].equals("w") || matrix[12][12].equals("wm"))) {
		matrix[12][0]="wm";
		matrix[12][6]="wm";
		matrix[12][12]="wm";

		}
		if((matrix[8][6].equals("w") || matrix[8][6].equals("wm")) && (matrix[10][6].equals("w") || matrix[10][6].equals("wm")) && (matrix[12][6].equals("w") || matrix[12][6].equals("wm"))) {
		matrix[8][6]="wm";
		matrix[10][6]="wm";
		matrix[12][6]="wm";

		}

		if((matrix[12][0].equals("w") || matrix[12][0].equals("wm")) && (matrix[12][6].equals("w") || matrix[12][6].equals("wm")) && (matrix[12][12].equals("w") || matrix[12][12].equals("wm"))) {
		matrix[12][0]="wm";
		matrix[12][6]="wm";
		matrix[12][12]="wm";

		}
		if((matrix[0][12].equals("w") || matrix[0][12].equals("wm")) && (matrix[6][12].equals("w") || matrix[6][12].equals("wm")) && (matrix[12][12].equals("w") || matrix[12][12].equals("wm"))) {
		matrix[0][12]="wm";
		matrix[6][12]="wm";
		matrix[12][12]="wm";

		}
		if((matrix[0][12].equals("w") || matrix[0][12].equals("wm")) && (matrix[6][12].equals("w") || matrix[6][12].equals("wm")) && (matrix[12][12].equals("w") || matrix[12][12].equals("wm"))) {
		matrix[0][12]="wm";
		matrix[6][12]="wm";
		matrix[12][12]="wm";

		}
		if((matrix[6][8].equals("w") || matrix[6][8].equals("wm")) && (matrix[6][10].equals("w") || matrix[6][10].equals("wm")) && (matrix[6][12].equals("w") || matrix[6][12].equals("wm"))) {
		matrix[6][8]="wm";
		matrix[6][10]="wm";
		matrix[6][12]="wm";

		}
		if((matrix[2][2].equals("w") || matrix[2][2].equals("wm")) && (matrix[2][6].equals("w") || matrix[2][6].equals("wm")) && (matrix[2][10].equals("w") || matrix[2][10].equals("wm"))) {
		matrix[2][2]="wm";
		matrix[2][6]="wm";
		matrix[2][10]="wm";

		}
		if((matrix[2][2].equals("w") || matrix[2][2].equals("wm")) && (matrix[6][2].equals("w") || matrix[6][2].equals("wm")) && (matrix[10][2].equals("w") || matrix[10][2].equals("wm"))) {
		matrix[2][2]="wm";
		matrix[6][2]="wm";
		matrix[10][2]="wm";

		}
		if((matrix[2][2].equals("w") || matrix[2][2].equals("wm")) && (matrix[2][6].equals("w") || matrix[2][6].equals("wm")) && (matrix[2][10].equals("w") || matrix[2][10].equals("wm"))) {
		matrix[2][2]="wm";
		matrix[2][6]="wm";
		matrix[2][10]="wm";

		}
		if((matrix[0][6].equals("w") || matrix[0][6].equals("wm")) && (matrix[2][6].equals("w") || matrix[2][6].equals("wm")) && (matrix[4][6].equals("w") || matrix[4][6].equals("wm"))) {
		matrix[0][6]="wm";
		matrix[2][6]="wm";
		matrix[4][6]="wm";

		}
		if((matrix[2][2].equals("w") || matrix[2][2].equals("wm")) && (matrix[2][6].equals("w") || matrix[2][6].equals("wm")) && (matrix[2][10].equals("w") || matrix[2][10].equals("wm"))) {
		matrix[2][2]="wm";
		matrix[2][6]="wm";
		matrix[2][10]="wm";

		}
		if((matrix[10][10].equals("w") || matrix[10][10].equals("wm")) && (matrix[6][10].equals("w") || matrix[6][10].equals("wm")) && (matrix[2][10].equals("w") || matrix[2][10].equals("wm"))) {
		matrix[10][10]="wm";
		matrix[6][10]="wm";
		matrix[2][10]="wm";

		}
		if((matrix[2][2].equals("w") || matrix[2][2].equals("wm")) && (matrix[6][2].equals("w") || matrix[6][2].equals("wm")) && (matrix[10][2].equals("w") || matrix[10][2].equals("wm"))) {
		matrix[2][2]="wm";
		matrix[6][2]="wm";
		matrix[10][2]="wm";

		}
		if((matrix[6][0].equals("w") || matrix[6][0].equals("wm")) && (matrix[6][2].equals("w") || matrix[6][2].equals("wm")) && (matrix[6][4].equals("w") || matrix[6][4].equals("wm"))) {
		matrix[6][0]="wm";
		matrix[6][2]="wm";
		matrix[6][4]="wm";

		}
		if((matrix[2][2].equals("w") || matrix[2][2].equals("wm")) && (matrix[6][2].equals("w") || matrix[6][2].equals("wm")) && (matrix[10][2].equals("w") || matrix[10][2].equals("wm"))) {
		matrix[2][2]="wm";
		matrix[6][2]="wm";
		matrix[10][2]="wm";

		}
		if((matrix[10][2].equals("w") || matrix[10][2].equals("wm")) && (matrix[10][6].equals("w") || matrix[10][6].equals("wm")) && (matrix[10][10].equals("w") || matrix[10][10].equals("wm"))) {
		matrix[10][2]="wm";
		matrix[10][6]="wm";
		matrix[10][10]="wm";

		}
		if((matrix[10][2].equals("w") || matrix[10][2].equals("wm")) && (matrix[10][6].equals("w") || matrix[10][6].equals("wm")) && (matrix[10][10].equals("w") || matrix[10][10].equals("wm"))) {
		matrix[10][2]="wm";
		matrix[10][6]="wm";
		matrix[10][10]="wm";

		}
		if((matrix[8][6].equals("w") || matrix[8][6].equals("wm")) && (matrix[10][6].equals("w") || matrix[10][6].equals("wm")) && (matrix[12][6].equals("w") || matrix[12][6].equals("wm"))) {
		matrix[8][6]="wm";
		matrix[10][6]="wm";
		matrix[12][6]="wm";

		}
		if((matrix[10][2].equals("w") || matrix[10][2].equals("wm")) && (matrix[10][6].equals("w") || matrix[10][6].equals("wm")) && (matrix[10][10].equals("w") || matrix[10][10].equals("wm"))) {
		matrix[10][2]="wm";
		matrix[10][6]="wm";
		matrix[10][10]="wm";
	
		}
		if((matrix[10][10].equals("w") || matrix[10][10].equals("wm")) && (matrix[6][10].equals("w") || matrix[6][10].equals("wm")) && (matrix[2][10].equals("w") || matrix[2][10].equals("wm"))) {
		matrix[10][10]="wm";
		matrix[6][10]="wm";
		matrix[2][10]="wm";
	
		}
		if((matrix[10][10].equals("w") || matrix[10][10].equals("wm")) && (matrix[6][10].equals("w") || matrix[6][10].equals("wm")) && (matrix[2][10].equals("w") || matrix[2][10].equals("wm"))) {
		matrix[10][10]="wm";
		matrix[6][10]="wm";
		matrix[2][10]="wm";

		}
		if((matrix[6][8].equals("w") || matrix[6][8].equals("wm")) && (matrix[6][10].equals("w") || matrix[6][10].equals("wm")) && (matrix[6][12].equals("w") || matrix[6][12].equals("wm"))) {
		matrix[6][8]="wm";
		matrix[6][10]="wm";
		matrix[6][12]="wm";

		}
		if((matrix[4][4].equals("w") || matrix[4][4].equals("wm")) && (matrix[4][6].equals("w") || matrix[4][6].equals("wm")) && (matrix[4][8].equals("w") || matrix[4][8].equals("wm"))) {
		matrix[4][4]="wm";
		matrix[4][6]="wm";
		matrix[4][8]="wm";

		}
		if((matrix[4][4].equals("w") || matrix[4][4].equals("wm")) && (matrix[6][4].equals("w") || matrix[6][4].equals("wm")) && (matrix[8][4].equals("w") || matrix[8][4].equals("wm"))) {
		matrix[4][4]="wm";
		matrix[6][4]="wm";
		matrix[8][4]="wm";

		}
		if((matrix[4][4].equals("w") || matrix[4][4].equals("wm")) && (matrix[4][6].equals("w") || matrix[4][6].equals("wm")) && (matrix[4][8].equals("w") || matrix[4][8].equals("wm"))) {
		matrix[4][4]="wm";
		matrix[4][6]="wm";
		matrix[4][8]="wm";

		}
		if((matrix[0][6].equals("w") || matrix[0][6].equals("wm")) && (matrix[2][6].equals("w") || matrix[2][6].equals("wm")) && (matrix[4][6].equals("w") || matrix[4][6].equals("wm"))) {
		matrix[0][6]="wm";
		matrix[2][6]="wm";
		matrix[4][6]="wm";

		}
		if((matrix[4][4].equals("w") || matrix[4][4].equals("wm")) && (matrix[4][6].equals("w") || matrix[4][6].equals("wm")) && (matrix[4][8].equals("w") || matrix[4][8].equals("wm"))) {
		matrix[4][4]="wm";
		matrix[4][6]="wm";
		matrix[4][8]="wm";

		}
		if((matrix[8][8].equals("w") || matrix[8][8].equals("wm")) && (matrix[6][8].equals("w") || matrix[6][8].equals("wm")) && (matrix[4][8].equals("w") || matrix[4][8].equals("wm"))) {
		matrix[8][8]="wm";
		matrix[6][8]="wm";
		matrix[4][8]="wm";

		}
		if((matrix[4][4].equals("w") || matrix[4][4].equals("wm")) && (matrix[6][4].equals("w") || matrix[6][4].equals("wm")) && (matrix[8][4].equals("w") || matrix[8][4].equals("wm"))) {
		matrix[4][4]="wm";
		matrix[6][4]="wm";
		matrix[8][4]="wm";

		}
		if((matrix[6][0].equals("w") || matrix[6][0].equals("wm")) && (matrix[6][2].equals("w") || matrix[6][2].equals("wm")) && (matrix[6][4].equals("w") || matrix[6][4].equals("wm"))) {
		matrix[6][0]="wm";
		matrix[6][2]="wm";
		matrix[6][4]="wm";

		}
		if((matrix[4][4].equals("w") || matrix[4][4].equals("wm")) && (matrix[6][4].equals("w") || matrix[6][4].equals("wm")) && (matrix[8][4].equals("w") || matrix[8][4].equals("wm"))) {
		matrix[4][4]="wm";
		matrix[6][4]="wm";
		matrix[8][4]="wm";
	
		}
		if((matrix[8][4].equals("w") || matrix[8][4].equals("wm")) && (matrix[8][6].equals("w") || matrix[8][6].equals("wm")) && (matrix[8][8].equals("w") || matrix[8][8].equals("wm"))) {
		matrix[8][4]="wm";
		matrix[8][6]="wm";
		matrix[8][8]="wm";

		}
		if((matrix[8][4].equals("w") ||  matrix[8][4].equals("wm")) && (matrix[8][6].equals("w") || matrix[8][6].equals("wm")) && (matrix[8][8].equals("w") || matrix[8][8].equals("wm"))) {
		matrix[8][4]="wm";
		matrix[8][6]="wm";
		matrix[8][8]="wm";
	
		}
		if((matrix[8][6].equals("w") || matrix[8][6].equals("wm")) && (matrix[10][6].equals("w") || matrix[10][6].equals("wm")) && (matrix[12][6].equals("w") || matrix[12][6].equals("wm"))) {
		matrix[8][6]="wm";
		matrix[10][6]="wm";
		matrix[12][6]="wm";

		}
		if((matrix[8][4].equals("w") || matrix[8][4].equals("wm")) && (matrix[8][6].equals("w") || matrix[8][6].equals("wm")) && (matrix[8][8].equals("wm") || matrix[8][8].equals("wm"))) {
		matrix[8][4]="wm";
		matrix[8][6]="wm";
		matrix[8][8]="wm";

		}
		if((matrix[8][8].equals("w") || matrix[8][8].equals("wm")) && (matrix[6][8].equals("w") || matrix[6][8].equals("wm")) && (matrix[4][8].equals("w") || matrix[4][8].equals("wm"))) {
		matrix[8][8]="wm";
		matrix[6][8]="wm";
		matrix[4][8]="wm";

		}
		if((matrix[8][8].equals("w") || matrix[8][8].equals("wm")) && (matrix[6][8].equals("w") || matrix[6][8].equals("wm")) && (matrix[4][8].equals("w") || matrix[4][8].equals("wm"))) {
		matrix[8][8]="wm";
		matrix[6][8]="wm";
		matrix[4][8]="wm";

		}
		if((matrix[6][8].equals("w") || matrix[6][8].equals("wm")) && (matrix[6][10].equals("w") || matrix[6][10].equals("wm")) && (matrix[6][12].equals("w") || matrix[6][12].equals("wm"))) {
		matrix[6][8]="wm";
		matrix[6][10]="wm";
		matrix[6][12]="wm";
	
		}
	}
	
	public static void vizsgal_fekete(int h_i, int h_j) {
		if(h_i==0 && h_j==0) {
			if((matrix[0][0].equals("b") || matrix[0][0].equals("bm")) && (matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[0][12].equals("b") || matrix[0][12].equals("bm"))) {
					matrix[0][0]="bm";
					matrix[0][6]="bm";
					matrix[0][12]="bm";
					f_malom=true;
					szamlalo--;
				}
			if((matrix[0][0].equals("b") || matrix[0][0].equals("bm")) && (matrix[6][0].equals("b") || matrix[6][0].equals("bm")) && (matrix[12][0].equals("b") || matrix[12][0].equals("bm"))) {
					matrix[0][0]="bm";
					matrix[6][0]="bm";
					matrix[12][0]="bm";
					f_malom=true;
					szamlalo--;
			}
		}
		if(h_i==0 && h_j==6) {
			if((matrix[0][0].equals("b") || matrix[0][0].equals("bm")) && (matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[0][12].equals("b") || matrix[0][12].equals("bm"))) {
				matrix[0][0]="bm";
				matrix[0][6]="bm";
				matrix[0][12]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[2][6].equals("b") || matrix[2][6].equals("bm")) && (matrix[4][6].equals("b") || matrix[4][6].equals("bm"))) {
				matrix[0][6]="bm";
				matrix[2][6]="bm";
				matrix[4][6]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==0 && h_j==12) {
			if((matrix[0][0].equals("b") || matrix[0][0].equals("bm")) && (matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[0][12].equals("b") || matrix[0][12].equals("bm"))) {
				matrix[0][0]="bm";
				matrix[0][6]="bm";
				matrix[0][12]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[0][12].equals("b") || matrix[0][12].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
				matrix[0][12]="bm";
				matrix[6][12]="bm";
				matrix[12][12]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==6 && h_j==0) {
			if((matrix[0][0].equals("b") || matrix[0][0].equals("bm")) && (matrix[6][0].equals("b") || matrix[6][0].equals("bm")) && (matrix[12][0].equals("b") || matrix[12][0].equals("bm"))) {
				matrix[0][0]="bm";
				matrix[6][0]="bm";
				matrix[12][0]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[6][0].equals("b") || matrix[6][0].equals("bm")) && (matrix[6][2].equals("b") || matrix[6][2].equals("bm")) && (matrix[6][4].equals("b") || matrix[6][4].equals("bm"))) {
				matrix[6][0]="bm";
				matrix[6][2]="bm";
				matrix[6][4]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==12 && h_j==0) {
			if((matrix[0][0].equals("b") || matrix[0][0].equals("bm")) && (matrix[6][0].equals("b") || matrix[6][0].equals("bm")) && (matrix[12][0].equals("b") || matrix[12][0].equals("bm"))) {
				matrix[0][0]="bm";
				matrix[6][0]="bm";
				matrix[12][0]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[12][0].equals("b") || matrix[12][0].equals("bm")) && (matrix[12][6].equals("b") || matrix[12][6].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
				matrix[12][0]="bm";
				matrix[12][6]="bm";
				matrix[12][12]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==12 && h_j==6) {
			if((matrix[12][0].equals("b") || matrix[12][0].equals("bm")) && (matrix[12][6].equals("b") || matrix[12][6].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
				matrix[12][0]="bm";
				matrix[12][6]="bm";
				matrix[12][12]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[8][6].equals("b") || matrix[8][6].equals("bm")) && (matrix[10][6].equals("b") || matrix[10][6].equals("bm")) && (matrix[12][6].equals("b") || matrix[12][6].equals("bm"))) {
				matrix[8][6]="bm";
				matrix[10][6]="bm";
				matrix[12][6]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==12 && h_j==12) {
			if((matrix[12][0].equals("b") || matrix[12][0].equals("bm")) && (matrix[12][6].equals("b") || matrix[12][6].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
				matrix[12][0]="bm";
				matrix[12][6]="bm";
				matrix[12][12]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[0][12].equals("b") || matrix[0][12].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
				matrix[0][12]="bm";
				matrix[6][12]="bm";
				matrix[12][12]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==6 && h_j==12) {
			if((matrix[0][12].equals("b") || matrix[0][12].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm")) && (matrix[12][12].equals("b") || matrix[12][12].equals("bm"))) {
				matrix[0][12]="bm";
				matrix[6][12]="bm";
				matrix[12][12]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[6][8].equals("b") || matrix[6][8].equals("bm")) && (matrix[6][10].equals("b") || matrix[6][10].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm"))) {
				matrix[6][8]="bm";
				matrix[6][10]="bm";
				matrix[6][12]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		///-------
		if(h_i==2 && h_j==2) {
			if((matrix[2][2].equals("b") || matrix[2][2].equals("bm")) && (matrix[2][6].equals("b") || matrix[2][6].equals("bm")) && (matrix[2][10].equals("b") || matrix[2][10].equals("bm"))) {
				matrix[2][2]="bm";
				matrix[2][6]="bm";
				matrix[2][10]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[2][2].equals("b") || matrix[2][2].equals("bm")) && (matrix[6][2].equals("b") || matrix[6][2].equals("bm")) && (matrix[10][2].equals("b") || matrix[10][2].equals("bm"))) {
				matrix[2][2]="bm";
				matrix[6][2]="bm";
				matrix[10][2]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==2 && h_j==6) {
			if((matrix[2][2].equals("b") || matrix[2][2].equals("bm")) && (matrix[2][6].equals("b") || matrix[2][6].equals("bm")) && (matrix[2][10].equals("b") || matrix[2][10].equals("bm"))) {
				matrix[2][2]="bm";
				matrix[2][6]="bm";
				matrix[2][10]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[2][6].equals("b") || matrix[2][6].equals("bm")) && (matrix[4][6].equals("b") || matrix[4][6].equals("bm"))) {
				matrix[0][6]="bm";
				matrix[2][6]="bm";
				matrix[4][6]="bm";
				f_malom=true;
				szamlalo--;
			}
			
		}
		if(h_i==2 && h_j==10) {
			if((matrix[2][2].equals("b") || matrix[2][2].equals("bm")) && (matrix[2][6].equals("b") || matrix[2][6].equals("bm")) && (matrix[2][10].equals("b") || matrix[2][10].equals("bm"))) {
				matrix[2][2]="bm";
				matrix[2][6]="bm";
				matrix[2][10]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[10][10].equals("b") || matrix[10][10].equals("bm")) && (matrix[6][10].equals("b") || matrix[6][10].equals("bm")) && (matrix[2][10].equals("b") || matrix[2][10].equals("bm"))) {
				matrix[10][10]="bm";
				matrix[6][10]="bm";
				matrix[2][10]="bm";
				f_malom=true;
				szamlalo--;
			}
			
		}
		if(h_i==6 && h_j==2) {
			if((matrix[2][2].equals("b") || matrix[2][2].equals("bm")) && (matrix[6][2].equals("b") || matrix[6][2].equals("bm")) && (matrix[10][2].equals("b") || matrix[10][2].equals("bm"))) {
				matrix[2][2]="bm";
				matrix[6][2]="bm";
				matrix[10][2]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[6][0].equals("b") || matrix[6][0].equals("bm")) && (matrix[6][2].equals("b") || matrix[6][2].equals("bm")) && (matrix[6][4].equals("b") || matrix[6][4].equals("bm"))) {
				matrix[6][0]="bm";
				matrix[6][2]="bm";
				matrix[6][4]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==10 && h_j==2) {
			if((matrix[2][2].equals("b") || matrix[2][2].equals("bm")) && (matrix[6][2].equals("b") || matrix[6][2].equals("bm")) && (matrix[10][2].equals("b") || matrix[10][2].equals("bm"))) {
				matrix[2][2]="bm";
				matrix[6][2]="bm";
				matrix[10][2]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[10][2].equals("b") || matrix[10][2].equals("bm")) && (matrix[10][6].equals("b") || matrix[10][6].equals("bm")) && (matrix[10][10].equals("b") || matrix[10][10].equals("bm"))) {
				matrix[10][2]="bm";
				matrix[10][6]="bm";
				matrix[10][10]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==10 && h_j==6) {
			if((matrix[10][2].equals("b") || matrix[10][2].equals("bm")) && (matrix[10][6].equals("b") || matrix[10][6].equals("bm")) && (matrix[10][10].equals("b") || matrix[10][10].equals("bm"))) {
				matrix[10][2]="bm";
				matrix[10][6]="bm";
				matrix[10][10]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[8][6].equals("b") || matrix[8][6].equals("bm")) && (matrix[10][6].equals("b") || matrix[10][6].equals("bm")) && (matrix[12][6].equals("b") || matrix[12][6].equals("bm"))) {
				matrix[8][6]="bm";
				matrix[10][6]="bm";
				matrix[12][6]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==10 && h_j==10) {
			if((matrix[10][2].equals("b") || matrix[10][2].equals("bm")) && (matrix[10][6].equals("b") || matrix[10][6].equals("bm")) && (matrix[10][10].equals("b") || matrix[10][10].equals("bm"))) {
				matrix[10][2]="bm";
				matrix[10][6]="bm";
				matrix[10][10]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[10][10].equals("b") || matrix[10][10].equals("bm")) && (matrix[6][10].equals("b") || matrix[6][10].equals("bm")) && (matrix[2][10].equals("b") || matrix[2][10].equals("bm"))) {
				matrix[10][10]="bm";
				matrix[6][10]="bm";
				matrix[2][10]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==6 && h_j==10) {
			if((matrix[10][10].equals("b") || matrix[10][10].equals("bm")) && (matrix[6][10].equals("b") || matrix[6][10].equals("bm")) && (matrix[2][10].equals("b") || matrix[2][10].equals("bm"))) {
				matrix[10][10]="bm";
				matrix[6][10]="bm";
				matrix[2][10]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[6][8].equals("b") || matrix[6][8].equals("bm")) && (matrix[6][10].equals("b") || matrix[6][10].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm"))) {
				matrix[6][8]="bm";
				matrix[6][10]="bm";
				matrix[6][12]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		////-------
		if(h_i==4 && h_j==4) {
			if((matrix[4][4].equals("b") || matrix[4][4].equals("bm")) && (matrix[4][6].equals("b") || matrix[4][6].equals("bm")) && (matrix[4][8].equals("b") || matrix[4][8].equals("bm"))) {
				matrix[4][4]="bm";
				matrix[4][6]="bm";
				matrix[4][8]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[4][4].equals("b") || matrix[4][4].equals("bm")) && (matrix[6][4].equals("b") || matrix[6][4].equals("bm")) && (matrix[8][4].equals("b") || matrix[8][4].equals("bm"))) {
				matrix[4][4]="bm";
				matrix[6][4]="bm";
				matrix[8][4]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==4 && h_j==6) {
			if((matrix[4][4].equals("b") || matrix[4][4].equals("bm")) && (matrix[4][6].equals("b") || matrix[4][6].equals("bm")) && (matrix[4][8].equals("b") || matrix[4][8].equals("bm"))) {
				matrix[4][4]="bm";
				matrix[4][6]="bm";
				matrix[4][8]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[0][6].equals("b") || matrix[0][6].equals("bm")) && (matrix[2][6].equals("b") || matrix[2][6].equals("bm")) && (matrix[4][6].equals("b") || matrix[4][6].equals("bm"))) {
				matrix[0][6]="bm";
				matrix[2][6]="bm";
				matrix[4][6]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==4 && h_j==8) {
			if((matrix[4][4].equals("b") || matrix[4][4].equals("bm")) && (matrix[4][6].equals("b") || matrix[4][6].equals("bm")) && (matrix[4][8].equals("b") || matrix[4][8].equals("bm"))) {
				matrix[4][4]="bm";
				matrix[4][6]="bm";
				matrix[4][8]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[8][8].equals("b") || matrix[8][8].equals("bm")) && (matrix[6][8].equals("b") || matrix[6][8].equals("bm")) && (matrix[4][8].equals("b") || matrix[4][8].equals("bm"))) {
				matrix[8][8]="bm";
				matrix[6][8]="bm";
				matrix[4][8]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==6 && h_j==4) {
			if((matrix[4][4].equals("b") || matrix[4][4].equals("bm")) && (matrix[6][4].equals("b") || matrix[6][4].equals("bm")) && (matrix[8][4].equals("b") || matrix[8][4].equals("bm"))) {
				matrix[4][4]="bm";
				matrix[6][4]="bm";
				matrix[8][4]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[6][0].equals("b") || matrix[6][0].equals("bm")) && (matrix[6][2].equals("b") || matrix[6][2].equals("bm")) && (matrix[6][4].equals("b") || matrix[6][4].equals("bm"))) {
				matrix[6][0]="bm";
				matrix[6][2]="bm";
				matrix[6][4]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==8 && h_j==4) {
			if((matrix[4][4].equals("b") || matrix[4][4].equals("bm")) && (matrix[6][4].equals("b") || matrix[6][4].equals("bm")) && (matrix[8][4].equals("b") || matrix[8][4].equals("bm"))) {
				matrix[4][4]="bm";
				matrix[6][4]="bm";
				matrix[8][4]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[8][4].equals("b") || matrix[8][4].equals("bm")) && (matrix[8][6].equals("b") || matrix[8][6].equals("bm")) && (matrix[8][8].equals("b") || matrix[8][8].equals("bm"))) {
				matrix[8][4]="bm";
				matrix[8][6]="bm";
				matrix[8][8]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==8 && h_j==6) {
			if((matrix[8][4].equals("b") ||  matrix[8][4].equals("bm")) && (matrix[8][6].equals("b") || matrix[8][6].equals("bm")) && (matrix[8][8].equals("b") || matrix[8][8].equals("bm"))) {
				matrix[8][4]="bm";
				matrix[8][6]="bm";
				matrix[8][8]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[8][6].equals("b") || matrix[8][6].equals("bm")) && (matrix[10][6].equals("b") || matrix[10][6].equals("bm")) && (matrix[12][6].equals("b") || matrix[12][6].equals("bm"))) {
				matrix[8][6]="bm";
				matrix[10][6]="bm";
				matrix[12][6]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==8 && h_j==8) {
			if((matrix[8][4].equals("b") || matrix[8][4].equals("bm")) && (matrix[8][6].equals("b") || matrix[8][6].equals("bm")) && (matrix[8][8].equals("b") || matrix[8][8].equals("bm"))) {
				matrix[8][4]="bm";
				matrix[8][6]="bm";
				matrix[8][8]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[8][8].equals("b") || matrix[8][8].equals("bm")) && (matrix[6][8].equals("b") || matrix[6][8].equals("bm")) && (matrix[4][8].equals("b") || matrix[4][8].equals("bm"))) {
				matrix[8][8]="bm";
				matrix[6][8]="bm";
				matrix[4][8]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
		if(h_i==6 && h_j==8) {
			if((matrix[8][8].equals("b") || matrix[8][8].equals("bm")) && (matrix[6][8].equals("b") || matrix[6][8].equals("bm")) && (matrix[4][8].equals("b") || matrix[4][8].equals("bm"))) {
				matrix[8][8]="bm";
				matrix[6][8]="bm";
				matrix[4][8]="bm";
				f_malom=true;
				szamlalo--;
			}
			if((matrix[6][8].equals("b") || matrix[6][8].equals("bm")) && (matrix[6][10].equals("b") || matrix[6][10].equals("bm")) && (matrix[6][12].equals("b") || matrix[6][12].equals("bm"))) {
				matrix[6][8]="bm";
				matrix[6][10]="bm";
				matrix[6][12]="bm";
				f_malom=true;
				szamlalo--;
			}
		}
				
	}
	
	public static void vizsgal_feher(int h_i, int h_j) {
		if(h_i==0 && h_j==0) {
			if((matrix[0][0].equals("w") || matrix[0][0].equals("wm")) && (matrix[0][6].equals("w") || matrix[0][6].equals("wm")) && (matrix[0][12].equals("w") || matrix[0][12].equals("wm"))) {
					matrix[0][0]="wm";
					matrix[0][6]="wm";
					matrix[0][12]="wm";
					feher_malom=true;
					szamlalo--;
				}
			if((matrix[0][0].equals("w") || matrix[0][0].equals("wm")) && (matrix[6][0].equals("w") || matrix[6][0].equals("wm")) && (matrix[12][0].equals("w") || matrix[12][0].equals("wm"))) {
					matrix[0][0]="wm";
					matrix[6][0]="wm";
					matrix[12][0]="wm";
					feher_malom=true;
					szamlalo--;
			}
		}
		if(h_i==0 && h_j==6) {
			if((matrix[0][0].equals("w") || matrix[0][0].equals("wm")) && (matrix[0][6].equals("w") || matrix[0][6].equals("wm")) && (matrix[0][12].equals("w") || matrix[0][12].equals("wm"))) {
				matrix[0][0]="wm";
				matrix[0][6]="wm";
				matrix[0][12]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[0][6].equals("w") || matrix[0][6].equals("wm")) && (matrix[2][6].equals("w") || matrix[2][6].equals("wm")) && (matrix[4][6].equals("w") || matrix[4][6].equals("wm"))) {
				matrix[0][6]="wm";
				matrix[2][6]="wm";
				matrix[4][6]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==0 && h_j==12) {
			if((matrix[0][0].equals("w") || matrix[0][0].equals("wm")) && (matrix[0][6].equals("w") || matrix[0][6].equals("wm")) && (matrix[0][12].equals("w") || matrix[0][12].equals("wm"))) {
				matrix[0][0]="wm";
				matrix[0][6]="wm";
				matrix[0][12]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[0][12].equals("w") || matrix[0][12].equals("wm")) && (matrix[6][12].equals("w") || matrix[6][12].equals("wm")) && (matrix[12][12].equals("w") || matrix[12][12].equals("wm"))) {
				matrix[0][12]="wm";
				matrix[6][12]="wm";
				matrix[12][12]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==6 && h_j==0) {
			if((matrix[0][0].equals("w") || matrix[0][0].equals("wm")) && (matrix[6][0].equals("w") || matrix[6][0].equals("wm")) && (matrix[12][0].equals("w") || matrix[12][0].equals("wm"))) {
				matrix[0][0]="wm";
				matrix[6][0]="wm";
				matrix[12][0]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[6][0].equals("w") || matrix[6][0].equals("wm")) && (matrix[6][2].equals("w") || matrix[6][2].equals("wm")) && (matrix[6][4].equals("w") || matrix[6][4].equals("wm"))) {
				matrix[6][0]="wm";
				matrix[6][2]="wm";
				matrix[6][4]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==12 && h_j==0) {
			if((matrix[0][0].equals("w") || matrix[0][0].equals("wm")) && (matrix[6][0].equals("w") || matrix[6][0].equals("wm")) && (matrix[12][0].equals("w") || matrix[12][0].equals("wm"))) {
				matrix[0][0]="wm";
				matrix[6][0]="wm";
				matrix[12][0]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[12][0].equals("w") || matrix[12][0].equals("wm")) && (matrix[12][6].equals("w") || matrix[12][6].equals("wm")) && (matrix[12][12].equals("w") || matrix[12][12].equals("wm"))) {
				matrix[12][0]="wm";
				matrix[12][6]="wm";
				matrix[12][12]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==12 && h_j==6) {
			if((matrix[12][0].equals("w") || matrix[12][0].equals("wm")) && (matrix[12][6].equals("w") || matrix[12][6].equals("wm")) && (matrix[12][12].equals("w") || matrix[12][12].equals("wm"))) {
				matrix[12][0]="wm";
				matrix[12][6]="wm";
				matrix[12][12]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[8][6].equals("w") || matrix[8][6].equals("wm")) && (matrix[10][6].equals("w") || matrix[10][6].equals("wm")) && (matrix[12][6].equals("w") || matrix[12][6].equals("wm"))) {
				matrix[8][6]="wm";
				matrix[10][6]="wm";
				matrix[12][6]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==12 && h_j==12) {
			if((matrix[12][0].equals("w") || matrix[12][0].equals("wm")) && (matrix[12][6].equals("w") || matrix[12][6].equals("wm")) && (matrix[12][12].equals("w") || matrix[12][12].equals("wm"))) {
				matrix[12][0]="wm";
				matrix[12][6]="wm";
				matrix[12][12]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[0][12].equals("w") || matrix[0][12].equals("wm")) && (matrix[6][12].equals("w") || matrix[6][12].equals("wm")) && (matrix[12][12].equals("w") || matrix[12][12].equals("wm"))) {
				matrix[0][12]="wm";
				matrix[6][12]="wm";
				matrix[12][12]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==6 && h_j==12) {
			if((matrix[0][12].equals("w") || matrix[0][12].equals("wm")) && (matrix[6][12].equals("w") || matrix[6][12].equals("wm")) && (matrix[12][12].equals("w") || matrix[12][12].equals("wm"))) {
				matrix[0][12]="wm";
				matrix[6][12]="wm";
				matrix[12][12]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[6][8].equals("w") || matrix[6][8].equals("wm")) && (matrix[6][10].equals("w") || matrix[6][10].equals("wm")) && (matrix[6][12].equals("w") || matrix[6][12].equals("wm"))) {
				matrix[6][8]="wm";
				matrix[6][10]="wm";
				matrix[6][12]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		///-------
		if(h_i==2 && h_j==2) {
			if((matrix[2][2].equals("w") || matrix[2][2].equals("wm")) && (matrix[2][6].equals("w") || matrix[2][6].equals("wm")) && (matrix[2][10].equals("w") || matrix[2][10].equals("wm"))) {
				matrix[2][2]="wm";
				matrix[2][6]="wm";
				matrix[2][10]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[2][2].equals("w") || matrix[2][2].equals("wm")) && (matrix[6][2].equals("w") || matrix[6][2].equals("wm")) && (matrix[10][2].equals("w") || matrix[10][2].equals("wm"))) {
				matrix[2][2]="wm";
				matrix[6][2]="wm";
				matrix[10][2]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==2 && h_j==6) {
			if((matrix[2][2].equals("w") || matrix[2][2].equals("wm")) && (matrix[2][6].equals("w") || matrix[2][6].equals("wm")) && (matrix[2][10].equals("w") || matrix[2][10].equals("wm"))) {
				matrix[2][2]="wm";
				matrix[2][6]="wm";
				matrix[2][10]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[0][6].equals("w") || matrix[0][6].equals("wm")) && (matrix[2][6].equals("w") || matrix[2][6].equals("wm")) && (matrix[4][6].equals("w") || matrix[4][6].equals("wm"))) {
				matrix[0][6]="wm";
				matrix[2][6]="wm";
				matrix[4][6]="wm";
				feher_malom=true;
				szamlalo--;
			}
			
		}
		if(h_i==2 && h_j==10) {
			if((matrix[2][2].equals("w") || matrix[2][2].equals("wm")) && (matrix[2][6].equals("w") || matrix[2][6].equals("wm")) && (matrix[2][10].equals("w") || matrix[2][10].equals("wm"))) {
				matrix[2][2]="wm";
				matrix[2][6]="wm";
				matrix[2][10]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[10][10].equals("w") || matrix[10][10].equals("wm")) && (matrix[6][10].equals("w") || matrix[6][10].equals("wm")) && (matrix[2][10].equals("w") || matrix[2][10].equals("wm"))) {
				matrix[10][10]="wm";
				matrix[6][10]="wm";
				matrix[2][10]="wm";
				feher_malom=true;
				szamlalo--;
			}
			
		}
		if(h_i==6 && h_j==2) {
			if((matrix[2][2].equals("w") || matrix[2][2].equals("wm")) && (matrix[6][2].equals("w") || matrix[6][2].equals("wm")) && (matrix[10][2].equals("w") || matrix[10][2].equals("wm"))) {
				matrix[2][2]="wm";
				matrix[6][2]="wm";
				matrix[10][2]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[6][0].equals("w") || matrix[6][0].equals("wm")) && (matrix[6][2].equals("w") || matrix[6][2].equals("wm")) && (matrix[6][4].equals("w") || matrix[6][4].equals("wm"))) {
				matrix[6][0]="wm";
				matrix[6][2]="wm";
				matrix[6][4]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==10 && h_j==2) {
			if((matrix[2][2].equals("w") || matrix[2][2].equals("wm")) && (matrix[6][2].equals("w") || matrix[6][2].equals("wm")) && (matrix[10][2].equals("w") || matrix[10][2].equals("wm"))) {
				matrix[2][2]="wm";
				matrix[6][2]="wm";
				matrix[10][2]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[10][2].equals("w") || matrix[10][2].equals("wm")) && (matrix[10][6].equals("w") || matrix[10][6].equals("wm")) && (matrix[10][10].equals("w") || matrix[10][10].equals("wm"))) {
				matrix[10][2]="wm";
				matrix[10][6]="wm";
				matrix[10][10]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==10 && h_j==6) {
			if((matrix[10][2].equals("w") || matrix[10][2].equals("wm")) && (matrix[10][6].equals("w") || matrix[10][6].equals("wm")) && (matrix[10][10].equals("w") || matrix[10][10].equals("wm"))) {
				matrix[10][2]="wm";
				matrix[10][6]="wm";
				matrix[10][10]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[8][6].equals("w") || matrix[8][6].equals("wm")) && (matrix[10][6].equals("w") || matrix[10][6].equals("wm")) && (matrix[12][6].equals("w") || matrix[12][6].equals("wm"))) {
				matrix[8][6]="wm";
				matrix[10][6]="wm";
				matrix[12][6]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==10 && h_j==10) {
			if((matrix[10][2].equals("w") || matrix[10][2].equals("wm")) && (matrix[10][6].equals("w") || matrix[10][6].equals("wm")) && (matrix[10][10].equals("w") || matrix[10][10].equals("wm"))) {
				matrix[10][2]="wm";
				matrix[10][6]="wm";
				matrix[10][10]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[10][10].equals("w") || matrix[10][10].equals("wm")) && (matrix[6][10].equals("w") || matrix[6][10].equals("wm")) && (matrix[2][10].equals("w") || matrix[2][10].equals("wm"))) {
				matrix[10][10]="wm";
				matrix[6][10]="wm";
				matrix[2][10]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==6 && h_j==10) {
			if((matrix[10][10].equals("w") || matrix[10][10].equals("wm")) && (matrix[6][10].equals("w") || matrix[6][10].equals("wm")) && (matrix[2][10].equals("w") || matrix[2][10].equals("wm"))) {
				matrix[10][10]="wm";
				matrix[6][10]="wm";
				matrix[2][10]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[6][8].equals("w") || matrix[6][8].equals("wm")) && (matrix[6][10].equals("w") || matrix[6][10].equals("wm")) && (matrix[6][12].equals("w") || matrix[6][12].equals("wm"))) {
				matrix[6][8]="wm";
				matrix[6][10]="wm";
				matrix[6][12]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		////-------
		if(h_i==4 && h_j==4) {
			if((matrix[4][4].equals("w") || matrix[4][4].equals("wm")) && (matrix[4][6].equals("w") || matrix[4][6].equals("wm")) && (matrix[4][8].equals("w") || matrix[4][8].equals("wm"))) {
				matrix[4][4]="wm";
				matrix[4][6]="wm";
				matrix[4][8]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[4][4].equals("w") || matrix[4][4].equals("wm")) && (matrix[6][4].equals("w") || matrix[6][4].equals("wm")) && (matrix[8][4].equals("w") || matrix[8][4].equals("wm"))) {
				matrix[4][4]="wm";
				matrix[6][4]="wm";
				matrix[8][4]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==4 && h_j==6) {
			if((matrix[4][4].equals("w") || matrix[4][4].equals("wm")) && (matrix[4][6].equals("w") || matrix[4][6].equals("wm")) && (matrix[4][8].equals("w") || matrix[4][8].equals("wm"))) {
				matrix[4][4]="wm";
				matrix[4][6]="wm";
				matrix[4][8]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[0][6].equals("w") || matrix[0][6].equals("wm")) && (matrix[2][6].equals("w") || matrix[2][6].equals("wm")) && (matrix[4][6].equals("w") || matrix[4][6].equals("wm"))) {
				matrix[0][6]="wm";
				matrix[2][6]="wm";
				matrix[4][6]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==4 && h_j==8) {
			if((matrix[4][4].equals("w") || matrix[4][4].equals("wm")) && (matrix[4][6].equals("w") || matrix[4][6].equals("wm")) && (matrix[4][8].equals("w") || matrix[4][8].equals("wm"))) {
				matrix[4][4]="wm";
				matrix[4][6]="wm";
				matrix[4][8]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[8][8].equals("w") || matrix[8][8].equals("wm")) && (matrix[6][8].equals("w") || matrix[6][8].equals("wm")) && (matrix[4][8].equals("w") || matrix[4][8].equals("wm"))) {
				matrix[8][8]="wm";
				matrix[6][8]="wm";
				matrix[4][8]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==6 && h_j==4) {
			if((matrix[4][4].equals("w") || matrix[4][4].equals("wm")) && (matrix[6][4].equals("w") || matrix[6][4].equals("wm")) && (matrix[8][4].equals("w") || matrix[8][4].equals("wm"))) {
				matrix[4][4]="wm";
				matrix[6][4]="wm";
				matrix[8][4]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[6][0].equals("w") || matrix[6][0].equals("wm")) && (matrix[6][2].equals("w") || matrix[6][2].equals("wm")) && (matrix[6][4].equals("w") || matrix[6][4].equals("wm"))) {
				matrix[6][0]="wm";
				matrix[6][2]="wm";
				matrix[6][4]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==8 && h_j==4) {
			if((matrix[4][4].equals("w") || matrix[4][4].equals("wm")) && (matrix[6][4].equals("w") || matrix[6][4].equals("wm")) && (matrix[8][4].equals("w") || matrix[8][4].equals("wm"))) {
				matrix[4][4]="wm";
				matrix[6][4]="wm";
				matrix[8][4]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[8][4].equals("w") || matrix[8][4].equals("wm")) && (matrix[8][6].equals("w") || matrix[8][6].equals("wm")) && (matrix[8][8].equals("w") || matrix[8][8].equals("wm"))) {
				matrix[8][4]="wm";
				matrix[8][6]="wm";
				matrix[8][8]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==8 && h_j==6) {
			if((matrix[8][4].equals("w") ||  matrix[8][4].equals("wm")) && (matrix[8][6].equals("w") || matrix[8][6].equals("wm")) && (matrix[8][8].equals("w") || matrix[8][8].equals("wm"))) {
				matrix[8][4]="wm";
				matrix[8][6]="wm";
				matrix[8][8]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[8][6].equals("w") || matrix[8][6].equals("wm")) && (matrix[10][6].equals("w") || matrix[10][6].equals("wm")) && (matrix[12][6].equals("w") || matrix[12][6].equals("wm"))) {
				matrix[8][6]="wm";
				matrix[10][6]="wm";
				matrix[12][6]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==8 && h_j==8) {
			if((matrix[8][4].equals("w") || matrix[8][4].equals("wm")) && (matrix[8][6].equals("w") || matrix[8][6].equals("wm")) && (matrix[8][8].equals("wm") || matrix[8][8].equals("wm"))) {
				matrix[8][4]="wm";
				matrix[8][6]="wm";
				matrix[8][8]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[8][8].equals("w") || matrix[8][8].equals("wm")) && (matrix[6][8].equals("w") || matrix[6][8].equals("wm")) && (matrix[4][8].equals("w") || matrix[4][8].equals("wm"))) {
				matrix[8][8]="wm";
				matrix[6][8]="wm";
				matrix[4][8]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
		if(h_i==6 && h_j==8) {
			if((matrix[8][8].equals("w") || matrix[8][8].equals("wm")) && (matrix[6][8].equals("w") || matrix[6][8].equals("wm")) && (matrix[4][8].equals("w") || matrix[4][8].equals("wm"))) {
				matrix[8][8]="wm";
				matrix[6][8]="wm";
				matrix[4][8]="wm";
				feher_malom=true;
				szamlalo--;
			}
			if((matrix[6][8].equals("w") || matrix[6][8].equals("wm")) && (matrix[6][10].equals("w") || matrix[6][10].equals("wm")) && (matrix[6][12].equals("w") || matrix[6][12].equals("wm"))) {
				matrix[6][8]="wm";
				matrix[6][10]="wm";
				matrix[6][12]="wm";
				feher_malom=true;
				szamlalo--;
			}
		}
	}
	
	
	public static void program() {
		lbkijon.setText("Fekete rak");
		for(int i=0;i<13;i++) {
			for(int j=0;j<13;j++) {
				labels[i][j].addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						
						for(int i=0;i<13;i++) {
							for(int j=0;j<13;j++) {
							if(e.getSource()==labels[i][j]) {
								///Pakolások
								if(matrix[i][j].equals("x") && (dbfeher>0 || dbfekete>0)) {
											if(szamlalo%2==1 && dbfekete>0) {
												labels[i][j].setIcon(new ImageIcon(Malom.class.getResource("/img/fekete.png")));
												dbfekete--;
												szamlalo++;
												matrix[i][j]="b";
												vizsgal_fekete(i,j);
												fekete_jatekban++;
											}
											else if(szamlalo%2==0 && dbfeher>0) {
												labels[i][j].setIcon(new ImageIcon(Malom.class.getResource("/img/feher.png")));
												dbfeher--;
												szamlalo++;
												matrix[i][j]="w";
												vizsgal_feher(i,j);
												feher_jatekban++;
											}
											kijon();
											kiir();
									}
								
								///Kijelölés
									else if(dbfekete==0 && dbfeher==0) {
											if(((matrix[i][j].equals("b") || matrix[i][j].equals("bm")) && szamlalo%2==1 && !f_malom) || ((matrix[i][j].equals("w") || matrix[i][j].equals("wm")) && szamlalo%2==0 && !feher_malom)) {
												if(szamlalo%2==1)
													aktualis="fekete";
												else
													aktualis="feher";
												lep_i=i; lep_j=j;
												if(i==0 && j==0) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j+6].equals("x")) {
														if(lep==1)
															labels[i][j+6].setBorder(border);
														else
															labels[i][j+6].setBorder(null);
													}
													if(matrix[i+6][j].equals("x")) {
														if(lep==1)
															labels[i+6][j].setBorder(border);
														else
															labels[i+6][j].setBorder(null);
													}
												}
												else if(i==6 && j==0) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													if(matrix[i-6][j].equals("x")) {
														if(lep==1)
															labels[i-6][j].setBorder(border);
														else
															labels[i-6][j].setBorder(null);
													}
													if(matrix[i+6][j].equals("x")) {
														if(lep==1)
															labels[i+6][j].setBorder(border);
														else
															labels[i+6][j].setBorder(null);
													}
													if(matrix[i][j+2].equals("x")) {
														if(lep==1)
															labels[i][j+2].setBorder(border);
														else
															labels[i][j+2].setBorder(null);
													}
												}
												else if(i==12 && j==0) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i-6][j].equals("x")) {
														if(lep==1)
															labels[i-6][j].setBorder(border);
														else
															labels[i-6][j].setBorder(null);
													}
													if(matrix[i][j+6].equals("x")) {
														if(lep==1)
															labels[i][j+6].setBorder(border);
														else
															labels[i][j+6].setBorder(null);
													}
												}
												else if(i==0 && j==6) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j-6].equals("x")) {
														if(lep==1)
															labels[i][j-6].setBorder(border);
														else
															labels[i][j-6].setBorder(null);
													}
													if(matrix[i][j+6].equals("x")) {
														if(lep==1)
															labels[i][j+6].setBorder(border);
														else
															labels[i][j+6].setBorder(null);
													}
													if(matrix[i+2][j].equals("x")) {
														if(lep==1)
															labels[i+2][j].setBorder(border);
														else
															labels[i+2][j].setBorder(null);
													}
												}
												else if(i==0 && j==12) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j-6].equals("x")) {
														if(lep==1)
															labels[i][j-6].setBorder(border);
														else
															labels[i][j-6].setBorder(null);
													}
													if(matrix[i+6][j].equals("x")) {
														if(lep==1)
															labels[i+6][j].setBorder(border);
														else
															labels[i+6][j].setBorder(null);
													}
												}
												else if(i==6 && j==12) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													if(matrix[i-6][j].equals("x")) {
														if(lep==1)
															labels[i-6][j].setBorder(border);
														else
															labels[i-6][j].setBorder(null);
													}
													if(matrix[i+6][j].equals("x")) {
														if(lep==1)
															labels[i+6][j].setBorder(border);
														else
															labels[i+6][j].setBorder(null);
													}
													if(matrix[i][j-2].equals("x")) {
														if(lep==1)
															labels[i][j-2].setBorder(border);
														else
															labels[i][j-2].setBorder(null);
													}
												}
												else if(i==12 && j==12) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i-6][j].equals("x")) {
														if(lep==1)
															labels[i-6][j].setBorder(border);
														else
															labels[i-6][j].setBorder(null);
													}
													if(matrix[i][j-6].equals("x")) {
														if(lep==1)
															labels[i][j-6].setBorder(border);
														else
															labels[i][j-6].setBorder(null);
													}
												}
												else if(i==12 && j==6) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j-6].equals("x")) {
														if(lep==1)
															labels[i][j-6].setBorder(border);
														else
															labels[i][j-6].setBorder(null);
													}
													if(matrix[i][j+6].equals("x")) {
														if(lep==1)
															labels[i][j+6].setBorder(border);
														else
															labels[i][j+6].setBorder(null);
													}
													if(matrix[i-2][j].equals("x")) {
														if(lep==1)
															labels[i-2][j].setBorder(border);
														else
															labels[i-2][j].setBorder(null);
													}
												}
												else if(i==2 && j==2) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j+4].equals("x")) {
														if(lep==1)
															labels[i][j+4].setBorder(border);
														else
															labels[i][j+4].setBorder(null);
													}
													if(matrix[i+4][j].equals("x")) {
														if(lep==1)
															labels[i+4][j].setBorder(border);
														else
															labels[i+4][j].setBorder(null);
													}
												}
												else if(i==6 && j==2) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													if(matrix[i-4][j].equals("x")) {
														if(lep==1)
															labels[i-4][j].setBorder(border);
														else
															labels[i-4][j].setBorder(null);
													}
													if(matrix[i+4][j].equals("x")) {
														if(lep==1)
															labels[i+4][j].setBorder(border);
														else
															labels[i+4][j].setBorder(null);
													}
													if(matrix[i][j+2].equals("x")) {
														if(lep==1)
															labels[i][j+2].setBorder(border);
														else
															labels[i][j+2].setBorder(null);
													}
													if(matrix[i][j-2].equals("x")) {
														if(lep==1)
															labels[i][j-2].setBorder(border);
														else
															labels[i][j-2].setBorder(null);
													}
												}
												else if(i==10 && j==2) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i-4][j].equals("x")) {
														if(lep==1)
															labels[i-4][j].setBorder(border);
														else
															labels[i-4][j].setBorder(null);
													}
													if(matrix[i][j+4].equals("x")) {
														if(lep==1)
															labels[i][j+4].setBorder(border);
														else
															labels[i][j+4].setBorder(null);
													}
												}
												else if(i==10 && j==6) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j-4].equals("x")) {
														if(lep==1)
															labels[i][j-4].setBorder(border);
														else
															labels[i][j-4].setBorder(null);
													}
													if(matrix[i][j+4].equals("x")) {
														if(lep==1)
															labels[i][j+4].setBorder(border);
														else
															labels[i][j+4].setBorder(null);
													}
													if(matrix[i+2][j].equals("x")) {
														if(lep==1)
															labels[i+2][j].setBorder(border);
														else
															labels[i+2][j].setBorder(null);
													}
													if(matrix[i-2][j].equals("x")) {
														if(lep==1)
															labels[i-2][j].setBorder(border);
														else
															labels[i-2][j].setBorder(null);
													}
												}
												else if(i==10 && j==10) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j-4].equals("x")) {
														if(lep==1)
															labels[i][j-4].setBorder(border);
														else
															labels[i][j-4].setBorder(null);
													}
													if(matrix[i-4][j].equals("x")) {
														if(lep==1)
															labels[i-4][j].setBorder(border);
														else
															labels[i-4][j].setBorder(null);
													}
												}
												else if(i==6 && j==10) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													if(matrix[i-4][j].equals("x")) {
														if(lep==1)
															labels[i-4][j].setBorder(border);
														else
															labels[i-4][j].setBorder(null);
													}
													if(matrix[i+4][j].equals("x")) {
														if(lep==1)
															labels[i+4][j].setBorder(border);
														else
															labels[i+4][j].setBorder(null);
													}
													if(matrix[i][j-2].equals("x")) {
														if(lep==1)
															labels[i][j-2].setBorder(border);
														else
															labels[i][j-2].setBorder(null);
													}
													if(matrix[i][j+2].equals("x")) {
														if(lep==1)
															labels[i][j+2].setBorder(border);
														else
															labels[i][j+2].setBorder(null);
													}
												}
												else if(i==2 && j==10) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j-4].equals("x")) {
														if(lep==1)
															labels[i][j-4].setBorder(border);
														else
															labels[i][j-4].setBorder(null);
													}
													if(matrix[i+4][j].equals("x")) {
														if(lep==1)
															labels[i+4][j].setBorder(border);
														else
															labels[i+4][j].setBorder(null);
													}
												}
												else if(i==2 && j==6) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j-4].equals("x")) {
														if(lep==1)
															labels[i][j-4].setBorder(border);
														else
															labels[i][j-4].setBorder(null);
													}
													if(matrix[i][j+4].equals("x")) {
														if(lep==1)
															labels[i][j+4].setBorder(border);
														else
															labels[i][j+4].setBorder(null);
													}
													if(matrix[i-2][j].equals("x")) {
														if(lep==1)
															labels[i-2][j].setBorder(border);
														else
															labels[i-2][j].setBorder(null);
													}
													if(matrix[i+2][j].equals("x")) {
														if(lep==1)
															labels[i+2][j].setBorder(border);
														else
															labels[i+2][j].setBorder(null);
													}
												}
												else if(i==4 && j==4) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j+2].equals("x")) {
														if(lep==1)
															labels[i][j+2].setBorder(border);
														else
															labels[i][j+2].setBorder(null);
													}
													if(matrix[i+2][j].equals("x")) {
														if(lep==1)
															labels[i+2][j].setBorder(border);
														else
															labels[i+2][j].setBorder(null);
													}
												}
												else if(i==6 && j==4) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j-2].equals("x")) {
														if(lep==1)
															labels[i][j-2].setBorder(border);
														else
															labels[i][j-2].setBorder(null);
													}
													if(matrix[i+2][j].equals("x")) {
														if(lep==1)
															labels[i+2][j].setBorder(border);
														else
															labels[i+2][j].setBorder(null);
													}
													if(matrix[i-2][j].equals("x")) {
														if(lep==1)
															labels[i-2][j].setBorder(border);
														else
															labels[i-2][j].setBorder(null);
													}
												}
												else if(i==8 && j==4) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j+2].equals("x")) {
														if(lep==1)
															labels[i][j+2].setBorder(border);
														else
															labels[i][j+2].setBorder(null);
													}
													if(matrix[i-2][j].equals("x")) {
														if(lep==1)
															labels[i-2][j].setBorder(border);
														else
															labels[i-2][j].setBorder(null);
													}
												}
												else if(i==8 && j==6) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j+2].equals("x")) {
														if(lep==1)
															labels[i][j+2].setBorder(border);
														else
															labels[i][j+2].setBorder(null);
													}
													if(matrix[i+2][j].equals("x")) {
														if(lep==1)
															labels[i+2][j].setBorder(border);
														else
															labels[i+2][j].setBorder(null);
													}
													if(matrix[i][j-2].equals("x")) {
														if(lep==1)
															labels[i][j-2].setBorder(border);
														else
															labels[i][j-2].setBorder(null);
													}
												}
												else if(i==8 && j==8) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i-2][j].equals("x")) {
														if(lep==1)
															labels[i-2][j].setBorder(border);
														else
															labels[i-2][j].setBorder(null);
													}
													if(matrix[i][j-2].equals("x")) {
														if(lep==1)
															labels[i][j-2].setBorder(border);
														else
															labels[i][j-2].setBorder(null);
													}
												}
												else if(i==6 && j==8) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i-2][j].equals("x")) {
														if(lep==1)
															labels[i-2][j].setBorder(border);
														else
															labels[i-2][j].setBorder(null);
													}
													if(matrix[i][j+2].equals("x")) {
														if(lep==1)
															labels[i][j+2].setBorder(border);
														else
															labels[i][j+2].setBorder(null);
													}
													if(matrix[i+2][j].equals("x")) {
														if(lep==1)
															labels[i+2][j].setBorder(border);
														else
															labels[i+2][j].setBorder(null);
													}
												}
												else if(i==4 && j==8) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j-2].equals("x")) {
														if(lep==1)
															labels[i][j-2].setBorder(border);
														else
															labels[i][j-2].setBorder(null);
													}
													if(matrix[i+2][j].equals("x")) {
														if(lep==1)
															labels[i+2][j].setBorder(border);
														else
															labels[i+2][j].setBorder(null);
													}
												}
												else if(i==4 && j==6) {
													if(lep==0)
														lep=1;
													else
														lep=0;
													
													if(matrix[i][j-2].equals("x")) {
														if(lep==1)
															labels[i][j-2].setBorder(border);
														else
															labels[i][j-2].setBorder(null);
													}
													if(matrix[i-2][j].equals("x")) {
														if(lep==1)
															labels[i-2][j].setBorder(border);
														else
															labels[i-2][j].setBorder(null);
													}
													if(matrix[i][j+2].equals("x")) {
														if(lep==1)
															labels[i][j+2].setBorder(border);
														else
															labels[i][j+2].setBorder(null);
													}
												}
												}	
											else{
												
											}
											kijon();
									}
									///LÉP
									if(lep==1 && matrix[i][j].equals("x")) {
										if((lep_i+6==i && lep_j==j) || (lep_i==i && lep_j+6==j) || (lep_i-6==i && lep_j==j) || (lep_i==i && lep_j+2==j) || (lep_i==i && lep_j-2==j) || (lep_i==i && lep_j-6==j)
											|| (lep_i+2==i && lep_j==j) || (lep_i-2==i && lep_j==j) || (lep_i==i && lep_j+4==j) || (lep_i+4==i && lep_j==j) || (lep_i-4==i && lep_j==j) || (lep_i==i && lep_j+2==j)
											|| (lep_i==i && lep_j-4==j)) {
											if(matrix[lep_i][lep_j].equals("bm")) {
												matrix[lep_i][lep_j]="b";
												if((lep_i==0 && lep_j==12) && matrix[lep_i][lep_j-6].equals("bm") && matrix[lep_i][lep_j-12].equals("bm")) {
													matrix[lep_i][lep_j-6]="b";
													matrix[lep_i][lep_j-12]="b";
												}
												if((lep_i==0 && lep_j==6) && matrix[lep_i][lep_j-6].equals("bm") && matrix[lep_i][lep_j+6].equals("bm")) {
													matrix[lep_i][lep_j-6]="b";
													matrix[lep_i][lep_j+6]="b";
												}
												if((lep_i==0 && lep_j==0) && matrix[lep_i][lep_j+6].equals("bm") && matrix[lep_i][lep_j+12].equals("bm")) {
													matrix[lep_i][lep_j+6]="b";
													matrix[lep_i][lep_j+12]="b";
												}
												if((lep_i==0 && lep_j==0) && matrix[lep_i+6][lep_j].equals("bm") && matrix[lep_i+12][lep_j].equals("bm")) {
													matrix[lep_i+6][lep_j]="b";
													matrix[lep_i+12][lep_j]="b";
												}
												if((lep_i==6 && lep_j==0) && matrix[lep_i-6][lep_j].equals("bm") && matrix[lep_i+6][lep_j].equals("bm")) {
													matrix[lep_i-6][lep_j]="b";
													matrix[lep_i+6][lep_j]="b";
												}
												if((lep_i==12 && lep_j==0) && matrix[lep_i-6][lep_j].equals("bm") && matrix[lep_i-12][lep_j].equals("bm")) {
													matrix[lep_i-6][lep_j]="b";
													matrix[lep_i-12][lep_j]="b";
												}
												if((lep_i==12 && lep_j==0) && matrix[lep_i][lep_j+6].equals("bm") && matrix[lep_i][lep_j+12].equals("bm")) {
													matrix[lep_i][lep_j+6]="b";
													matrix[lep_i][lep_j+12]="b";
												}
												if((lep_i==12 && lep_j==6) && matrix[lep_i][lep_j+6].equals("bm") && matrix[lep_i][lep_j-6].equals("bm")) {
													matrix[lep_i][lep_j+6]="b";
													matrix[lep_i][lep_j-6]="b";
												}
												if((lep_i==12 && lep_j==12) && matrix[lep_i][lep_j-6].equals("bm") && matrix[lep_i][lep_j-12].equals("bm")) {
													matrix[lep_i][lep_j-12]="b";
													matrix[lep_i][lep_j-6]="b";
												}
												if((lep_i==12 && lep_j==12) && matrix[lep_i-6][lep_j].equals("bm") && matrix[lep_i-12][lep_j].equals("bm")) {
													matrix[lep_i-6][lep_j]="b";
													matrix[lep_i-12][lep_j]="b";
												}
												if((lep_i==6 && lep_j==12) && matrix[lep_i-6][lep_j].equals("bm") && matrix[lep_i+6][lep_j].equals("bm")) {
													matrix[lep_i-6][lep_j]="b";
													matrix[lep_i+6][lep_j]="b";
												}
												if((lep_i==0 && lep_j==12) && matrix[lep_i+12][lep_j].equals("bm") && matrix[lep_i+6][lep_j].equals("bm")) {
													matrix[lep_i+12][lep_j]="b";
													matrix[lep_i+6][lep_j]="b";
												}
												if((lep_i==2 && lep_j==2) && matrix[lep_i][lep_j+4].equals("bm") && matrix[lep_i][lep_j+8].equals("bm")) {
													matrix[lep_i][lep_j+4]="b";
													matrix[lep_i][lep_j+8]="b";
												}
												if((lep_i==2 && lep_j==6) && matrix[lep_i][lep_j+4].equals("bm") && matrix[lep_i][lep_j-4].equals("bm")) {
													matrix[lep_i][lep_j+4]="b";
													matrix[lep_i][lep_j-4]="b";
												}
												if((lep_i==2 && lep_j==10) && matrix[lep_i][lep_j-4].equals("bm") && matrix[lep_i][lep_j-8].equals("bm")) {
													matrix[lep_i][lep_j-4]="b";
													matrix[lep_i][lep_j-8]="b";
												}
												if((lep_i==2 && lep_j==2) && matrix[lep_i+8][lep_j].equals("bm") && matrix[lep_i+4][lep_j].equals("bm")) {
													matrix[lep_i+8][lep_j]="b";
													matrix[lep_i+4][lep_j]="b";
												}
												if((lep_i==6 && lep_j==2) && matrix[lep_i-4][lep_j].equals("bm") && matrix[lep_i+4][lep_j].equals("bm")) {
													matrix[lep_i-4][lep_j]="b";
													matrix[lep_i+4][lep_j]="b";
												}
												if((lep_i==10 && lep_j==2) && matrix[lep_i-4][lep_j].equals("bm") && matrix[lep_i-8][lep_j].equals("bm")) {
													matrix[lep_i-4][lep_j]="b";
													matrix[lep_i-8][lep_j]="b";
												}
												//
												if((lep_i==10 && lep_j==2) && matrix[lep_i][lep_j+4].equals("bm") && matrix[lep_i][lep_j+8].equals("bm")) {
													matrix[lep_i-4][lep_j]="b";
													matrix[lep_i+4][lep_j]="b";
												}
												if((lep_i==10 && lep_j==6) && matrix[lep_i][lep_j-4].equals("bm") && matrix[lep_i][lep_j+4].equals("bm")) {
													matrix[lep_i][lep_j-4]="b";
													matrix[lep_i][lep_j+4]="b";
												}
												if((lep_i==10 && lep_j==10) && matrix[lep_i][lep_j-4].equals("bm") && matrix[lep_i][lep_j-8].equals("bm")) {
													matrix[lep_i][lep_j-4]="b";
													matrix[lep_i][lep_j-8]="b";
												}
												//
												if((lep_i==10 && lep_j==10) && matrix[lep_i-4][lep_j].equals("bm") && matrix[lep_i-8][lep_j].equals("bm")) {
													matrix[lep_i-4][lep_j]="b";
													matrix[lep_i-8][lep_j]="b";
												}
												if((lep_i==6 && lep_j==10) && matrix[lep_i-4][lep_j].equals("bm") && matrix[lep_i+4][lep_j].equals("bm")) {
													matrix[lep_i-4][lep_j]="b";
													matrix[lep_i+4][lep_j]="b";
												}
												if((lep_i==2 && lep_j==10) && matrix[lep_i+4][lep_j].equals("bm") && matrix[lep_i+8][lep_j].equals("bm")) {
													matrix[lep_i+4][lep_j]="b";
													matrix[lep_i+8][lep_j]="b";
												}
												////
												if((lep_i==4 && lep_j==4) && matrix[lep_i][lep_j+2].equals("bm") && matrix[lep_i][lep_j+4].equals("bm")) {
													matrix[lep_i][lep_j+2]="b";
													matrix[lep_i][lep_j+4]="b";
												}
												if((lep_i==4 && lep_j==6) && matrix[lep_i][lep_j-2].equals("bm") && matrix[lep_i][lep_j+2].equals("bm")) {
													matrix[lep_i][lep_j+2]="b";
													matrix[lep_i][lep_j+4]="b";
												}
												if((lep_i==4 && lep_j==8) && matrix[lep_i][lep_j-2].equals("bm") && matrix[lep_i][lep_j-4].equals("bm")) {
													matrix[lep_i][lep_j-2]="b";
													matrix[lep_i][lep_j-4]="b";
												}
												//
												if((lep_i==4 && lep_j==4) && matrix[lep_i+2][lep_j].equals("bm") && matrix[lep_i+4][lep_j].equals("bm")) {
													matrix[lep_i+2][lep_j]="b";
													matrix[lep_i+4][lep_j]="b";
												}
												if((lep_i==6 && lep_j==4) && matrix[lep_i+2][lep_j].equals("bm") && matrix[lep_i-2][lep_j].equals("bm")) {
													matrix[lep_i+2][lep_j]="b";
													matrix[lep_i-2][lep_j]="b";
												}
												if((lep_i==8 && lep_j==4) && matrix[lep_i-4][lep_j].equals("bm") && matrix[lep_i-8][lep_j].equals("bm")) {
													matrix[lep_i-4][lep_j]="b";
													matrix[lep_i-8][lep_j]="b";
												}
												//
												if((lep_i==8 && lep_j==4) && matrix[lep_i][lep_j+2].equals("bm") && matrix[lep_i][lep_j+4].equals("bm")) {
													matrix[lep_i][lep_j+2]="b";
													matrix[lep_i][lep_j+4]="b";
												}
												if((lep_i==8 && lep_j==6) && matrix[lep_i][lep_j+2].equals("bm") && matrix[lep_i][lep_j-2].equals("bm")) {
													matrix[lep_i][lep_j+2]="b";
													matrix[lep_i][lep_j-2]="b";
												}
												if((lep_i==8 && lep_j==8) && matrix[lep_i][lep_j-2].equals("bm") && matrix[lep_i][lep_j-4].equals("bm")) {
													matrix[lep_i][lep_j+2]="b";
													matrix[lep_i][lep_j+4]="b";
												}
												//
												if((lep_i==8 && lep_j==8) && matrix[lep_i-2][lep_j].equals("bm") && matrix[lep_i-4][lep_j].equals("bm")) {
													matrix[lep_i-2][lep_j]="b";
													matrix[lep_i-4][lep_j]="b";
												}
												if((lep_i==6 && lep_j==8) && matrix[lep_i-2][lep_j].equals("bm") && matrix[lep_i+2][lep_j].equals("bm")) {
													matrix[lep_i-2][lep_j]="b";
													matrix[lep_i+2][lep_j]="b";
												}
												if((lep_i==4 && lep_j==8) && matrix[lep_i+2][lep_j].equals("bm") && matrix[lep_i+4][lep_j].equals("bm")) {
													matrix[lep_i+2][lep_j]="b";
													matrix[lep_i+4][lep_j]="b";
												}
												////
												if((lep_i==0 && lep_j==6) && matrix[lep_i+2][lep_j].equals("bm") && matrix[lep_i+4][lep_j].equals("bm")) {
													matrix[lep_i+2][lep_j]="b";
													matrix[lep_i+4][lep_j]="b";
												}
												if((lep_i==2 && lep_j==6) && matrix[lep_i+2][lep_j].equals("bm") && matrix[lep_i-2][lep_j].equals("bm")) {
													matrix[lep_i+2][lep_j]="b";
													matrix[lep_i-2][lep_j]="b";
												}
												if((lep_i==4 && lep_j==6) && matrix[lep_i-2][lep_j].equals("bm") && matrix[lep_i-4][lep_j].equals("bm")) {
													matrix[lep_i-2][lep_j]="b";
													matrix[lep_i-4][lep_j]="b";
												}
												//
												if((lep_i==8 && lep_j==6) && matrix[lep_i+2][lep_j].equals("bm") && matrix[lep_i+4][lep_j].equals("bm")) {
													matrix[lep_i+2][lep_j]="b";
													matrix[lep_i+4][lep_j]="b";
												}
												if((lep_i==10 && lep_j==6) && matrix[lep_i+2][lep_j].equals("bm") && matrix[lep_i-2][lep_j].equals("bm")) {
													matrix[lep_i+2][lep_j]="b";
													matrix[lep_i-2][lep_j]="b";
												}
												if((lep_i==12 && lep_j==6) && matrix[lep_i-2][lep_j].equals("bm") && matrix[lep_i-4][lep_j].equals("bm")) {
													matrix[lep_i-2][lep_j]="b";
													matrix[lep_i-4][lep_j]="b";
												}
												//
												if((lep_i==6 && lep_j==0) && matrix[lep_i][lep_j+2].equals("bm") && matrix[lep_i][lep_j+4].equals("bm")) {
													matrix[lep_i][lep_j+2]="b";
													matrix[lep_i][lep_j+4]="b";
												}
												if((lep_i==6 && lep_j==2) && matrix[lep_i][lep_j+2].equals("bm") && matrix[lep_i][lep_j-2].equals("bm")) {
													matrix[lep_i+2][lep_j]="b";
													matrix[lep_i-2][lep_j]="b";
												}
												if((lep_i==6 && lep_j==4) && matrix[lep_i][lep_j-4].equals("bm") && matrix[lep_i][lep_j-2].equals("bm")) {
													matrix[lep_i-4][lep_j]="b";
													matrix[lep_i-2][lep_j]="b";
												}
												//
												if((lep_i==6 && lep_j==8) && matrix[lep_i][lep_j+2].equals("bm") && matrix[lep_i][lep_j+4].equals("bm")) {
													matrix[lep_i][lep_j+2]="b";
													matrix[lep_i][lep_j+4]="b";
												}
												if((lep_i==6 && lep_j==10) && matrix[lep_i][lep_j+2].equals("bm") && matrix[lep_i][lep_j-2].equals("bm")) {
													matrix[lep_i+2][lep_j]="b";
													matrix[lep_i-2][lep_j]="b";
												}
												if((lep_i==6 && lep_j==12) && matrix[lep_i][lep_j-4].equals("bm") && matrix[lep_i][lep_j-2].equals("bm")) {
													matrix[lep_i-4][lep_j]="b";
													matrix[lep_i-2][lep_j]="b";
												}
												
											} else if(matrix[lep_i][lep_j].equals("wm")) {
												matrix[lep_i][lep_j]="w";
												if((lep_i==0 && lep_j==12) && matrix[lep_i][lep_j-6].equals("wm") && matrix[lep_i][lep_j-12].equals("wm")) {
													matrix[lep_i][lep_j-6]="w";
													matrix[lep_i][lep_j-12]="w";
												}
												if((lep_i==0 && lep_j==6) && matrix[lep_i][lep_j-6].equals("wm") && matrix[lep_i][lep_j+6].equals("wm")) {
													matrix[lep_i][lep_j-6]="w";
													matrix[lep_i][lep_j+6]="w";
												}
												if((lep_i==0 && lep_j==0) && matrix[lep_i][lep_j+6].equals("wm") && matrix[lep_i][lep_j+12].equals("wm")) {
													matrix[lep_i][lep_j+6]="w";
													matrix[lep_i][lep_j+12]="w";
												}
												if((lep_i==0 && lep_j==0) && matrix[lep_i+6][lep_j].equals("wm") && matrix[lep_i+12][lep_j].equals("wm")) {
													matrix[lep_i+6][lep_j]="w";
													matrix[lep_i+12][lep_j]="w";
												}
												if((lep_i==6 && lep_j==0) && matrix[lep_i-6][lep_j].equals("wm") && matrix[lep_i+6][lep_j].equals("wm")) {
													matrix[lep_i-6][lep_j]="w";
													matrix[lep_i+6][lep_j]="w";
												}
												if((lep_i==12 && lep_j==0) && matrix[lep_i-6][lep_j].equals("wm") && matrix[lep_i-12][lep_j].equals("wm")) {
													matrix[lep_i-6][lep_j]="w";
													matrix[lep_i-12][lep_j]="w";
												}
												if((lep_i==12 && lep_j==0) && matrix[lep_i][lep_j+6].equals("wm") && matrix[lep_i][lep_j+12].equals("wm")) {
													matrix[lep_i][lep_j+6]="w";
													matrix[lep_i][lep_j+12]="w";
												}
												if((lep_i==12 && lep_j==6) && matrix[lep_i][lep_j+6].equals("wm") && matrix[lep_i][lep_j-6].equals("wm")) {
													matrix[lep_i][lep_j+6]="w";
													matrix[lep_i][lep_j-6]="w";
												}
												if((lep_i==12 && lep_j==12) && matrix[lep_i][lep_j-6].equals("wm") && matrix[lep_i][lep_j-12].equals("wm")) {
													matrix[lep_i][lep_j-12]="w";
													matrix[lep_i][lep_j-6]="w";
												}
												if((lep_i==12 && lep_j==12) && matrix[lep_i-6][lep_j].equals("wm") && matrix[lep_i-12][lep_j].equals("wm")) {
													matrix[lep_i-6][lep_j]="w";
													matrix[lep_i-12][lep_j]="w";
												}
												if((lep_i==6 && lep_j==12) && matrix[lep_i-6][lep_j].equals("wm") && matrix[lep_i+6][lep_j].equals("wm")) {
													matrix[lep_i-6][lep_j]="w";
													matrix[lep_i+6][lep_j]="w";
												}
												if((lep_i==0 && lep_j==12) && matrix[lep_i+12][lep_j].equals("wm") && matrix[lep_i+6][lep_j].equals("wm")) {
													matrix[lep_i+12][lep_j]="w";
													matrix[lep_i+6][lep_j]="w";
												}
												if((lep_i==2 && lep_j==2) && matrix[lep_i][lep_j+4].equals("wm") && matrix[lep_i][lep_j+8].equals("wm")) {
													matrix[lep_i][lep_j+4]="w";
													matrix[lep_i][lep_j+8]="w";
												}
												if((lep_i==2 && lep_j==6) && matrix[lep_i][lep_j+4].equals("wm") && matrix[lep_i][lep_j-4].equals("wm")) {
													matrix[lep_i][lep_j+4]="w";
													matrix[lep_i][lep_j-4]="w";
												}
												if((lep_i==2 && lep_j==10) && matrix[lep_i][lep_j-4].equals("wm") && matrix[lep_i][lep_j-8].equals("wm")) {
													matrix[lep_i][lep_j-4]="w";
													matrix[lep_i][lep_j-8]="w";
												}
												if((lep_i==2 && lep_j==2) && matrix[lep_i+8][lep_j].equals("wm") && matrix[lep_i+4][lep_j].equals("wm")) {
													matrix[lep_i+8][lep_j]="w";
													matrix[lep_i+4][lep_j]="w";
												}
												if((lep_i==6 && lep_j==2) && matrix[lep_i-4][lep_j].equals("wm") && matrix[lep_i+4][lep_j].equals("wm")) {
													matrix[lep_i-4][lep_j]="w";
													matrix[lep_i+4][lep_j]="w";
												}
												if((lep_i==10 && lep_j==2) && matrix[lep_i-4][lep_j].equals("wm") && matrix[lep_i-8][lep_j].equals("wm")) {
													matrix[lep_i-4][lep_j]="w";
													matrix[lep_i-8][lep_j]="w";
												}
												//
												if((lep_i==10 && lep_j==2) && matrix[lep_i][lep_j+4].equals("wm") && matrix[lep_i][lep_j+8].equals("wm")) {
													matrix[lep_i][lep_j+4]="w";
													matrix[lep_i][lep_j+8]="w";
												}
												if((lep_i==10 && lep_j==6) && matrix[lep_i][lep_j-4].equals("wm") && matrix[lep_i][lep_j+4].equals("wm")) {
													matrix[lep_i][lep_j-4]="w";
													matrix[lep_i][lep_j+4]="w";
												}
												if((lep_i==10 && lep_j==10) && matrix[lep_i][lep_j-4].equals("wm") && matrix[lep_i][lep_j-8].equals("wm")) {
													matrix[lep_i][lep_j-4]="w";
													matrix[lep_i][lep_j-8]="w";
												}
												//
												if((lep_i==10 && lep_j==10) && matrix[lep_i-4][lep_j].equals("wm") && matrix[lep_i-8][lep_j].equals("wm")) {
													matrix[lep_i-4][lep_j]="w";
													matrix[lep_i-8][lep_j]="w";
												}
												if((lep_i==6 && lep_j==10) && matrix[lep_i-4][lep_j].equals("wm") && matrix[lep_i+4][lep_j].equals("wm")) {
													matrix[lep_i-4][lep_j]="w";
													matrix[lep_i+4][lep_j]="w";
												}
												if((lep_i==2 && lep_j==10) && matrix[lep_i+4][lep_j].equals("wm") && matrix[lep_i+8][lep_j].equals("m")) {
													matrix[lep_i+4][lep_j]="w";
													matrix[lep_i+8][lep_j]="w";
												}
												////
												if((lep_i==4 && lep_j==4) && matrix[lep_i][lep_j+2].equals("wm") && matrix[lep_i][lep_j+4].equals("wm")) {
													matrix[lep_i][lep_j+2]="w";
													matrix[lep_i][lep_j+4]="w";
												}
												if((lep_i==4 && lep_j==6) && matrix[lep_i][lep_j-2].equals("wm") && matrix[lep_i][lep_j+2].equals("wm")) {
													matrix[lep_i][lep_j+2]="w";
													matrix[lep_i][lep_j-2]="w";
												}
												if((lep_i==4 && lep_j==8) && matrix[lep_i][lep_j-2].equals("wm") && matrix[lep_i][lep_j-4].equals("wm")) {
													matrix[lep_i][lep_j-2]="w";
													matrix[lep_i][lep_j-4]="w";
												}
												//
												if((lep_i==4 && lep_j==4) && matrix[lep_i+2][lep_j].equals("wm") && matrix[lep_i+4][lep_j].equals("wm")) {
													matrix[lep_i+2][lep_j]="w";
													matrix[lep_i+4][lep_j]="w";
												}
												if((lep_i==6 && lep_j==4) && matrix[lep_i+2][lep_j].equals("wm") && matrix[lep_i-2][lep_j].equals("wm")) {
													matrix[lep_i+2][lep_j]="w";
													matrix[lep_i-2][lep_j]="w";
												}
												if((lep_i==8 && lep_j==4) && matrix[lep_i-4][lep_j].equals("wm") && matrix[lep_i-8][lep_j].equals("wm")) {
													matrix[lep_i-4][lep_j]="w";
													matrix[lep_i-8][lep_j]="w";
												}
												//
												if((lep_i==8 && lep_j==4) && matrix[lep_i][lep_j+2].equals("wm") && matrix[lep_i][lep_j+4].equals("wm")) {
													matrix[lep_i][lep_j+2]="w";
													matrix[lep_i][lep_j+4]="w";
												}
												if((lep_i==8 && lep_j==6) && matrix[lep_i][lep_j+2].equals("wm") && matrix[lep_i][lep_j-2].equals("wm")) {
													matrix[lep_i][lep_j+2]="w";
													matrix[lep_i][lep_j-2]="w";
												}
												if((lep_i==8 && lep_j==8) && matrix[lep_i][lep_j-2].equals("wm") && matrix[lep_i][lep_j-4].equals("wm")) {
													matrix[lep_i][lep_j-2]="w";
													matrix[lep_i][lep_j-4]="w";
												}
												//
												if((lep_i==8 && lep_j==8) && matrix[lep_i-2][lep_j].equals("wm") && matrix[lep_i-4][lep_j].equals("wm")) {
													matrix[lep_i-2][lep_j]="w";
													matrix[lep_i-4][lep_j]="w";
												}
												if((lep_i==6 && lep_j==8) && matrix[lep_i-2][lep_j].equals("wm") && matrix[lep_i+2][lep_j].equals("wm")) {
													matrix[lep_i-2][lep_j]="w";
													matrix[lep_i+2][lep_j]="w";
												}
												if((lep_i==4 && lep_j==8) && matrix[lep_i+2][lep_j].equals("wm") && matrix[lep_i+4][lep_j].equals("wm")) {
													matrix[lep_i+2][lep_j]="w";
													matrix[lep_i+4][lep_j]="w";
												}
												////
												if((lep_i==0 && lep_j==6) && matrix[lep_i+2][lep_j].equals("wm") && matrix[lep_i+4][lep_j].equals("wm")) {
													matrix[lep_i+2][lep_j]="w";
													matrix[lep_i+4][lep_j]="w";
												}
												if((lep_i==2 && lep_j==6) && matrix[lep_i+2][lep_j].equals("wm") && matrix[lep_i-2][lep_j].equals("wm")) {
													matrix[lep_i+2][lep_j]="w";
													matrix[lep_i-2][lep_j]="w";
												}
												if((lep_i==4 && lep_j==6) && matrix[lep_i-2][lep_j].equals("wm") && matrix[lep_i-4][lep_j].equals("wm")) {
													matrix[lep_i-2][lep_j]="w";
													matrix[lep_i-4][lep_j]="w";
												}
												//
												if((lep_i==8 && lep_j==6) && matrix[lep_i+2][lep_j].equals("wm") && matrix[lep_i+4][lep_j].equals("wm")) {
													matrix[lep_i+2][lep_j]="w";
													matrix[lep_i+4][lep_j]="w";
												}
												if((lep_i==10 && lep_j==6) && matrix[lep_i+2][lep_j].equals("wm") && matrix[lep_i-2][lep_j].equals("wm")) {
													matrix[lep_i+2][lep_j]="w";
													matrix[lep_i-2][lep_j]="w";
												}
												if((lep_i==12 && lep_j==6) && matrix[lep_i-2][lep_j].equals("wm") && matrix[lep_i-4][lep_j].equals("wm")) {
													matrix[lep_i-2][lep_j]="w";
													matrix[lep_i-4][lep_j]="w";
												}
												//
												if((lep_i==6 && lep_j==0) && matrix[lep_i][lep_j+2].equals("wm") && matrix[lep_i][lep_j+4].equals("wm")) {
													matrix[lep_i][lep_j+2]="w";
													matrix[lep_i][lep_j+4]="w";
												}
												if((lep_i==6 && lep_j==2) && matrix[lep_i][lep_j+2].equals("wm") && matrix[lep_i][lep_j-2].equals("wm")) {
													matrix[lep_i][lep_j+2]="w";
													matrix[lep_i][lep_j-2]="w";
												}
												if((lep_i==6 && lep_j==4) && matrix[lep_i][lep_j-4].equals("wm") && matrix[lep_i][lep_j-2].equals("wm")) {
													matrix[lep_i][lep_j-4]="w";
													matrix[lep_i][lep_j-2]="w";
												}
												//
												if((lep_i==6 && lep_j==8) && matrix[lep_i][lep_j+2].equals("wm") && matrix[lep_i][lep_j+4].equals("wm")) {
													matrix[lep_i][lep_j+2]="w";
													matrix[lep_i][lep_j+4]="w";
												}
												if((lep_i==6 && lep_j==10) && matrix[lep_i][lep_j+2].equals("wm") && matrix[lep_i][lep_j-2].equals("wm")) {
													matrix[lep_i][lep_j-2]="w";
													matrix[lep_i][lep_j+2]="w";
												}
												if((lep_i==6 && lep_j==12) && matrix[lep_i][lep_j-4].equals("wm") && matrix[lep_i][lep_j-2].equals("wm")) {
													matrix[lep_i][lep_j-4]="w";
													matrix[lep_i][lep_j-2]="w";
												}
											}
											
											matrix[i][j]=matrix[lep_i][lep_j];
											matrix[lep_i][lep_j]="x";
											matrix_malom();
											for(int z=0;z<13;z++) {
												for(int k=0;k<13;k++) {
													labels[z][k].setBorder(null);
													if(matrix[z][k].equals("x"))
														labels[z][k].setIcon(new ImageIcon(Malom.class.getResource("/img/pont.png")));
													else if(matrix[z][k].equals("b") || matrix[z][k].equals("bm"))
														labels[z][k].setIcon(new ImageIcon(Malom.class.getResource("/img/fekete.png")));
														else if(matrix[z][k].equals("w") || matrix[z][k].equals("wm"))
															labels[z][k].setIcon(new ImageIcon(Malom.class.getResource("/img/feher.png")));
												}
											}
										szamlalo++;
										if(aktualis.equals("fekete"))
											vizsgal_fekete(i,j);
										else
											vizsgal_feher(i,j);
										kijon();
										lep=0;
										
										kiir();
										}
						
									}
									
									///LEVESZ
									if((f_malom && matrix[i][j].equals("w") && szamlalo%2==1) || (feher_malom && matrix[i][j].equals("b") && szamlalo%2==0)) {
										matrix[i][j]="x";
										for(int z=0;z<13;z++) {
											for(int k=0;k<13;k++) {
												labels[z][k].setBorder(null);
												if(matrix[z][k].equals("x"))
													labels[z][k].setIcon(new ImageIcon(Malom.class.getResource("/img/pont.png")));
												else if(matrix[z][k].equals("b") || matrix[z][k].equals("bm"))
													labels[z][k].setIcon(new ImageIcon(Malom.class.getResource("/img/fekete.png")));
													else if(matrix[z][k].equals("w") || matrix[z][k].equals("wm"))
														labels[z][k].setIcon(new ImageIcon(Malom.class.getResource("/img/feher.png")));
											}
										}
										if(feher_malom) {
											szamlalo++;
											feher_malom=false;
											fekete_jatekban--;
										}
										if(f_malom) {
											szamlalo++;
											f_malom=false;
											feher_jatekban--;
										}
										kijon();
										kiir();
									}
									
									if(dbfeher==0 && dbfekete==0) {
										if(fekete_jatekban<3) {
											JOptionPane.showMessageDialog(lbkijon, "Fehér nyert!");
											System.exit(0);
										}
										else if(feher_jatekban<3) {
											JOptionPane.showMessageDialog(lbkijon, "Fekete nyert!");
											System.exit(0);
										}
									}
								}
									
							
							
							
							
								
							}
							
						}
						System.out.println("fekete: "+fekete_jatekban+" fehér: "+feher_jatekban);
					}
				});
				
			}
		}
		
	}
	
	
	public Malom() {
		setResizable(false);
		setTitle("Malom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 10, 598, 598);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(13, 13, 0, 0));
		
		lbkijon = new JLabel("New label");
		lbkijon.setBounds(20, 619, 178, 31);
		contentPane.add(lbkijon);
		
		
		

		
		

		beolv();
		feltolt();
		program();
	}
}
