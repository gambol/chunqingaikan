package com.twocloo.com.cn.adapters; class BMDAdapter$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/adapters/BMDAdapter$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BMDAdapter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/adapters/BMDAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/adapters/BMDAdapter;
a=0;// 
a=0;// .field private final synthetic val$beg:I
a=0;// 
a=0;// .field private final synthetic val$textid:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$vip:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/adapters/BMDAdapter;IILjava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/BMDAdapter$1;->this$0:Lcom/twocloo/com/cn/adapters/BMDAdapter;
a=0;// 
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/adapters/BMDAdapter$1;->val$beg:I
a=0;// 
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/adapters/BMDAdapter$1;->val$vip:I
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/adapters/BMDAdapter$1;->val$textid:Ljava/lang/String;
a=0;// 
a=0;//     .line 81
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/BMDAdapter$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "msg":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/16 v1, 0x7c
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 86
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/adapters/BMDAdapter$1;->val$beg:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 87
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/adapters/BMDAdapter$1;->val$vip:I
a=0;// 
a=0;//     iput v1, v0, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/BMDAdapter$1;->val$textid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/BMDAdapter$1;->this$0:Lcom/twocloo/com/cn/adapters/BMDAdapter;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/adapters/BMDAdapter;->access$0(Lcom/twocloo/com/cn/adapters/BMDAdapter;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 90
a=0;//     return-void
a=0;// .end method
}}
