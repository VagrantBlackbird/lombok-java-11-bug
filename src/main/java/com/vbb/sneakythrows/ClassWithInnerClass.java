package com.vbb.sneakythrows;

import java.net.MalformedURLException;
import java.net.URL;

import lombok.SneakyThrows;

public class ClassWithInnerClass {
	
	@SneakyThrows
	public void printUrl() {
		System.out.println(new Inner().getUrl());
		
	}
	
	public class Inner {
		public URL getUrl() throws MalformedURLException {
			return new URL("Hello");
		}
	}
}
