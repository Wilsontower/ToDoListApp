package UserModule;


/**
* UserModule/UserOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从F:/IDEA/源码/task_3/src/user.idl
* 2019年6月11日 星期二 下午02时42分12秒 CST
*/

public interface UserOperations 
{
  boolean add (String startTime, String endTime, String label);
  String query (String startTime, String endTime);
  boolean delete (String key);
  boolean clear ();
  String show ();
} // interface UserOperations
