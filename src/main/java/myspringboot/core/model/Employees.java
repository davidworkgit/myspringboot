package myspringboot.core.model;

public class Employees {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.id
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.firstname
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.lastname
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    private String lastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.emailaddress
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    private String emailaddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.id
     *
     * @return the value of employees.id
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.id
     *
     * @param id the value for employees.id
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.firstname
     *
     * @return the value of employees.firstname
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.firstname
     *
     * @param firstname the value for employees.firstname
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.lastname
     *
     * @return the value of employees.lastname
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.lastname
     *
     * @param lastname the value for employees.lastname
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.emailaddress
     *
     * @return the value of employees.emailaddress
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    public String getEmailaddress() {
        return emailaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.emailaddress
     *
     * @param emailaddress the value for employees.emailaddress
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
}