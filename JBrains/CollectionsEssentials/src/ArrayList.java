public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<String> names = new java.util.ArrayList<>();

        for (int i = 0; i < 20; i++) {
            names.add("name " + i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(names.get(i));
        }

        names.indexOf("name 4");
    }
}
