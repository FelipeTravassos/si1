package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

public class Task extends Model {

	  @Id
	  public Long id;
	  
	  @Required
	  public String label;
	  
	  public static Finder<Long,Task> find = new Finder(
	    Long.class, Task.class
	  );
  
	  public static List<Task> all() {
		 try {
			  return find.all();
		} catch (Exception e) {
			// TODO: handle exception
			 return new ArrayList<Task>();
		}
	}
  
	  public static void create(Task task) {
		  task.save();
	  }
  
	  public static void delete(Long id) {
		  find.ref(id).delete();
	  }
    
}
