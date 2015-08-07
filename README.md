# Java-MultiLineString
You can now use multiline string in java.

You have option to trim each line

# Usage

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


