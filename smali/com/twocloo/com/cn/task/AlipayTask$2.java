package com.twocloo.com.cn.task; class AlipayTask$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/task/AlipayTask$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AlipayTask.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/task/AlipayTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/task/AlipayTask;
a=0;// 
a=0;// .field private final synthetic val$encodeStrSign:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$orderInfo:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$signType:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/task/AlipayTask;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/AlipayTask$2;->this$0:Lcom/twocloo/com/cn/task/AlipayTask;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/AlipayTask$2;->val$orderInfo:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/task/AlipayTask$2;->val$encodeStrSign:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/task/AlipayTask$2;->val$signType:Ljava/lang/String;
a=0;// 
a=0;//     .line 80
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/AlipayTask$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/AlipayTask$2;->this$0:Lcom/twocloo/com/cn/task/AlipayTask;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/AlipayTask;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/task/AlipayTask;->alipay:Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/task/AlipayTask$2;->val$orderInfo:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/AlipayTask$2;->val$encodeStrSign:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/task/AlipayTask$2;->val$signType:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/twocloo/base/alipay/Alipay;->pay(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
}}
