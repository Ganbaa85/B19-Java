import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class GovermentEmployee {
    private int id;

    GovermentEmployee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == null) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {  // edge cases
            return false;
        }
        GovermentEmployee employee = (GovermentEmployee) o;
        return id == employee.id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {

        GovermentEmployee govermentEmployee = new GovermentEmployee(001);
        GovermentEmployee govermentEmployee2 = new GovermentEmployee(002);
        GovermentEmployee govermentEmployee3 = new GovermentEmployee(002);
        HashSet<GovermentEmployee> employees = new HashSet<>();
        employees.add(govermentEmployee);
        employees.add(govermentEmployee2);
        employees.add(govermentEmployee3); // employee3.equals(employee2) removes duplicate with override method
        System.out.println(employees);
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("apple", "watermelon"));
        HashSet<String> hashSet2 = new HashSet<>(Arrays.asList("carrot", "melon"));
        ArrayList<HashSet<String>> hashSetArrayList = new ArrayList<>();
        hashSetArrayList.add(hashSet);
        hashSetArrayList.add(hashSet2);
        System.out.println(hashSetArrayList);
        ArrayList<ArrayList<String>> arrayList;
        ArrayList<ArrayList<int[]>> arrayList1; // ArrayList< objects >
        ArrayList<int[]> arrayList2 = new ArrayList<>(); // int array will be stored in arraylist
        int[] arr = new int[]{1,11,111};
        int[] arr1 = new int[]{2,22,222};
        arrayList2.add(arr);
        arrayList2.add(arr1);
        System.out.println(arrayList2);

    }


}
