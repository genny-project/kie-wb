package genny;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class User implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String age;
   private java.lang.String name;

   public User()
   {
   }

   public java.lang.String getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.String age)
   {
      this.age = age;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public User(java.lang.String age, java.lang.String name)
   {
      this.age = age;
      this.name = name;
   }

}