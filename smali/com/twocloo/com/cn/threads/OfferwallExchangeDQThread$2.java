package com.twocloo.com.cn.threads; class OfferwallExchangeDQThread$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "OfferwallExchangeDQThread.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/waps/UpdatePointsNotifier;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->savePoints(II)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;
a=0;// 
a=0;// .field private final synthetic val$points:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$2;->this$0:Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;
a=0;// 
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$2;->val$points:I
a=0;// 
a=0;//     .line 146
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getUpdatePoints(Ljava/lang/String;I)V
a=0;//     .locals 2
a=0;//     .param p1, "arg0"    # Ljava/lang/String;
a=0;//     .param p2, "arg1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$2;->this$0:Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->access$0(Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setWanpuPoints(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getUpdatePointsFailed(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "arg0"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$2;->this$0:Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->access$0(Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread$2;->val$points:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setWanpuPoints(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 150
a=0;//     return-void
a=0;// .end method
}}
