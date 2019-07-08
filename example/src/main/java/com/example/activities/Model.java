package com.example.activities;

import com.orm.SugarRecord;
import com.orm.annotation.NotNull;

public class Model extends SugarRecord {

    @NotNull(intDef = 666)
    public Long defaultInt;
    @NotNull(strDef = "Def")
    public String defaultString;

    public Model() {}
    public Model(Long val1, String val2) {
        defaultInt = val1;
        defaultString = val2;
    }
}
