LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE   := native_sample
LOCAL_SRC_FILES := jni_sample.cpp

include $(BUILD_SHARED_LIBRARY)