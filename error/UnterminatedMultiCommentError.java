package decaf.error;

import decaf.Location;

public class UnterminatedMultiCommentError extends DecafError {

	public UnterminatedMultiCommentError(Location location) {
		super(location);
	}

	@Override
	protected String getErrMsg() {
		return "unterminated multi comment";
	}

}