package com.ccit.mmwlan; class ClientSDK { void a() { int a;
a=0;// .class public final Lcom/ccit/mmwlan/ClientSDK;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ClientSDK.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     const-string v0, "casdkjni"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 16
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public native AsymmetricDecryptionForBilling(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native AsymmetricEncryptionForBilling(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native AsymmetricEncryptionForMMLogin(ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native DestorySecCertForBilling(Ljava/lang/String;)I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native SIDSignNativeForBilling(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native SignNativeForLogin(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;)Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native SymmetricDecryptionForBilling(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native UpdateRandNumForBilling(Ljava/lang/String;)I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native UpdateRandNumForLogin(Ljava/lang/String;ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;Ljava/lang/String;)I
a=0;// .end method
a=0;// 
a=0;// .method public native VerifyWithCertForBilling(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native checkSecCertNativeForBilling()I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native checkSecCertNativeForLogin(ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;)I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native encWithCertNativeForLogin(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native genPKIKeyNativeForBilling()I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native genPKIKeyNativeForLogin(ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;)I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native genSIDNative()Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native genTempPKIKeyNativeForBilling()Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native getCertStateNativeForBilling()I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native getDigestNative(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native getPubKeyForBilling()Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native getPubKeyForLogin(ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;)Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native getSecCertNativeForBilling()Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native saveSecCertNativeForBilling(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native saveSecCertNativeForLogin(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;Ljava/lang/String;)I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public native transmitInfoNative(Lcom/ccit/mmwlan/vo/DeviceInfo;)I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
}}
