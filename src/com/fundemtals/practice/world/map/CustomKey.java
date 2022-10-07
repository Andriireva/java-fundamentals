package com.fundemtals.practice.world.map;

import java.util.Objects;

public class CustomKey {
    private final String skey;
    private final Integer ikey;

    public CustomKey(String skey, Integer ikey) {
        this.skey = skey;
        this.ikey = ikey;
    }

//    public void setSkey(String skey) {
//        this.skey = skey;
//    }
//
//    public void setIkey(Integer ikey) {
//        this.ikey = ikey;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomKey customKey = (CustomKey) o;
        return Objects.equals(skey, customKey.skey)
                && Objects.equals(ikey, customKey.ikey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skey, ikey);
    }
}
