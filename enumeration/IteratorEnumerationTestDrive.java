package com.j2.adapter.enumeration;

import java.util.*;

public class IteratorEnumerationTestDrive {
 public static void main (String args[]) {
  ArrayList l = new ArrayList();
  l.add("iterator");
  l.add(4);
  Enumeration enumeration = new IteratorEnumeration(l.iterator());
  while (enumeration.hasMoreElements()) {
   System.out.println(enumeration.nextElement());
  }
 }
}