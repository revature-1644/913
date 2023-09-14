package Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {
    /**
     * public makes this variable directly accessible outside of this class
     * (public - protected - default - private)
     * final makes it so that this object can not be changed to anything else - it's permanent
     * static makes it so that this object doesn't belong to any specific Object instance -
     * it belongs to the "LogUtil" class, but it's static-scoped, which means it's loaded
     * into Java's memory as soon as the program starts up
     */
    public final static Logger log = LoggerFactory.getLogger("Application.class");

}
