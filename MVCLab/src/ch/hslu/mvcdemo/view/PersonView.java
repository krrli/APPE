package ch.hslu.mvcdemo.view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class PersonView extends JPanel{

	/*
	private final JLabel nameLabel;
	private final JLabel vornameLabel;
	private final JTextField nameText;
	private final JTextField vornnameText;	
	*/
	
	private final JTable table;
	
	public PersonView(){
		super(new GridLayout(1,0));
		
		/*
		this.nameLabel = new JLabel("Name: ");
		this.vornameLabel = new JLabel("Vorname: ");
		this.nameText = new JTextField("waehl e person uus");
		this.vornnameText = new JTextField("waehl e person uus");
		*/
		
		String[] columnNames = {"Name", "Vorname"};
		String[][] data = {
				{"Hoi", "Du"},
				{"wie", "gehts?"},
				{"mini", "farb"},
				{"und", "dini"},
				{"das", "ged"},
				{"zäme", "zweee"}
		};
		
		table = new JTable(data, columnNames);
		
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane);
		
	}
	
	public static void createAndShowGUI() {
        JFrame frame = new JFrame("PersoenliView");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        PersonView newContentPane = new PersonView();
        newContentPane.setOpaque(true); 
        frame.setContentPane(newContentPane);
 
        frame.pack();
        frame.setVisible(true);
    }
}
