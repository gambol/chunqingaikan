package com.alipay.android.app; class IAlixPay$Stub$Proxy { void a() { int a;
a=0;// .class Lcom/alipay/android/app/IAlixPay$Stub$Proxy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "IAlixPay.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/alipay/android/app/IAlixPay;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/alipay/android/app/IAlixPay$Stub;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "Proxy"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mRemote:Landroid/os/IBinder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/os/IBinder;)V
a=0;//     .locals 0
a=0;//     .param p1, "remote"    # Landroid/os/IBinder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 104
a=0;//     #p0=(Reference,Lcom/alipay/android/app/IAlixPay$Stub$Proxy;);
a=0;//     iput-object p1, p0, Lcom/alipay/android/app/IAlixPay$Stub$Proxy;->mRemote:Landroid/os/IBinder;
a=0;// 
a=0;//     .line 105
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public Pay(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "strInfo"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 128
a=0;//     .local v0, "_data":Landroid/os/Parcel;
a=0;//     #v0=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 131
a=0;//     .local v1, "_reply":Landroid/os/Parcel;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v3, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 132
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v3, p0, Lcom/alipay/android/app/IAlixPay$Stub$Proxy;->mRemote:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v3, v4, v0, v1, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 138
a=0;//     .local v2, "_result":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 139
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 141
a=0;//     return-object v2
a=0;// 
a=0;//     .line 137
a=0;//     .end local v2    # "_result":Ljava/lang/String;
a=0;//     :catchall_0
a=0;//     #v2=(Uninit);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 138
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 139
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 140
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public asBinder()Landroid/os/IBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/alipay/android/app/IAlixPay$Stub$Proxy;->mRemote:Landroid/os/IBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/IBinder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getInterfaceDescriptor()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     const-string v0, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public prePay(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "orderInfo"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 219
a=0;//     .local v0, "_data":Landroid/os/Parcel;
a=0;//     #v0=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 222
a=0;//     .local v1, "_reply":Landroid/os/Parcel;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v3, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 223
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v3, p0, Lcom/alipay/android/app/IAlixPay$Stub$Proxy;->mRemote:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v3, v4, v0, v1, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 229
a=0;//     .local v2, "_result":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 230
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 232
a=0;//     return-object v2
a=0;// 
a=0;//     .line 228
a=0;//     .end local v2    # "_result":Ljava/lang/String;
a=0;//     :catchall_0
a=0;//     #v2=(Uninit);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 229
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 230
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 231
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public registerCallback(Lcom/alipay/android/app/IRemoteServiceCallback;)V
a=0;//     .locals 5
a=0;//     .param p1, "cb"    # Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 175
a=0;//     .local v0, "_data":Landroid/os/Parcel;
a=0;//     #v0=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 177
a=0;//     .local v1, "_reply":Landroid/os/Parcel;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v2, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 178
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/alipay/android/app/IRemoteServiceCallback;->asBinder()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v2, p0, Lcom/alipay/android/app/IAlixPay$Stub$Proxy;->mRemote:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 183
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 184
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 186
a=0;//     return-void
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 182
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 183
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 184
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 185
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public test()Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 153
a=0;//     .local v0, "_data":Landroid/os/Parcel;
a=0;//     #v0=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 156
a=0;//     .local v1, "_reply":Landroid/os/Parcel;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v3, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v3, p0, Lcom/alipay/android/app/IAlixPay$Stub$Proxy;->mRemote:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v3, v4, v0, v1, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 158
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
a=0;// 
a=0;//     .line 159
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 162
a=0;//     .local v2, "_result":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 165
a=0;//     return-object v2
a=0;// 
a=0;//     .line 161
a=0;//     .end local v2    # "_result":Ljava/lang/String;
a=0;//     :catchall_0
a=0;//     #v2=(Uninit);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 162
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 164
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public unregisterCallback(Lcom/alipay/android/app/IRemoteServiceCallback;)V
a=0;//     .locals 5
a=0;//     .param p1, "cb"    # Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 193
a=0;//     .local v0, "_data":Landroid/os/Parcel;
a=0;//     #v0=(Reference,Landroid/os/Parcel;);
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 195
a=0;//     .local v1, "_reply":Landroid/os/Parcel;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v2, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 196
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Lcom/alipay/android/app/IRemoteServiceCallback;->asBinder()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v2, p0, Lcom/alipay/android/app/IAlixPay$Stub$Proxy;->mRemote:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 204
a=0;//     return-void
a=0;// 
a=0;//     .line 196
a=0;//     :cond_0
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 200
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 201
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 203
a=0;//     throw v2
a=0;// .end method
}}
