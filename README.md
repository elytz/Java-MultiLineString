# Java-MultiLineString
You can now use multiline string in java. You have option to trim each line.

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
	+"This is "
	+"Multi "
	+"Line "
	+"String";
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


