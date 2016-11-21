#include <jni.h>
#include <string>

extern "C"
jstring
Java_com_dai_android_game_other_SimpleJniActivity_stringFromJNI(JNIEnv *env, jobject thiz) {
    std::string hello("A simple hello string from Java native interface call");
    return env->NewStringUTF(hello.c_str());
}
