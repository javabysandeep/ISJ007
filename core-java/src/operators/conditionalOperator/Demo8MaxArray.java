package operators.conditionalOperator;

public class Demo8MaxArray {
    public static void main(String[] args) {
        int[] array = {284, 594, 786, 907, 123};
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (max < array[index]) {
                max = array[index];
            }
        }
        System.out.println("Max is = " + max);

    }
}
