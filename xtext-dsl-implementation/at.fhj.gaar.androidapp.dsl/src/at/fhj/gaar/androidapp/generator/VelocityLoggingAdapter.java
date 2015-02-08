package at.fhj.gaar.androidapp.generator;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.velocity.runtime.RuntimeServices;
import org.apache.velocity.runtime.log.LogChute;

public class VelocityLoggingAdapter implements LogChute {

	private Logger logger;
	
	public VelocityLoggingAdapter(Logger logger) {
		this.logger = logger;
	}
	
	@Override
	public void init(RuntimeServices rs) throws Exception {

	}

	@Override
	public void log(int level, String message) {
		logger.log(translateLevel(level), message);

	}

	@Override
	public void log(int level, String message, Throwable t) {
		logger.log(translateLevel(level), message, t);
	}

	@Override
	public boolean isLevelEnabled(int level) {
		return logger.isLoggable(translateLevel(level));
	}

	private Level translateLevel(int level) {
		switch (level) {
			case TRACE_ID: return Level.FINER;
			case DEBUG_ID: return Level.FINE;
			case INFO_ID: return Level.INFO;
			case WARN_ID: return Level.WARNING;
			case ERROR_ID: return Level.SEVERE;
		}
		
		return Level.INFO;
	}
}
