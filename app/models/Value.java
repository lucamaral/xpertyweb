package models;

public class Value {
	
	private ValueType type;
	private Object value;
	
	public Value(ValueType type, Object value) {
		super();
		this.type = type;
		this.value = value;
	}

	public boolean checkEquals(Object toCompare) {
		return type.checkEquals(this.value, toCompare);
	}

	public boolean greaterThan(Object toCompare) {
		return type.greaterThan(this.value, toCompare);
	}

	public boolean greaterOrEqualThan(Object toCompare) {
		return type.greaterOrEqualThan(this.value, toCompare);
	}

	public boolean lowerThan(Object toCompare) {
		return type.lowerThan(this.value, toCompare);
	}

	public boolean lowerOrEqualThan(Object toCompare) {
		return type.lowerOrEqualThan(this.value, toCompare);
	}

	@Override
	public String toString() {
		return "Value [type=" + type + ", value=" + value + "]";
	}
	
	

}
