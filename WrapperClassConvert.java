package com.assignment;

public class WrapperClassConvert {

	public static Object convertToWrapper(Object primitive) {

		if (primitive instanceof Integer) {
			Integer in = (Integer) primitive;
			System.out.println(in);
		} else if (primitive instanceof Character) {
			Character ch = (Character) primitive;
			System.out.println(ch);
		} else if (primitive instanceof Byte) {
			Byte by = (Byte) primitive;
			System.out.println(by);
		} else if (primitive instanceof Short) {
			Short sh = (Short) primitive;
			System.out.println(sh);
		} else if (primitive instanceof Long) {
			Long l = (Long) primitive;
			System.out.println(l);
		} else if (primitive instanceof Float) {
			Float f = (Float) primitive;
			System.out.println(f);
		} else if (primitive instanceof Double) {
			Double d = (Double) primitive;
			System.out.println(d);
		} else if (primitive instanceof Boolean) {
			Boolean boo = (Boolean) primitive;
			System.out.println(boo);
		} else if (primitive == null) {
			System.out.println("Give proper primitive as input");
		} else {
			System.out.println("Give proper primitive as input");
		}
		return null;
	}

	public static void main(String[] args) {

		int i = 10;
		convertToWrapper(i);
	}
}
