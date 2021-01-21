public class Source {

	String someMethod(String val) {
		// Test commit 1
		if(val == null)
			return null;

		return "ABC";
	}

	String anotherMethod(String val) {
		return someMethod(val);
	}
}
