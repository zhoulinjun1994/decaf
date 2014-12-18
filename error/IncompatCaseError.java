package decaf.error;

import decaf.Location;

/**
 * example：incompatible operands: int + bool<br>
 * PA2
 */
public class IncompatCaseError extends DecafError {

	private String expr;


	public IncompatCaseError(String expr, Location location) {
		super(location);
		this.expr = expr;
	}

	@Override
	protected String getErrMsg() {
		return "incompatible case: int constant is expected";
	}

}
