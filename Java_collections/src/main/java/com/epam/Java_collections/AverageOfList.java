package com.epam.Java_collections;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class AverageOfList{
	public static void main(String[] args) {
		Integer[] list = {2,3,4,5,6,7,8};
		List<Integer> listnum = Arrays.asList(list);
		double Average = average(listnum);
		System.out.println(Average);
		}
	public static Double average(List<Integer> list) {
		return list.stream()
				.mapToInt(i -> i)
				.average()
				.getAsDouble();
	}
}	