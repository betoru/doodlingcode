#include <jni.h>
#include "HelloJNICpp.h"
#include "HelloJNICppImpl.h"

JNIEXPORT void JNICALL Java_cppmjni_HelloJNICpp_sayHello (JNIEnv *env, jobject thisObj) {
    sayHello();  // invoke C++ function
    return;
}