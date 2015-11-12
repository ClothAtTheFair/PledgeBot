public class brother {
	public String name;
	public String gender;
	public String year;
	public String home;
	public String major;
	
	public brother()
	{
		name = "Mel";
		gender = "Who knows";
		year = "Junior";
		home = "box";
		major = "CE";
	}
	public brother(String aName, String aGender, String aYear, String aHome, String aMajor)
	{
		name = aName;
		gender = aGender;
		year = aYear;
		home = aHome;
		major = aMajor;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	
	
	public String closingParagraph()
	{
		return "Thank you! " + name + "It was really great getting to know that you are a " + gender + ", studying " + major + " in your " + 
	    year + " year of college and that you are from " + home;
	}
	
