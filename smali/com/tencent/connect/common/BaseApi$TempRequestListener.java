package com.tencent.connect.common; class BaseApi$TempRequestListener { void a() { int a;
a=0;// .class public Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/connect/common/BaseApi;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1
a=0;//     name = "TempRequestListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mListener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 317
a=0;//     iput-object p1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->this$0:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 318
a=0;//     #p0=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iput-object p2, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mListener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 319
a=0;//     new-instance v0, Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;);
a=0;//     iget-object v1, p1, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p0, v1, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;-><init>(Lcom/tencent/connect/common/BaseApi$TempRequestListener;Landroid/os/Looper;Lcom/tencent/connect/common/BaseApi;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 329
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Lcom/tencent/connect/common/BaseApi$TempRequestListener;)Lcom/tencent/tauth/IUiListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 314
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mListener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onComplete(Lorg/json/JSONObject;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 334
a=0;//     iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 335
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 337
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onConnectTimeoutException(Lorg/apache/http/conn/ConnectTimeoutException;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 365
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 366
a=0;//     invoke-virtual {p1}, Lorg/apache/http/conn/ConnectTimeoutException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 367
a=0;//     const/4 v1, -0x7
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 368
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 369
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onHttpStatusException(Lcom/tencent/utils/HttpUtils$HttpStatusException;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 389
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 390
a=0;//     invoke-virtual {p1}, Lcom/tencent/utils/HttpUtils$HttpStatusException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 391
a=0;//     const/16 v1, -0x9
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 392
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 393
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onIOException(Ljava/io/IOException;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 342
a=0;//     invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 343
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 344
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 345
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onJSONException(Lorg/json/JSONException;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 358
a=0;//     invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 359
a=0;//     const/4 v1, -0x4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 360
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 361
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onMalformedURLException(Ljava/net/MalformedURLException;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 349
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 350
a=0;//     invoke-virtual {p1}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 351
a=0;//     const/4 v1, -0x3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 352
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 353
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onNetworkUnavailableException(Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 381
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 382
a=0;//     invoke-virtual {p1}, Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 383
a=0;//     const/16 v1, -0xa
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 384
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 385
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSocketTimeoutException(Ljava/net/SocketTimeoutException;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 373
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 374
a=0;//     invoke-virtual {p1}, Ljava/net/SocketTimeoutException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 375
a=0;//     const/4 v1, -0x8
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 376
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 377
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onUnknowException(Ljava/lang/Exception;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 397
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 398
a=0;//     invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 399
a=0;//     const/4 v1, -0x6
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 400
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 401
a=0;//     return-void
a=0;// .end method
}}
