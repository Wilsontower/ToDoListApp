package UserModule;

/**
* UserModule/UserHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��F:/IDEA/Դ��/task_3/src/user.idl
* 2019��6��11�� ���ڶ� ����02ʱ42��12�� CST
*/

public final class UserHolder implements org.omg.CORBA.portable.Streamable
{
  public UserModule.User value = null;

  public UserHolder ()
  {
  }

  public UserHolder (UserModule.User initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = UserModule.UserHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    UserModule.UserHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return UserModule.UserHelper.type ();
  }

}
