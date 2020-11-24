package com.company;

public class Author
{
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender)
    {
        setName(name);
        setEmail(email);
        setGender(gender);
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String in_email)
    {
        email = in_email;
    }
    public char getGender()
    {
        return gender;
    }

    public String toString()
    {
        return "name: " + name + ", Email: " + email +
                " gender: " + gender;
    }
}