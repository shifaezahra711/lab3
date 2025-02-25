 public class student{
public static void main(String[] args){
	Data d1=new Data("shifa","Gujranwala",03331,3.0);
	d1.setName("shifa");
	d1.setAdress("Gujranwala");
	d1.setPhoneNum(03331);
	d1.setGPA(3.3);
	String name1=d1.getName();
	String adress1=d1.getAdress();
	int PhoneNum1=d1.getPhoneNum();
	double GPA1=d1.getGPA();
	d1.display(name1,adress1,PhoneNum1,GPA1);

	Data d2=new Data("zahra","lahore",2221,3.4);
	d2.setName("zahra");
	d2.setAdress("lahore");
	d2.setPhoneNum(2221);
	d2.setGPA(3.);
	String name2=(d2.getName());
	String adress2=(d2.getAdress());
	int PhoneNum2=(d2.getPhoneNum());
	double GPA2=(d2.getGPA());
d2.display(name2,adress2,PhoneNum2,GPA2);
}

}
 