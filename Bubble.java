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
		JTextField numElements;
		JButton AL;
		JButton ordered;
		JButton comparable;
		
		public MyPanel()
		{
			AL = new JButton("ArrayList");
			add(AL);
			
			ordered = new JButton("Ordered");
			add(ordered);
			
			comparable = new JButton("Comparable");
			add(comparable);
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
	
	public IntComparable[] sortComparable()
	{
		return null;
	}
	
	public IntOrdered[] sortOrdered()
	{
		return null;
	}
	
	class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
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
