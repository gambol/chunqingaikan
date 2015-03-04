package com.twocloo.com.cn.view; class VipChapterOrder$2$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;
a=0;// .super Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// .source "VipChapterOrder.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/view/VipChapterOrder$2;->run()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//         "<",
a=0;//         "Lcom/twocloo/com/cn/beans/SubResultBean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/twocloo/com/cn/view/VipChapterOrder$2;
a=0;// 
a=0;// .field private final synthetic val$act:Landroid/app/Activity;
a=0;// 
a=0;// .field private final synthetic val$aid:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$isVip:I
a=0;// 
a=0;// .field private final synthetic val$mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private final synthetic val$textid:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$token:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/view/VipChapterOrder$2;Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->this$1:Lcom/twocloo/com/cn/view/VipChapterOrder$2;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$token:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$aid:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$textid:Ljava/lang/String;
a=0;// 
a=0;//     iput p7, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$isVip:I
a=0;// 
a=0;//     .line 135
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/singlebook/DataCallBack;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;)Lcom/twocloo/com/cn/view/VipChapterOrder$2;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->this$1:Lcom/twocloo/com/cn/view/VipChapterOrder$2;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder$2;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callBack(Lcom/twocloo/com/cn/beans/SubResultBean;)V
a=0;//     .locals 8
a=0;//     .param p1, "t"    # Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/SubResultBean;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     new-instance v7, Ljava/lang/Thread;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/VipChapterOrder$2$1$1;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$aid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$token:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$textid:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$isVip:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1$1;-><init>(Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder$2$1$1;);
a=0;//     invoke-direct {v7, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 172
a=0;//     #v7=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 188
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 174
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/view/VipChapterOrder$2$1$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1$2;-><init>(Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder$2$1$2;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 185
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->this$1:Lcom/twocloo/com/cn/view/VipChapterOrder$2;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder$2;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/view/VipChapterOrder$2;->access$0(Lcom/twocloo/com/cn/view/VipChapterOrder$2;)Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$token:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$aid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$textid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->val$isVip:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/twocloo/com/cn/view/VipChapterOrder;->access$3(Lcom/twocloo/com/cn/view/VipChapterOrder;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic callBack(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Lcom/twocloo/com/cn/beans/SubResultBean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/view/VipChapterOrder$2$1;->callBack(Lcom/twocloo/com/cn/beans/SubResultBean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
