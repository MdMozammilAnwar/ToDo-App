/**
 * 
 */
package com.moz.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moz.sb.model.ToDo;

/**
 * @author Md Mozammil Anwar Quadri
 *
 */
public interface ToDoRepository extends JpaRepository<ToDo, Integer> {

}
