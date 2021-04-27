package com.whatIdobymyself;

public class Person {

    private String firstname;
    private String lastname;
    private String birthmonth;
    private String birthday;
    private String birthyear;
    private String ssn;

    public Person(String firstname, String lastname, String birthmonth, String birthday, String birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }

    public String returnBirthday(String birthmonth, String birthday,String birthyear){
        return birthmonth+"/"+birthday+"/"+birthyear;
    }
}
