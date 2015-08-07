# Java-MultiLineString
You can now use multiline string in java. You also have an option to trim each line.

Now you can write java program like PHP.

The following code
<pre>
String t = MultiLine.stringTrim(/*
			Helloworld
			This is 
			Multi
			Line
			String
			*/);
</pre>
			
Equivalent to
<pre>
String t = "Helloworld"
		+ "This is "
		+ "Multi "
		+ "Line "
		+ "String";
</pre>

# Usage

Dont forget to set the classpath to "MultiLineString.jar"

<pre>

import com.multiline.string.*;

class Test{

public static void main(String[] args){

String t = MultiLine.string(/*
			Helloworld
			This is 
			Multi
			Line
			String
			*/);

System.out.println(t);

t = MultiLine.stringTrim(/*
			Helloworld
			This is 
			Multi
			Line
			String
			*/);

System.out.println(t);


}
}

</pre>

## Output
<pre>

                        Helloworld
                        This is
                        Multi
                        Line
                        String


Helloworld
This is
Multi
Line
String
</pre>

## Note:
1. This should work only when both your .class and .java file exist in same folder
2. So this wont support inside any IDE.

##Currently working on:
1. Support Neatbeans and Eclipse IDE
2. Simple batch / sh file to replace 'string' and 'stringTrim' function with exact string
