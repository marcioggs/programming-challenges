package com.marcioggs.neetcode150.binarysearch.timebasedkeyvaluestore;

import java.util.AbstractMap.SimpleEntry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class TimeMap {

  private final Map<String, TreeSet<Entry<Integer, String>>> store = new HashMap<>();

  public TimeMap() {}

  public void set(String key, String value, int timestamp) {
    var values = store.get(key);
    if (values == null) {
      values = new TreeSet<>(Comparator.comparingInt(Entry::getKey));
      store.put(key, values);
    }
    values.add(new SimpleEntry<>(timestamp, value));
  }

  public String get(String key, int timestamp) {
    var keyValues = store.get(key);
    if (keyValues == null) {
      return "";
    }
    var value = keyValues.floor(new SimpleEntry<>(timestamp, null));
    return value != null ? value.getValue() : "";
  }
}
