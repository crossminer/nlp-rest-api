package springboot.tests;

import java.io.IOException;

import org.eclipse.scava.nlp.classifiers.sentimentanalyzer.SentimentAnalyzer;
import org.eclipse.scava.nlp.tools.predictions.singlelabel.SingleLabelPrediction;

public class SentimentAnalysisTest {
	
	public static void main(String[] args) {
//		String text = "I am Yannis and I am programming with Spiring boot!";
		String text = "Life is good, I am happy!";
		
		SingleLabelPrediction prediction = null;
		try {
			prediction = SentimentAnalyzer.predict(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Id: " + prediction.getId());
		System.out.println("Label: " + prediction.getLabel());
		System.out.println("Text: " + prediction.getText());
		System.out.println("ExternalExtra: " + prediction.getExternalExtra());
		System.out.println();
	}

}
