public class teste {
    public static void main(String[] args)
    {
        String s1 = new String("Ola");
        String s2 = new String("Olá");
        String s3 = s1;
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));

        System.out.println(s1 ==s3);

    }
}
