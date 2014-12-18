package decaf.error;

import decaf.Location;

/**
 * example：incompatible operands: int + bool<br>
 * PA2
 */
public class IncompatSwitchError extends DecafError {

	private String expr;


	public IncompatSwitchError(String expr, Location location) {
		super(location);
		this.expr = expr;
	}

	@Override
	protected String getErrMsg() {
		return "incompatible switch: " + expr + " given,  int expected";
	}

}
