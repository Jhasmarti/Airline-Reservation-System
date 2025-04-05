import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class Jswindow implements ActionListener
{
	JFrame f;
	 
	JButton next;
	Jswindow()
	{
		f=new JFrame("Airline Reservation System");

	    
	//**TITLE ***

		JLabel Title=new JLabel("Airline Reservation System");
		Title.setFont(new Font("Elephant",Font.BOLD,38));
		Title.setBounds(140,30,600,40);
		f.add(Title);
	
	//**SUB- TITLE ***

		JLabel SubTitle=new JLabel("Login");
		SubTitle.setFont(new Font("Arial",Font.BOLD,26));
		SubTitle.setBounds(350,80,650,40);
		f.add(SubTitle);

	//**Name ***

		JLabel Name=new JLabel("Username : ");
		Name.setFont(new Font("Raleway",Font.BOLD,22));
		Name.setBounds(70,180,200,30);
		f.add(Name);

		JTextField NameTextField=new JTextField();
		NameTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		NameTextField.setBounds(280,180,200,30);
		f.add(NameTextField);

	//**Password ***

		JLabel Password=new JLabel("Password : ");
		Password.setFont(new Font("Raleway",Font.BOLD,22));
		Password.setBounds(70,250,200,30);
		f.add(Password);

		JTextField PasswordTextField=new JTextField();
		PasswordTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		PasswordTextField.setBounds(280,250,200,30);
		f.add(PasswordTextField);

	//**Cancel Button ***

		JButton Cancel=new JButton("Cancel");
	  	Cancel.setBackground(Color.BLACK);
		Cancel.setForeground(Color.WHITE);
		Cancel.setFont(new Font("Raleway",Font.BOLD,22));
		Cancel.setBounds(150,350,200,50);
		Cancel.addActionListener(this);
		f.add(Cancel);

	//**Submit Button ***

		JButton next=new JButton("Booking Ticket");
	  	next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,22));
		next.setBounds(400,350,200,50);
		next.addActionListener(this);
		f.add(next);


		f.setBounds(100,140,80,20);
		f.setLayout(null);
		f.setSize(800,600);
		f.setVisible(true);
		f.setLocation(350, 10);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

	 public void actionPerformed(ActionEvent e) 
	  {
		Page secondFrame=new  Page();
		f.dispose();  			
		
  	  }	
	
}


class Airline
{
	public static void main(String[] args)
	{
		new Jswindow();
	}
}







class Page implements ActionListener  {
JFrame f;
		
private String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" ,"2020", "2021", "2022",
            "2023","2024"};
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JComboBox lt;
    private String country[]
		={"Afghanistan","Bangladesh","Canada","China","India","Japan","Malaysia",
			"Maldives","Pakistan","United Kingdom","United Arab Emirates","United States"};

		
		Page()
		{
		f=new JFrame("Airline Reservation System");

	    
	//**TITLE ***

		JLabel Title=new JLabel("Airline Reservation System");
		Title.setFont(new Font("Elephant",Font.BOLD,38));
		Title.setBounds(140,30,600,40);
		f.add(Title);
	
	//**SUB- TITLE ***

		JLabel SubTitle=new JLabel("Page 1: Presonal Detail");
		SubTitle.setFont(new Font("Arial",Font.BOLD,26));
		SubTitle.setBounds(280,80,600,40);
		f.add(SubTitle);

	//**Name ***

		JLabel Name=new JLabel("Username : ");
		Name.setFont(new Font("Raleway",Font.BOLD,22));
		Name.setBounds(70,150,200,30);
		f.add(Name);

		JTextField NameTextField=new JTextField();
		NameTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		NameTextField.setBounds(280,150,400,30);
		f.add(NameTextField);

	//**Phone Number ***

		JLabel Phone=new JLabel("Phone Number : ");
		Phone.setFont(new Font("Raleway",Font.BOLD,22));
		Phone.setBounds(70,200,200,30);
		f.add(Phone);

		JTextField PhoneTextField=new JTextField();
		PhoneTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		PhoneTextField.setBounds(280,200,400,30);
		f.add(PhoneTextField);

	//**Date Of Birth ***

		JLabel Dob=new JLabel("Date Of Birth : ");
		Dob.setFont(new Font("Raleway",Font.BOLD,22));
		Dob.setBounds(70,250,200,30);
		f.add(Dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setBounds(280,250,200,30);
        f.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setBounds(480,250,200,30);
        f.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setBounds(680,250,200,30);
        f.add(year);

	//**Gender ***

		JLabel Gender=new JLabel("Gender : ");
		Gender.setFont(new Font("Raleway",Font.BOLD,22));
		Gender.setBounds(70,300,200,30);
		f.add(Gender);

		JRadioButton male=new JRadioButton("Male");
		male.setBounds(280,300,100,30);
		male.setFont(new Font("Raleway",Font.PLAIN,22));
		f.add(male);

		JRadioButton female=new JRadioButton("Female");
		female.setBounds(480,300,150,30);
		female.setFont(new Font("Raleway",Font.PLAIN,22));
		f.add(female);

		ButtonGroup genderGroup= new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);

	//**Email ID ***

		JLabel Email=new JLabel("Email ID : ");
		Email.setFont(new Font("Arial",Font.BOLD,22));
		Email.setBounds(70,350,200,30);
		f.add(Email);

		JTextField EmailTextField=new JTextField();
		EmailTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		EmailTextField.setBounds(280,350,400,30);
		f.add(EmailTextField);

	//**Marital Status ***

		JLabel Marital=new JLabel("Marital Status : ");
		Marital.setFont(new Font("Raleway",Font.BOLD,22));
		Marital.setBounds(70,400,200,30);
		f.add(Marital);

		JRadioButton married=new JRadioButton("Married");
		married.setBounds(280,400,100,30);
		married.setFont(new Font("Raleway",Font.PLAIN,22));
		f.add(married);

		JRadioButton unmarried=new JRadioButton("Unmarried");
		unmarried.setBounds(480,400,150,30);
		unmarried.setFont(new Font("Raleway",Font.PLAIN,22));
		f.add(unmarried);

		ButtonGroup MaritalGroup= new ButtonGroup();
		MaritalGroup.add(married);
		MaritalGroup.add(unmarried);
		
	//**Address ***

		JLabel Address=new JLabel("Address : ");
		Address.setFont(new Font("Raleway",Font.BOLD,22));
		Address.setBounds(70,450,200,30);
		f.add(Address);
		JTextField AddressTextField=new JTextField();
		AddressTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		AddressTextField.setBounds(280,450,400,30);
		f.add(AddressTextField);

	//**Aadhar ***

		JLabel Aadhar=new JLabel("Aadhar Number : ");
		Aadhar.setFont(new Font("Raleway",Font.BOLD,22));
		Aadhar.setBounds(70,500,200,30);
		f.add(Aadhar);
		JTextField AadharTextField=new JTextField();
		AadharTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		AadharTextField.setBounds(280,500,400,30);
		f.add(AadharTextField);

	//**Pin Code ***

		JLabel Pin=new JLabel("Pin Code : ");
		Pin.setFont(new Font("Raleway",Font.BOLD,22));
		Pin.setBounds(70,550,200,30);
		f.add(Pin);
		JTextField PinTextField=new JTextField();
		PinTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		PinTextField.setBounds(280,550,400,30);
		f.add(PinTextField);

	//**Passport No ***

		JLabel Pass=new JLabel("Passport Number ");
		Pass.setFont(new Font("Raleway",Font.BOLD,22));
		Pass.setBounds(70,600,200,30);
		f.add(Pass);
		JTextField PassTextField=new JTextField();
		PassTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		PassTextField.setBounds(280,600,400,30);
		f.add(PassTextField);

	//**State ***

		JLabel State=new JLabel("State : ");
		State.setFont(new Font("Raleway",Font.BOLD,22));
		State.setBounds(70,650,200,30);
		f.add(State);
		JTextField StateTextField=new JTextField();
		StateTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		StateTextField.setBounds(280,650,400,30);
		f.add(StateTextField);

	//**Country ***

		JLabel Country=new JLabel("Country : ");
		Country.setFont(new Font("Raleway",Font.BOLD,22));
		Country.setBounds(70,700,200,30);
		f.add(Country);
        	lt = new JComboBox(country);
        	lt.setFont(new Font("Arial", Font.PLAIN, 15));
        	lt.setSize(60, 20);
        	lt.setBounds(280,700,200,30);
        	f.add(lt);

	//**Next Button ***

		JButton next=new JButton("Next ");
	  	next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,22));
		next.setBounds(600,750,200,50);
		next.addActionListener(this);
		f.add(next);


		f.setBounds(100,140,80,20);
		f.setLayout(null);
		f.setSize(1000,1000);
		f.setVisible(true);
		f.setLocation(350, 10);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

	 public void actionPerformed(ActionEvent e) 
	  {
		Prog secondFrame=new  Prog();
		f.dispose();  			
		
  	  }	
	
}





class page2	
{

    public static void main(String[] args) {
                new Prog();
    }
}















class Prog implements ActionListener  {
JFrame f;
	JLabel res;
JButton next;		

private String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020", "2021", "2022",
            "2023","2024"};
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;



	private JComboBox lt;
	private String country[]
		={"Afghanistan","Bangladesh","Canada","China","India","Japan","Malaysia",
			"Maldives","Pakistan","United Kingdom","United Arab Emirates","United States"};






	
		Prog()
		{

		   f=new JFrame("Airline Reservation System");

	//**TITLE ***

		JLabel Title=new JLabel("Airline Reservation System");
		Title.setFont(new Font("Elephant",Font.BOLD,38));
		Title.setBounds(140,30,600,40);
		f.add(Title);
	
	//**SUB- TITLE ***

		JLabel SubTitle=new JLabel("Page 2: Additional Details");
		SubTitle.setFont(new Font("Arial",Font.BOLD,26));
		SubTitle.setBounds(280,80,600,40);
		f.add(SubTitle);

	//** FlightName ***	

		JLabel FlightName=new JLabel("Flight Name : ");
		FlightName.setFont(new Font("Raleway",Font.BOLD,22));
		FlightName.setBounds(70,150,200,30);
		f.add(FlightName);
		JTextField FlightNameTextField=new JTextField();
		FlightNameTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		FlightNameTextField.setBounds(280,150,400,30);
		f.add(FlightNameTextField);

	//** Flight Number ***

		JLabel FlightNo=new JLabel("Flight Number : ");
		FlightNo.setFont(new Font("Raleway",Font.BOLD,22));
		FlightNo.setBounds(70,200,200,30);
		f.add(FlightNo);
		JTextField FlightNoTextField=new JTextField();
		FlightNoTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		FlightNoTextField.setBounds(280,200,400,30);
		f.add(FlightNoTextField);

	//**International or Domestic ***

		JLabel IntDom=new JLabel("International or Domestic : ");
		IntDom.setFont(new Font("Raleway",Font.BOLD,22));
		IntDom.setBounds(70,250,350,30);
		f.add(IntDom);

		JRadioButton International=new JRadioButton("International");
		International.setBounds(380,250,200,30);
		International.setFont(new Font("Raleway",Font.PLAIN,22));
		f.add(International);

		JRadioButton Domestic=new JRadioButton("Domestic");
		Domestic.setBounds(580,250,150,30);
		Domestic.setFont(new Font("Raleway",Font.PLAIN,22));
		f.add(Domestic);


		ButtonGroup IntDomGroup= new ButtonGroup();
		IntDomGroup.add(International);
		IntDomGroup.add(Domestic);
	
	//**Airline ***

		JLabel Airline=new JLabel("Airline Name : ");
		Airline.setFont(new Font("Raleway",Font.BOLD,22));
		Airline.setBounds(70,300,200,30);
		f.add(Airline);
		JTextField AirlineTextField=new JTextField();
		AirlineTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		AirlineTextField.setBounds(280,300,400,30);
		f.add(AirlineTextField);

	//**Source ***

		JLabel Source=new JLabel("Source : ");
		Source.setFont(new Font("Raleway",Font.BOLD,22));
		Source.setBounds(70,350,200,30);
		f.add(Source);
		JTextField SourceTextField=new JTextField();
		SourceTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		SourceTextField.setBounds(280,350,400,30);
		f.add(SourceTextField);
       		lt = new JComboBox(country);
        	lt.setFont(new Font("Arial", Font.PLAIN, 15));
        	lt.setSize(60, 20);
       	 	lt.setBounds(280,350,200,30);
        	f.add(lt);

	//**Destination ***

		JLabel des=new JLabel("Destination : ");
		des.setFont(new Font("Raleway",Font.BOLD,22));
		des.setBounds(70,400,200,30);
		f.add(des);
        	lt = new JComboBox(country);
        	lt.setFont(new Font("Arial", Font.PLAIN, 15));
        	lt.setSize(60, 20);
        	lt.setBounds(280,400,200,30);
        	f.add(lt);

	//**Class ***

		JLabel Class=new JLabel("Flight Class : ");
		Class.setFont(new Font("Raleway",Font.BOLD,22));
		Class.setBounds(70,450,200,30);
		f.add(Class);

		JRadioButton Economy=new JRadioButton("Economy");
		Economy.setBounds(280,450,250,30);
		Economy.setFont(new Font("Raleway",Font.PLAIN,22));
		f.add(Economy);

		JRadioButton PEconomy=new JRadioButton("Preminum Economy");
		PEconomy.setBounds(580,450,250,30);
		PEconomy.setFont(new Font("Raleway",Font.PLAIN,22));
		f.add(PEconomy);

		JRadioButton Business=new JRadioButton("Business Class");
		Business.setBounds(280,500,250,30);
		Business.setFont(new Font("Raleway",Font.PLAIN,22));
		f.add(Business);

		JRadioButton First=new JRadioButton("First Class");
		First.setBounds(580,500,250,30);
		First.setFont(new Font("Raleway",Font.PLAIN,22));
		f.add(First);


		ButtonGroup ClassGroup= new ButtonGroup();
		ClassGroup.add(Economy);
		ClassGroup.add(PEconomy);
		ClassGroup.add(Business);
		ClassGroup.add(First);

	//**Departure Date ***

		JLabel DepartureD=new JLabel("Departure Date : ");
		DepartureD.setFont(new Font("Raleway",Font.BOLD,22));
		DepartureD.setBounds(70,550,200,30);
		f.add(DepartureD);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setBounds(280,550,200,30);
        f.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setBounds(480,550,200,30);
        f.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setBounds(680,550,200,30);
        f.add(year);
 
	//**Departure Time ***

		JLabel DepartureT=new JLabel("Departure Time : ");
		DepartureT.setFont(new Font("Raleway",Font.BOLD,22));
		DepartureT.setBounds(70,600,200,30);
		f.add(DepartureT);
		JTextField DepartureTTextField=new JTextField();
		DepartureTTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		DepartureTTextField.setBounds(280,600,400,30);
		f.add(DepartureTTextField);



	//**Return Date ***

		JLabel ReturnD=new JLabel("Return Date : ");
		ReturnD.setFont(new Font("Raleway",Font.BOLD,22));
		ReturnD.setBounds(70,650,200,30);
		f.add(ReturnD);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setBounds(280,650,200,30);
        f.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setBounds(480,650,200,30);
        f.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setBounds(680,650,200,30);
        f.add(year);

	//**Return Time ***

		JLabel ReturnT=new JLabel("Return Time: ");
		ReturnT.setFont(new Font("Raleway",Font.BOLD,22));
		ReturnT.setBounds(70,700,200,30);
		f.add(ReturnT);
		JTextField ReturnTimTextField=new JTextField();
		ReturnTimTextField.setFont(new Font("Raleway",Font.PLAIN,14));
		ReturnTimTextField.setBounds(280,700,400,30);
		f.add(ReturnTimTextField);

	//**declare ***
		JCheckBox finall= new JCheckBox(" I hereby declare that the above entered details are correct to the best of my knowledge ");
		finall.setBounds(70,750,1000,30);
		finall.setFont(new Font("Raleway",Font.BOLD,22));
		f.add(finall);

	//**Submit ***

		JButton next=new JButton("Pay & Submit ");
	  	next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,22));
		next.setBounds(600,800,200,50);
		next.addActionListener(this);
		f.add(next);


		f.setBounds(100,140,80,20);
		f.setLayout(null);
		f.setSize(1000,1000);
		f.setVisible(true);
		f.setLocation(350, 10);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	
   

	}

	public void actionPerformed(ActionEvent e)
		{	
			
			System.out.println("Boking Successfully..");
		}
}


class Program	
{

    public static void main(String[] args) {
                new Prog();
    }
}


