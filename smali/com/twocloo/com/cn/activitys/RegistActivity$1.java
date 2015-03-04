package com.twocloo.com.cn.activitys; class RegistActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/RegistActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "RegistActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private password:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;// .field private username:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/RegistActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     .line 56
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 9
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 64
a=0;//     #v8=(Null);
a=0;//     iget v3, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     .line 118
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 66
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/activitys/RegistActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 72
a=0;//     :pswitch_1
a=0;//     #v3=(Integer);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 75
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 76
a=0;//     .local v2, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUsername()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->username:Ljava/lang/String;
a=0;// 
a=0;//     .line 77
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getPassword()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->password:Ljava/lang/String;
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v3, Lcom/twocloo/com/cn/threads/SendLogRegInfo;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/threads/SendLogRegInfo;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-direct {v3, v4, v5, v6, v7}, Lcom/twocloo/com/cn/threads/SendLogRegInfo;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/threads/SendLogRegInfo;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->start()V
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/Constants$LoginType;->def:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     invoke-static {v3, v4, v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->saveLoginStatus(Landroid/content/Context;Ljava/lang/String;Lcom/twocloo/com/cn/common/Constants$LoginType;)V
a=0;// 
a=0;//     .line 82
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/BookApp;->setUser(Lcom/twocloo/com/cn/beans/User;)V
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     const-class v4, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "id"
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->main_usercenter:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/LocalStore;->getVisitsSuccessful(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v1, Lcom/twocloo/com/cn/task/PresentYDBTask;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/task/PresentYDBTask;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     const-string v4, "http://app.2cloo.com/user-get_special_free_ydb?ct=%s&pt=%s&v=%s&srcid=%s&uid=%s&imei=%s&install_type=%s&sign=%s"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/LocalStore;->getNewUserWithPresentYDB(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 90
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {v1, v3, v4, v5, v6}, Lcom/twocloo/com/cn/task/PresentYDBTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 92
a=0;//     .local v1, "presentTask":Lcom/twocloo/com/cn/task/PresentYDBTask;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/task/PresentYDBTask;);
a=0;//     new-array v3, v8, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/task/PresentYDBTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 95
a=0;//     .end local v1    # "presentTask":Lcom/twocloo/com/cn/task/PresentYDBTask;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 99
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     .end local v2    # "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 103
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     const-string v4, "\u7528\u6237\u540d\u5df2\u5b58\u5728!"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     :pswitch_3
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 109
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     const-string v4, "\u6ce8\u518c\u8fc7\u4e8e\u9891\u7e41,\u8bf7\u7a0d\u5019\u518d\u6ce8\u518c!"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 112
a=0;//     :pswitch_4
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/RegistActivity;->access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 115
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     const-string v4, "\u8bbf\u95ee\u94fe\u63a5\u8d85\u65f6,\u8bf7\u68c0\u67e5\u7cfb\u7edf\u65f6\u95f4\u8bbe\u7f6e!"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
}}
