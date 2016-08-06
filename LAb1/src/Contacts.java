
public class Contacts {

	public static void main(String[] args) {
		Contacts myContacts = new Contacts();
        Contacts myContacts2 = new Contacts("Mehdi","Peiravi","mwhdi@gmail.com");
		Contacts myContacts4 = new Contacts ("909043433");
		Contacts myContacts5 = new Contacts ("marcellu","jones", "only1marcellus@aiol.com","3108493994","Marki");
		
		printToConsole(myContacts5);
		
		
	}
		// TODO Auto-generated method stub

	
		private String _firstName;
		private String _lastName;
		private String _nickName;
		private String _phoneNumber;
		private String _eMail;
		
		public String getFirstName() {return _firstName;}
		public void setFirstName (String value) {_firstName = value;}
		
		public String getLastName() {return _lastName;}
		public void setLastName (String value) {_lastName = value;}
		
		public String getNickName() {return _nickName;}
		public void setNickName (String value) {_nickName = value;}
		
		public String getPhoneNumber() {return _phoneNumber;}
		public void setPhoneNumber (String value) {_phoneNumber = value;}
		
		public String getEmail() {return _eMail;}
		public void setEmail (String value) {_eMail = value;}
		
		public Contacts()
		{
			_firstName ="";
			_lastName ="";
			_nickName ="";
			_phoneNumber="";
			_eMail="";
		}
	
		public Contacts(String firstName, String lastName, String eMail)
		{
			_firstName =firstName;
			_lastName =lastName;
			_nickName ="";
			_phoneNumber="";
			_eMail=eMail;
		}
		
		public Contacts(String firstName, String lastName, String eMail, String phoneNumber,String nickName)
		{
			_firstName =firstName;
			_lastName =lastName;
			_nickName =nickName;
			_phoneNumber=phoneNumber;
			_eMail=eMail;
		}
		
		public Contacts(String phoneNumber)
		{
			_firstName ="firstName";
			_lastName ="lastName";
			_nickName ="nickName";
			_phoneNumber=phoneNumber;
			_eMail="eMail";
		}
		
private static void printToConsole (Contacts myContacts) {
	System.out.println("First Name:" + myContacts.getFirstName());;
	System.out.println("Last Name:" + myContacts.getLastName());;
	System.out.println("Nick Name:" + myContacts.getNickName());;
	System.out.println("Phone Number:" + myContacts.getPhoneNumber());;
	System.out.println("E-mail:" + myContacts.getEmail());;

}}

	


