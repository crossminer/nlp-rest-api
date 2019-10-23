package springboot.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.scava.nlp.classifiers.emotionclassifier.EmotionClassifier;
import org.eclipse.scava.nlp.tools.predictions.multilabel.MultiLabelPrediction;
import org.eclipse.scava.nlp.tools.predictions.multilabel.MultiLabelPredictionCollection;

public class EmotionTest {
	
	public static void main(String[] args) {
		System.err.println("-----------------Emotions-----------------------");
		//Usage of Emotion Classifier
		List<String> textCollection = new ArrayList<String>();
		
		textCollection.add("But then I don't get how your CPU usage is 100% on all core my concern as now it not being able to establish a diagnostic especially when there is nothing in logs");
		textCollection.add("");
		textCollection.add("I'll need some help from you, but first I want to give you an initial \"version/template\", I'm on it");
		textCollection.add("I like the new community manager of this project, continue like that!");
		
		try {
			MultiLabelPredictionCollection emotions = EmotionClassifier.predict(textCollection);
			System.out.println("Emotions classification:");
			for(MultiLabelPrediction emotion : emotions.getPredictionCollection()) {
				System.out.println(emotion.getText() + "\n" + emotion.getLabels());
			}		
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
