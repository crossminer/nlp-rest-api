package springboot.tests;

import org.eclipse.scava.nlp.tools.readability.Readability;

public class ReadabilityTest {
	
	public static void main(String[] args) {
		String text = "One morning Toad sat in bed.I have many things to do, he said.I will write them all down on a list so that I can remember them.Toad wrote on a piece of paper: A list of things to do today.Then he wrote: Wake up.I have done that, said Toad, and he crossed it out";
		
		System.out.println(Readability.calculateDaleChall(text));
		
		text = "Why is it that as soon as Jingle Bells starts playing on the radio, otherwise-sane people are driven to extremes to create the PerfectChristmas? Take the case of MaureenMcFadden, a Womans Day editor, who decided to decorate her tree with homemade gingerbread ornaments. I started late in the evening, she recalled. And then I knocked the molasses jar on the floor. It was downhillfrom there. Her catlong haired , of coursesat in the molasses pool. And when I yelped, he ran down the hall into my bedroom spewing molasses everywhere. Still, after she washed the ...";
		
		System.out.println(Readability.calculateDaleChall(text));
	}

}
