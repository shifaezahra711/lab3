class StudentTest{
private String name;
private String registration;
private String city;
private int phoneNum;
private double GPA;
private static int count=0;
public StudentTest(String name,String city,int phoneNum,double GPA){
	this.name=name;
	this.city=city;
	this.phoneNum=phoneNum;
	this.GPA=GPA;
	registration=String.format("FA24-BCS-%03d",++count);
}
public void setName(String name){
	this.name=name;
}
public void setAdress(String city ){
	this.city=city;
}
public void setPhoneNum(int phoneNum){
	this.phoneNum=phoneNum;
}
public void setGPA(double GPA){
	this.GPA=GPA;
}

public String getName(){
	return name;
}
public String getAdress(){
	return adress;
}
public int getPhoneNum(){
	return phoneNum;
}
public double getGPA(){
	return GPA;
}
public void display(String name,String adress,int phoneNum,double GPA){
System.out.printf("%s\t,%s\t,%s\t,%d\t,%.2f,\n",name , registration, adress ,phoneNum , (double)GPA);

}
}