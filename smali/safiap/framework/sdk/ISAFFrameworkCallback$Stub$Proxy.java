package safiap.framework.sdk; class ISAFFrameworkCallback$Stub$Proxy { void a() { int a;
a=0;// .class Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub$Proxy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "Proxy"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/os/IBinder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/os/IBinder;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 77
a=0;//     #p0=(Reference,Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub$Proxy;);
a=0;//     iput-object p1, p0, Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public asBinder()Landroid/os/IBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/IBinder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getInterfaceDescriptor()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFrameworkCallback"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onDownloadProgress(Ljava/lang/String;II)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 90
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 92
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFrameworkCallback"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 93
a=0;//     invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// 
a=0;//     .line 100
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public onFinishDownload(Ljava/lang/String;I)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 107
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 109
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFrameworkCallback"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/ISAFFrameworkCallback$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 113
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 118
a=0;//     return-void
a=0;// 
a=0;//     .line 116
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
