package entities;

public class Adress {
	
	    private static String email;
	    private String phone;

	    public Adress() {
		}

		public Adress(String email, String phone) {
	        this.email = email;
	        this.phone = phone;
	    }

	    public static String getEmail() {
	        return email;
	    }

	    public String getPhone() {
	        return phone;
	    }
	}



