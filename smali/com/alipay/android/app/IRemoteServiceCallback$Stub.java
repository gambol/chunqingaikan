package com.alipay.android.app; class IRemoteServiceCallback$Stub { void a() { int a;
a=0;// .class public abstract Lcom/alipay/android/app/IRemoteServiceCallback$Stub;
a=0;// .super Landroid/os/Binder;
a=0;// .source "IRemoteServiceCallback.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x409
a=0;//     name = "Stub"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/alipay/android/app/IRemoteServiceCallback$Stub$Proxy;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DESCRIPTOR:Ljava/lang/String; = "com.alipay.android.app.IRemoteServiceCallback"
a=0;// 
a=0;// .field static final TRANSACTION_isHideLoadingScreen:I = 0x3
a=0;// 
a=0;// .field static final TRANSACTION_payEnd:I = 0x2
a=0;// 
a=0;// .field static final TRANSACTION_startActivity:I = 0x1
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
a=0;//     #p0=(Reference,Lcom/alipay/android/app/IRemoteServiceCallback$Stub;);
a=0;//     const-string v0, "com.alipay.android.app.IRemoteServiceCallback"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p0, v0}, Lcom/alipay/android/app/IRemoteServiceCallback$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static asInterface(Landroid/os/IBinder;)Lcom/alipay/android/app/IRemoteServiceCallback;
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
a=0;//     const-string v1, "com.alipay.android.app.IRemoteServiceCallback"
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
a=0;//     instance-of v1, v0, Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 33
a=0;//     check-cast v0, Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 35
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Lcom/alipay/android/app/IRemoteServiceCallback$Stub$Proxy;
a=0;// 
a=0;//     .end local v0    # "iin":Landroid/os/IInterface;
a=0;//     #v0=(UninitRef,Lcom/alipay/android/app/IRemoteServiceCallback$Stub$Proxy;);
a=0;//     invoke-direct {v0, p0}, Lcom/alipay/android/app/IRemoteServiceCallback$Stub$Proxy;-><init>(Landroid/os/IBinder;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/alipay/android/app/IRemoteServiceCallback$Stub$Proxy;);
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
a=0;//     .locals 7
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
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 43
a=0;//     #v5=(One);
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 90
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 47
a=0;//     :sswitch_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);
a=0;//     const-string v6, "com.alipay.android.app.IRemoteServiceCallback"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     :sswitch_1
a=0;//     #v6=(Uninit);
a=0;//     const-string v6, "com.alipay.android.app.IRemoteServiceCallback"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v6}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 54
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "_arg0":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 58
a=0;//     .local v1, "_arg1":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 60
a=0;//     .local v2, "_arg2":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     sget-object v6, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Parcelable$Creator;);
a=0;//     invoke-interface {v6, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/os/Bundle;
a=0;// 
a=0;//     .line 66
a=0;//     .local v3, "_arg3":Landroid/os/Bundle;
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);
a=0;//     invoke-virtual {p0, v0, v1, v2, v3}, Lcom/alipay/android/app/IRemoteServiceCallback$Stub;->startActivity(Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     .end local v3    # "_arg3":Landroid/os/Bundle;
a=0;//     :cond_0
a=0;//     #v3=(Uninit);v6=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .restart local v3    # "_arg3":Landroid/os/Bundle;
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 72
a=0;//     .end local v0    # "_arg0":Ljava/lang/String;
a=0;//     .end local v1    # "_arg1":Ljava/lang/String;
a=0;//     .end local v2    # "_arg2":I
a=0;//     .end local v3    # "_arg3":Landroid/os/Bundle;
a=0;//     :sswitch_2
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v6=(Uninit);
a=0;//     const-string v6, "com.alipay.android.app.IRemoteServiceCallback"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v6}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     move v0, v5
a=0;// 
a=0;//     .line 76
a=0;//     .local v0, "_arg0":Z
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 77
a=0;//     .restart local v1    # "_arg1":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/alipay/android/app/IRemoteServiceCallback$Stub;->payEnd(ZLjava/lang/String;)V
a=0;// 
a=0;//     .line 78
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 83
a=0;//     .end local v0    # "_arg0":Z
a=0;//     .end local v1    # "_arg1":Ljava/lang/String;
a=0;//     :sswitch_3
a=0;//     #v0=(Null);v1=(Uninit);v6=(Uninit);
a=0;//     const-string v6, "com.alipay.android.app.IRemoteServiceCallback"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v6}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 84
a=0;//     invoke-virtual {p0}, Lcom/alipay/android/app/IRemoteServiceCallback$Stub;->isHideLoadingScreen()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 85
a=0;//     .local v4, "_result":Z
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 86
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     move v0, v5
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 43
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_1
a=0;//         0x2 -> :sswitch_2
a=0;//         0x3 -> :sswitch_3
a=0;//         0x5f4e5446 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
}}
