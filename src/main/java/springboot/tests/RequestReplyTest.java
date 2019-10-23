package springboot.tests;

import java.io.IOException;

import org.eclipse.scava.nlp.classifiers.requestreplydetector.RequestReplyClassifier;
import org.eclipse.scava.nlp.tools.predictions.singlelabel.SingleLabelPrediction;

public class RequestReplyTest {
	
	public static void main(String[] args) {
		String text = "What is this testing text?";
		
		System.out.println(text);
		SingleLabelPrediction prediction = null;
		try {
			prediction = RequestReplyClassifier.predict(text, false, false);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prediction.getLabel());
	}

}
