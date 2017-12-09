/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class AccountVideoConfig extends PersistentObject {
  private transient long swigCPtr;

  protected AccountVideoConfig(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.AccountVideoConfig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AccountVideoConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_AccountVideoConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setAutoShowIncoming(boolean value) {
    pjsua2JNI.AccountVideoConfig_autoShowIncoming_set(swigCPtr, this, value);
  }

  public boolean getAutoShowIncoming() {
    return pjsua2JNI.AccountVideoConfig_autoShowIncoming_get(swigCPtr, this);
  }

  public void setAutoTransmitOutgoing(boolean value) {
    pjsua2JNI.AccountVideoConfig_autoTransmitOutgoing_set(swigCPtr, this, value);
  }

  public boolean getAutoTransmitOutgoing() {
    return pjsua2JNI.AccountVideoConfig_autoTransmitOutgoing_get(swigCPtr, this);
  }

  public void setWindowFlags(long value) {
    pjsua2JNI.AccountVideoConfig_windowFlags_set(swigCPtr, this, value);
  }

  public long getWindowFlags() {
    return pjsua2JNI.AccountVideoConfig_windowFlags_get(swigCPtr, this);
  }

  public void setDefaultCaptureDevice(int value) {
    pjsua2JNI.AccountVideoConfig_defaultCaptureDevice_set(swigCPtr, this, value);
  }

  public int getDefaultCaptureDevice() {
    return pjsua2JNI.AccountVideoConfig_defaultCaptureDevice_get(swigCPtr, this);
  }

  public void setDefaultRenderDevice(int value) {
    pjsua2JNI.AccountVideoConfig_defaultRenderDevice_set(swigCPtr, this, value);
  }

  public int getDefaultRenderDevice() {
    return pjsua2JNI.AccountVideoConfig_defaultRenderDevice_get(swigCPtr, this);
  }

  public void setRateControlMethod(pjmedia_vid_stream_rc_method value) {
    pjsua2JNI.AccountVideoConfig_rateControlMethod_set(swigCPtr, this, value.swigValue());
  }

  public pjmedia_vid_stream_rc_method getRateControlMethod() {
    return pjmedia_vid_stream_rc_method.swigToEnum(pjsua2JNI.AccountVideoConfig_rateControlMethod_get(swigCPtr, this));
  }

  public void setRateControlBandwidth(long value) {
    pjsua2JNI.AccountVideoConfig_rateControlBandwidth_set(swigCPtr, this, value);
  }

  public long getRateControlBandwidth() {
    return pjsua2JNI.AccountVideoConfig_rateControlBandwidth_get(swigCPtr, this);
  }

  public void readObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.AccountVideoConfig_readObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public void writeObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.AccountVideoConfig_writeObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public AccountVideoConfig() {
    this(pjsua2JNI.new_AccountVideoConfig(), true);
  }

}
