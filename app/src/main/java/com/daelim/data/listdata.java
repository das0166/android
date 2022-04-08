package com.daelim.data;

public class listdata {
    String name;
    String phone;
    boolean pic;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public boolean getPic() {
        return pic;
    }

    public listdata(String name, String phone, boolean pic){
        this.name=name;
        this.phone=phone;
        this.pic=pic;
    }
}
