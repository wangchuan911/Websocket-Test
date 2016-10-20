package hello;

public class Greeting {
	private String content;
	private String talker;

	public Greeting() {
	}

	public Greeting(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public String getTalker() {
		return talker;
	}

	public void setTalker(String talker) {
		this.talker = talker;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
