class employee{
	String name;
	int age;
	float basic_pay;
	void showname()
	{
		System.out.println(" Name ="+name);
		System.out.println("Age ="+age);
		System.out.println("Basic pay ="+basic_pay);

	} 
}
class programmer extends employee{
	String department;
	double bonus;
	void showdept() {
		System.out.println("Department =" +department);
		System.out.println("Bonus =" +bonus);
	 }
	void totalsalary() 
	{
		System.out.println("Total salary ="+" "+ (bonus+ basic_pay));

	}	
	}
	class inheritence {

	public static void main(String[] args)
	{
		programmer subob= new programmer();
		subob.name="lena";
		subob.age= 19;
		subob.basic_pay=5000;
		subob.department="Manager";
		subob.bonus=5.5;
		System.out.println("Details of a Employee :");
		subob.showname();
		subob.showdept();
		System.out.println("Total salary of employee");
		subob.totalsalary();

	}}
