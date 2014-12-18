package decaf.error;

import decaf.Location;

/**
 * example：incompatible operand: - int[]<br>
 * PA2
 */
public class IncompatLvalueError extends DecafError {

	public String op;
	public IncompatLvalueError(Location location, String op) {
		super(location);
		this.op = op;
	}

	@Override
	protected String getErrMsg() {
		return "lvalue required as " + op + " operand";
	}

}
