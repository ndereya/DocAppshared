package com.normtechnologies.docapp;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Capt.Ndereya on 25/01/2019.
 */

public class MyItemsBcs extends AppCompatActivity {

    public MyItemsBcs() {
    }

    private String cuHeadbcs,cudescbcs;

    public MyItemsBcs(String cuHeadbcs, String cudescbcs) {
        this.cuHeadbcs = cuHeadbcs;
        this.cudescbcs = cudescbcs;
    }

    public String getCuHeadbcs() {
        return cuHeadbcs;
    }

    public String getCudescbcs() {
        return cudescbcs;
    }
}
