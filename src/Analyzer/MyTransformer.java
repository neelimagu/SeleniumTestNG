package Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements IAnnotationTransformer {

	//Here we are trying to run the failed test cases during run time instead of marking it from the annotation
	//We are using the same RetryAnalyzer class which we wrote for executing it with annotations but adding
	//a listener in testng.xml
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
	annotation.setRetryAnalyzer(Analyzer.RetryAnalyzer.class);	
		
	}

}
