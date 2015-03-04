package com.twocloo.com.cn.activitys; class LoginActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/LoginActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "LoginActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/LoginActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     .line 62
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 67
a=0;//     #v3=(Null);
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 123
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 69
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);
a=0;//     sput-boolean v3, Lcom/twocloo/com/cn/activitys/BookApp;->isInit:Z
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 73
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$1(Lcom/twocloo/com/cn/activitys/LoginActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 74
a=0;//     const-string v1, "LOGINTAG"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$1(Lcom/twocloo/com/cn/activitys/LoginActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "Readbook"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$1(Lcom/twocloo/com/cn/activitys/LoginActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "ReadbookDown"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$1(Lcom/twocloo/com/cn/activitys/LoginActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "FeedbackActivity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$1(Lcom/twocloo/com/cn/activitys/LoginActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 75
a=0;//     const-string v1, "BaseReadBook"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$1(Lcom/twocloo/com/cn/activitys/LoginActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "NovelDetailedActivity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$1(Lcom/twocloo/com/cn/activitys/LoginActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "BfMLActivity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$1(Lcom/twocloo/com/cn/activitys/LoginActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 76
a=0;//     const-string v1, "RECHARGE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$1(Lcom/twocloo/com/cn/activitys/LoginActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "SignInActivity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$1(Lcom/twocloo/com/cn/activitys/LoginActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 77
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->finish()V
a=0;// 
a=0;//     .line 86
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getFirstLogin(Landroid/content/Context;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     const-string v2, "\u767b\u5f55\u6210\u529f\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 82
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->main_usercenter:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setLoginType(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/activitys/LoginActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 98
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 101
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     const-string v2, "\u7528\u6237\u540d\u4e0d\u5b58\u5728\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 104
a=0;//     :pswitch_2
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 107
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     const-string v2, "\u7528\u6237\u540d\u6216\u5bc6\u7801\u9519\u8bef\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 110
a=0;//     :pswitch_3
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 113
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     const-string v2, "\u767b\u5f55\u5f02\u5e38\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 116
a=0;//     :pswitch_4
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/LoginActivity;->access$0(Lcom/twocloo/com/cn/activitys/LoginActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 119
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/LoginActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/LoginActivity;);
a=0;//     const-string v2, "\u7f51\u7edc\u8fde\u63a5\u9519\u8bef\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
}}
