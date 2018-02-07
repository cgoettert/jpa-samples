package com.cgoettert.mappedsuperclass;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author cgoettert
 */
@MappedSuperclass
public class Person {

    @Column(name = "first_name", columnDefinition = "text")
    private String firstName;
    @Column(name = "last_name", columnDefinition = "text")
    private String lastName;
    @Column(name = "email", columnDefinition = "text")
    private String email;
    @Column(name = "age", columnDefinition = "integer")
    private Integer age;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
