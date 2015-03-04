package com.tencent.weiyun; class FileManager$DownLoadImp$1 { void a() { int a;
a=0;// .class Lcom/tencent/weiyun/FileManager$DownLoadImp$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/weiyun/FileManager$DownLoadImp;-><init>(Lcom/tencent/weiyun/FileManager;Landroid/content/Context;Lcom/tencent/weiyun/FileManager$WeiyunFileType;Lcom/tencent/weiyun/WeiyunFile;Ljava/lang/String;Lcom/tencent/weiyun/IDownLoadFileCallBack;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;// .field final synthetic val$this$0:Lcom/tencent/weiyun/FileManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/weiyun/FileManager$DownLoadImp;Landroid/os/Looper;Lcom/tencent/weiyun/FileManager;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 535
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->val$this$0:Lcom/tencent/weiyun/FileManager;
a=0;// 
a=0;//     invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 538
a=0;//     #v5=(Null);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 572
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/IDownLoadFileCallBack;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/IDownLoadFileCallBack;);
a=0;//     new-instance v2, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     iget v3, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v2, v3, v0, v5}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v1, v2}, Lcom/tencent/weiyun/IDownLoadFileCallBack;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 574
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 540
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 542
a=0;//     :try_start_0
a=0;//     const-string v1, "ret"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 543
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 544
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/IDownLoadFileCallBack;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v3, v1, v0, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v2, v3}, Lcom/tencent/weiyun/IDownLoadFileCallBack;->onError(Lcom/tencent/tauth/UiError;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 556
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 557
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/IDownLoadFileCallBack;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/4 v3, -0x4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v3, v0, v5}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v1, v2}, Lcom/tencent/weiyun/IDownLoadFileCallBack;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 547
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v1, "data"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 548
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     const-string v2, "dl_encrypt_url"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1602(Lcom/tencent/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 549
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     const-string v2, "dl_cookie_name"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1702(Lcom/tencent/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 550
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     const-string v2, "dl_cookie_value"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1802(Lcom/tencent/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 551
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     const-string v2, "dl_svr_port"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1902(Lcom/tencent/weiyun/FileManager$DownLoadImp;I)I
a=0;// 
a=0;//     .line 552
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     const-string v2, "dl_svr_host"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2002(Lcom/tencent/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 553
a=0;//     const-string v1, "dl_thumb_size"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 554
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     const-string v2, "dl_thumb_size"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2102(Lcom/tencent/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 560
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/IDownLoadFileCallBack;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/tencent/weiyun/IDownLoadFileCallBack;->onDownloadStart()V
a=0;// 
a=0;//     .line 561
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2200(Lcom/tencent/weiyun/FileManager$DownLoadImp;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 564
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 565
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 566
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/IDownLoadFileCallBack;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/weiyun/IDownLoadFileCallBack;->onDownloadProgress(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 569
a=0;//     :pswitch_2
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/IDownLoadFileCallBack;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2300(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/weiyun/IDownLoadFileCallBack;->onDownloadSuccess(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 538
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
