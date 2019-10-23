package springboot.tests;

import org.eclipse.scava.nlp.classifiers.documentation.DocumentationClassifier;
import org.eclipse.scava.nlp.tools.predictions.multilabel.MultiLabelPrediction;

public class DocumentationTest {
	
	public static void main(String[] args) {
		String text = "What is this testing text?";
		text = "This is testing text";
		
		MultiLabelPrediction prediction = new MultiLabelPrediction(text);
		prediction = DocumentationClassifier.classify(prediction, false);
		System.out.println(prediction.getLabels());

	}
}
