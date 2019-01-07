package com.moderncreation.mediapickerlibrary;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class ARGBColor implements Serializable {
    int a;
    int r;
    int g;
    int b;

    public ARGBColor(int a, int r, int g, int b) {
        this.a = a;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}
