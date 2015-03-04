package safiap.framework.sdk; class ISAFFrameworkCallback$Stub { void a() { int a;
a=0;// .class public abstract Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub;
a=0;// .super Landroid/os/Binder;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x409
a=0;//     name = "Stub"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub$Proxy;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String; = "safiap.framework.sdk.ISAFFrameworkCallback"
a=0;// 
a=0;// .field private static b:I = 0x1
a=0;// 
a=0;// .field private static c:I = 0x2
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Landroid/os/Binder;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub;);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFrameworkCallback"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p0, v0}, Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 16
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static asInterface(Landroid/os/IBinder;)Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 24
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 30
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 26
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFrameworkCallback"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 27
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     instance-of v1, v0, Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 28
a=0;//     check-cast v0, Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 30
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub$Proxy;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub$Proxy;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub$Proxy;-><init>(Landroid/os/IBinder;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub$Proxy;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public asBinder()Landroid/os/IBinder;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 38
a=0;//     #v0=(One);
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 70
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 42
a=0;//     :sswitch_0
a=0;//     #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v1, "safiap.framework.sdk.ISAFFrameworkCallback"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     :sswitch_1
a=0;//     #v1=(Uninit);
a=0;//     const-string v1, "safiap.framework.sdk.ISAFFrameworkCallback"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 49
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 53
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 54
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v1, v2, v3}, Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub;->onDownloadProgress(Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 55
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 60
a=0;//     :sswitch_2
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v1, "safiap.framework.sdk.ISAFFrameworkCallback"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 64
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 65
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v1, v2}, Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub;->onFinishDownload(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 66
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 38
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_1
a=0;//         0x2 -> :sswitch_2
a=0;//         0x5f4e5446 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
}}
