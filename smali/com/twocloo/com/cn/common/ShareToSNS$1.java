package com.twocloo.com.cn.common; class ShareToSNS$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/common/ShareToSNS$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ShareToSNS.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/common/ShareToSNS;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     .line 62
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 7
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 66
a=0;//     #v3=(One);
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 67
a=0;//     iget v5, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0x2710
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     if-ne v5, v6, :cond_1
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$0(Lcom/twocloo/com/cn/common/ShareToSNS;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$0(Lcom/twocloo/com/cn/common/ShareToSNS;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 71
a=0;//     :cond_0
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/common/ShareToSNS;->wxApi:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     invoke-interface {v5}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->isWXAppInstalled()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$1(Lcom/twocloo/com/cn/common/ShareToSNS;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v5, "\u672a\u68c0\u6d4b\u5230\u5fae\u4fe1\u5ba2\u6237\u7aef\uff0c\u8bf7\u5148\u5b89\u88c5"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 100
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 75
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(One);v5=(Boolean);v6=(PosShort);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$2(Lcom/twocloo/com/cn/common/ShareToSNS;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 78
a=0;//     new-instance v1, Lcom/tencent/mm/sdk/modelmsg/WXWebpageObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/WXWebpageObject;);
a=0;//     invoke-direct {v1}, Lcom/tencent/mm/sdk/modelmsg/WXWebpageObject;-><init>()V
a=0;// 
a=0;//     .line 79
a=0;//     .local v1, "webpage":Lcom/tencent/mm/sdk/modelmsg/WXWebpageObject;
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXWebpageObject;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "http://t.2cloo.com/book/"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/twocloo/com/cn/common/ShareToSNS;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "/?app_share=1"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, v1, Lcom/tencent/mm/sdk/modelmsg/WXWebpageObject;->webpageUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v2, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     invoke-direct {v2, v1}, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;-><init>(Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;)V
a=0;// 
a=0;//     .line 81
a=0;//     .local v2, "wxmsg":Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;//     #v2=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "\u4e8c\u5c42\u697c\u4e66\u9662\u300a"
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$3(Lcom/twocloo/com/cn/common/ShareToSNS;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "\u300b"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$4(Lcom/twocloo/com/cn/common/ShareToSNS;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, v2, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$5(Lcom/twocloo/com/cn/common/ShareToSNS;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, v2, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$2(Lcom/twocloo/com/cn/common/ShareToSNS;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6, v3}, Lcom/twocloo/com/cn/common/ShareToSNS;->bmpToByteArray(Landroid/graphics/Bitmap;Z)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, v2, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;-><init>()V
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "req":Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     const-string v6, "webpage"
a=0;// 
a=0;//     invoke-static {v5, v6}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$6(Lcom/twocloo/com/cn/common/ShareToSNS;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, v0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->transaction:Ljava/lang/String;
a=0;// 
a=0;//     .line 87
a=0;//     iput-object v2, v0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     iget v5, v5, Lcom/twocloo/com/cn/common/ShareToSNS;->shareMode:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, v3, :cond_5
a=0;// 
a=0;//     .line 90
a=0;//     sput-boolean v3, Lcom/twocloo/com/cn/common/Constants;->isWechatShare:Z
a=0;// 
a=0;//     .line 91
a=0;//     sput-boolean v3, Lcom/twocloo/com/cn/common/Constants;->isShareTimeline:Z
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$7(Lcom/twocloo/com/cn/common/ShareToSNS;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     iput v3, v0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->scene:I
a=0;// 
a=0;//     .line 98
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v5=(Integer);v6=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/common/ShareToSNS;->wxApi:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     invoke-interface {v3, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/sdk/modelbase/BaseReq;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(One);v5=(Boolean);v6=(Reference,Ljava/lang/String;);
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 92
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 93
a=0;//     :cond_5
a=0;//     #v3=(One);v5=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS$1;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     iget v5, v5, Lcom/twocloo/com/cn/common/ShareToSNS;->shareMode:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ne v5, v6, :cond_3
a=0;// 
a=0;//     .line 94
a=0;//     sput-boolean v3, Lcom/twocloo/com/cn/common/Constants;->isWechatShare:Z
a=0;// 
a=0;//     .line 95
a=0;//     sput-boolean v4, Lcom/twocloo/com/cn/common/Constants;->isShareTimeline:Z
a=0;// 
a=0;//     .line 96
a=0;//     iput v4, v0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->scene:I
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
