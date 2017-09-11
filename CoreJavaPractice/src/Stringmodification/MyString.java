package Stringmodification;

public class MyString {

	private String name;
	private int no;
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	public MyString(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}
	public MyString() {
		super();
	}



	@Override
	public String toString() {
		return "MyString [name=" + name + ", no=" + no + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyString) {
			MyString mys = (MyString)obj;
			if(this.name.equals(mys.name) && this.no==mys.no) {
				return true;
			}
		}
		else {
			return false;
		}
		return false;
	}

/*@Override
		public int hashcode() {
			int len = name.length();
			int hash = len*5;
			return hash;
		}*/

	}


