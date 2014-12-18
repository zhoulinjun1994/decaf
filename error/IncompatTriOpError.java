package decaf.error;

import decaf.Location;

/**
 * example：incompatible operands: int + bool<br>
 * PA2
 */
public class IncompatTriOpError extends DecafError {

	private String middle;

	private String right;


	public IncompatTriOpError(Location location, String middle, String right) {
		super(location);
		this.middle = middle;
		this.right = right;
	}

	@Override
	protected String getErrMsg() {
		return "operands to ?:  have different types " + middle + " and " + right;
	}

}
