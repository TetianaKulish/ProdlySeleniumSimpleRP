package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SeleniumProperty {

    public static Properties properties;
    public static final String BROWSER_NAME = getProp("browser");
    public static final long PAGE_LOAD_TIMEOUT = Long.parseLong(getProp("webdriver-pageload-timeout"));
    public static final long IMPLICITLY_WAIT = Long.parseLong(getProp("webdriver-implicitly-wait"));
    public static final String DEFAULT_DOWNLOAD_DIRECTORY = getProp("download-default-directory");
    public static final String PROJECT_HOMEPAGE = getProp("project-homepage");
    public static final String FILES_PATH = getProp("filesPath");


    public static String getProp(String propName) {
        String property = configureProps("test.properties").getProperty(propName);
        if (property == null) {
            property = configureProps("global.properties").getProperty(propName);
            if (property == null) {
                property = System.getProperty(propName);
            }
        }
        return property;
    }

    public static Properties configureProps(String propName) {
        InputStream input;
        try {
            File f = new File(propName);
            if (f.exists() && !f.isDirectory()) {
                input = new FileInputStream(propName);
            } else {
                input = new FileInputStream("global.properties");
            }
            if (properties == null) {
                properties = new Properties();
            }
            properties.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}