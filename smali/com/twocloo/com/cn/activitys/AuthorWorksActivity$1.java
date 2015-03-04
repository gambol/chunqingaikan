package com.twocloo.com.cn.activitys; class AuthorWorksActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "AuthorWorksActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// 
a=0;//     .line 38
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;);
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
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->access$0(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->access$0(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 44
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 52
a=0;//     :goto_0
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 47
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->access$1(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/adapters/AuthorWorkAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/adapters/AuthorWorkAdapter;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->access$2(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcom/twocloo/com/cn/adapters/AuthorWorkAdapter;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/AuthorWorkAdapter;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->access$3(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;Lcom/twocloo/com/cn/adapters/AuthorWorkAdapter;)V
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->access$4(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;)Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;->access$5(Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;)Lcom/twocloo/com/cn/adapters/AuthorWorkAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
