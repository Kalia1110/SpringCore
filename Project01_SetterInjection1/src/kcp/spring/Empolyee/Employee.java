package kcp.spring.Empolyee;

public class Employee {
		private String name,city;
		private int id;
		public Employee(String name, String city, int id) {
		    this.city=city;
		    this.name=name;
		    this.id=id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void Display() {
			System.out.println("Name:: "+name+" Id:: "+id+"City:: "+city);
		}
		
}
