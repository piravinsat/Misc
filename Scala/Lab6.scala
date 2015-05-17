class Employee(name: String, salary: Int) {
	def na = name;
	def sa = salary;
	
	//Override the toString method and return the string
	override def toString() =
		"Employee[name= " + na + ", salary=" + sa + "]";
}

class Manager(name: String, salary:Int, department: String) extends Employee (name, salary) {
	def de = department;
	
	//Override the toString method and return the string
	override def toString() =
		"Manager[name= " + na + ", salary=" + sa + ", department=" + de + "]";
}

class Executive(name: String, salary:Int, department: String) extends Manager (name, salary, department) {
	//Override the toString method and return the string
	override def toString() =
		"Executive[name= " + na + ", salary=" + sa + ", department=" + de + "]";
}

object TestMethod {
	def main(args: Array[String]) {
	
	var e = new Employee("McDowell",2);
		println(e.toString());
	var m = new Manager("Jeff",2,"Combine Harvesters");
		println(m.toString());
	var x = new Executive("Jim Demint",2,"Programming");
		println(x.toString());
		
		}
}