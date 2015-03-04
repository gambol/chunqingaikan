package safiap.framework.sdk; class ISAFFramework$Stub$Proxy { void a() { int a;
a=0;// .class Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/sdk/ISAFFramework$Stub;
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
a=0;//     .line 150
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 151
a=0;//     #p0=(Reference,Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;);
a=0;//     iput-object p1, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public asBinder()Landroid/os/IBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/IBinder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public cancel(Ljava/lang/String;)Z
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 214
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 215
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 218
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v3, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 219
a=0;//     invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v3, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v3, v4, v1, v2, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 222
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 228
a=0;//     return v0
a=0;// 
a=0;//     .line 225
a=0;//     :catchall_0
a=0;//     #v0=(Null);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public cancelAll()Z
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 232
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 233
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 236
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v3, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v3, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v3, v4, v1, v2, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 238
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 239
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 242
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 243
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 245
a=0;//     return v0
a=0;// 
a=0;//     .line 242
a=0;//     :catchall_0
a=0;//     #v0=(Null);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 243
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public checkIAPinstallation()Z
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 295
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 296
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 299
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v3, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 300
a=0;//     iget-object v3, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/16 v4, 0x9
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v3, v4, v1, v2, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 301
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 302
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 305
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 306
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 308
a=0;//     return v0
a=0;// 
a=0;//     .line 305
a=0;//     :catchall_0
a=0;//     #v0=(Null);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 306
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public checkServiceVersion()Z
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 329
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 330
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 333
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v3, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v3, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/16 v4, 0xb
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v3, v4, v1, v2, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 335
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 336
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 339
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 340
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 342
a=0;//     return v0
a=0;// 
a=0;//     .line 339
a=0;//     :catchall_0
a=0;//     #v0=(Null);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 340
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public downloadPlugin(Lsafiap/framework/sdk/ISAFFrameworkCallback;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 199
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 201
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 202
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Lsafiap/framework/sdk/ISAFFrameworkCallback;->asBinder()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 205
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 210
a=0;//     return-void
a=0;// 
a=0;//     .line 202
a=0;//     :cond_0
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 208
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getFrameworkVersion()I
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 250
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 253
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 255
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 256
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 259
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 260
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 262
a=0;//     return v0
a=0;// 
a=0;//     .line 259
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 260
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getIAPDedicateActionName()Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 312
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 313
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 316
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 318
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 319
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 322
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 323
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 325
a=0;//     return-object v0
a=0;// 
a=0;//     .line 322
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 323
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getInterfaceDescriptor()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPluginInfo(Ljava/lang/String;)I
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 181
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 184
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 185
a=0;//     invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 191
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 194
a=0;//     return v0
a=0;// 
a=0;//     .line 191
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public hasUpdate()Z
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 163
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 164
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 167
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v4, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v4, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v4, v5, v2, v3, v6}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 169
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 170
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->readInt()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 173
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 174
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 176
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 170
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 173
a=0;//     :catchall_0
a=0;//     #v0=(One);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 174
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public startCheckUpdate(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 267
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 269
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 271
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v3, 0x7
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 272
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 275
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 276
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 277
a=0;//     return-void
a=0;// 
a=0;//     .line 275
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 276
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public startIAPInstall()V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 282
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 284
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v0, "safiap.framework.sdk.ISAFFramework"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/ISAFFramework$Stub$Proxy;->a:Landroid/os/IBinder;
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 286
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 289
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 291
a=0;//     return-void
a=0;// 
a=0;//     .line 289
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
