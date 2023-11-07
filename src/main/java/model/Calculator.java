package model;



    public class Calculator {
        public static float add(float num1, float num2) {
            if (Float.isNaN(num1) || Float.isNaN(num2)) {
                throw new IllegalArgumentException("Inserire numeri validi!");
            }
            return num1 + num2;
        }

        public static float subtract(float num1, float num2) {
            if (Float.isNaN(num1) || Float.isNaN(num2)) {
                throw new IllegalArgumentException("Inserire numeri validi!");
            }
            return num1 - num2;
        }

        public static float divide(float num1, float num2) {
            if (Float.isNaN(num1) || Float.isNaN(num2)) {
                throw new IllegalArgumentException("Inserire numeri validi!");
            }
            if (num2 == 0) {
                throw new IllegalArgumentException("Il dividendo non può essere zero!");
            }
            return num1 / num2;
        }

        public static  float multiply(float num1, float num2) {
            if (Float.isNaN(num1) || Float.isNaN(num2)) {
                throw new IllegalArgumentException("Inserire numeri validi!");
            }
            return num1 * num2;
        }
    }




