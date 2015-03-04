package com.twocloo.com.cn.activitys; class AccountsecurityActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "AccountsecurityActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;
a=0;// 
a=0;//     .line 51
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;);
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
a=0;//     .line 53
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "code":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\u83b7\u53d6\u7528\u6237\u8d44\u6599\u5931\u8d25"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 63
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 56
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->access$0(Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;)Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/UserInfoNewThread;->userinfo:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->access$1(Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;Lcom/twocloo/com/cn/beans/UserCenterNewbean;)V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->access$2(Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->access$2(Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->getEmail()Ljava/lang/String;
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
a=0;//     .line 59
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->access$3(Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;->access$2(Lcom/twocloo/com/cn/activitys/AccountsecurityActivity;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->getEmail()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
