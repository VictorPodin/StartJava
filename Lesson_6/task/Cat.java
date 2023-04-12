package Lesson_6.task;

import java.util.Objects;

public class Cat {
    public String name;
    public int age;
    public String diagnose;
    public boolean isIll;
    public Owner owner;

    public Cat(String name, int age, boolean isIll, String diagnose, Owner owner) {
        this.name = name;
        this.age = age;
        this.isIll = isIll;
        this.diagnose = diagnose;
        this.owner = owner;

    }

    @Override
    public String toString() {
        return String.format("Cat {name = %s, age = %s, isIll = %s, diagnose = %s, owner = %s}", name, age, isIll,
                diagnose, owner);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Cat cat = (Cat)obj;
        return cat.name.equals(this.name) && cat.age == (this.age) && cat.diagnose.equals(this.diagnose) && cat.isIll == this.isIll;
        //return Objects.equals(this,obj);
        // if (obj instanceof Cat){
        //     return Objects.equals(this,obj);
        // }
        // else return false;
        //return this.name.equals(((Cat)obj).name) && this.age == ((Cat)obj).age && this.isIll == ((Cat)obj).isIll && this.diagnose == (((Cat)obj).diagnose) && this.owner == (((Cat)obj).owner);
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null)? 0: name.hashCode());
        result = prime * result + age;
        result = prime * result + ((diagnose == null)? 0: diagnose.hashCode());

        return result;
    }
}
