package springboot.tests;

import org.eclipse.scava.nlp.tools.plaintext.PlainTextObject;
import org.eclipse.scava.nlp.tools.plaintext.bugtrackers.PlainTextBugTrackerMarkdownBased;
import org.eclipse.scava.nlp.tools.plaintext.bugtrackers.PlainTextBugTrackersOthers;
import org.eclipse.scava.nlp.tools.plaintext.bugtrackers.PlainTextBugzilla;
import org.eclipse.scava.nlp.tools.plaintext.bugtrackers.PlainTextRedmine;
import org.eclipse.scava.nlp.tools.plaintext.commitsmessages.PlainTextCommitsMessagesMarkdownBased;
import org.eclipse.scava.nlp.tools.plaintext.communicationchannels.PlainTextEclipseForums;
import org.eclipse.scava.nlp.tools.plaintext.communicationchannels.PlainTextNewsgroups;
import org.eclipse.scava.nlp.tools.plaintext.communicationchannels.PlainTextNewsgroupsSubject;
import org.eclipse.scava.nlp.tools.plaintext.documentation.PlainTextDocumentationHtmlBased;
import org.eclipse.scava.nlp.tools.plaintext.documentation.PlainTextDocumentationOthers;

public class PlainTextTest {
	
	public static void main(String[] args) {
		
		System.err.println("-----------------Extraction Plain Text-----------------------");
		//Extraction of plain text
		
		String githubMessage3 = ">This is a reply of a message\n"+
				"I'm using the following endpoints to query the API (I have tried the ones available at https://github.com/crossminer/scava/wiki/REST-API-Documentation#metrics-provider-api, but they don't seem to work)\n" + 
				"- `/metrics/`\n" + 
				"- `/factoids/`\n" + 
				"- `/projects/`\n" + 
				"- `/projects/p/<project-id>/m/<metric-id>`\n" + 
				"- `/projects/p/<project-id>/f/<factoid-id>`\n" + 
				"\n" + 
				"I don't know if this problem is related to the endpoints I'm using, comes from the metricprovider. or just that most metrics have zero values. Any help @ambpro @md2manoppello ?\n" + 
				"\n" + 
				"**emf**\n" + 
				"Total metrics collected: 188 (183 empty, empty datatable) \n" + 
				"306 listed in http://localhost:5601/project/configure/emf";
		
		System.out.println("Orginal message:\t"+githubMessage3);
		System.out.println();
		
		System.out.println("PlainTextBugTrackerMarkdownBased:");
		PlainTextObject plain = PlainTextBugTrackerMarkdownBased.process(githubMessage3);
		System.out.println("Plain text:\t"+plain.getPlainTextAsList());
		System.out.println("Contains reply?:\t"+plain.hadReplies());
		System.out.println();

		System.out.println("PlainTextBugTrackersOthers:");
		plain = PlainTextBugTrackersOthers.process(githubMessage3);
		System.out.println("Plain text:\t"+plain.getPlainTextAsList());
		System.out.println("Contains reply?:\t"+plain.hadReplies());
		System.out.println();

		System.out.println("PlainTextBugzilla:");
		plain = PlainTextBugzilla.process(githubMessage3);
		System.out.println("Plain text:\t"+plain.getPlainTextAsList());
		System.out.println("Contains reply?:\t"+plain.hadReplies());
		System.out.println();

		System.out.println("PlainTextRedmine:");
		plain = PlainTextRedmine.process(githubMessage3);
		System.out.println("Plain text:\t"+plain.getPlainTextAsList());
		System.out.println("Contains reply?:\t"+plain.hadReplies());
		System.out.println();

		System.out.println("PlainTextCommitsMessagesMarkdownBased:");
		plain = PlainTextCommitsMessagesMarkdownBased.process(githubMessage3);
		System.out.println("Plain text:\t"+plain.getPlainTextAsList());
		System.out.println("Contains reply?:\t"+plain.hadReplies());
		System.out.println();

		System.out.println("PlainTextEclipseForums:");
		plain = PlainTextEclipseForums.process(githubMessage3);
		System.out.println("Plain text:\t"+plain.getPlainTextAsList());
		System.out.println("Contains reply?:\t"+plain.hadReplies());
		System.out.println();

		System.out.println("PlainTextNewsgroups:");
		plain = PlainTextNewsgroups.process(githubMessage3);
		System.out.println("Plain text:\t"+plain.getPlainTextAsList());
		System.out.println("Contains reply?:\t"+plain.hadReplies());
		System.out.println();

		System.out.println("PlainTextNewsgroupsSubject:");
		String out = PlainTextNewsgroupsSubject.process(githubMessage3);
		System.out.println("Plain text:\t"+out);
		System.out.println();

		System.out.println("PlainTextDocumentationHtmlBased:");
		plain = PlainTextDocumentationHtmlBased.process(githubMessage3);
		System.out.println("Plain text:\t"+plain.getPlainTextAsList());
		System.out.println("Contains reply?:\t"+plain.hadReplies());
		System.out.println();

		System.out.println("PlainTextDocumentationOthers:");
		plain = PlainTextDocumentationOthers.process(githubMessage3);
		System.out.println("Plain text:\t"+plain.getPlainTextAsList());
		System.out.println("Contains reply?:\t"+plain.hadReplies());
		System.out.println();

	}

}
