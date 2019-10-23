package springboot.tests;

import org.eclipse.scava.nlp.resources.sentinet5.SenticNet5;
import org.eclipse.scava.nlp.tools.core.NLPCoreAnalyzer;

public class SenticnetTest {
	
	public static void main(String[] args) {
		String text = "Adrian has been working all the weekend.";
		
		System.out.println(text);
		NLPCoreAnalyzer coreAnalyzer = new org.eclipse.scava.nlp.tools.core.NLPCoreAnalyzer(text);

		System.out.println("Lemmas: " + coreAnalyzer.getLemmas());
		System.out.println("LemmatizedText: " + coreAnalyzer.getLemmatizedText());
		System.out.println("LemmatizedSentences: " + coreAnalyzer.getLemmatizedSentences());
		System.out.println("LemmatizedSentencesAsText: " + coreAnalyzer.getLemmatizedSentencesAsText());
		
		System.out.println("POS: " + coreAnalyzer.getPOS());
		System.out.println("POSText: " + coreAnalyzer.getPOSText());
		System.out.println("POSSentences: " + coreAnalyzer.getPOSSentences());
		System.out.println("POSSentencesAsText: " + coreAnalyzer.getPOSSentencesAsText());

		System.out.println("Tokens: " + coreAnalyzer.getTokens());
		System.out.println("TokenizedText: " + coreAnalyzer.getTokenizedText());
		System.out.println("TokenizedSentences: " + coreAnalyzer.getTokenizedSentences());
		System.out.println("TokenizedSentencesAsText: " + coreAnalyzer.getTokenizedSentencesAsText());

		System.out.println("Stats: " + coreAnalyzer.getStats());

		System.out.println(SenticNet5.analyzeText(coreAnalyzer));
		
		text = "This program has a memory leak problem which is breaking all the computers!.";
		System.out.println(text);
		coreAnalyzer = new NLPCoreAnalyzer(text);
		System.out.println("Lemmas: " + coreAnalyzer.getLemmas());
		System.out.println("LemmatizedText: " + coreAnalyzer.getLemmatizedText());
		System.out.println("LemmatizedSentences: " + coreAnalyzer.getLemmatizedSentences());
		System.out.println("LemmatizedSentencesAsText: " + coreAnalyzer.getLemmatizedSentencesAsText());
		
		System.out.println("POS: " + coreAnalyzer.getPOS());
		System.out.println("POSText: " + coreAnalyzer.getPOSText());
		System.out.println("POSSentences: " + coreAnalyzer.getPOSSentences());
		System.out.println("POSSentencesAsText: " + coreAnalyzer.getPOSSentencesAsText());

		System.out.println("Tokens: " + coreAnalyzer.getTokens());
		System.out.println("TokenizedText: " + coreAnalyzer.getTokenizedText());
		System.out.println("TokenizedSentences: " + coreAnalyzer.getTokenizedSentences());
		System.out.println("TokenizedSentencesAsText: " + coreAnalyzer.getTokenizedSentencesAsText());

		System.out.println("Stats: " + coreAnalyzer.getStats());
		System.out.println(SenticNet5.analyzeText(coreAnalyzer));

	}

}
