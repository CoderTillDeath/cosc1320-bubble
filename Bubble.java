import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Bubble extends JFrame
{
	public static void main(String[] args)
	{
		new GUI();
	}
}

class GUI extends JFrame
{
	Int[] arr;
	
	public GUI()
	{
		setSize(375,80);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setContentPane(new MyPanel());
		setVisible(true);
	}
	
	class MyPanel extends JPanel
	{
		JLabel numLab;
		JTextField numElements;
		JButton AL;
		JButton ordered;
		JButton comparable;
		
		public MyPanel()
		{
			numLab = new JLabel("Number of Elements: ");
			add(numLab);
			
			numElements = new JTextField(" 10 ");
			add(numElements);
			
			AL = new JButton("ArrayList");
			AL.addActionListener(new ButtonListener());
			add(AL);
			
			ordered = new JButton("Ordered");
			ordered.addActionListener(new ButtonListener());
			add(ordered);
			
			comparable = new JButton("Comparable");
			comparable.addActionListener(new ButtonListener());
			add(comparable);
		}
	
		class ButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				createArray(Integer.parseInt(numElements.getText().trim()));
				switch(e.getActionCommand())
				{
					case "ArrayList":	
										break;
					case "Ordered":		sortOrdered();
										break;
					case "Comparable":	sortComparable();
										break;
				}
			}
		}
	}
	
	public Int[] createArray(int a)
	{
		arr = new Int[a];
		
		for(int x = 0; x < a; x++)
		{
			arr[x] = new Int((int) (Math.random() * a));
		}
		
		return arr;
	}
	
	public void sortComparable()
	{
		boolean swapped = true;
		
		for (int j = 1; swapped; j++) 
		{
			swapped = false;

			for (int i = 0; i < arr.length - j; i++) {                                       

				  if (arr[i].compareTo(arr[i + 1]) > 0) {                          

						Int tmp = arr[i];

						arr[i] = arr[i + 1];

						arr[i + 1] = tmp;

						swapped = true;

				  }
			}     
		}
		
		printArr();
	}
	
	public void sortOrdered()
	{
		boolean swapped = true;
		
		for (int j = 1; swapped; j++) 
		{
			swapped = false;

			for (int i = 0; i < arr.length - j; i++) {                                       

				  if (arr[i].follows(arr[i + 1])) {                          

						Int tmp = arr[i];

						arr[i] = arr[i + 1];

						arr[i + 1] = tmp;

						swapped = true;

				  }
			}     
		}
		printArr();
	}
	
	public void printArr()
	{
		for(int x = 0; x < arr.length; x++)
		{
			System.out.print(arr[x].toString() + " ");
		}
		System.out.println();
	}
}
