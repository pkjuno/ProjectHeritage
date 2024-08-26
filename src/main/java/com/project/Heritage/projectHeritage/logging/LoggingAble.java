package com.project.Heritage.projectHeritage.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class LoggingAble {

    protected final Logger log = LoggerFactory.getLogger(getClass());
}
