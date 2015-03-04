package com.twocloo.com.cn.http; class UpdateAPKService$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/http/UpdateAPKService$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "UpdateAPKService.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/http/UpdateAPKService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     .line 163
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 166
a=0;//     #v7=(Null);
a=0;//     iget v2, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 193
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/UpdateAPKService;->access$2(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/http/UpdateAPKService;->stopService(Landroid/content/Intent;)Z
a=0;// 
a=0;//     .line 196
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 169
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/http/UpdateAPKService;->access$0(Lcom/twocloo/com/cn/http/UpdateAPKService;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 170
a=0;//     .local v1, "uri":Landroid/net/Uri;
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.VIEW"
a=0;// 
a=0;//     invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 171
a=0;//     .local v0, "installIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v2, 0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 172
a=0;//     const-string v2, "application/vnd.android.package-archive"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/twocloo/com/cn/http/UpdateAPKService;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/http/UpdateAPKService;->access$1(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/UpdateAPKService;->access$2(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/http/UpdateAPKService;->stopService(Landroid/content/Intent;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 188
a=0;//     .end local v0    # "installIntent":Landroid/content/Intent;
a=0;//     .end local v1    # "uri":Landroid/net/Uri;
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/http/UpdateAPKService;->access$3(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService;);
a=0;//     const-string v4, "2cloo"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "\u4e0b\u8f7d\u5931\u8d25"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/http/UpdateAPKService;->access$4(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4, v5, v6}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/http/UpdateAPKService;->access$1(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/UpdateAPKService;->access$3(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v7, v3}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;->this$0:Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/UpdateAPKService;->access$2(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/http/UpdateAPKService;->stopService(Landroid/content/Intent;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 166
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
