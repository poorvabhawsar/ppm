public class Source {

	String someMethod(String val) {
		if(val == null)
			return null;

		return "ABC";
	}

	String anotherMethod(String val) {
		return someMethod(val);
	}
}