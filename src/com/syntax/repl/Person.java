package com.syntax.repl;

 class Persons {
	
		  private String firstname;
		  private String lastname;
		  private String birthmonth;
		  private String birthday;
		  private String birthyeaar;
		  private String ssn;
		  Persons(String firstname,String lastname,String birthmonth,String birthday,String birthyeaar,String ssn){
		    this.firstname=firstname;
		    this.lastname=lastname;
		    this.birthyeaar=birthyeaar;this.birthday=birthday;this.birthmonth=birthmonth;this.ssn=ssn;
		  }
		  public String getName(){
		    return firstname;
		  }
		  public String getLastname() {
			  return lastname;
		  }
		  public String getSsn() {
			  return ssn;
		  }
		  public String formatBirthday(String birthmonth, String birthday,String birthyear){
		    String birthFormat=birthmonth+"/"+birthday+"/"+birthyear;
		    return birthFormat;
		  }
		}


