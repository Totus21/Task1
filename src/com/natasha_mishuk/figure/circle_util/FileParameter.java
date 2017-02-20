package com.natasha_mishuk.figure.circle_util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileParameter {

    private String fileName;
    public final static String ROOT_DIR="datafiles\\";
    Logger logger = LogManager.getLogger("FileParameter");



    public void setFileName(String fileName){
        logger.log(Level.INFO,"setFileName sets fileName -> "+ fileName);
        this.fileName = fileName;
    }


    public String getFileName(){
        logger.log(Level.INFO,"getFileName returns fileName -> "+ fileName);
        return fileName;
    }



}
