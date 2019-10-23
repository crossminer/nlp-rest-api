package springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}



//GET REQUEST
//http://localhost:8080/sentimentSingle?sentence="I am programming!"

//GET REQUEST
//http://localhost:8080/sentiment?sentence=I am programming!

//GET REQUEST
//http://localhost:8080/sentiment?sentence="I am programming!"

//GET REQUEST
//http://localhost:8080/sentiment?sentence=I am too happy&sentence=I am working&sentence=I am sad&sentence=I am enthusiastic!&sentence=I don't care, do I?

//GET REQUEST
//http://localhost:8080/sentiment?sentence="aaa","bb,bbb","cc",d,dd,"234"
// the above is problematic with commas

//GET REQUEST
//http://localhost:8080/sentimentIds?
//	id=11&sentence=I am too happy&
//	id=21&sentence=I am working&
//	id=31&sentence=I am sad&
//	id=41&sentence=I am enthusiastic!&
//	id=51&sentence=I don't care,do I?

// POST REQUEST
// http://localhost:8080/sentimentSingle
// JSON BODY: I am sad!

// POST REQUEST
//http://localhost:8080/sentiment
//JSON BODY: 
//[
//	"I am too happy",
//	"I am working",
//	"I am sad",
//	"I am enthusiastic!",
//	"I don't care, do I?"
//]

//POST REQUEST
//http://localhost:8080/sentimentIds
//JSON BODY: 
//[
// {
//     "id": "11",
//     "sentence": "I am too happy"
// },
// {
//     "id": "21",
//     "sentence": "I am working"
// },
// {
//     "id": "31",
//     "sentence": "I am sad"
// },
// {
//     "id": "41",
//     "sentence": "I am enthusiastic!"
// },
// {
//     "id": "51",
//     "sentence": "I don't care, do I?"
// }
//]