package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name = "attribute")
public class Attribute extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "VALUE_TYPE")
	private ValueType valueType;
	
	@Column(name = "IS_GOAL")
	private boolean isGoal;
	
	@Column(name = "QUESTION")
	private String question; 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ValueType getValueType() {
		return valueType;
	}

	public void setValueType(ValueType valueType) {
		this.valueType = valueType;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public boolean getIsGoal() {
		return isGoal;
	}
	
	public void setIsGoal(boolean isGoal){
		this.isGoal = isGoal;
	}

	private static Finder<Long, Attribute> find = new Finder<Long, Attribute>(Long.class, Attribute.class);
	
	public static List<Attribute> list(){
		return find.all();
	}

	public static Attribute find(Long id) {
		return find.byId(id);
	}

}
