package springboot.tests;

import org.eclipse.scava.nlp.tools.references.NormalizedReferences;
import org.eclipse.scava.nlp.tools.references.github.ReferencesInGitHub;

public class ReferencesTest {
	
	public static void main(String[] args) {
		
		//Extraction of references
		System.err.println("-----------------Extraction References-----------------------");
		
		String githubMessage = "By looking on the stack trace,  I guess that the above issue is already fixed by the commit https://github.com/crossminer/scava/commit/7e232944198e100368ab0de9037337fcd757f8db.\n" + 
				"let me know if the current update of `dev` branch works fine for you?";
		
		String githubMessage2 = "Hi @blueoly @creat89 this issue could be related to #276 ?";
		
		NormalizedReferences references = ReferencesInGitHub.findReferences(githubMessage, "crossminer", "scava");
		
		NormalizedReferences references2 = ReferencesInGitHub.findReferences(githubMessage2, "crossminer", "scava");
		
		System.out.println(githubMessage);
		System.out.println("Bugs:\t"+references.getNormalizedBugsReferences());
		System.out.println("Commits:\t"+references.getNormalizedCommitsReferences());
		
		System.out.println(githubMessage2);
		System.out.println("Bugs:\t"+references2.getNormalizedBugsReferences());
		System.out.println("Commits:\t"+references2.getNormalizedCommitsReferences());
		
	}

}
