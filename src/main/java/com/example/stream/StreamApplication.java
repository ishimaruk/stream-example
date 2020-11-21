package com.example.stream;

import com.example.stream.view.ExampleFilter;
import com.example.stream.view.ExampleFlatMap;
import com.example.stream.view.ExampleGroupBy;
import com.example.stream.view.ExampleMap;
import com.example.stream.view.ExampleReduce;
import com.example.stream.view.ExampleSort;
import com.example.stream.view.ExampleToMap;

public class StreamApplication {

	public static void main(String[] args) {
		ExampleFilter.run();
		ExampleMap.run();
		ExampleReduce.run();
		ExampleToMap.run();
		ExampleSort.run();
		ExampleGroupBy.run();
		ExampleFlatMap.run();
	}

}
