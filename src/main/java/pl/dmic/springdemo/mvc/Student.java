package pl.dmic.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String city;
    private String programmingLanguage;
    private String[] operatingSystems;
    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> programmingLanguageOptions;


    public Student() {

        // populate country options: used ISO country code
        countryOptions = new LinkedHashMap<String, String>();

        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("PL", "Poland");
        countryOptions.put("US", "United States of America");

        // add programming langague options:

        programmingLanguageOptions = new LinkedHashMap<String, String>();

        programmingLanguageOptions.put("Java", "Java");
        programmingLanguageOptions.put("PHP", "PHP");
        programmingLanguageOptions.put("C#", "C#");
        programmingLanguageOptions.put("Python", "Python");
        programmingLanguageOptions.put("Ruby", "Ruby");

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public LinkedHashMap<String, String> getProgrammingLanguageOptions() {
        return programmingLanguageOptions;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
