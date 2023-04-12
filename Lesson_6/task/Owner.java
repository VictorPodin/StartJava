package Lesson_6.task;

import java.util.Objects;

public class Owner {
    public String name;
    public String phone;
    public Owner(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString(){
        return String.format("{owner = %s, phone = %s}", name, phone);
    }
    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return Objects.equals(this,obj);
        // if (obj instanceof Owner){
        //     return Objects.equals(this,obj);
        // }
        // else return false;
        //return this.name.equals(((Owner)obj).name) && this.phone == (((Owner)obj).phone);
    }
}
