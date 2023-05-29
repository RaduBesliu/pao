package not_project_related;

class C {
    public static int a = 1;
    public int b = 1;

    public void met() {
        a++;
        b++;
    }
}

class Afisare {
    public static void main(String[] args) {
        C ob1 = new C();
        C ob2 = new C();
        ob1.met();
        ob2.met();
        System.out.println(ob1.a + ob2.b);
    }
}