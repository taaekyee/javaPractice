package javaPractice;

public class prac1_Student {
	String name;
	String number;
	int birthYear;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prac1_Student s1 = new prac1_Student();
		s1.name = "È«±â·Õ";
		s1.number = "1234";
		s1.birthYear = 1995;
		
		prac1_Student s2 = new prac1_Student();
		s2.name = "È«±â·Õ";
		s2.number = "1234";
		s2.birthYear = 1995;
		
		if(s1.equals(s2)) System.out.println("s1 == s2");
		else System.out.println("s1 != s2");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.toString());
	}

	@Override
	public String toString() {
		return "prac1_Student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		prac1_Student other = (prac1_Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

}
