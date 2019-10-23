package springboot.tests;

import java.util.Arrays;
import java.util.List;

import org.eclipse.scava.nlp.classifiers.codedetector.CodeDetector;
import org.eclipse.scava.nlp.tools.predictions.singlelabel.SingleLabelPrediction;
import org.eclipse.scava.nlp.tools.predictions.singlelabel.SingleLabelPredictionCollection;

public class CodeDetectorTest {
	
	public static void main(String[] args) {
		SingleLabelPrediction prediction;
		SingleLabelPredictionCollection listPredition;
		
		//Analysis done by String
		String word="hello world";
        prediction=CodeDetector.predict(word);
        System.out.println(prediction.getText()+"\t"+prediction.getLabel());
        System.out.println("---------------");
        
        
        //Analysis done by lists
        List<String> listWords = Arrays.asList("\n\n  \n", "use strict;\nuse warnings;\n", "system.out.println(word);", "How are you?\r\n I'm fine thanks.",
        		"This is JUST at test.","System.err.println(\"Irrecognisable classification output: \" + prediction);",
        		"    At the top level public, or package-private (no explicit modifier).\n" + 
        		"    At the member level public, private, protected, or package-private (no explicit modifier).\n");
        listPredition=CodeDetector.predict(listWords);
        for(String element : listPredition.getPredictedLabels())
        {
        	System.out.println(element);
        }
        System.out.println("---------------");
	}

}
