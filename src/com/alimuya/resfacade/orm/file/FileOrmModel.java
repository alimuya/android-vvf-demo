package com.alimuya.resfacade.orm.file;

public abstract class FileOrmModel {
	public boolean save(){
		return false;
	}
	
	public static <T> T load(Class<T> clazz) {
		String clazzName3 = new Object() {
			public String getClassName() {
				String clazzName = this.getClass().getName();
				return clazzName.substring(0, clazzName.lastIndexOf('$'));
			}
		}.getClassName();
		return null;
	}
	
}
