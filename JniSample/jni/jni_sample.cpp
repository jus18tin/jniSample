#include <jni.h>

extern "C" {
	JNIEXPORT jint JNICALL Java_com_example_jnisample_JniSampleActivity_testJni(JNIEnv* env, jobject, jint i)
	{
		return i+1;
	}
}
