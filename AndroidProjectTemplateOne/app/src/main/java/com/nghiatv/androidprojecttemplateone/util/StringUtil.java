package com.nghiatv.androidprojecttemplateone.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public class StringUtil {

    /**
     * This method is used to encode a string with UTF-8
     *
     * @param value is string you want to encode
     * @return return a string with encode
     */
    public static String urlEncoding(String value) {
        String encodedUrl;
        try {
            encodedUrl = URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            encodedUrl = value;
        }
        return encodedUrl;
    }

    /**
     * This method is used to validate an email
     *
     * @param email is email you want to validate
     * @return return true if email is valid else return false
     */
    public static boolean validateEmail(String email) {
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
