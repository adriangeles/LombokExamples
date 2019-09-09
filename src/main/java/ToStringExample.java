import lombok.ToString;

import java.awt.*;


public class ToStringExample {

    public static void main(String[] args) {

        System.out.println(new BaseDTO());
        System.out.println(new ExtendsDTO());

        // ToStringExample.BaseDTO(list=[a, b, c], base=Value)
        // ToStringExample.ExtendsDTO(super=ToStringExample.BaseDTO(list=[a, b, c], base=Value), Extend)
    }

    @ToString(
            callSuper=true,
            includeFieldNames =  false,
            doNotUseGetters = true)
    private static class ExtendsDTO extends BaseDTO {
        private String extend = "Extend";
    }

    @ToString
    private static class BaseDTO {
        private String[] list = {"a","b","c"};
        private String base = "Value";
        @ToString.Exclude private String hiddeBase = "Don't show it";
    }
}
