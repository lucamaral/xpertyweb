package models;

public class RuleCondition {
	
	private String attribute;
	private Value value;
	
	public RuleCondition(String attribute, Value value) {
		this.attribute = attribute;
		this.value = value;
	}
	
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	
	public boolean hasAttribute(String toCompare) {
		return this.attribute.equals(toCompare);
	}

	public boolean checkEquals(Object toCompare) {
		return this.value.checkEquals(toCompare);
	}
	
	public boolean greaterThan(Object toCompare) {
		return this.value.greaterThan(toCompare);
	}

	public boolean greaterOrEqualThan(Object toCompare) {
		return this.value.greaterOrEqualThan(toCompare);
	}

	public boolean lowerThan(Object toCompare) {
		return this.value.lowerThan(toCompare);
	}

	public boolean lowerOrEqualThan(Object toCompare) {
		return this.value.lowerOrEqualThan(toCompare);
	}
	
	@Override
	public String toString() {
		return "RuleCondition [attribute=" + attribute + ", value=" + value + "]";
	}

	

	

	
	
	

}
