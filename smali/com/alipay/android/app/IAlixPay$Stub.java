package com.alipay.android.app; class IAlixPay$Stub { void a() { int a;
a=0;// .class public abstract Lcom/alipay/android/app/IAlixPay$Stub;
a=0;// .super Landroid/os/Binder;
a=0;// .source "IAlixPay.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/alipay/android/app/IAlixPay;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/alipay/android/app/IAlixPay;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x409
a=0;//     name = "Stub"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/alipay/android/app/IAlixPay$Stub$Proxy;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DESCRIPTOR:Ljava/lang/String; = "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;// .field static final TRANSACTION_Pay:I = 0x1
a=0;// 
a=0;// .field static final TRANSACTION_prePay:I = 0x5
a=0;// 
a=0;// .field static final TRANSACTION_registerCallback:I = 0x3
a=0;// 
a=0;// .field static final TRANSACTION_test:I = 0x2
a=0;// 
a=0;// .field static final TRANSACTION_unregisterCallback:I = 0x4
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Landroid/os/Binder;-><init>()V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcom/alipay/android/app/IAlixPay$Stub;);
a=0;//     const-string v0, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p0, v0}, Lcom/alipay/android/app/IAlixPay$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static asInterface(Landroid/os/IBinder;)Lcom/alipay/android/app/IAlixPay;
a=0;//     .locals 2
a=0;//     .param p0, "obj"    # Landroid/os/IBinder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 35
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v1, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 32
a=0;//     .local v0, "iin":Landroid/os/IInterface;
a=0;//     #v0=(Reference,Landroid/os/IInterface;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     instance-of v1, v0, Lcom/alipay/android/app/IAlixPay;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 33
a=0;//     check-cast v0, Lcom/alipay/android/app/IAlixPay;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 35
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Lcom/alipay/android/app/IAlixPay$Stub$Proxy;
a=0;// 
a=0;//     .end local v0    # "iin":Landroid/os/IInterface;
a=0;//     #v0=(UninitRef,Lcom/alipay/android/app/IAlixPay$Stub$Proxy;);
a=0;//     invoke-direct {v0, p0}, Lcom/alipay/android/app/IAlixPay$Stub$Proxy;-><init>(Landroid/os/IBinder;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/alipay/android/app/IAlixPay$Stub$Proxy;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public asBinder()Landroid/os/IBinder;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;//     .locals 4
a=0;//     .param p1, "code"    # I
a=0;//     .param p2, "data"    # Landroid/os/Parcel;
a=0;//     .param p3, "reply"    # Landroid/os/Parcel;
a=0;//     .param p4, "flags"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 43
a=0;//     #v2=(One);
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 97
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 47
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);v3=(Uninit);
a=0;//     const-string v3, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     :sswitch_1
a=0;//     #v3=(Uninit);
a=0;//     const-string v3, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 54
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 55
a=0;//     .local v0, "_arg0":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/alipay/android/app/IAlixPay$Stub;->Pay(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 56
a=0;//     .local v1, "_result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 57
a=0;//     invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 62
a=0;//     .end local v0    # "_arg0":Ljava/lang/String;
a=0;//     .end local v1    # "_result":Ljava/lang/String;
a=0;//     :sswitch_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);
a=0;//     const-string v3, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 63
a=0;//     invoke-virtual {p0}, Lcom/alipay/android/app/IAlixPay$Stub;->test()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 64
a=0;//     .restart local v1    # "_result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 70
a=0;//     .end local v1    # "_result":Ljava/lang/String;
a=0;//     :sswitch_3
a=0;//     #v1=(Uninit);v3=(Uninit);
a=0;//     const-string v3, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/alipay/android/app/IRemoteServiceCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 73
a=0;//     .local v0, "_arg0":Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;//     #v0=(Reference,Lcom/alipay/android/app/IRemoteServiceCallback;);
a=0;//     invoke-virtual {p0, v0}, Lcom/alipay/android/app/IAlixPay$Stub;->registerCallback(Lcom/alipay/android/app/IRemoteServiceCallback;)V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     .end local v0    # "_arg0":Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;//     :sswitch_4
a=0;//     #v0=(Uninit);v3=(Uninit);
a=0;//     const-string v3, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/alipay/android/app/IRemoteServiceCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 82
a=0;//     .restart local v0    # "_arg0":Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;//     #v0=(Reference,Lcom/alipay/android/app/IRemoteServiceCallback;);
a=0;//     invoke-virtual {p0, v0}, Lcom/alipay/android/app/IAlixPay$Stub;->unregisterCallback(Lcom/alipay/android/app/IRemoteServiceCallback;)V
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 88
a=0;//     .end local v0    # "_arg0":Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;//     :sswitch_5
a=0;//     #v0=(Uninit);v3=(Uninit);
a=0;//     const-string v3, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 91
a=0;//     .local v0, "_arg0":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/alipay/android/app/IAlixPay$Stub;->prePay(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 92
a=0;//     .restart local v1    # "_result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 93
a=0;//     invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 43
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_1
a=0;//         0x2 -> :sswitch_2
a=0;//         0x3 -> :sswitch_3
a=0;//         0x4 -> :sswitch_4
a=0;//         0x5 -> :sswitch_5
a=0;//         0x5f4e5446 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
}}
