package safiap.framework.sdk; class ISAFFramework$Stub { void a() { int a;
a=0;// .class public abstract Lsafiap/framework/sdk/ISAFFramework$Stub;
a=0;// .super Landroid/os/Binder;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/sdk/ISAFFramework;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x409
a=0;//     name = "Stub"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String; = "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;// .field private static b:I = 0x1
a=0;// 
a=0;// .field private static c:I = 0x2
a=0;// 
a=0;// .field private static d:I = 0x3
a=0;// 
a=0;// .field private static e:I = 0x4
a=0;// 
a=0;// .field private static f:I = 0x5
a=0;// 
a=0;// .field private static g:I = 0x6
a=0;// 
a=0;// .field private static h:I = 0x7
a=0;// 
a=0;// .field private static i:I = 0x8
a=0;// 
a=0;// .field private static j:I = 0x9
a=0;// 
a=0;// .field private static k:I = 0xa
a=0;// 
a=0;// .field private static l:I = 0xb
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0}, Landroid/os/Binder;-><init>()V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lsafiap/framework/sdk/ISAFFramework$Stub;);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p0, v0}, Lsafiap/framework/sdk/ISAFFramework$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 19
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static asInterface(Landroid/os/IBinder;)Lsafiap/framework/sdk/ISAFFramework;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 27
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 33
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 29
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 30
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     instance-of v1, v0, Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 31
a=0;//     check-cast v0, Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 33
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;-><init>(Landroid/os/IBinder;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public asBinder()Landroid/os/IBinder;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;//     .locals 3
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
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 41
a=0;//     #v1=(One);
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 144
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 45
a=0;//     :sswitch_0
a=0;//     #v0=(Null);v1=(One);v2=(Uninit);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 50
a=0;//     :sswitch_1
a=0;//     #v0=(Null);
a=0;//     const-string v2, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {p0}, Lsafiap/framework/sdk/ISAFFramework$Stub;->hasUpdate()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 52
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 53
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     :sswitch_2
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {p0, v0}, Lsafiap/framework/sdk/ISAFFramework$Stub;->getPluginInfo(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 62
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 63
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     :sswitch_3
a=0;//     #v0=(Null);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub;->asInterface(Landroid/os/IBinder;)Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 73
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v2}, Lsafiap/framework/sdk/ISAFFramework$Stub;->downloadPlugin(Lsafiap/framework/sdk/ISAFFrameworkCallback;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     :sswitch_4
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     const-string v2, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 82
a=0;//     invoke-virtual {p0, v2}, Lsafiap/framework/sdk/ISAFFramework$Stub;->cancel(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 83
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 84
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     :sswitch_5
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     const-string v2, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {p0}, Lsafiap/framework/sdk/ISAFFramework$Stub;->cancelAll()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 91
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 92
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 97
a=0;//     :sswitch_6
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     invoke-virtual {p0}, Lsafiap/framework/sdk/ISAFFramework$Stub;->getFrameworkVersion()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 99
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 105
a=0;//     :sswitch_7
a=0;//     #v0=(Null);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 108
a=0;//     invoke-virtual {p0, v0}, Lsafiap/framework/sdk/ISAFFramework$Stub;->startCheckUpdate(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 109
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 114
a=0;//     :sswitch_8
a=0;//     #v0=(Null);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {p0}, Lsafiap/framework/sdk/ISAFFramework$Stub;->startIAPInstall()V
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 121
a=0;//     :sswitch_9
a=0;//     #v0=(Null);
a=0;//     const-string v2, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 122
a=0;//     invoke-virtual {p0}, Lsafiap/framework/sdk/ISAFFramework$Stub;->checkIAPinstallation()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 123
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 124
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 129
a=0;//     :sswitch_a
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 130
a=0;//     invoke-virtual {p0}, Lsafiap/framework/sdk/ISAFFramework$Stub;->getIAPDedicateActionName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 131
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 132
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 137
a=0;//     :sswitch_b
a=0;//     #v0=(Null);
a=0;//     const-string v2, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 138
a=0;//     invoke-virtual {p0}, Lsafiap/framework/sdk/ISAFFramework$Stub;->checkServiceVersion()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 139
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
a=0;// 
a=0;//     .line 140
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 41
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_1
a=0;//         0x2 -> :sswitch_2
a=0;//         0x3 -> :sswitch_3
a=0;//         0x4 -> :sswitch_4
a=0;//         0x5 -> :sswitch_5
a=0;//         0x6 -> :sswitch_6
a=0;//         0x7 -> :sswitch_7
a=0;//         0x8 -> :sswitch_8
a=0;//         0x9 -> :sswitch_9
a=0;//         0xa -> :sswitch_a
a=0;//         0xb -> :sswitch_b
a=0;//         0x5f4e5446 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
}}
