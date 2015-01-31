package com.google.vrtoolkit.cardboard.samples.treasurehunt;

import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ana on 1/31/2015.
 */
public class GeometryReader {


    public void coordinates (Dictionary dict){
        Enumeration keys = dict.keys();

        List keyList= Collections.list(keys);

        for(Object k:keyList){

            Object geometry = dict.get(k);
        }


    }
}
