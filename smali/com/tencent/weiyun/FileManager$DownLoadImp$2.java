package com.tencent.weiyun; class FileManager$DownLoadImp$2 { void a() { int a;
a=0;// .class Lcom/tencent/weiyun/FileManager$DownLoadImp$2;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/weiyun/FileManager$DownLoadImp;->getDownloadPermission()V
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
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/weiyun/FileManager$DownLoadImp;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 624
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 626
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     iget-object v0, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp;->this$0:Lcom/tencent/weiyun/FileManager;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager;->c(Lcom/tencent/weiyun/FileManager;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 627
a=0;//     const-string v1, "file_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/weiyun/WeiyunFile;->getFileId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 628
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2600(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 629
a=0;//     const-string v1, "thumb"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2600(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 633
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     iget-object v1, v1, Lcom/tencent/weiyun/FileManager$DownLoadImp;->this$0:Lcom/tencent/weiyun/FileManager;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager;->d(Lcom/tencent/weiyun/FileManager;)Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2800(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     iget-object v4, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v4}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2900(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/FileManager$WeiyunFileType;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3000(Lcom/tencent/weiyun/FileManager$DownLoadImp;Lcom/tencent/weiyun/FileManager$WeiyunFileType;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     invoke-static {v1, v2, v3, v0, v4}, Lcom/tencent/utils/HttpUtils;->request(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 634
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 635
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput v2, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 636
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 637
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Lcom/tencent/utils/HttpUtils$NetworkUnavailableException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catch Lcom/tencent/utils/HttpUtils$HttpStatusException; {:try_start_0 .. :try_end_0} :catch_4
a=0;// 
a=0;//     .line 664
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 638
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 639
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 640
a=0;//     const/4 v2, -0x3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iput v2, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual {v0}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 642
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 643
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 644
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 645
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 646
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 647
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 648
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 649
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 650
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 651
a=0;//     const/4 v0, -0x4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 652
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 653
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 654
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 655
a=0;//     invoke-virtual {v0}, Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 656
a=0;//     const/16 v0, -0xa
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 657
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 658
a=0;//     :catch_4
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 659
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 660
a=0;//     invoke-virtual {v0}, Lcom/tencent/utils/HttpUtils$HttpStatusException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 661
a=0;//     const/16 v0, -0x9
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 662
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}