/* Copyright (c) 2000-2007 by Paul N. Hilfinger.  All Rights Reserved.
 * For licensing terms, see the file GJDB.LICENSES, Part 2, which must
 * accompany any redistribution of this file. */

package ucb.gjdb;

/** An exception that indicates an error in a user-inputted command. */
class CommandException extends RuntimeException {

    CommandException () {
        super ();
		this.exception = null;
    }

    CommandException (String s, Throwable e) {
        super (s);
		this.exception = e;
    }

    CommandException (Throwable e) {
        super ();
		this.exception = e;
    }

	Throwable getThrowable () {
		return exception;
	}

	static CommandException ERROR (Throwable e, String format, Object... args)
	{
		if (format == null)
			return new CommandException (e);
		else
			return new CommandException (String.format (format, args), e);
	}

	static CommandException ERROR (String format, Object... args) {
        if (format == null)
            return new CommandException ();
		return new CommandException (String.format (format, args), null);
	}

	private final Throwable exception;
}
