package com.myspringboot.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyAnnotationValidator implements
ConstraintValidator<MyAnnotation, String>{
	
	protected long minSize;
	
	@Override
    public void initialize(MyAnnotation Value) {
        this.minSize = Value.value();
    }

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value.length() < this.minSize) {
			return false;
		}
		return true;
	}

}
