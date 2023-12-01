package case_study.util;

import case_study.views.EmployeeView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyRegex  {

    public static boolean checkRegex(String regex, String path) {
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(path);
      return matcher.matches();
      //return   path.matches(regex);
    }
}
