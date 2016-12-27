package com.cf.test;

public class E {
  F f;

public F getF() {
	return f;
}

public void setF(F f) {
	this.f = f;
}

public E(F f) {
	this.f = f;
}

@Override
public String toString() {
	return "E [f=" + f + "]";
}
  
}
