package com.twocloo.com.cn.task; class SupportAuthorLastTask$19 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/task/SupportAuthorLastTask$19;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SupportAuthorLastTask.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->onPostExecute(Lcom/twocloo/com/cn/beans/SupportAuthorBean;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/task/SupportAuthorLastTask;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$19;->this$0:Lcom/twocloo/com/cn/task/SupportAuthorLastTask;
a=0;// 
a=0;//     .line 196
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/SupportAuthorLastTask$19;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "arg0"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.settings.WIFI_SETTINGS"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 200
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$19;->this$0:Lcom/twocloo/com/cn/task/SupportAuthorLastTask;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->access$3(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/SupportAuthorLastTask$19;->this$0:Lcom/twocloo/com/cn/task/SupportAuthorLastTask;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/task/SupportAuthorLastTask;->access$2(Lcom/twocloo/com/cn/task/SupportAuthorLastTask;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     .line 203
a=0;//     return-void
a=0;// .end method
}}
