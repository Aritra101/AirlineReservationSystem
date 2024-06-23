import javax.swing.*;
import java.awt.*;

public class PrintTicket1 extends JFrame {
	public PrintTicket1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime) {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel Panel2 = new JPanel();
		Panel2.setLayout(new GridBagLayout());
		Panel2.setPreferredSize(new Dimension(500, 200));

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.anchor = GridBagConstraints.WEST;

		JLabel LTitle = new JLabel("<html><b><font color=\"#C71585\" size=\"7\">AirLine Ticket</font></b></html>");
		JLabel LFrom = new JLabel("<html><b><font color=\"#000000\">From: </font></b><font color=\"#778899\">" + sFrom + "</font></html>");
		JLabel LTo = new JLabel("<html><font color=\"#000000\">To: </font><font color=\"#778899\">" + sTo + "</font></html>");
		JLabel LClass = new JLabel("<html><font color=\"#000000\">Class: </font><font color=\"#778899\">" + sClass + "</font></html>");
		JLabel LBookingDate = new JLabel("<html><font color=\"#000000\">Traveling Date: </font><font color=\"#778899\">" + sBookingDate + "</font></html>");
		JLabel LPrice = new JLabel("<html><font color=\"#000000\">Total Price: </font><font color=\"#778899\">" + iPrice + "</font></html>");
		JLabel LTime = new JLabel("<html><font color=\"#000000\">Depature Time: </font><font color=\"#778899\">" + sTime + "</font></html>");
		JLabel LAdult = new JLabel("<html><font color=\"#000000\">Adult: </font><font color=\"#778899\">" + iAdult + "</font></html>");
		JLabel LChildren = new JLabel("<html><font color=\"#000000\">Children: </font><font color=\"#778899\">" + iChildren + "</font></html>");
		JLabel LInfant = new JLabel("<html><font color=\"#000000\">Infant: </font><font color=\"#778899\">" + iInfant + "</font></html>");
		JLabel LWishes = new JLabel("<html><i><font color=\"#D2B48C\">Wish you a happy journey</font></i></html>");

		JLabel LTicketNo = new JLabel("<html><font color=\"#000000\">Ticket Number: </font></html>");
		JLabel LBookedBy = new JLabel("<html><font color=\"#000000\">Booked By: </font></html>");

		JLabel LEmpty = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		JLabel LDemo = new JLabel("<html><u><font color=\"#8FBC8F\">AirLine-Project Developed By</font></u></html>");
		JLabel LFranklin = new JLabel("<html><i><font color=\"#8FBC8F\">R Franklin Bourgia Singh</font></i></html>");
		JLabel LRavi = new JLabel("<html><i><font color=\"#8FBC8F\">V.R Ravi Sankar</font></i></html>");
		JLabel LMayuran = new JLabel("<html><i><font color=\"#8FBC8F\">B Mayuran</font></i></html>");
		JLabel LSathya = new JLabel("<html><i><font color=\"#8FBC8F\">Sathyaraj</font></i></html>");
		JLabel LYugesh = new JLabel("<html><i><font color=\"#8FBC8F\">Yugesh Verma</font></i></html>");
		JLabel LGopi = new JLabel("<html><i><font color=\"#8FBC8F\">Gopi Pal</font></i></html>");
		JLabel LNeeraj = new JLabel("<html><i><font color=\"#8FBC8F\">Neeraj</font></i></html>");
		JLabel LSunil = new JLabel("<html><i><font color=\"#8FBC8F\">Sunil</font></i></html>");

		gbc.gridx = 0;
		gbc.gridy = 0;
		Panel2.add(LTitle, gbc);

		gbc.gridy++;
		Panel2.add(LFrom, gbc);
		gbc.gridy++;
		Panel2.add(LTo, gbc);
		gbc.gridy++;
		Panel2.add(LClass, gbc);
		gbc.gridy++;
		Panel2.add(LBookingDate, gbc);
		gbc.gridy++;
		Panel2.add(LPrice, gbc);
		gbc.gridy++;
		Panel2.add(LTime, gbc);
		gbc.gridy++;
		Panel2.add(LAdult, gbc);
		gbc.gridy++;
		Panel2.add(LChildren, gbc);
		gbc.gridy++;
		Panel2.add(LInfant, gbc);
		gbc.gridy++;
		Panel2.add(LWishes, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		Panel2.add(LTicketNo, gbc);
		gbc.gridy++;
		Panel2.add(LBookedBy, gbc);

		gbc.gridx = 0;
		gbc.gridy++;
		gbc.gridwidth = 2;
		Panel2.add(LEmpty, gbc);

		gbc.gridy++;
		Panel2.add(LDemo, gbc);
		gbc.gridy++;
		Panel2.add(LFranklin, gbc);
		gbc.gridy++;
		Panel2.add(LRavi, gbc);
		gbc.gridy++;
		Panel2.add(LMayuran, gbc);
		gbc.gridy++;
		Panel2.add(LSathya, gbc);
		gbc.gridy++;
		Panel2.add(LYugesh, gbc);
		gbc.gridy++;
		Panel2.add(LGopi, gbc);
		gbc.gridy++;
		Panel2.add(LNeeraj, gbc);
		gbc.gridy++;
		Panel2.add(LSunil, gbc);

		Panel2.setBackground(Color.white);

		c.add(Panel2, BorderLayout.CENTER);

		setSize(700, 650);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PrintTicket1("New York", "Los Angeles", "Business", 2, 1, 0, "2023-06-15", 1200, "10:00 AM");
	}
}
