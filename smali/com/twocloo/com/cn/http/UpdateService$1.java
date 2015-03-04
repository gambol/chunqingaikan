package com.twocloo.com.cn.http; class UpdateService$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/http/UpdateService$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "UpdateService.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/http/UpdateService;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/http/UpdateService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/UpdateService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     .line 37
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/UpdateService$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 10
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 39
a=0;//     #v9=(Null);
a=0;//     iget v2, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 55
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 41
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/UpdateService;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/http/UpdateService;->access$0(Lcom/twocloo/com/cn/http/UpdateService;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 44
a=0;//     :pswitch_1
a=0;//     #v2=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/UpdateService;);
a=0;//     const-string v3, "notification"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/http/UpdateService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 46
a=0;//     .local v0, "manager":Landroid/app/NotificationManager;
a=0;//     new-instance v1, Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->icon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-string v3, "\u63d0\u9192"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct {v1, v2, v3, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     .line 48
a=0;//     .local v1, "notification":Landroid/app/Notification;
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/UpdateService;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/http/UpdateService;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u63d0\u9192"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "\u60a8\u6b63\u5728\u9605\u8bfb\u7684\u4f5c\u54c1\u6709"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v5, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\u90e8\u5df2\u6709\u66f4\u65b0\uff0c\u53bb\u770b\u770b\u5427\uff01"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/http/UpdateService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     new-instance v6, Landroid/content/Intent;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/http/UpdateService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/http/UpdateService;);
a=0;//     const-class v8, Lcom/twocloo/com/cn/activitys/LoadingActivity;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v6, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {v5, v9, v6, v9}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 50
a=0;//     iget v2, v1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     or-int/lit8 v2, v2, 0x10
a=0;// 
a=0;//     iput v2, v1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     .line 51
a=0;//     iget v2, v1, Landroid/app/Notification;->defaults:I
a=0;// 
a=0;//     or-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     iput v2, v1, Landroid/app/Notification;->defaults:I
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 39
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
