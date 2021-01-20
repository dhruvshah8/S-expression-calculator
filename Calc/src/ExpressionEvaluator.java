 

 

public class ExpressionEvaluator {

	 
	/*
	 * Returns two exprs from the given expr
	 * Eg: In is "add(expr1, expr2)",
	 * out is array of [expr1, expr2]
	 */
	
	private static String[] getTwoExpr(String expr, String op) {
		
		String[] exprArr = new String[2]; 
		
		int commaPos = SyntaxChecker.checkMatchedParansAndReturnNextDelim(expr, op.length() + 1, ',');
		String expr1 = expr.substring(op.length() + 1, commaPos);
		exprArr[0] = expr1;
		
		int endPos = SyntaxChecker.checkMatchedParansAndReturnNextDelim(expr, commaPos + 1, ')');
		String expr2 = expr.substring(commaPos + 1, endPos);
		exprArr[1] = expr2;
		
		return exprArr;
	}
	
	 
   /* Expression evaluator*/
   public static int getCalculatedValue(String expr) {
	
	try {
		if(SyntaxChecker.isNumeric(expr)) {
			return Integer.parseInt(expr);
			
		} else if (expr.startsWith(Constants.ADD)) {
			
			String[] exprs = getTwoExpr(expr, Constants.ADD);
			return getCalculatedValue(exprs[0]) + getCalculatedValue(exprs[1]);
			 
		} else if (expr.startsWith(Constants.SUB)) {
			
			String[] exprs = getTwoExpr(expr, Constants.SUB);
			return getCalculatedValue(exprs[0]) - getCalculatedValue(exprs[1]);
		
		} else if(expr.startsWith(Constants.MULT)) {
			
			String[] exprs = getTwoExpr(expr, Constants.MULT);
			return getCalculatedValue(exprs[0]) * getCalculatedValue(exprs[1]);
		
		} else if(expr.startsWith(Constants.DIV)) {
			
			String[] exprs = getTwoExpr(expr, Constants.DIV);
			return getCalculatedValue(exprs[0]) / getCalculatedValue(exprs[1]);
		
		}
		
	} catch (Exception e){
		
	}
		
		return 0;
	}
	
}