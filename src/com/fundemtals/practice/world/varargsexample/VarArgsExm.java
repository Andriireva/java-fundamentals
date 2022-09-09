package com.fundemtals.practice.world.varargsexample;

import java.util.Locale;

public class VarArgsExm {

    public VarArgsExm(String... s) {
    }

    // Vargs are treated as array
    // vargs are the latest arg in method
    public String addPrefixes(String k, String... strings) {
        String res = k.toLowerCase();


        for (Object s : strings) {
            res += s;
        }
        return res;
    }

    public static void main(String[] args) {
        VarArgsExm varArgsExm = new VarArgsExm();
        String s = varArgsExm.addPrefixes("BBBBB");
        System.out.println(s);
    }
}
