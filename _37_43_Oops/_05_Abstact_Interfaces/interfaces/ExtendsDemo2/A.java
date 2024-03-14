package DsaProgress._37_43_Oops._05_Abstact_Interfaces.interfaces.ExtendsDemo2;

public interface A {


    // STATIC INTERFACE SHOULD ALWAYS HAVE A BODY
    // CALL VIA A INTERFACE NAME
    default void fun(){
        System.out.println("I am in A");
    }

}
