package genny;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class QCmd implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String cmd_type;
   private java.lang.String code;

   public QCmd()
   {
   }

   public java.lang.String getCmd_type()
   {
      return this.cmd_type;
   }

   public void setCmd_type(java.lang.String cmd_type)
   {
      this.cmd_type = cmd_type;
   }

   public java.lang.String getCode()
   {
      return this.code;
   }

   public void setCode(java.lang.String code)
   {
      this.code = code;
   }

   public QCmd(java.lang.String cmd_type, java.lang.String code)
   {
      this.cmd_type = cmd_type;
      this.code = code;
   }

}