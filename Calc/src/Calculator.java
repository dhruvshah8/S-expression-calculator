

public class Calculator {
	



	/* Removing unnecessary spaces from the input string */
	public String getCorrectInput(String str){
		return str.replaceAll("\\s", "");
	}


	public static void main(String[] args) {



		/* Input arguments length check conditions */
		try {
			if (args.length < 1 || args.length > 1) {
				throw new IllegalArgumentException(Constants.illegalArgumentMessage);
			}
		} catch (Exception e) {
			return;
		}

 
		// get input as String 
		Calculator calcObj = new Calculator();
		String input = calcObj.getCorrectInput(args[0]);

		// check syntax 
		SyntaxChecker.checkInitialSyntax(input);
		
		// print results 
		System.out.println(ExpressionEvaluator.getCalculatedValue(input));

	}

}


