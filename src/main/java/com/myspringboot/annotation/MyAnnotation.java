package com.myspringboot.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {MyAnnotationValidator.class})
public @interface MyAnnotation {

	String message() default "{javax.validation.constraints.Myannotation.message}";

	Class<?>[] groups() default { };
	
	Class<? extends Payload>[] payload() default { };
	
	long value();

	@Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
		MyAnnotation[] value();
    }
	
}
