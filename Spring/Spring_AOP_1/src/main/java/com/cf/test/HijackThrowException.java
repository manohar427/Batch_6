package com.cf.test;

import org.springframework.aop.ThrowsAdvice;

public class HijackThrowException implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
		System.out.println("manoharThrowExceptio : Throw exception hijacked!");
	}
}