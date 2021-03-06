package com.z3dd.conjugo;

import android.widget.EditText;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by EdanYachdav on 4/2/16.
 */
public class Verb implements Serializable {
    private Set<String> verbDetails;

    public Verb(EditText[] array) {
        verbDetails = new LinkedHashSet<>();
        for (EditText et : array) {
            verbDetails.add(et.getText().toString());
        }
    }

    public Verb(String[] s) {
        verbDetails = new LinkedHashSet<>();
        for (String str : s) {
            verbDetails.add(str.toString());
        }
    }

    public String verbName() {
        Iterator<String> it = verbDetails.iterator();
        return it.next().toString();
    }

    public Set<String> verbDetailSet() {
        return verbDetails;
    }

    @Override
    public String toString() {
        return verbName();
    }

    @Override
    public boolean equals(Object o) {
        boolean isEqual = false;
        Verb v = (Verb) o;
        if(this.verbName().hashCode() == v.verbName().hashCode()) {
            isEqual = true;
        }
        return isEqual;
    }

    public int hashCode() {
        int hash = 3;
        hash = 7 * hash + this.verbName().hashCode();
        return hash;
    }
}
