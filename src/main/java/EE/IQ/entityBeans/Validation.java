package EE.IQ.entityBeans;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.lang.annotation.*;

public class Validation {

        /*Bean validation or entity validation consists of validating data within a class. For example, validating whether
        a field represents an email. Usually, developers perform these validations on both the front-end and back-end,
        and in some cases, even within the database. This can lead to complex validations and potential application errors.

        To help address this issue, in the new version of Java EE released in December 2009, we have Bean Validation. This
        feature allows us to perform validations using metadata (annotations) and apply them across all layers of our
        applications. It also enables us to create custom validations that can be easily integrated with JPA and JSF,
        for instance.

        Let's see an example above where we're going to add some news validation rules:*/



    static class Contract {

        @NotEmpty
        private String name;

        @NotEmpty
        @Pattern(regexp = ".+@.+\\.[a-z]+")
        private String email;

        @Cep
        private String code;

        // getters and setters

        public void sendMail() {}

           /*Here, we've added the @NotEmpty and @Pattern annotations. These ensure that we don't save any Contract with an
           empty name or email. Additionally, they validate the provided regex with @Pattern. We can also handle more specific
           validations, such as CEP and CPF. As you've noticed, we've applied the @Cep annotation above the 'code' variable
           to perform a custom validation. To achieve this, we need to create our own interface validator, as shown below.
           Afterward, it's simply a matter of adding this annotation to the desired property.*/


    }


    @Constraint(validatedBy = CepValidator.class)
    @Documented
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Cep {
        String message() default "Invalid CEP";
        Class<?>[] groups() default { };
        Class<? extends Payload>[] payload() default { };
    }

        /*This code block defines a custom annotation @Cep. Let's break down the different parts:

        @Constraint(validatedBy = CepValidator.class): Indicates that this annotation is a constraint annotation and specifies
        the class (CepValidator.class) responsible for validating this constraint.

        @Documented: Indicates that instances of this annotation should be included in the generated JavaDoc.

        @Target(ElementType.FIELD): Specifies that this annotation can be used only on fields.

        @Retention(RetentionPolicy.RUNTIME): Specifies the retention policy of the annotation, allowing it to be accessible
         at runtime via reflection.

        public @interface Cep {: Begins the definition of the custom annotation named Cep.

        String message() default "Invalid Cep";: Defines an element message within the annotation, providing a default
        error message for the validation failure.

        Class<?>[] groups() default { };: Defines an element groups, which can be used to specify validation groups (used
        in validation scenarios where groups of constraints are validated selectively).
        Class<? extends Payload>[] payload() default { };: Defines an element payload, typically used for additional metadata
         and validation-related information.
    */


    public static class CepValidator implements ConstraintValidator<Cep, String> {

        private static final String CEP_PATTERN = "\\d{5}-\\d{3}";
        private java.util.regex.Pattern pattern;

        @Override
        public void initialize(Cep constraintAnnotation) {
            pattern = java.util.regex.Pattern.compile(CEP_PATTERN);
        }

        @Override
        public boolean isValid(String value, ConstraintValidatorContext context) {
            if (value == null) {
                return false;
            }
            java.util.regex.Matcher matcher = pattern.matcher(value);
            return matcher.matches();
        }
    }








/*        JSF: JavaServer Faces, is a Java-based web application framework that simplifies building user interfaces for
        Java EE applications. It provides a component-based approach to web development, allowing developers to create
        reusable UI components


        Keywords
            JSF
            Bean validation*/


}
