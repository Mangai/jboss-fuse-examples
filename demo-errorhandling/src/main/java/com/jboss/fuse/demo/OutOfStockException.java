package com.jboss.fuse.demo;

public class OutOfStockException extends RuntimeException {
	private static final long serialVersionUID = 804393872113119507L;

	public OutOfStockException() {
	}

	public OutOfStockException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public OutOfStockException(String message, Throwable cause) {
		super(message, cause);
	}

	public OutOfStockException(String message) {
		super(message);
	}

	public OutOfStockException(Throwable cause) {
		super(cause);
	}
}
