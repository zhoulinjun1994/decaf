package decaf.error;

import decaf.Location;

/**
 * example：incompatible operands: int + bool<br>
 * PA2
 */
public class IncompatRepeatUntilError extends DecafError {

	private String cond;


	public IncompatRepeatUntilError(String cond, Location location) {
		super(location);
		this.cond = cond;
	}

	@Override
	protected String getErrMsg() {
		return "test expression must have bool type";
	}

}
