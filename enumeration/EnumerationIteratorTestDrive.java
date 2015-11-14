package com.j2.adapter.enumeration;

import java.util.*;

public class EnumerationIteratorTestDrive {
 public static void main (String args[]) {
  Vector v = new Vector();
  v.add("iterator");
  v.add(4);
  Iterator iterator = new EnumerationIterator(v.elements());
  while (iterator.hasNext()) {
   System.out.println(iterator.next());
  }
 }
}