/**
 * 
 */
package com.moz.sb.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Md Mozammil Anwar Quadri
 *
 */
@Data
@Entity(name = "TODO")
public class ToDo {
	@Id
	@GeneratedValue
	private Integer id;
	private String toDoDate;
	private String toDoText;
}
