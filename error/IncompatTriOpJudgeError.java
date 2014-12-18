package decaf.error;

import decaf.Location;

/**
 * example：incompatible operands: int + bool<br>
 * PA2
 */
public class IncompatTriOpJudgeError extends DecafError {

	public IncompatTriOpJudgeError(Location location) {
		super(location);
	}

	@Override
	protected String getErrMsg() {
		return "test expression must have bool type";
	}

}
