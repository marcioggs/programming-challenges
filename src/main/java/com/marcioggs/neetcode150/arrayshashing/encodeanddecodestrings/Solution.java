package com.marcioggs.neetcode150.arrayshashing.encodeanddecodestrings;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  /*
   * @param strs: a list of strings
   * @return: encodes a list of strings to a single string.
   */
  public String encode(List<String> strs) {
    var result = new StringBuilder();

    for (var str : strs) {
      result.append(str.length());
      result.append("#");
      result.append(str);
    }
    return result.toString();
  }

  /*
   * @param str: A string
   * @return: dcodes a single string to a list of strings
   */
  public List<String> decode(String str) {
    var result = new ArrayList<String>();

    while (str.indexOf("#") > 0) {
      int firstHashIndex = str.indexOf("#");
      var wordLength = Integer.parseInt(str.substring(0, firstHashIndex));
      result.add(str.substring(firstHashIndex + 1, firstHashIndex + wordLength + 1));
      str = str.substring(firstHashIndex + wordLength + 1);
    }

    return result;
  }
}
