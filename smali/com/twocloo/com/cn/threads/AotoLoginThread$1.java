package com.twocloo.com.cn.threads; class AotoLoginThread$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/threads/AotoLoginThread$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AotoLoginThread.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/threads/AotoLoginThread;->run()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/threads/AotoLoginThread;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/threads/AotoLoginThread;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread$1;->this$0:Lcom/twocloo/com/cn/threads/AotoLoginThread;
a=0;// 
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/AotoLoginThread$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread$1;->this$0:Lcom/twocloo/com/cn/threads/AotoLoginThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/AotoLoginThread;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/threads/AotoLoginThread;->access$0(Lcom/twocloo/com/cn/threads/AotoLoginThread;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/AotoLoginThread$1;->this$0:Lcom/twocloo/com/cn/threads/AotoLoginThread;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/AotoLoginThread;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/threads/AotoLoginThread;->access$0(Lcom/twocloo/com/cn/threads/AotoLoginThread;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
}}
