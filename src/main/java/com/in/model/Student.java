package com.in.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Student {
 private Long sId;
 private String sName;
 private String sCourseName;
}
