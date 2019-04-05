// Generated by Scapix Language Bridge

#include <scapix/bridge/java/object.h>

void scapix_java_export_contact();
void scapix_java_export_session();
void scapix_java_export_model();

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM* vm, void* reserved)
{
  try
  {
    auto result = scapix::bridge::java::on_load(vm, reserved);

    scapix_java_export_contact();
    scapix_java_export_session();
    scapix_java_export_model();

    return result;
  }
  catch (const scapix::link::java::vm_exception& e)
  {
    e.get()->throw_();
  }

  return 0;
}
