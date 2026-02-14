public class Mutable_and_Immutable_Strings {
    public static void main(String[] args)
    {
        String name="navin"; //stored as new object in STC
        name=name+"reddy"; /* new object is created and
                           address is changed for variable in stack memory*/
        System.out.println("hello "+name);

        String s1="Navin"; /* new object is created as it is
                           new literal value with captial 'N'*/
        String s2="Navin"; /* only address from previous object
                           of same literal value is copied
                           and re-used in stack to save memory */

        System.out.println(s1==s2);

    }
}
