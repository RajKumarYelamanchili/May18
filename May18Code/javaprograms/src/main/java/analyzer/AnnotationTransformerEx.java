package analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformerEx implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation1,Class testClass1,Constructor testConstructor1,Method testMethod1)
	{
		annotation1.setRetryAnalyzer(RetryAnalyser.class);
	}

}
