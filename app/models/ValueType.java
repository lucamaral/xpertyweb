package models;

public enum ValueType {

	NUMBER {
		@Override
		public boolean checkEquals(Object value, Object toCompare) {
			try {
				double parseValue = Double.parseDouble(value.toString());
				double parseToCompare = Double.parseDouble(toCompare.toString());
				return parseValue == parseToCompare;
			} catch (final NumberFormatException e) {
				return false;
			}
		}

		@Override
		public boolean greaterThan(Object value, Object toCompare) {
			try {
				double parseValue = Double.parseDouble(value.toString());
				double parseToCompare = Double.parseDouble(toCompare.toString());
				return parseValue > parseToCompare;
			} catch (final NumberFormatException e) {
				return false;
			}
		}

		@Override
		public boolean greaterOrEqualThan(Object value, Object toCompare) {
			try {
				double parseValue = Double.parseDouble(value.toString());
				double parseToCompare = Double.parseDouble(toCompare.toString());
				return parseValue >= parseToCompare;
			} catch (final NumberFormatException e) {
				return false;
			}
		}

		@Override
		public boolean lowerThan(Object value, Object toCompare) {
			try {
				double parseValue = Double.parseDouble(value.toString());
				double parseToCompare = Double.parseDouble(toCompare.toString());
				return parseValue < parseToCompare;
			} catch (final NumberFormatException e) {
				return false;
			}
		}

		@Override
		public boolean lowerOrEqualThan(Object value, Object toCompare) {
			try {
				double parseValue = Double.parseDouble(value.toString());
				double parseToCompare = Double.parseDouble(toCompare.toString());
				return parseValue <= parseToCompare;
			} catch (final NumberFormatException e) {
				return false;
			}
		}
	},
	BOOLEAN {
		@Override
		public boolean checkEquals(Object value, Object toCompare) {
			if(value instanceof Boolean){
				if(toCompare.equals("true")){
					return value.equals(true);
				}else{
					return value.equals(false);
				}
			}
			return false;
		}

		@Override
		public boolean greaterThan(Object value, Object toCompare) {
			return false;
		}

		@Override
		public boolean greaterOrEqualThan(Object value, Object toCompare) {
			return false;
		}

		@Override
		public boolean lowerThan(Object value, Object toCompare) {
			return false;
		}

		@Override
		public boolean lowerOrEqualThan(Object value, Object toCompare) {
			return false;
		}
	},
	TEXT {
		@Override
		public boolean checkEquals(Object value, Object toCompare) {
			return value.equals(toCompare);
		}

		@Override
		public boolean greaterThan(Object value, Object toCompare) {
			return false;
		}

		@Override
		public boolean greaterOrEqualThan(Object value, Object toCompare) {
			return false;
		}

		@Override
		public boolean lowerThan(Object value, Object toCompare) {
			return false;
		}

		@Override
		public boolean lowerOrEqualThan(Object value, Object toCompare) {
			return false;
		}
	};

	public abstract boolean checkEquals(Object value, Object toCompare);

	public abstract boolean greaterThan(Object value, Object toCompare);

	public abstract boolean greaterOrEqualThan(Object value, Object toCompare);

	public abstract boolean lowerThan(Object value, Object toCompare);

	public abstract boolean lowerOrEqualThan(Object value, Object toCompare);
}
