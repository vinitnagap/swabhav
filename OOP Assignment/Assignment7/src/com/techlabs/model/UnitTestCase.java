package com.techlabs.model;

import java.lang.annotation.*;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
public @interface UnitTestCase {
	public String value = "Test Case";

}