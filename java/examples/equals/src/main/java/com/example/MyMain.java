package com.example;

class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }



}


public class MyMain {
    public static void main(String[] args) {
        Person john = new Person("john", 28);
        Person john2 = new Person("john", 28);

        if(john == john2) {
            System.out.println("john == john2 is true");
        }

        if(john.equals(john2)) {
            System.out.println("john.equals(john2) is true");
        }

    }



}
